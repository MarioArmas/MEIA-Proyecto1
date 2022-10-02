/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author mario
 */
public class Proyecto1{
    
    public static void main(String[] args) {
        // this lines open the admin form (just for testing)
        AdminForm adminForm = new AdminForm();
        adminForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        adminForm.setSize(430, 350);
        adminForm.setVisible(true);
    }
    
    public static ArrayList<String> getFile(String path) {
        ArrayList<String> data = new ArrayList<String>();
        File file = new File(path);
        
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader fileToRead = new BufferedReader(fileReader);
                String line = fileToRead.readLine();

                while (line != null) {
                    if (!"".equals(line)) {
                        data.add(line);
                    }
                    
                    line = fileToRead.readLine();
                }

                fileReader.close();
                fileToRead.close();
            } catch (IOException ex) {
                String strError = ex.getMessage();
                return data;
            }
        }

        return data;
    }
    
    public static void saveFile(String path, String data, boolean append) {
        File descBitacoraFile = new File(path);

        try {
            // true -> append
            // false -> overwrite
           try (FileWriter Write = new FileWriter(descBitacoraFile, append);
               BufferedWriter bw = new BufferedWriter(Write)) {
               bw.write(data);
               bw.close();
           }
       }
       catch(IOException ex) {
           String strError = ex.getMessage();
           System.out.println(strError);
       }
    }
}
