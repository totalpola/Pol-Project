package cognate1java.votingsystemnitotal;


import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class WelcomeFrame extends javax.swing.JFrame {
    
//for usernameAndPassword    
ArrayList<String> usernamePassword = new ArrayList<String>();

//list of votes per user
DefaultListModel<String> voteList = new DefaultListModel();

//candidates
int LeeJiun = 0;
int momo = 0;
int sana = 0;
int jisoo = 0;
int mina = 0;
int jennie = 0;

    public WelcomeFrame() {
        initComponents();
        
         

        voteList.addElement("====================");
        voteList.addElement("        Vote Wisely Kids");
        voteList.addElement("------------------------------------");
        
 
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUpFrame = new javax.swing.JFrame();
        signUpPane = new javax.swing.JPanel();
        lblRES = new javax.swing.JLabel();
        txfFullname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfFullAddress = new javax.swing.JTextField();
        cbMore = new javax.swing.JRadioButton();
        cbLess = new javax.swing.JRadioButton();
        registerButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        confirmPasswordField = new javax.swing.JTextField();
        newPasswordField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loginFrame = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        mainMenuFrame = new javax.swing.JFrame();
        Name = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        viewVoteFrame = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        LeeJieunLabel = new javax.swing.JLabel();
        momoLabel = new javax.swing.JLabel();
        sanaLabel = new javax.swing.JLabel();
        jisooLabel = new javax.swing.JLabel();
        minaLabel = new javax.swing.JLabel();
        jennieLabel = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        voteFrame = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        welcomePANE = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        signUpFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        signUpFrame.setMinimumSize(new java.awt.Dimension(600, 640));
        signUpFrame.setResizable(false);
        signUpFrame.setSize(new java.awt.Dimension(600, 640));
        signUpFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signUpPane.setBackground(new java.awt.Color(153, 153, 0));
        signUpPane.setMinimumSize(new java.awt.Dimension(600, 500));
        signUpPane.setPreferredSize(new java.awt.Dimension(600, 600));
        signUpPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRES.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblRES.setText("H O M E O W N E R  |  R E S I D E N T");
        signUpPane.add(lblRES, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        txfFullname.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txfFullname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txfFullname.setBorder(null);
        signUpPane.add(txfFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 470, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Address");
        signUpPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Confirm Password:");
        signUpPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        txfFullAddress.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txfFullAddress.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txfFullAddress.setBorder(null);
        signUpPane.add(txfFullAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 470, 40));

        cbMore.setBackground(new java.awt.Color(153, 153, 0));
        cbMore.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbMore.setSelected(true);
        cbMore.setText("MORE than 6 months");
        cbMore.setBorder(null);
        cbMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMoreActionPerformed(evt);
            }
        });
        signUpPane.add(cbMore, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        cbLess.setBackground(new java.awt.Color(153, 153, 0));
        cbLess.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbLess.setText("LESS than 6 months");
        cbLess.setBorder(null);
        cbLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLessActionPerformed(evt);
            }
        });
        signUpPane.add(cbLess, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        registerButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        registerButton.setText("Register");
        registerButton.setBorder(null);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        signUpPane.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 250, 40));

        cancelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setBorder(null);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        signUpPane.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 250, 40));

        confirmPasswordField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        confirmPasswordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        confirmPasswordField.setBorder(null);
        signUpPane.add(confirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 290, 40));

        newPasswordField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        newPasswordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        newPasswordField.setBorder(null);
        signUpPane.add(newPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 290, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Full Name:");
        signUpPane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("New Password:");
        signUpPane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        signUpFrame.getContentPane().add(signUpPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        loginFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setResizable(false);
        loginFrame.setSize(new java.awt.Dimension(500, 500));
        loginFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setText("Login Frame");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 150, -1));

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1.setText("Username");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 280, 40));

        jTextField2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField2.setText("Password");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 280, 40));

        jButton1.setText("Login");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 170, 30));

        jButton2.setText("Cancel");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 170, 30));

        loginFrame.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainMenuFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        mainMenuFrame.setBackground(new java.awt.Color(255, 255, 255));
        mainMenuFrame.setMinimumSize(new java.awt.Dimension(400, 600));
        mainMenuFrame.setResizable(false);
        mainMenuFrame.setSize(new java.awt.Dimension(400, 600));
        mainMenuFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Name.setText("Name");
        mainMenuFrame.getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Welcome  ");
        mainMenuFrame.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jButton3.setText("Logout");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        mainMenuFrame.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 170, 30));

        jButton4.setBackground(new java.awt.Color(153, 153, 0));
        jButton4.setText("Vote");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        mainMenuFrame.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 170, 30));

        jButton5.setText("View Vote");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        mainMenuFrame.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 170, 30));

        viewVoteFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        viewVoteFrame.setSize(new java.awt.Dimension(500, 500));
        viewVoteFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel3ComponentShown(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setText("Official Tally Vote");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        LeeJieunLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LeeJieunLabel.setText("Lee Jieun = 0");
        jPanel3.add(LeeJieunLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, -1));

        momoLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        momoLabel.setText("Momo = 0");
        jPanel3.add(momoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 70, -1));

        sanaLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        sanaLabel.setText("Sana = 0");
        jPanel3.add(sanaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 70, -1));

        jisooLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jisooLabel.setText("Jisoo = 0");
        jPanel3.add(jisooLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 70, -1));

        minaLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        minaLabel.setText("Mina = 0");
        jPanel3.add(minaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 70, -1));

        jennieLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jennieLabel.setText("Jennie = 0");
        jPanel3.add(jennieLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 70, -1));

        jButton8.setText("back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 362, 170, 30));

        viewVoteFrame.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        voteFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        voteFrame.setResizable(false);
        voteFrame.setSize(new java.awt.Dimension(600, 400));
        voteFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "====================", "        Vote Wisely Kids", "------------------------------------" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 160, 270));

        jCheckBox1.setText("Lee Jieun");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jCheckBox2.setText("Momo");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jCheckBox3.setText("Sana");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jCheckBox4.setText("Jisooo");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jCheckBox5.setText("Mina");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jCheckBox6.setText("Jennie");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel7.setText("Please choice your top 3");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jButton6.setText("Vote");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 170, 40));

        jButton7.setText("Cancel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 170, 40));

        voteFrame.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomePANE.setBackground(new java.awt.Color(255, 153, 153));
        welcomePANE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        loginButton.setText("Login");
        loginButton.setBorder(null);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        welcomePANE.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 250, 40));

        signUpButton.setBackground(new java.awt.Color(0, 0, 0));
        signUpButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setText("Sign Up");
        signUpButton.setBorder(null);
        signUpButton.setPreferredSize(new java.awt.Dimension(46, 23));
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        welcomePANE.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 250, 50));

        jLabel1.setFont(new java.awt.Font("Vivaldi", 0, 36)); // NOI18N
        jLabel1.setText("Welcome to 2022 Elections");
        welcomePANE.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        getContentPane().add(welcomePANE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        this.setVisible(false); //Welcome Frame
        signUpFrame.setVisible(true);
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void cbMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMoreActionPerformed
        cbLess.setSelected(false);
    }//GEN-LAST:event_cbMoreActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
