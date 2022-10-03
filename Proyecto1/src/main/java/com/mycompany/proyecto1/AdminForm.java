/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto1;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.*;
import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import javax.swing.JFileChooser;

/**
 *
 * @author mario
 */
public class AdminForm extends javax.swing.JFrame {

    private static final String USER_FILE = "C:\\MEIA/usuario.txt";
    private static final String USER_BITACORA_FILE = "C:\\MEIA/bitacora_usuario.txt";

    /**
     * Creates new form AdminForm
     */
    public AdminForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackupBtn = new javax.swing.JButton();
        UserTF = new javax.swing.JTextField();
        NameTF = new javax.swing.JTextField();
        LastNameTF = new javax.swing.JTextField();
        PasswordTF = new javax.swing.JTextField();
        RolTF = new javax.swing.JTextField();
        BirthDateTF = new javax.swing.JTextField();
        EmailTF = new javax.swing.JTextField();
        PhoneNumberTF = new javax.swing.JTextField();
        PathProfilePictureTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        InsertBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackupBtn.setText("Backup");
        BackupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackupBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("User:");

        jLabel2.setText("Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Password:");

        jLabel5.setText("Rol:");

        jLabel6.setText("Birth date:");

        jLabel7.setText("email:");

        jLabel8.setText("Phone Number:");

