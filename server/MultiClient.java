package client.server;

import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.*;
import javax.swing.ImageIcon;
import static java.nio.file.StandardCopyOption.*;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MultiClient extends javax.swing.JFrame {

    public boolean logout = true;
    static String username;
    static String currentUser = null;
    static String password  = null;
    static int serverPort = 12000;
    static String serverIP = "0.0.0.0";
    InetAddress ipAdress;
    Socket socket;
    static DataInputStream dataInputStream;
    static DataInputStream dataInputStreamPassword;
    static DataOutputStream dataOutputStream;
    static DataOutputStream dataOutputStreamPassword;
    public MultiClient() throws UnknownHostException, IOException {
        initComponents();
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        mainPanel = new javax.swing.JPanel();
        regUserPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        singUp2 = new javax.swing.JButton();
        cancel_singUp1 = new javax.swing.JButton();
        Wrong_username_Label = new javax.swing.JLabel();
        Correct_username_Label = new javax.swing.JLabel();
        ServerStatusLabel = new javax.swing.JLabel();
        logoutPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        myImagePanel = new javax.swing.JPanel();
        share = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myList = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        loadImage = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        imageLabel = new javax.swing.JLabel();
        userListBox = new javax.swing.JComboBox<>();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        log_username = new javax.swing.JTextField();
        log_password = new javax.swing.JTextField();
        singUp = new javax.swing.JButton();
        cancel_singUp = new javax.swing.JButton();
        foreignImagePanel = new javax.swing.JPanel();
        myImagePanel1 = new javax.swing.JPanel();
        shareForeign = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        foreignList = new javax.swing.JList<>();
        usersList = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        foreignImageViewer = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        fileChooser.setCurrentDirectory(new java.io.File("C:\\"));
            fileChooser.setDialogTitle("Choose image");

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setBackground(new java.awt.Color(255, 255, 255));

            mainPanel.setBackground(new java.awt.Color(255, 255, 255));
            mainPanel.setLayout(new java.awt.CardLayout());

            regUserPanel.setBackground(new java.awt.Color(255, 255, 255));
            regUserPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
            regUserPanel.setForeground(new java.awt.Color(51, 51, 255));
            regUserPanel.setDoubleBuffered(false);
            regUserPanel.setFocusable(false);

            jLabel4.setFont(new java.awt.Font("Century", 2, 24)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(0, 153, 51));
            jLabel4.setText("Wellcome to imageCloud");
            jLabel4.setAlignmentY(0.0F);

            Username.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
            Username.setText("Username");
            Username.setToolTipText("Username");

            Password.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
            Password.setText("Password");

            singUp2.setText("Sing Up");
            singUp2.setFocusable(false);
            singUp2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    singUp2ActionPerformed(evt);
                }
            });

            cancel_singUp1.setBackground(new java.awt.Color(255, 255, 255));
            cancel_singUp1.setText("Cancel");
            cancel_singUp1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cancel_singUp1ActionPerformed(evt);
                }
            });

            Wrong_username_Label.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
            Wrong_username_Label.setForeground(new java.awt.Color(255, 0, 0));

            Correct_username_Label.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
            Correct_username_Label.setForeground(new java.awt.Color(0, 204, 0));

            javax.swing.GroupLayout regUserPanelLayout = new javax.swing.GroupLayout(regUserPanel);
            regUserPanel.setLayout(regUserPanelLayout);
            regUserPanelLayout.setHorizontalGroup(
                regUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(regUserPanelLayout.createSequentialGroup()
                    .addContainerGap(264, Short.MAX_VALUE)
                    .addGroup(regUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regUserPanelLayout.createSequentialGroup()
                            .addGroup(regUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(regUserPanelLayout.createSequentialGroup()
                                    .addComponent(singUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cancel_singUp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(regUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(357, 357, 357))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regUserPanelLayout.createSequentialGroup()
                            .addGroup(regUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Wrong_username_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Correct_username_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(296, 296, 296))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regUserPanelLayout.createSequentialGroup()
                            .addComponent(ServerStatusLabel)
                            .addGap(34, 34, 34))))
            );
            regUserPanelLayout.setVerticalGroup(
                regUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(regUserPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ServerStatusLabel)
                    .addGap(59, 59, 59)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(regUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(singUp2)
                        .addComponent(cancel_singUp1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Wrong_username_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Correct_username_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(162, Short.MAX_VALUE))
            );

            mainPanel.add(regUserPanel, "card2");

            logoutPanel.setBackground(new java.awt.Color(255, 255, 255));
            logoutPanel.setFocusable(false);

            jButton1.setText("Yes");
            jButton1.setFocusable(false);
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setText("No");
            jButton2.setFocusable(false);

            jLabel2.setBackground(new java.awt.Color(255, 255, 255));
            jLabel2.setFont(new java.awt.Font("Century", 2, 36)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 0, 51));
            jLabel2.setText("Are you sure want to exit ?");

            javax.swing.GroupLayout logoutPanelLayout = new javax.swing.GroupLayout(logoutPanel);
            logoutPanel.setLayout(logoutPanelLayout);
            logoutPanelLayout.setHorizontalGroup(
                logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutPanelLayout.createSequentialGroup()
                    .addContainerGap(190, Short.MAX_VALUE)
                    .addGroup(logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(logoutPanelLayout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(147, 147, 147)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(198, 198, 198))
            );
            logoutPanelLayout.setVerticalGroup(
                logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutPanelLayout.createSequentialGroup()
                    .addContainerGap(142, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(logoutPanelLayout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(jButton2))
                        .addGroup(logoutPanelLayout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(jButton1)))
                    .addGap(161, 161, 161))
            );

            mainPanel.add(logoutPanel, "card3");

            myImagePanel.setBackground(new java.awt.Color(255, 255, 255));
            myImagePanel.setFocusable(false);

            share.setText("Share with:");
            share.setFocusable(false);
            share.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    shareActionPerformed(evt);
                }
            });

            myList.setFocusable(false);
            myList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
                public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                    myListValueChanged(evt);
                }
            });
            jScrollPane1.setViewportView(myList);

            loadImage.setText("Load");
            loadImage.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    loadImageActionPerformed(evt);
                }
            });

            jScrollPane3.setViewportView(imageLabel);

            javax.swing.GroupLayout myImagePanelLayout = new javax.swing.GroupLayout(myImagePanel);
            myImagePanel.setLayout(myImagePanelLayout);
            myImagePanelLayout.setHorizontalGroup(
                myImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myImagePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(myImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(myImagePanelLayout.createSequentialGroup()
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(loadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(jScrollPane3))
                        .addGroup(myImagePanelLayout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(share, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(userListBox, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 198, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            myImagePanelLayout.setVerticalGroup(
                myImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myImagePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(myImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(myImagePanelLayout.createSequentialGroup()
                            .addGroup(myImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(loadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(myImagePanelLayout.createSequentialGroup()
                            .addComponent(jScrollPane3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(myImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(share)
                                .addComponent(userListBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap())
            );

            mainPanel.add(myImagePanel, "card4");

            loginPanel.setBackground(new java.awt.Color(255, 255, 255));
            loginPanel.setFocusable(false);

            jLabel1.setFont(new java.awt.Font("Century", 2, 24)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 153, 51));
            jLabel1.setText("Wellcome to imageCloud");
            jLabel1.setAlignmentY(0.0F);

            log_username.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
            log_username.setToolTipText("");

            log_password.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N

            singUp.setText("Log In");
            singUp.setFocusPainted(false);
            singUp.setFocusable(false);
            singUp.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    singUpActionPerformed(evt);
                }
            });

            cancel_singUp.setBackground(new java.awt.Color(255, 255, 255));
            cancel_singUp.setText("Cancel");
            cancel_singUp.setFocusPainted(false);
            cancel_singUp.setFocusable(false);
            cancel_singUp.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cancel_singUpActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
            loginPanel.setLayout(loginPanelLayout);
            loginPanelLayout.setHorizontalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginPanelLayout.createSequentialGroup()
                    .addContainerGap(268, Short.MAX_VALUE)
                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(296, 296, 296))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(loginPanelLayout.createSequentialGroup()
                                    .addComponent(singUp, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cancel_singUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(log_password, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(log_username, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(357, 357, 357))))
            );
            loginPanelLayout.setVerticalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginPanelLayout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(log_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(log_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(singUp)
                        .addComponent(cancel_singUp))
                    .addContainerGap(196, Short.MAX_VALUE))
            );

            mainPanel.add(loginPanel, "card5");

            foreignImagePanel.setBackground(new java.awt.Color(255, 255, 255));

            myImagePanel1.setBackground(new java.awt.Color(255, 255, 255));
            myImagePanel1.setFocusable(false);

            shareForeign.setText("Share with:");
            shareForeign.setFocusable(false);
            shareForeign.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    shareForeignActionPerformed(evt);
                }
            });

            foreignList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
                public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                    foreignListValueChanged(evt);
                }
            });
            jScrollPane2.setViewportView(foreignList);

            jScrollPane5.setViewportView(foreignImageViewer);

            javax.swing.GroupLayout myImagePanel1Layout = new javax.swing.GroupLayout(myImagePanel1);
            myImagePanel1.setLayout(myImagePanel1Layout);
            myImagePanel1Layout.setHorizontalGroup(
                myImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myImagePanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(myImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(myImagePanel1Layout.createSequentialGroup()
                            .addComponent(shareForeign, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(usersList, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 196, Short.MAX_VALUE))
                        .addComponent(jScrollPane5))
                    .addContainerGap())
            );
            myImagePanel1Layout.setVerticalGroup(
                myImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myImagePanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(myImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(myImagePanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(myImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(shareForeign)
                                .addComponent(usersList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
                    .addContainerGap())
            );

            javax.swing.GroupLayout foreignImagePanelLayout = new javax.swing.GroupLayout(foreignImagePanel);
            foreignImagePanel.setLayout(foreignImagePanelLayout);
            foreignImagePanelLayout.setHorizontalGroup(
                foreignImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 849, Short.MAX_VALUE)
                .addGroup(foreignImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            foreignImagePanelLayout.setVerticalGroup(
                foreignImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 458, Short.MAX_VALUE)
                .addGroup(foreignImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foreignImagePanelLayout.createSequentialGroup()
                        .addComponent(myImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
            );

            mainPanel.add(foreignImagePanel, "card6");

            jMenu2.setText("User");

            jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
            jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/new_user.png"))); // NOI18N
            jMenuItem2.setText("New User");
            jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem2ActionPerformed(evt);
                }
            });
            jMenu2.add(jMenuItem2);

            jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
            jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/login.png"))); // NOI18N
            jMenuItem7.setText("Login");
            jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem7ActionPerformed(evt);
                }
            });
            jMenu2.add(jMenuItem7);

            jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
            jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/Logout.png"))); // NOI18N
            jMenuItem1.setText("Logout");
            jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem1ActionPerformed(evt);
                }
            });
            jMenu2.add(jMenuItem1);

            jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
            jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/exit.png"))); // NOI18N
            jMenuItem3.setText("Exit");
            jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem3ActionPerformed(evt);
                }
            });
            jMenu2.add(jMenuItem3);

            jMenuBar1.add(jMenu2);

            jMenu4.setText("View Image");

            jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
            jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/myimage.png"))); // NOI18N
            jMenuItem4.setText("My Image");
            jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem4ActionPerformed(evt);
                }
            });
            jMenu4.add(jMenuItem4);

            jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
            jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/foreign_image.png"))); // NOI18N
            jMenuItem5.setText("Foreign Image");
            jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem5ActionPerformed(evt);
                }
            });
            jMenu4.add(jMenuItem5);

            jMenuBar1.add(jMenu4);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(logout == true){
            regUserPanel.setVisible(true);
            myImagePanel.setVisible(false);
            foreignImagePanel.setVisible(false);
        }else 
            myImagePanel.setVisible(true);
        Wrong_username_Label.setText(null);
        Correct_username_Label.setText(null);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void cancel_singUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_singUpActionPerformed
        loginPanel.setVisible(false);
    }//GEN-LAST:event_cancel_singUpActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(logout == false){
            regUserPanel.setVisible(false);
            myImagePanel.setVisible(false);
            foreignImagePanel.setVisible(false);
            logoutPanel.setVisible(true);
            loginPanel.setVisible(false);
        }
        else{
            regUserPanel.setVisible(false);
            myImagePanel.setVisible(false);
            foreignImagePanel.setVisible(false);
            logoutPanel.setVisible(false);
            loginPanel.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        logout = true;
        loginPanel.setVisible(true);
        logoutPanel.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        logoutPanel.setVisible(false);
        loginPanel.setVisible(false);
        regUserPanel.setVisible(false);
        foreignImagePanel.setVisible(false);
        
        if(logout == true){ 
            myImagePanel.setVisible(false);

        } else if (logout == false){
            myImagePanel.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    
    
    
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        logoutPanel.setVisible(false);
        loginPanel.setVisible(true);
        regUserPanel.setVisible(false);
        myImagePanel.setVisible(false);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        logoutPanel.setVisible(false);
        loginPanel.setVisible(false);
        regUserPanel.setVisible(false);
        myImagePanel.setVisible(false);
        
        if(logout == true){ 


        } else if (logout == false){
            foreignImagePanel.setVisible(true);
            try {
            openForeignImage();
        } catch (IOException ex) {
            Logger.getLogger(MultiClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed
DefaultListModel listModel = new DefaultListModel();
    private void cancel_singUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_singUp1ActionPerformed
        regUserPanel.setVisible(false);
    }//GEN-LAST:event_cancel_singUp1ActionPerformed
    
    public void openForeignImage() throws IOException{
        File folder = null;
        File[] listOfFile;
        String fileName = null;
        BufferedImage tempImage; 
        String directoryName = null;
        File userListFile = null;
        String userListString = null;
        int i = 0;
        ArrayList userData = new ArrayList();
        HashMap<String, String> data = new HashMap<String, String>();
        BufferedReader br = null;
        folder = new File("C:\\Users\\neyro\\OneDrive\\Documents\\NetBeansProjects\\Client Server\\src\\"+currentUser+"\\ForeignImage\\");
        
        br = new BufferedReader(new FileReader("UserDataBase.txt"));
        
        while((userListString = br.readLine())!= null){
            userData.add(userListString);
        }
        String[] userDataMassive = new String[userData.size()];
        userListBox.removeAllItems();
        usersList.removeAllItems();
        for(int x = 0; x<userData.size(); x++){
            userDataMassive[x] = (String) userData.get(x);
            userListBox.addItem(userDataMassive[x]);
            usersList.addItem(userDataMassive[x]);
        }
        
        listOfFile = folder.listFiles();
        listModel.removeAllElements();
        foreignList.setModel(listModel);
        for(File file : listOfFile){
            if(file.isFile()){
                fileName = file.getName();
                listModel.addElement(fileName);
                foreignList.setModel(listModel);
                data.put(fileName,file.getPath());
                
            }
            else if(file.isDirectory()){
                directoryName = file.getName();
                listModel.addElement(directoryName);
                foreignList.setModel(listModel);
            }
        }
    
    
    }
    
    public void openFilefromDirectory(String locatFileDir) throws IOException{
        File folder = null;
        File[] listOfFile;
        String fileName = null;
        BufferedImage tempImage; 
        String directoryName = null;
        File userListFile = null;
        String userListString = null;
        int i = 0;
        ArrayList userData = new ArrayList();
        HashMap<String, String> data = new HashMap<String, String>();
        BufferedReader br = null;
        folder = new File("C:\\Users\\neyro\\OneDrive\\Documents\\NetBeansProjects\\Client Server\\src\\" + locatFileDir+"\\");
        
        br = new BufferedReader(new FileReader("UserDataBase.txt"));
        
        while((userListString = br.readLine())!= null){
            userData.add(userListString);
        }
        String[] userDataMassive = new String[userData.size()];
        
        for(int x = 0; x<userData.size(); x++){
            userDataMassive[x] = (String) userData.get(x);
            userListBox.addItem(userDataMassive[x]);
        }
        
        listOfFile = folder.listFiles();
        listModel.removeAllElements();
        myList.setModel(listModel);
        for(File file : listOfFile){
            if(file.isFile()){
                fileName = file.getName();
                listModel.addElement(fileName);
                myList.setModel(listModel);
                data.put(fileName,file.getPath());
                
            }
            else if(file.isDirectory()){
                directoryName = file.getName();
                listModel.addElement(directoryName);
                myList.setModel(listModel);
            }
        }
    }
    private void singUp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singUp2ActionPerformed
        username = Username.getText();
        password = Password.getText();
        String answer_reg = null;
        try {
            while (answer_reg == null) {
                dataOutputStream.writeUTF(username+"="+password+"=reg");
                dataOutputStream.flush();
                System.out.println("Date was send");
                answer_reg = dataInputStream.readUTF();
                if (answer_reg.equals("true")) {
                    System.out.println("Server say Ok ");
                    Correct_username_Label.setText("You are succeful Sign Up");
                    Wrong_username_Label.setText(null);
                    myImagePanel.setVisible(true);
                    regUserPanel.setVisible(false);
                    openFilefromDirectory(username);
                    logout = false;
                    currentUser = username;
                } else if (answer_reg.equals("false")) {
                    System.out.println("Server say no");
                    Wrong_username_Label.setText("Username [" + username + "] already exist");
                    Correct_username_Label.setText(null);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(MultiClient.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_singUp2ActionPerformed
    private void singUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singUpActionPerformed
        System.out.println(" Is tasted on start");
        String login_username = log_username.getText();
        String login_password = log_password.getText();
        String answer_log = null;
        String answer_log_Data = null;
        String answer_log_pass = null;
        int lineNumber = 0;
        try{
            while(answer_log  == null){
                System.out.println(" Is tasted on while");
                dataOutputStream.writeUTF(login_username+"="+login_password+"=log");
                dataOutputStream.flush();
                answer_log_Data = dataInputStream.readUTF();
                String userData[] = answer_log_Data.split("=");
                answer_log = userData[0];
                answer_log_pass = userData[1];
                if(answer_log.equals("logThisUser") && answer_log_pass.equals(login_password)){
                    Correct_username_Label.setText("You are succeful LogIn");
                    Wrong_username_Label.setText(null);
                    myImagePanel.setVisible(true);
                    regUserPanel.setVisible(false);
                    System.out.println(" Is tasted on if");
                    openFilefromDirectory(login_username);
                    logout = false;
                    currentUser = login_username;
                }
                else if (!answer_log.equals(login_password) || !answer_log_pass.equals(login_password)) {
                    Wrong_username_Label.setText("Username or Password is wrong.Try Again!");
                    Correct_username_Label.setText(null);
                            System.out.println(" Is tasted on else if ");

                }
            }
       
        }catch (IOException ex) {
            Logger.getLogger(MultiClient.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_singUpActionPerformed

    private void loadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadImageActionPerformed
       int returnVal = fileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String currdir = null;
            String filePath = ""+file.getAbsolutePath();
            currdir = "C:\\Users\\neyro\\OneDrive\\Documents\\NetBeansProjects\\Client Server\\src\\" + currentUser+"\\";
            File tempFile = new File(filePath);
            tempFile.renameTo(new File(currdir+tempFile.getName()));
            tempFile.delete();
           try {
               openFilefromDirectory(currentUser);
           } catch (IOException ex) {
               Logger.getLogger(MultiClient.class.getName()).log(Level.SEVERE, null, ex);
           }
    } else {

    }
        
        
    }//GEN-LAST:event_loadImageActionPerformed

    private void myListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_myListValueChanged
        try{
            String currdir = "C:\\Users\\neyro\\OneDrive\\Documents\\NetBeansProjects\\Client Server\\src\\" + currentUser+"\\";
            ImageIcon imagIcon = new ImageIcon(currdir+myList.getSelectedValue());
            Image image = imagIcon.getImage();
            Image newImage = image.getScaledInstance(566, 404, Image.SCALE_SMOOTH);
            imagIcon = new ImageIcon(newImage);
            imageLabel.setIcon(imagIcon);
            }catch(Exception x){
        }
    }//GEN-LAST:event_myListValueChanged

    private void shareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shareActionPerformed
        try{
            String currdir = "C:\\Users\\neyro\\OneDrive\\Documents\\NetBeansProjects\\Client Server\\src\\" + currentUser+"\\";
            String userToSend = (String) userListBox.getSelectedItem();
            String userToSendLocation = "C:\\Users\\neyro\\OneDrive\\Documents\\NetBeansProjects\\Client Server\\src\\" +userToSend+"\\ForeignImage\\";
            String fileToSend = myList.getSelectedValue();
            File file = new File(currdir+fileToSend);
            String filePath = ""+file.getAbsolutePath();
            File tempFile = new File(filePath);
            tempFile.renameTo(new File(userToSendLocation+tempFile.getName()));
        }catch(Exception x){
        }
        
        
        
    }//GEN-LAST:event_shareActionPerformed

    private void shareForeignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shareForeignActionPerformed
        try{
            String currdir = "C:\\Users\\neyro\\OneDrive\\Documents\\NetBeansProjects\\Client Server\\src\\" + currentUser+"\\ForeignImage\\";
            String userToSend = (String) usersList.getSelectedItem();
            String userToSendLocation = "C:\\Users\\neyro\\OneDrive\\Documents\\NetBeansProjects\\Client Server\\src\\" +userToSend+"\\ForeignImage\\";
            String fileToSend = foreignList.getSelectedValue();
            File file = new File(currdir+fileToSend);
            String filePath = ""+file.getAbsolutePath();
            File tempFile = new File(filePath);
            tempFile.renameTo(new File(userToSendLocation+tempFile.getName()));
        }catch(Exception x){
        }
        
        
        
    }//GEN-LAST:event_shareForeignActionPerformed

    private void foreignListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_foreignListValueChanged
        
                try{
            String currdir = "C:\\Users\\neyro\\OneDrive\\Documents\\NetBeansProjects\\Client Server\\src\\" + currentUser+"\\ForeignImage\\";
            ImageIcon imagIcon = new ImageIcon(currdir+foreignList.getSelectedValue());
            Image image = imagIcon.getImage();
            Image newImage = image.getScaledInstance(566, 404, Image.SCALE_SMOOTH);
            imagIcon = new ImageIcon(newImage);
            foreignImageViewer.setIcon(imagIcon);
            }catch(Exception x){
        }
                
    }//GEN-LAST:event_foreignListValueChanged

    public static void main(String args[]) throws IOException {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MultiClient().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(MultiClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        try {
            InetAddress ipAdress = InetAddress.getByName(serverIP);
            Socket socket = new Socket(serverIP, serverPort);
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());

        } catch (UnknownHostException ex) {
            Logger.getLogger(MultiClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Correct_username_Label;
    private javax.swing.JTextField Password;
    private javax.swing.JLabel ServerStatusLabel;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel Wrong_username_Label;
    private javax.swing.JButton cancel_singUp;
    private javax.swing.JButton cancel_singUp1;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JPanel foreignImagePanel;
    private javax.swing.JLabel foreignImageViewer;
    private javax.swing.JList<String> foreignList;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton loadImage;
    private javax.swing.JTextField log_password;
    private javax.swing.JTextField log_username;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel myImagePanel;
    private javax.swing.JPanel myImagePanel1;
    public javax.swing.JList<String> myList;
    private javax.swing.JPanel regUserPanel;
    private javax.swing.JButton share;
    private javax.swing.JButton shareForeign;
    private javax.swing.JButton singUp;
    private javax.swing.JButton singUp2;
    private javax.swing.JComboBox<String> userListBox;
    private javax.swing.JComboBox<String> usersList;
    // End of variables declaration//GEN-END:variables

    
}