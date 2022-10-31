/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto1;

import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class UserForm extends javax.swing.JFrame {
    private static final String USER_FILE = "C:\\MEIA/usuario.txt";
    private static final String USER_BITACORA_FILE = "C:\\MEIA/bitacora_usuario.txt";
    private static final String BITACORA_USER_PLAYLISTS_FILE = "C:\\MEIA/bitacora_listas_canciones.txt";
    static int blockNumber = 1;
    static int index = 0;
    
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
        JBCreatePlaylist = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        JTplaylistName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxPlaylist = new javax.swing.JComboBox<>();
        cbxSongs = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLSongs = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        JLPlaylists = new javax.swing.JList<>();
        JBaddSong = new javax.swing.JButton();

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

        JBCreatePlaylist.setText("Create Playlist");
        JBCreatePlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCreatePlaylistActionPerformed(evt);
            }
        });

        jLabel6.setText("Playlist name:");

        JTplaylistName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTplaylistNameActionPerformed(evt);
            }
        });

        jLabel7.setText("Generate new playlist");

        jLabel9.setText("Add songs to a playlist");

        jScrollPane1.setViewportView(JLSongs);

        jScrollPane2.setViewportView(JLPlaylists);

        JBaddSong.setText("Add song");
        JBaddSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBaddSongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTplaylistName, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBCreatePlaylist)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbxPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxSongs, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBaddSong)))
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCreatePlaylist)
                    .addComponent(jLabel6)
                    .addComponent(JTplaylistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSongs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBaddSong))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jTabbedPane1.addTab("Playlists", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
            JOptionPane.showMessageDialog(null, "Datos cambiados correctamente","Operación exitosa", WIDTH);
        }
    }//GEN-LAST:event_ChangeDJBActionPerformed

    private void DeleteJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteJBActionPerformed
        delete();
    }//GEN-LAST:event_DeleteJBActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        copyData();
        showSongs();
        showPlaylists();
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

    private void JTplaylistNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTplaylistNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTplaylistNameActionPerformed

    private void JBCreatePlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCreatePlaylistActionPerformed
        if (JTplaylistName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre para la lista","Error!", WIDTH);
            return;
        }
        
        String[] Playlist = new String[5];
        String date = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
        
        Playlist[0] = Proyecto1.activeUser[0];
        Playlist[1] = JTplaylistName.getText();
        Playlist[2] = Proyecto1.activeUser[0];
        Playlist[3] = date;
        Playlist[4] = "1";
        
        String PlaylistToAdd = "";
        for (int i = 0; i < Playlist.length; i++) {
            PlaylistToAdd += Playlist[i];
            if (i != Playlist.length -1) {
                PlaylistToAdd += "|";
            }
        }
        PlaylistToAdd += System.getProperty("line.separator");
        
        reorganizePlaylist();
        Proyecto1.saveFile(BITACORA_USER_PLAYLISTS_FILE, PlaylistToAdd, true);
        updateDescriptorPlaylist(true);
        updateDescriptorPlaylist(false);
        JOptionPane.showMessageDialog(null, "Playlist agregada","Operación exitosa", WIDTH);
        showSongs();
        showPlaylists();
        
    }//GEN-LAST:event_JBCreatePlaylistActionPerformed

    private void JBaddSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBaddSongActionPerformed
        addSongToPlaylist();
    }//GEN-LAST:event_JBaddSongActionPerformed
    
    private void addSongToPlaylist(){
        String playlist = cbxPlaylist.getSelectedItem().toString();
        String songCode = getSongCode(cbxSongs.getSelectedItem().toString());
        String user = Proyecto1.activeUser[0];
        String date = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
        getBlock();
        String bloque = String.valueOf(blockNumber);
        String path = "C:\\MEIA/bloque_" + bloque + ".txt";
        String indexPath = "C:\\MEIA/indice_canciones.txt";
        
        //Actions to update and add songs to the master file
        String songToAdd = user + "|" + playlist + "|" + songCode + "|" + user + "|" + date + "|1";
        songToAdd += System.getProperty("line.separator");
        Proyecto1.saveFile(path, songToAdd, true);
        updateDescriptorBlock();
        
        //Actions to update and add songs to the index file (sorted)
        ArrayList<String> indexData = Proyecto1.getFile("C:\\MEIA/indice_canciones.txt");
        if (!indexData.isEmpty()){
            index = indexData.size();
            index++;
        }
        
        String[] indexSong = new String[5];
        String position = getPosition();
        String key = user + "" + playlist + "" + songCode;
        String pointer = " ";
        indexSong[0] = String.valueOf(index);
        indexSong[1] = String.valueOf(blockNumber) + "." + position;
        indexSong[2] = key;
        indexSong[3] = pointer; //pendiente actualizar este dato
        indexSong[4] = "1";
        
        String indexSongToAdd = "";
        for (int i = 0; i < indexSong.length; i++) {
            indexSongToAdd += indexSong[i];
            if (i != indexSong.length -1) {
                indexSongToAdd += "|";
            }
        }
        indexSongToAdd += System.getProperty("line.separator");

        Proyecto1.saveFile(indexPath, indexSongToAdd, true);
        updateDescriptorIndexFile();
        JOptionPane.showMessageDialog(null, "canción agregada a la playlist","Operación exitosa", WIDTH);
        index++;
    }
    
    
    private void showSongs(){   
        ArrayList<String> fileData1 = Proyecto1.getFile("C:\\MEIA/bitacora_canciones.txt");
        ArrayList<String> fileData2 = Proyecto1.getFile("C:\\MEIA/canciones.txt");
        ArrayList<String> songs = new ArrayList<String>();
        DefaultListModel modelSongs= new DefaultListModel();
        JLSongs.setModel(modelSongs);
        cbxSongs.removeAllItems();
        
        for (String line : fileData1) {
            fileData2.add(line);
        }
        
        for (String line : fileData2) {
            String[] items = line.split("\\|");
            songs.add(items[1]  + " - " + items[2] + System.getProperty("line.separator"));
        }
        
        Collections.sort(songs);
        for (String song : songs) {
            modelSongs.addElement(song);
            cbxSongs.addItem(song);
        }   
    }
    
    private void showPlaylists(){
        ArrayList<String> filePlaylists = Proyecto1.getFile("C:\\MEIA/listas_canciones.txt");
        ArrayList<String> fileBitacoraPlaylists = Proyecto1.getFile("C:\\MEIA/bitacora_listas_canciones.txt");
        DefaultListModel modelPlaylist = new DefaultListModel();
        JLPlaylists.setModel(modelPlaylist);
        modelPlaylist.clear();
        cbxPlaylist.removeAllItems();
        
        for (String userData : filePlaylists) {
            String[] playlistUser = userData.split("\\|");
            if (playlistUser[0].equals(Proyecto1.activeUser[0])) {
                modelPlaylist.addElement(playlistUser[1]);
                cbxPlaylist.addItem(playlistUser[1]);
            }
        }
        
        for (String userData : fileBitacoraPlaylists) {
            String[] playlistUser = userData.split("\\|");
            if (playlistUser[0].equals(Proyecto1.activeUser[0])) {
                modelPlaylist.addElement(playlistUser[1]);
                cbxPlaylist.addItem(playlistUser[1]);
            }
        }
    }
    
    private String getSongCode(String songName){
        String code = "";
        String[] name = songName.split("\\-");
        
        ArrayList<String> fileSongs = Proyecto1.getFile("C:\\MEIA/canciones.txt");
        ArrayList<String> fileBitacoraSongs = Proyecto1.getFile("C:\\MEIA/bitacora_canciones.txt");
        
        for (String songsData : fileSongs) {
            String[] songs = songsData.split("\\|");
            if (songs[1].equals(name[0].substring(0, name[0].length()-1))) {
                code = songs[0];
                break;
            }
        }
        
        for (String songsData : fileBitacoraSongs) {
            String[] songs = songsData.split("\\|");
            if (songs[1].equals(name[0].substring(0, name[0].length()-1))) {
                code = songs[0];
                break;
            }
        }
        return code;
    }
    //gets the block number in which the new song should be entered
    private void getBlock(){
        String path = "C:\\MEIA/desc_bloque_"+ blockNumber +".txt";
        ArrayList<String> data = Proyecto1.getFile(path);
        if (data.isEmpty()) return;
        String lineData = data.get(6);
        int num = Integer.parseInt(lineData.substring(20, lineData.length()));
        
        ArrayList<String> usersData = Proyecto1.getFile("C:\\MEIA/bloque_"+blockNumber+".txt");
        if (usersData.size() >= num) {
            blockNumber++;
        }
    }
    
    private String getPosition(){
        String position;
        ArrayList<String> usersData = Proyecto1.getFile("C:\\MEIA/bloque_"+blockNumber+".txt");
        int numOfElements = usersData.size();
        position = String.valueOf(numOfElements++);
        return position;
    }
    //Lets copy the active user information on data fields
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
        if (userName.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar un usuario","Error!", WIDTH);
            return;
        }
            
        
        String[] userFinded = AdminForm.searchUser(userName);
        if (userFinded[0] == null){
            JOptionPane.showMessageDialog(null, "El usuario seleccionado no existe","Error!", WIDTH);
            return;
        }
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
                
                JOptionPane.showMessageDialog(null, "Se ha dado de baja al usuario","Operación exitosa", WIDTH);
                return;
            }
        }
    }
    
    private void reorganizePlaylist(){
        String path = "C:\\MEIA/desc_listas_canciones.txt";
        ArrayList<String> data = Proyecto1.getFile(path);
        if (data.isEmpty()) return;
        String lineData = data.get(6);
        int num = Integer.parseInt(lineData.substring(20, lineData.length()));
        
        ArrayList<String> usersData = Proyecto1.getFile("C:\\MEIA/bitacora_listas_canciones.txt");
        if (usersData.size() >= num) {
            ArrayList<String> realUsersData = Proyecto1.getFile("C:\\MEIA/listas_canciones.txt");
            for (String item : usersData) {
                realUsersData.add(item);
            }
            
            Collections.sort(realUsersData);
            
            String fileText = "";
            for (String item : realUsersData) {
                fileText += item + System.getProperty("line.separator");
            }
            
            Proyecto1.saveFile("C:\\MEIA/bitacora_listas_canciones.txt", "", false);
            Proyecto1.saveFile("C:\\MEIA/listas_canciones.txt", fileText, false);
            updateDescriptorPlaylist(true);
            updateDescriptorPlaylist(false);
        }
    }
    
    private void updateDescriptorPlaylist(boolean bitacora){
        String path;
        String date = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
        ArrayList<String> descData;
        ArrayList<String> fileData;
        String fileName;
        if (bitacora) {
            path = "C:\\MEIA/desc_bitacora_listas_canciones.txt";
            descData = Proyecto1.getFile(path);
            fileData = Proyecto1.getFile("C:\\MEIA/bitacora_listas_canciones.txt");
            fileName = "bitacora_listas_canciones.txt";
        }
        else {
            path = "C:\\MEIA/desc_listas_canciones.txt";
            descData = Proyecto1.getFile(path);
            fileData = Proyecto1.getFile("C:\\MEIA/listas_canciones.txt");
            fileName = "listas_canciones.txt";
        }
        
        String[] data = new String[7];
        for (int i = 0; i < descData.size(); i++) {
            data[i] = descData.get(i);
        }
        
        data[0] = "Nombre simbolico: " + fileName;
        if (data[1] == null) {
                data[1] = "Fecha de creación: " + date;
        }
        if (data[2] == null) {
            data[2] = "Usuario creación: " + SignInForm.lastUser;
        }
        data[3] = "Fecha de modificación: " + date;
        data[4] = "Usuario de modificación: " + SignInForm.lastUser;
        data[5] = "Registros: " + fileData.size();
        data[6] = "Max reorganización: 3";
        
        String fileString = "";
        for (int i = 0; i < data.length; i++) {
            fileString += data[i];
            if (i != data.length - 1) {
                fileString += System.getProperty("line.separator");
            }
        }
        
        Proyecto1.saveFile(path, fileString, false);
    }
    
    private void updateDescriptorBlock(){
        String path;
        String date = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
        ArrayList<String> descData;
        ArrayList<String> fileData;
        String fileName;
        String bloque = String.valueOf(blockNumber);
        
        path = "C:\\MEIA/desc_bloque_"+ bloque +".txt";
        descData = Proyecto1.getFile(path);
        fileData = Proyecto1.getFile("C:\\MEIA/bloque_"+ bloque +".txt");
        fileName = "C:\\MEIA/bloque_"+ bloque +"txt"; 
        String[] data = new String[7];
        for (int i = 0; i < descData.size(); i++) {
            data[i] = descData.get(i);
        }
        
        data[0] = "Nombre simbolico: " + fileName;
        if (data[1] == null) {
                data[1] = "Fecha de creación: " + date;
        }
        if (data[2] == null) {
            data[2] = "Usuario creación: " + SignInForm.lastUser;
        }
        data[3] = "Fecha de modificación: " + date;
        data[4] = "Usuario de modificación: " + SignInForm.lastUser;
        data[5] = "Registros: " + fileData.size();
        data[6] = "Max reorganización: 3";
        
        String fileString = "";
        for (int i = 0; i < data.length; i++) {
            fileString += data[i];
            if (i != data.length - 1) {
                fileString += System.getProperty("line.separator");
            }
        }
        
        Proyecto1.saveFile(path, fileString, false); 
    }
    
    private void updateDescriptorIndexFile(){
        String path;
        String date = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
        ArrayList<String> descData;
        ArrayList<String> fileData;
        String fileName;
        
        path = "C:\\MEIA/desc_indice_canciones.txt";
        descData = Proyecto1.getFile(path);
        fileData = Proyecto1.getFile("C:\\MEIA/indice_canciones.txt");
        fileName = "indice_canciones.txt";

        
        String[] data = new String[7];
        for (int i = 0; i < descData.size(); i++) {
            data[i] = descData.get(i);
        }
        
        data[0] = "Nombre simbolico: " + fileName;
        if (data[1] == null) {
                data[1] = "Fecha de creación: " + date;
        }
        if (data[2] == null) {
            data[2] = "Usuario creación: " + SignInForm.lastUser;
        }
        data[3] = "Fecha de modificación: " + date;
        data[4] = "Usuario de modificación: " + SignInForm.lastUser;
        data[5] = "Registros: " + fileData.size();
        data[6] = "Max reorganización: 3";
        
        String fileString = "";
        for (int i = 0; i < data.length; i++) {
            fileString += data[i];
            if (i != data.length - 1) {
                fileString += System.getProperty("line.separator");
            }
        }
        
        Proyecto1.saveFile(path, fileString, false);
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
    private javax.swing.JButton JBCreatePlaylist;
    private javax.swing.JButton JBaddSong;
    private javax.swing.JList<String> JLPlaylists;
    private javax.swing.JList<String> JLSongs;
    private javax.swing.JTextField JTplaylistName;
    private javax.swing.JTextField PasswordTF;
    private javax.swing.JTextField PathTF;
    private javax.swing.JTextField PhoneNumberTF;
    private javax.swing.JComboBox<String> cbxPlaylist;
    private javax.swing.JComboBox<String> cbxSongs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