        jLabel9.setText("Path Profile Picture:");

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        InsertBtn.setText("Insert");
        InsertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PathProfilePictureTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(PhoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BirthDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RolTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BackupBtn)
                        .addComponent(SearchBtn))
                    .addComponent(UpdateBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InsertBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(SearchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(UpdateBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(DeleteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(InsertBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RolTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BirthDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PathProfilePictureTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackupBtn)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackupBtnActionPerformed
        File file;
        String destinationPath = "";
        
        JFileChooser dialog = new JFileChooser("C:\\MEIA");
        dialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int value = dialog.showOpenDialog(this);
        
        if (value == JFileChooser.APPROVE_OPTION) {
            file = dialog.getSelectedFile();
            destinationPath = file.getPath();
        }
        
        makeBackup(destinationPath);
        updateBackupBitacora(destinationPath);
        updateDescriptorBackupBitacora();
    }//GEN-LAST:event_BackupBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        String userName = UserTF.getText();
        String[] user = searchUser(userName);
        if (user[0] != null) {
            UserTF.setText(user[0]);
            NameTF.setText(user[1]);
            LastNameTF.setText(user[2]);
            PasswordTF.setText(user[3]);
            RolTF.setText(user[4]);
            BirthDateTF.setText(user[5]);
            EmailTF.setText(user[6]);
            PhoneNumberTF.setText(user[7]);
            PathProfilePictureTF.setText(user[8]);
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void InsertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtnActionPerformed
        createUser();
    }//GEN-LAST:event_InsertBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        deleteUser();
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        updateUser();
    }//GEN-LAST:event_UpdateBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }
    
    private void makeBackup(String _destinationPath) {
        String destinationPath = _destinationPath + "/MEIA_Backup";
        var source = new File("C:\\MEIA");
        var dest = new File(destinationPath);
        
        try {
            Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.COPY_ATTRIBUTES);
        }
        catch (IOException ex) {
            String strError = ex.getMessage();
            System.out.println(strError);
        }
        
        File[] files = new File("C:\\MEIA").listFiles(); 
        for (File file : files) {
            String strPath = dest.toString() + "/" + file.getName();
            Path path = Paths.get(strPath);
            if (file.isFile()) {
                try {
                    Files.copy(file.toPath(), path, StandardCopyOption.COPY_ATTRIBUTES);
                }
                catch (IOException ex) {
                    String strError = ex.getMessage();
                    System.out.println(strError);
                }
            }
        }
    }
    
    private void updateBackupBitacora(String destinationPath) {
        String bitacoraPath = "C:\\MEIA/bitacora_backup.txt";
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        String fileData = destinationPath + "|" + "usuario" + "|" + date + System.getProperty("line.separator");
        Proyecto1.saveFile(bitacoraPath, fileData, true);
    }
    
    private void updateDescriptorBackupBitacora() {
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        String descBitacoraPath = "C:\\MEIA/desc_bitacora_backup.txt";
        ArrayList<String> rawData = Proyecto1.getFile(descBitacoraPath);
        String[] data = new String[6];
        for (int i = 0; i < rawData.size(); i++) {
            data[i] = rawData.get(i);
        }
        
        data[0] = "Nombre simbolico: bitacora_backup.txt";
        if (data[1] == null) {
            data[1] = "Fecha de creación: " + date;
        }
        if (data[2] == null) {
            data[2] = "Usuario creación: " + Proyecto1.activeUser[0];
        }
        data[3] = "Fecha de modificación: " + date;
        data[4] = "Usuario de modificación: " + Proyecto1.activeUser[0];
        if (data[5] == null) {
            data[5] = "Registros: 1";
        } else {
            String number = data[5].substring(11, data[5].length());
            Integer num = Integer.parseInt(number) + 1;
            data[5] = "Registros: " + num.toString();
        }

        String fileData = data[0] + System.getProperty("line.separator") + data[1] + System.getProperty("line.separator") + data[2] + System.getProperty("line.separator") + data[3] + System.getProperty("line.separator") + data[4] + System.getProperty("line.separator") + data[5];
        Proyecto1.saveFile(descBitacoraPath, fileData, false);
    }
    
    public static void reorganize() {
        String path = "C:\\MEIA/desc_usuario.txt";
        ArrayList<String> data = Proyecto1.getFile(path);
        if (data.isEmpty()) return;
        String lineData = data.get(8);
        int num = Integer.parseInt(lineData.substring(20, lineData.length()));
        
        ArrayList<String> usersData = Proyecto1.getFile(USER_BITACORA_FILE);
        if (usersData.size() >= num) {
            ArrayList<String> realUsersData = Proyecto1.getFile(USER_FILE);
            for (String item : usersData) {
                realUsersData.add(item);
            }
            
            Collections.sort(realUsersData);
            
            String fileText = "";
            for (String item : realUsersData) {
                fileText += item + System.getProperty("line.separator");
            }
            
            Proyecto1.saveFile(USER_BITACORA_FILE, "", false);
            Proyecto1.saveFile(USER_FILE, fileText, false);
            updateDescriptorUser(true);
            updateDescriptorUser(false);
        }
    }
    
    public static void updateDescriptorUser(boolean bitacora) {
        String path;
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        ArrayList<String> descData;
        ArrayList<String> fileData;
        String fileName;
        if (bitacora) {
            path = "C:\\MEIA/desc_bitacora_usuario.txt";
            descData = Proyecto1.getFile(path);
            fileData = Proyecto1.getFile(USER_BITACORA_FILE);
            fileName = "bitacora_usuario.txt";
        }
        else {
            path = "C:\\MEIA/desc_usuario.txt";
            descData = Proyecto1.getFile(path);
            fileData = Proyecto1.getFile(USER_FILE);
            fileName = "usuario.txt";
        }
        
        int actives = 0;
        int inactives = 0;
        for (String userData : fileData) {
            String[] user = userData.split("\\|");
            if (user[9].equals("1")) actives++;
            else inactives++;
        }
        String[] data = new String[9];
        for (int i = 0; i < descData.size(); i++) {
            data[i] = descData.get(i);
        }
        
        data[0] = "Nombre simbolico: " + fileName;
        if (data[1] == null) {
            data[1] = "Fecha de creación: " + date;
        }
        if (data[2] == null) {
            data[2] = "Usuario creación: " + Proyecto1.activeUser[0];
        }
        data[3] = "Fecha de modificación: " + date;
        data[4] = "Usuario de modificación: " + Proyecto1.activeUser[0];
        data[5] = "Registros: " + fileData.size();
        data[6] = "Registros activos: " + actives;
        data[7] = "Registros inactivos: " + inactives;
        data[8] = "Max reorganización: 3";
        
        String fileString = "";
        for (int i = 0; i < data.length; i++) {
            fileString += data[i];
            if (i != data.length - 1) {
                fileString += System.getProperty("line.separator");
            }
        }
        
        Proyecto1.saveFile(path, fileString, false);
    }
    
    private void createUser() {
        String[] user = new String[10];
        user[0] = UserTF.getText();
        user[1] = NameTF.getText();
        user[2] = LastNameTF.getText();
        user[3] = PasswordTF.getText();
        user[4] = "0";
        user[5] = BirthDateTF.getText();
        user[6] = EmailTF.getText();
        user[7] = PhoneNumberTF.getText();
        user[8] = PathProfilePictureTF.getText();
        user[9] = "1";
        
        String status =  validateInputs(user);
        if (!status.equals("ok")) return;
        
        String[] userFinded = searchUser(user[0]);

        if (userFinded[0] != null) return;

        reorganize();
        
        String userToAdd = "";
        user[3] = Proyecto1.encode(user[3]);
        for (int i = 0; i < user.length; i++) {
            userToAdd += user[i];
            if (i != user.length -1) {
                userToAdd += "|";
            }
        }
        userToAdd += System.getProperty("line.separator");

        Proyecto1.saveFile(USER_BITACORA_FILE, userToAdd, true);
        updateDescriptorUser(true);
        updateDescriptorUser(false);
    }
    
    public static String[] searchUser(String userName) {
        ArrayList<String> fileUsers = Proyecto1.getFile(USER_FILE);
        ArrayList<String> fileBitacoraUsers = Proyecto1.getFile(USER_BITACORA_FILE);
        String[] userFinded = new String[11];
        
        for (String userData : fileUsers) {
            String[] user = userData.split("\\|");
            if (user[0].equals(userName) && user[9].equals("1")) {
                System.arraycopy(user, 0, userFinded, 0, user.length);
                userFinded[10] = USER_FILE;
                break;
            }
        }
        
        for (String userData : fileBitacoraUsers) {
            String[] user = userData.split("\\|");
            if (user[0].equals(userName) && user[9].equals("1")) {
                System.arraycopy(user, 0, userFinded, 0, user.length);
                userFinded[10] = USER_BITACORA_FILE;
                break;
            }
        }
        
        if (userFinded[0] != null) {
            userFinded[3] = Proyecto1.decode(userFinded[3]);            
        }
        
        return userFinded;
    }
    
    private void updateUser() {
        String[] user = new String[9];
        user[0] = UserTF.getText();
        user[1] = NameTF.getText();
        user[2] = LastNameTF.getText();
        user[3] = PasswordTF.getText();
        user[4] = RolTF.getText();
        user[5] = BirthDateTF.getText();
        user[6] = EmailTF.getText();
        user[7] = PhoneNumberTF.getText();
        user[8] = PathProfilePictureTF.getText();
        
        String status =  validateInputs(user);
        if (!status.equals("ok")) return;
        String[] userFinded = searchUser(user[0]);
        String path = userFinded[10];
        if (userFinded[0] == null) {
            return;
        }

        ArrayList<String> fileUsers = Proyecto1.getFile(path);
        for (int i = 0; i < fileUsers.size(); i++) {
            String[] userInFile = fileUsers.get(i).split("\\|");
            if (userInFile[0].equals(user[0])) {
                System.arraycopy(user, 0, userInFile, 0, user.length);
                String lineToAdd = "";
                userInFile[3] = Proyecto1.encode(userInFile[3]);
                for (int j = 0; j < userInFile.length; j++) {
                    lineToAdd += userInFile[j];
                    if (j != userInFile.length - 1) {
                        lineToAdd += "|";
                    }
                }

                fileUsers.remove(i);
                fileUsers.add(i, lineToAdd);
                String fileData = "";

                for (String item : fileUsers) {
                    fileData += item + System.getProperty("line.separator");
                }

                Proyecto1.saveFile(path, fileData, false);
                if (path.equals(USER_BITACORA_FILE)) {
                    updateDescriptorUser(true);
                }
                if (path.equals(USER_FILE)) {
                    updateDescriptorUser(false);
                }

                return;
            }
        }
    }
    
    private void deleteUser() {
        // no a él mismo
        String userName = UserTF.getText();
        if (userName.equals("")) return;
        if (userName.equals(Proyecto1.activeUser[0])) return;
        
        String[] userFinded = searchUser(userName);
        if (userFinded[0] == null) return;
        String path = userFinded[10];
        
        ArrayList<String> fileUsers = Proyecto1.getFile(path);
        String lineToAdd = "";
        for (int i = 0; i < fileUsers.size(); i++) {
            String[] user = fileUsers.get(i).split("\\|");
            if (user[0].equals(userName)) {
                user[9] = "0";
                
                for (int j = 0; j < user.length; j++) {
                    lineToAdd += user[j];
                    if (j != user.length - 1) {
                        lineToAdd += "|";
                    }
                }
                
                fileUsers.remove(i);
                fileUsers.add(i, lineToAdd);
                
                String fileData = "";
                for (String item : fileUsers) {
                    fileData += item + System.getProperty("line.separator");
                }
                
                Proyecto1.saveFile(path, fileData, false);
                if (path.equals(USER_BITACORA_FILE)) {
                    updateDescriptorUser(true);
                }
                if (path.equals(USER_FILE)) {
                    updateDescriptorUser(false);
                }
                
                return;
            }
        }
    }
    
    private String validateInputs(String[] userInput) {
        for (String item : userInput) {
            if (item.equals("")) {
                return "campos vacios";
            }
        }
        
        if (userInput[0].length() > 20) {
            return "Nombre de usuario demasiado largo";
        }
        
        if (userInput[1].length() > 30) {
            return "Nombre demasiado largo";
        }
        
        if (userInput[2].length() > 30) {
            return "Apellido demasiado largo";
        }
        
        if (userInput[3].length() > 40) {
            return "Contraseña demasiado larga";
        }
        
        /*if (!SignInForm.ValidatePassword(userInput[3])) {
            return "Contraseña poco segura";
        }*/
        
        if (!userInput[4].equals("1") && !userInput[4].equals("0")) {
            return "Rol no válido";
        }
        
        if (!correctDateFormat(userInput[5])) {
            return "Formato de fecha no válido";
        }
        
        if (userInput[6].length() > 40) {
            return "Correo demasiado largo";
        }
        
        if (!correctEmailFormat(userInput[6])) {
            return "Formato de correo no válido";
        }
        
        if (userInput[7].length() != 8) {
            return "Número de teléfono no válido";
        }
        
        try {
            int test = Integer.parseInt(userInput[7]);
        }
        catch (NumberFormatException ex) {
            String strError = ex.getMessage();
            System.out.println(strError);
            return "El número de teléfono no es un int";
        }
        
        if (userInput[8].length() > 200) {
            return "Ubicación de archivo demasiado larga";
        }
        
        return "ok";
    }
    
    private boolean correctDateFormat(String date) {
        // Formato de fecha dd/mm/yyyy
        String[] fields = date.split("/");
        if (fields.length != 3) return false;
        
        try {
            int field0 = Integer.parseInt(fields[0]);
            int field1 = Integer.parseInt(fields[1]);
            int field2 = Integer.parseInt(fields[2]);
        }
        catch (NumberFormatException ex) {
            return false;
        }
        
        if (fields[0].length() != 2) return false;
        if (fields[1].length() != 2) return false;
        if (fields[2].length() != 4) return false;
        
        return true;
    }
    
    private boolean correctEmailFormat(String date) {
        String[] fields = date.split("@");
        return fields.length == 2;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackupBtn;
    private javax.swing.JTextField BirthDateTF;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField EmailTF;
    private javax.swing.JButton InsertBtn;
    private javax.swing.JTextField LastNameTF;
    private javax.swing.JTextField NameTF;
    private javax.swing.JTextField PasswordTF;
    private javax.swing.JTextField PathProfilePictureTF;
    private javax.swing.JTextField PhoneNumberTF;
    private javax.swing.JTextField RolTF;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField UserTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
