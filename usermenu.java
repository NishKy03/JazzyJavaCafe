package cafesystem2;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JLabel;

public class usermenu extends javax.swing.JFrame {

    public usermenu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        NameLabelM = new javax.swing.JPanel();
        loginDisplayM = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JazzyJavaCafe");

        jPanel1.setBackground(new java.awt.Color(243, 237, 224));

        jLabel7.setFont(new java.awt.Font("Rage Italic", 0, 35)); // NOI18N
        jLabel7.setText("Jazzy Java Cafe");

        jButton13.setBackground(new java.awt.Color(243, 237, 224));
        jButton13.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jButton13.setText("Home");
        jButton13.setBorder(null);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(243, 237, 224));
        jButton14.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jButton14.setText("Menu");
        jButton14.setBorder(null);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(243, 237, 224));
        jButton15.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jButton15.setText("Contact Us");
        jButton15.setBorder(null);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(243, 237, 224));
        jButton16.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jButton16.setText("About");
        jButton16.setBorder(null);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
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

        NameLabelM.setBackground(new java.awt.Color(243, 237, 224));

        loginDisplayM.setBackground(new java.awt.Color(243, 237, 224));
        loginDisplayM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginDisplayM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout NameLabelMLayout = new javax.swing.GroupLayout(NameLabelM);
        NameLabelM.setLayout(NameLabelMLayout);
        NameLabelMLayout.setHorizontalGroup(
            NameLabelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NameLabelMLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(loginDisplayM, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        NameLabelMLayout.setVerticalGroup(
            NameLabelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginDisplayM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel7)
                .addGap(198, 198, 198)
                .addComponent(jButton13)
                .addGap(80, 80, 80)
                .addComponent(jButton14)
                .addGap(80, 80, 80)
                .addComponent(jButton16)
                .addGap(80, 80, 80)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(NameLabelM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(logout)
                    .addComponent(jButton13)
                    .addComponent(jButton16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameLabelM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(195, 176, 145));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("user menu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(563, 563, 563))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(510, Short.MAX_VALUE))
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

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
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
    }//GEN-LAST:event_jButton16ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       home homeFrame = new home();
       homeFrame.setVisible(true);
       homeFrame.pack();
       homeFrame.setLocationRelativeTo(null);
       
       this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
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
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
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
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
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
    }//GEN-LAST:event_jButton15ActionPerformed

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
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(usermenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usermenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usermenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usermenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usermenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel NameLabelM;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel loginDisplayM;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
