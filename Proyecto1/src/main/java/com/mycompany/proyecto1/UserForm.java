/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto1;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFileChooser;

/**
 *
 * @author mario
 */
public class UserForm extends javax.swing.JFrame {
    private static final String USER_FILE = "C:\\MEIA/usuario.txt";
    private static final String USER_BITACORA_FILE = "C:\\MEIA/bitacora_usuario.txt";
    
    /**
     * Creates new form UserForm
     */
    public UserForm() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        PathTF = new javax.swing.JTextField();
        DeleteJB = new javax.swing.JButton();
        ChangeDJB = new javax.swing.JButton();
        PasswordTF = new javax.swing.JTextField();
        EmailTF = new javax.swing.JTextField();
        BirthDateTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PhoneNumberTF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PathTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PathTFKeyTyped(evt);
            }
        });

        DeleteJB.setText("Delete");
        DeleteJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteJBActionPerformed(evt);
            }
        });

        ChangeDJB.setText("Change Data");
        ChangeDJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeDJBActionPerformed(evt);
            }
        });

        PasswordTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordTFKeyTyped(evt);
            }
        });

        EmailTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailTFKeyTyped(evt);
            }
        });

        BirthDateTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BirthDateTFKeyTyped(evt);
            }
        });

        jLabel1.setText("Password:");

        jLabel2.setText("Email:");

        jLabel3.setText("Birth Date:");

        jLabel4.setText("Phone Number.");

        jLabel5.setText("Profile Picture Path");

        PhoneNumberTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhoneNumberTFKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(PasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PathTF)
                            .addComponent(PhoneNumberTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BirthDateTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ChangeDJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteJB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChangeDJB))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(DeleteJB))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BirthDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PathTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Playlists", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChangeDJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeDJBActionPerformed
        String[] user = new String[9];
        for (int i = 0; i < 9; i++){
             user[i] = Proyecto1.activeUser[i];
        }
        user[3] = PasswordTF.getText();
        user[6] = EmailTF.getText();
        user[5] = BirthDateTF.getText();
        user[7] = PhoneNumberTF.getText();
        user[8] = PathTF.getText();
        
        if(SignInForm.ValidateEmail(user[6]) && SignInForm.IsNumber(user[7]) && SignInForm.ValidatePassword(user[3]) && AdminForm.correctDateFormat(user[5])){
            updateUser(user);
        }
    }//GEN-LAST:event_ChangeDJBActionPerformed

    private void DeleteJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteJBActionPerformed
        delete();
    }//GEN-LAST:event_DeleteJBActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        copyData();
    }//GEN-LAST:event_formWindowOpened

    private void PasswordTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordTFKeyTyped
        if(PasswordTF.getText().length() >= 40)
        {
            evt.consume();
        }
    }//GEN-LAST:event_PasswordTFKeyTyped

    private void EmailTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailTFKeyTyped
        if(EmailTF.getText().length() >= 40)
        {
            evt.consume();
        }
    }//GEN-LAST:event_EmailTFKeyTyped

    private void BirthDateTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BirthDateTFKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_BirthDateTFKeyTyped

    private void PhoneNumberTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneNumberTFKeyTyped
        if(PhoneNumberTF.getText().length() >= 8)
        {
            evt.consume();
        }
    }//GEN-LAST:event_PhoneNumberTFKeyTyped

    private void PathTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PathTFKeyTyped
        if(PathTF.getText().length() >= 200)
        {
            evt.consume();
        }
    }//GEN-LAST:event_PathTFKeyTyped
    
    private void copyData(){
        PasswordTF.setText(Proyecto1.activeUser[3]);
        EmailTF.setText(Proyecto1.activeUser[6]);
        BirthDateTF.setText(Proyecto1.activeUser[5]);
        PhoneNumberTF.setText(Proyecto1.activeUser[7]);
        PathTF.setText(Proyecto1.activeUser[8]);
    }
    
    private void updateUser(String[] user) {
        String[] userFinded = AdminForm.searchUser(user[0]);
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
                    AdminForm.updateDescriptorUser(true);
                }
                if (path.equals(USER_FILE)) {
                    AdminForm.updateDescriptorUser(false);
                }
                    
            return;
            }
        }
    }
    private void delete() {
        String userName = Proyecto1.activeUser[0];
        if (userName.equals("")) return;
        
        String[] userFinded = AdminForm.searchUser(userName);
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
                    AdminForm.updateDescriptorUser(true);
                }
                if (path.equals(USER_FILE)) {
                    AdminForm.updateDescriptorUser(false);
                }
                
                return;
            }
        }
    }
    
    public static void playSound(String songName) {
        // recibe como parámetro el nombre de la canción y su extensión
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\MEIA/songs/" + songName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
    
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
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BirthDateTF;
    private javax.swing.JButton ChangeDJB;
    private javax.swing.JButton DeleteJB;
    private javax.swing.JTextField EmailTF;
    private javax.swing.JTextField PasswordTF;
    private javax.swing.JTextField PathTF;
    private javax.swing.JTextField PhoneNumberTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
