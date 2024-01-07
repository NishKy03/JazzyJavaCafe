package cafesystem2;

import java.io.*;
import java.io.File;
import java.io.FilterWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IMAN
 */
public class signup extends javax.swing.JFrame {
ArrayList<String> all_usernames = new ArrayList<>();
Map<String, String> usernameANDpassword = new HashMap<>();


    /**
     * Creates new form signin
     */
    public signup() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
   
public void loadUserInformation() {
        getUsers();
    }
    
public void getUsers(){
    File readFile = new File("signup.txt");
    String username = null;
    String password = null;
    
        try {
            FileReader fileReader = new FileReader(readFile);
            BufferedReader br = new BufferedReader(fileReader);
            //read line by line from the signup.txt file
            Object[] lines = br.lines().toArray();
            for(int i=0;i<lines.length;i++)
            {
                //splits the row into two rows
                //one for the name of the field
                //and other for the value of the field
                String[] row = lines[i].toString().split(":");
                
                if(row[0].equals("Username"))
                {
                    //if its the username field we will get the username
                    username = row[1].trim();
                    //add the username to the all username array
                    all_usernames.add(username);
                }
                else if(row[0].equals("Password"))
                {
                    password=row[1].trim();
                }
                
                if (!Objects.isNull(username) && !Objects.isNull(password)) {
                    usernameANDpassword.put(username, password);
                    username = null;
                    password = null;
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(signin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean checkIfUsernameExists(String run) {
        File readFile = new File("signup.txt");

        try {
            FileReader fileReader = new FileReader(readFile);
            BufferedReader br = new BufferedReader(fileReader);
            String line;

            while ((line = br.readLine()) != null) {
                if (line.startsWith("Username:") && line.substring(10).trim().equals(run)) {
                    br.close(); // Close the file once the username is found
                    return true;
                }
            }

            br.close(); // Close the file if the username is not found
        } catch (IOException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        confirmpasswordField = new javax.swing.JPasswordField();
        usernameField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        login2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JazzyJavaCafe");

        jPanel1.setBackground(new java.awt.Color(243, 237, 224));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(204, 182, 137));

        confirmpasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpasswordFieldActionPerformed(evt);
            }
        });

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(127, 93, 25));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIGN UP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Password");

        signup.setText("Sign Up");
        signup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(102, 102, 102)));
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel3.setText("I already have an account ");

        login2.setBackground(new java.awt.Color(204, 182, 137));
        login2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        login2.setText("Log In");
        login2.setBorder(null);
        login2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Confirm Password");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(usernameField)
                    .addComponent(confirmpasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(login2)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmpasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(login2))
                .addGap(62, 62, 62))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot_2023-12-15_104449-removebg-preview (6)_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(514, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(423, 423, 423))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(522, 522, 522))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login2ActionPerformed
       signin login2Frame = new signin();
       login2Frame.setVisible(true);
       login2Frame.pack();
       login2Frame.setLocationRelativeTo(null);
       
       this.dispose();
    }//GEN-LAST:event_login2ActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
       String username = usernameField.getText();
       String password = String.valueOf(passwordField.getPassword());
       String confirmPassword = String.valueOf(confirmpasswordField.getPassword());
        
       File openFile = new File("signup.txt");
       
    try {
         PrintWriter writeFile = new PrintWriter(new FileWriter(openFile,true));
           
         if(username.equals(""))
         {
             //System.out.println("Fields cannot be empty");
             JOptionPane.showMessageDialog(null, "Username cannot be empty");
         }
         else if(password.equals(""))
         {
             JOptionPane.showMessageDialog(null, "Password cannot be empty");
         }
         else if(confirmPassword.equals(""))
         {
             JOptionPane.showMessageDialog(null, "Confirmation password cannot be empty");
         }
         else
         {
            if(password.equals(confirmPassword))
              {
                  if(!checkIfUsernameExists(username)){
                   writeFile.println("Username: " + username);
                   writeFile.println("Password: " + password);
                   writeFile.println("Confirm Password: " + confirmPassword);
                   writeFile.println("-------");
                   writeFile.close();
                  }
                  else
                   {
                       //System.out.println("Username already Existed!");
                       JOptionPane.showMessageDialog(null,"Username already Existed!");

                   }

              }
              else
              {
                  //System.out.println("Confirmation password Error");
                  JOptionPane.showMessageDialog(null,"Confirmation password Error");
              }   
         }
    }
    
    
    
    
    
    catch (IOException ex) {
        Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
    }
       
       signin signupFrame = new signin();
       signupFrame.setVisible(true);
       signupFrame.pack();
       signupFrame.setLocationRelativeTo(null);
       
       this.dispose();
    }//GEN-LAST:event_signupActionPerformed

    
    private void confirmpasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpasswordFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmpasswordField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton login2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton signup;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
