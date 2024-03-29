package cafesystem2;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JLabel;

public class userabout extends javax.swing.JFrame {

    public userabout() {
        initComponents();
        setLocationRelativeTo(null);
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
        jButton1 = new javax.swing.JButton();
        NameLabelA = new javax.swing.JPanel();
        loginDisplayA = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JazzyJavaCafe");

        jPanel1.setBackground(new java.awt.Color(243, 237, 224));

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

        jButton1.setBackground(new java.awt.Color(243, 237, 224));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafesystem2/cart.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 237, 224)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        NameLabelA.setBackground(new java.awt.Color(243, 237, 224));

        loginDisplayA.setBackground(new java.awt.Color(243, 237, 224));
        loginDisplayA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginDisplayA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout NameLabelALayout = new javax.swing.GroupLayout(NameLabelA);
        NameLabelA.setLayout(NameLabelALayout);
        NameLabelALayout.setHorizontalGroup(
            NameLabelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NameLabelALayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(loginDisplayA, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        NameLabelALayout.setVerticalGroup(
            NameLabelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginDisplayA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(NameLabelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(menu)
                    .addComponent(contact)
                    .addComponent(logout)
                    .addComponent(home)
                    .addComponent(about))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameLabelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(195, 176, 145));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setText("ABOUT US");

        jPanel3.setBackground(new java.awt.Color(202, 187, 168));

        jScrollPane1.setBorder(null);

        jTextPane1.setBackground(new java.awt.Color(202, 187, 168));
        jTextPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextPane1.setText("The system is developed by 4 group members:\n\n1. Abdullah Bin Saidi(Programmer)\n\n2. Daniel Zameer Shah Bin Mohd Sabri(GUI Designer)\n\n3. Nurul Izzah Irdina Binti Mohd Kairudin(GUI Designer)\n\n4. Danish Haikal Bin Suhaimi(Programmer)");
        jTextPane1.setCaretColor(new java.awt.Color(202, 187, 168));
        jScrollPane1.setViewportView(jTextPane1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot_2023-12-15_104449-removebg-preview (6)_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userabout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel NameLabelA;
    private javax.swing.JButton about;
    private javax.swing.JButton contact;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    public javax.swing.JLabel loginDisplayA;
    private javax.swing.JButton logout;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}