//        Condition if the registry are not more than 6 months
        if (cbLess.isSelected()) {
           JOptionPane.showMessageDialog(welcomePANE, "6 more months");
       }else{

        try{
            String randomUsername = txfFullname.getText().toUpperCase().substring(0, 1) + 
                                    confirmPasswordField.getText().toUpperCase().substring(0, 1) +
                                    txfFullname.getText().toUpperCase().substring(0, 2);
            usernamePassword.add("Name: " + txfFullname.getText());
            usernamePassword.add("Username: " + randomUsername);
            usernamePassword.add("Password: " + confirmPasswordField.getText());
                    
            JOptionPane.showMessageDialog(welcomePANE, "Your new Username is " + randomUsername);
            signUpFrame.setVisible(false);
            loginFrame.setVisible(true);
            Name.setText(txfFullname.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(welcomePANE, "please [ut all empty fields"); 
        }   

        
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        signUpFrame.setVisible(false);
        this.setVisible(true); 
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void cbLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLessActionPerformed
        cbMore.setSelected(false);
    }//GEN-LAST:event_cbLessActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        this.setVisible(false);
        loginFrame.setVisible(true);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       if (jTextField1.getText().toString().replaceAll(" ", "") == "Username"){
           jTextField1.setText("");
       }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
      if (jTextField2.getText().toString().replaceAll(" ", "") == "Password"){
           jTextField2.setText("");
       }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.setVisible(true); //welcomeFrame
        loginFrame.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (usernamePassword.contains("Username: " + jTextField1.getText().toString()) &&
            usernamePassword.contains("Password: " + jTextField2.getText().toString())){
            
            JOptionPane.showMessageDialog(welcomePANE, "Wow congrats");
            mainMenuFrame.setVisible(true); //welcomeFrame
            loginFrame.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(welcomePANE, "Invalid usrname or password");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mainMenuFrame.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mainMenuFrame.setVisible(false);
        voteFrame.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mainMenuFrame.setVisible(false);
        viewVoteFrame.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()){
            voteList.addElement(jCheckBox1.getText().toString());
            jList1.setModel(voteList);  
        }else{
           voteList.removeElement(jCheckBox1.getText().toString());
            jList1.setModel(voteList);  
        }    
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()){
            voteList.addElement(jCheckBox2.getText().toString());
            jList1.setModel(voteList);  
        }else{
           voteList.removeElement(jCheckBox2.getText().toString());
            jList1.setModel(voteList);  
        }    
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox3.isSelected()){
            voteList.addElement(jCheckBox3.getText().toString());
            jList1.setModel(voteList);  
        }else{
           voteList.removeElement(jCheckBox3.getText().toString());
            jList1.setModel(voteList);  
        } 
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if (jCheckBox4.isSelected()){
            voteList.addElement(jCheckBox4.getText().toString());
            jList1.setModel(voteList);  
        }else{
           voteList.removeElement(jCheckBox4.getText().toString());
            jList1.setModel(voteList);  
        } 
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if (jCheckBox5.isSelected()){
            voteList.addElement(jCheckBox5.getText().toString());
            jList1.setModel(voteList);  
        }else{
           voteList.removeElement(jCheckBox5.getText().toString());
            jList1.setModel(voteList);  
        } 
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if (jCheckBox6.isSelected()){
            voteList.addElement(jCheckBox6.getText().toString());
            jList1.setModel(voteList);  
        }else{
           voteList.removeElement(jCheckBox6.getText().toString());
            jList1.setModel(voteList);  
        } 
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setVisible(true);
        voteFrame.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        if (jList1.getModel().getSize() == 6){
            System.out.println("Wow Ang Galing");
            System.out.println(voteList.contains(jCheckBox1.getText().toString()));
            LeeJiun += check(jCheckBox1);
            momo += check(jCheckBox2);
            sana += check(jCheckBox3);
            jisoo += check(jCheckBox4);
            mina += check(jCheckBox5);
            jennie += check(jCheckBox6);
            
            LeeJieunLabel.setText("Lee Jieun = " + String.valueOf(LeeJiun));
            momoLabel.setText("Momo = " + String.valueOf(momo));
            sanaLabel.setText("Momo = " + String.valueOf(sana));
            jisooLabel.setText("Momo = " + String.valueOf(jisoo));
            minaLabel.setText("Mina = " + String.valueOf(mina));
            jennieLabel.setText("Jennie = " + String.valueOf(jennie));
            
            voteFrame.setVisible(false);
            viewVoteFrame.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(welcomePANE, "Please choice Top 3 only :(((");
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    public int check(JCheckBox check){
        if (voteList.contains(check.getText().toString()))
        {
            return 1;
        }else{
            return 0;
        }
    }
    private void jPanel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel3ComponentShown
            LeeJieunLabel.setText("Lee Jieun = " + String.valueOf(LeeJiun));
            momoLabel.setText("Momo = " + String.valueOf(momo));
            sanaLabel.setText("Momo = " + String.valueOf(sana));
            jisooLabel.setText("Momo = " + String.valueOf(jisoo));
            minaLabel.setText("Mina = " + String.valueOf(mina));
            jennieLabel.setText("Jennie = " + String.valueOf(jennie));
    }//GEN-LAST:event_jPanel3ComponentShown

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            mainMenuFrame.setVisible(true);
            viewVoteFrame.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LeeJieunLabel;
    private javax.swing.JLabel Name;
    private javax.swing.JButton cancelButton;
    private javax.swing.JRadioButton cbLess;
    private javax.swing.JRadioButton cbMore;
    private javax.swing.JTextField confirmPasswordField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jennieLabel;
    private javax.swing.JLabel jisooLabel;
    private javax.swing.JLabel lblRES;
    private javax.swing.JButton loginButton;
    private javax.swing.JFrame loginFrame;
    private javax.swing.JFrame mainMenuFrame;
    private javax.swing.JLabel minaLabel;
    private javax.swing.JLabel momoLabel;
    private javax.swing.JTextField newPasswordField;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel sanaLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JFrame signUpFrame;
    private javax.swing.JPanel signUpPane;
    private javax.swing.JTextField txfFullAddress;
    private javax.swing.JTextField txfFullname;
    private javax.swing.JFrame viewVoteFrame;
    private javax.swing.JFrame voteFrame;
    private javax.swing.JPanel welcomePANE;
    // End of variables declaration//GEN-END:variables
}
