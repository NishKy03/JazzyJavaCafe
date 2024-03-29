package cafesystem2;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JLabel;

public class userhome extends javax.swing.JFrame {

    public userhome() {
        initComponents();
  ;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        contact = new javax.swing.JButton();
        about = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        NameLabel = new javax.swing.JPanel();
        loginDisplay = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JazzyJavaCafe");
        setPreferredSize(new java.awt.Dimension(1227, 730));

        jPanel1.setBackground(new java.awt.Color(243, 237, 224));
        jPanel1.setPreferredSize(new java.awt.Dimension(1218, 57));

        jLabel7.setFont(new java.awt.Font("Rage Italic", 0, 35)); // NOI18N
        jLabel7.setText("Jazzy Java Cafe");

        home.setBackground(new java.awt.Color(243, 237, 224));
        home.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        home.setText("Home");
        home.setBorder(null);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        menu.setBackground(new java.awt.Color(243, 237, 224));
        menu.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        menu.setText("Menu");
        menu.setBorder(null);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        contact.setBackground(new java.awt.Color(243, 237, 224));
        contact.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        contact.setText("Contact Us");
        contact.setBorder(null);
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });

        about.setBackground(new java.awt.Color(243, 237, 224));
        about.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        about.setText("About");
        about.setBorder(null);
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(243, 237, 224));
        logout.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        logout.setText("Logout");
        logout.setBorder(null);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        NameLabel.setBackground(new java.awt.Color(243, 237, 224));

        loginDisplay.setBackground(new java.awt.Color(243, 237, 224));
        loginDisplay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout NameLabelLayout = new javax.swing.GroupLayout(NameLabel);
        NameLabel.setLayout(NameLabelLayout);
        NameLabelLayout.setHorizontalGroup(
            NameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NameLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
        );
        NameLabelLayout.setVerticalGroup(
            NameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(243, 237, 224));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafesystem2/cart.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 237, 224)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel7)
                .addGap(198, 198, 198)
                .addComponent(home)
                .addGap(80, 80, 80)
                .addComponent(menu)
                .addGap(80, 80, 80)
                .addComponent(about)
                .addGap(80, 80, 80)
                .addComponent(contact)
                .addGap(38, 38, 38)
                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(logout)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(menu)
                        .addComponent(contact)
                        .addComponent(logout)
                        .addComponent(home)
                        .addComponent(about))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(195, 176, 145));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 55)); // NOI18N
        jLabel9.setText("crafted with love...");

        jLabel10.setBackground(new java.awt.Color(160, 85, 45));
        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 55)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(160, 82, 45));
        jLabel10.setText("Epicurean delights , ");

        jScrollPane1.setBorder(null);

        jTextArea1.setBackground(new java.awt.Color(195, 176, 145));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("At Jazzy Java we specialize in epicurean delights crafted with love.  \nCreating a menu of exquisite dishes that tantalize the taste buds. \nJoin us for a culinary experience where every bite is a celebration\nof flavor and each dish is a testament to our commitment to excellence \nand love for great food !!");
        jTextArea1.setBorder(null);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(72, 72, 72))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(61, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(53, 53, 53)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel9)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(102, 102, 102)
                    .addComponent(jLabel10)
                    .addContainerGap(487, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(202, 187, 168));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image1 (1) (4).jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/IMAGE 5 (1)_1.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1227, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
       userabout useraboutFrame = new userabout();
       JLabel usernameLabel = new JLabel(); // Create a new JLabel
        try {
            FileReader fileReader = new FileReader("userSession.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String username = bufferedReader.readLine();
            bufferedReader.close();

            // Set text for the JLabel
            usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12));
            usernameLabel.setText("<html><b>Welcome <i>" + username.toUpperCase() + "</i> !</b></hmtl>");
            
            useraboutFrame.NameLabelA.setLayout(new FlowLayout(FlowLayout.CENTER)); // Set the layout manager

            useraboutFrame.NameLabelA.add(usernameLabel); // Add the JLabel to the userhomeFrame
            useraboutFrame.NameLabelA.setVisible(true); // Make sure the panel is visible
            useraboutFrame.setVisible(true);
            useraboutFrame.pack();
            useraboutFrame.setLocationRelativeTo(null);
       
            this.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_aboutActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       home homeFrame = new home();
       homeFrame.setVisible(true);
       homeFrame.pack();
       homeFrame.setLocationRelativeTo(null);
       
       this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        userhome userhomeFrame = new userhome();
        JLabel usernameLabel = new JLabel(); // Create a new JLabel
        try {
            FileReader fileReader = new FileReader("userSession.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String username = bufferedReader.readLine();
            bufferedReader.close();

            // Set text for the JLabel
            usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12));
            usernameLabel.setText("<html><b>Welcome <i>" + username.toUpperCase() + "</i> !</b></hmtl>");
            
            userhomeFrame.NameLabel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Set the layout manager

            userhomeFrame.NameLabel.add(usernameLabel); // Add the JLabel to the userhomeFrame
            userhomeFrame.NameLabel.setVisible(true); // Make sure the panel is visible
            userhomeFrame.setVisible(true);
            userhomeFrame.pack();
            userhomeFrame.setLocationRelativeTo(null);

            this.dispose(); // Dispose the current frame
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_homeActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        usercontact usercontactFrame = new usercontact();
        JLabel usernameLabel = new JLabel(); // Create a new JLabel
        try {
            FileReader fileReader = new FileReader("userSession.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String username = bufferedReader.readLine();
            bufferedReader.close();

            // Set text for the JLabel
            usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12));
            usernameLabel.setText("<html><b>Welcome <i>" + username.toUpperCase() + "</i> !</b></hmtl>");
            
            usercontactFrame.NameLabelC.setLayout(new FlowLayout(FlowLayout.CENTER)); // Set the layout manager

            usercontactFrame.NameLabelC.add(usernameLabel); // Add the JLabel to the userhomeFrame
            usercontactFrame.NameLabelC.setVisible(true); // Make sure the panel is visible
            usercontactFrame.setVisible(true);
            usercontactFrame.pack();
            usercontactFrame.setLocationRelativeTo(null);

            this.dispose(); // Dispose the current frame
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_contactActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        usermenu usermenuFrame = new usermenu();
        JLabel usernameLabel = new JLabel(); // Create a new JLabel
        try {
            FileReader fileReader = new FileReader("userSession.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String username = bufferedReader.readLine();
            bufferedReader.close();

            // Set text for the JLabel
            usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12));
            usernameLabel.setText("<html><b>Welcome <i>" + username.toUpperCase() + "</i> !</b></hmtl>");
            
            usermenuFrame.NameLabelM.setLayout(new FlowLayout(FlowLayout.CENTER)); // Set the layout manager

            usermenuFrame.NameLabelM.add(usernameLabel); // Add the JLabel to the userhomeFrame
            usermenuFrame.NameLabelM.setVisible(true); // Make sure the panel is visible
            usermenuFrame.setVisible(true);
            usermenuFrame.pack();
            usermenuFrame.setLocationRelativeTo(null);
       
       this.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_menuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        order orderFrame = new order();
        JLabel usernameLabel = new JLabel(); // Create a new JLabel
        try {
            FileReader fileReader = new FileReader("userSession.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String username = bufferedReader.readLine();
            bufferedReader.close();

            // Set text for the JLabel
            usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12));
            usernameLabel.setText("<html><b>Welcome <i>" + username.toUpperCase() + "</i> !</b></hmtl>");
            
            orderFrame.NameLabelO.setLayout(new FlowLayout(FlowLayout.CENTER)); // Set the layout manager

            orderFrame.NameLabelO.add(usernameLabel); // Add the JLabel to the userhomeFrame
            orderFrame.NameLabelO.setVisible(true); // Make sure the panel is visible
            orderFrame.setVisible(true);
            orderFrame.pack();
            orderFrame.setLocationRelativeTo(null);

            this.dispose(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
     public void setUsernameLabel(String username) {
        if (usernameLabel != null) {
            
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userhome().setVisible(true);
            }
        });
    }
    
    javax.swing.JLabel usernameLabel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel NameLabel;
    private javax.swing.JButton about;
    private javax.swing.JButton contact;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JLabel loginDisplay;
    private javax.swing.JButton logout;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables

}
