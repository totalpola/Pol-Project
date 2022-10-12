package BPHAI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;



public class test {
	ArrayList<String> usernamePassword = new ArrayList<String>();
	public test() {
//------------------------------------------FONT----------------------------------------------//	
		Font FONT1 = new Font ("Elephant", Font.ITALIC, 40);
		Font FONT2 = new Font ("Century Gothic", Font.PLAIN, 25);
		Font BUTTON = new Font ("Century Gothic", Font.BOLD, 25);				

		//------------------------------------------PANEL----------------------------------------------//		
		JPanel welcomePANE = new JPanel ();
			welcomePANE.setBackground(Color.decode("#0d0d0d"));
			welcomePANE.setLayout(null);		
		//------------------------------------------FRAME----------------------------------------------//				
		JFrame welcomeFRAME = new JFrame("JSCR 2022 ELECTION");
				welcomeFRAME.setVisible(true);
				welcomeFRAME.setResizable(false);
				welcomeFRAME.setBounds(440, 90, 600, 500);
				welcomeFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				welcomeFRAME.add(welcomePANE);	
				
		//------------------------------------------PANEL----------------------------------------------//			
		JPanel signUpPane = new JPanel ();
				signUpPane.setBackground(Color.decode("#FFFFFF"));
				signUpPane.setLayout(null);					
		//------------------------------------------FRAME----------------------------------------------//				
		JFrame signUpFrame = new JFrame("JSCR 2022 ELECTION");
				signUpFrame.setVisible(false);
				signUpFrame.setResizable(false);
				signUpFrame.setBounds(440, 90, 600, 600);
				signUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				signUpFrame.add(signUpPane);
				
		//------------------------------------------PANEL----------------------------------------------//		
		JPanel loginPANE = new JPanel ();
				loginPANE.setBackground(Color.decode("#f2f2f2"));
				loginPANE.setLayout(null);				
		//------------------------------------------FRAME----------------------------------------------//	
		JFrame loginFRAME = new JFrame("JSCR 2022 ELECTION | Log In");
				loginFRAME.setVisible(false);
				loginFRAME.setResizable(false);
				loginFRAME.setBounds(430, 100, 600, 540);
				loginFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				loginFRAME.add(loginPANE);		

//-------------------------- Welcome Frame --------------------------
//----------------------------------------COMPONENTS----------------------------------------------//
			/******** TITLE ********/
				JLabel lblMAIN = new JLabel("Janssenville Subdivision");
					lblMAIN.setFont(FONT1);
					lblMAIN.setForeground(Color.decode("#f2f2f2"));
					//lblMAIN.setForeground(Color.decode("#d4af37"));
				JLabel lblSUBa = new JLabel("WELCOME TO 2022 ELECTIONS");
					lblSUBa.setFont(FONT2);
					lblSUBa.setForeground(Color.decode("#f2f2f2"));
				JLabel lblLINE = new JLabel("______________"
						+ "________________");
					lblLINE.setFont(FONT2);
					lblLINE.setForeground(Color.decode("#f2f2f2"));
				//SET BOUNDS
					lblMAIN.setBounds(30, 15, 600, 50);
					lblSUBa.setBounds(113, 90, 500, 50);
					lblLINE.setBounds(100, 115, 600, 50);
				//ADD TO PANEL
					welcomePANE.add(lblMAIN);
					welcomePANE.add(lblSUBa);
					welcomePANE.add(lblLINE);	
					
			/******** BUTTONS ********/
					JButton btnLOGINNINGS = new JButton("CHECK");
						btnLOGINNINGS.setFont(BUTTON);
						btnLOGINNINGS.setForeground(Color.decode("#fffceb"));
						btnLOGINNINGS.setBackground(Color.decode("#262626"));
						
					JButton btnLOGINs = new JButton("LOGIN");
						btnLOGINs.setFont(BUTTON);
						btnLOGINs.setForeground(Color.decode("#fffceb"));
						btnLOGINs.setBackground(Color.decode("#262626"));
						
					JButton btnSIGNUP = new JButton("SIGNUP");
						btnSIGNUP.setFont(BUTTON);
						btnSIGNUP.setForeground(Color.decode("#262626"));
						btnSIGNUP.setBackground(Color.decode("#f2f2f2"));
						
					//SET BOUNDS
						btnLOGINs.setBounds(120, 240, 350, 50);
						btnSIGNUP.setBounds(120, 310, 350, 50);
						btnLOGINNINGS.setBounds(120, 400, 350, 50);
						
					//ADD TO PANEL
						welcomePANE.add(btnLOGINs);
						welcomePANE.add(btnSIGNUP);
						welcomePANE.add(btnLOGINNINGS);					
	
			
//------------------------------------------EVENTS----------------------------------------------//	
			btnLOGINs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					welcomeFRAME.setVisible(false);
					loginFRAME.setVisible(true);
				}
			});
			
			btnSIGNUP.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					welcomeFRAME.setVisible(false);
					signUpFrame.setVisible(true);
				}
			});
			
			btnLOGINNINGS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(usernamePassword);
				}
			});		
			
//-------------------------- signUp Frame --------------------------								
				
//----------------------------------------COMPONENTS----------------------------------------------//	
				
//			Fullname 
			JLabel lblLNAME = new JLabel("full Name:");
				lblLNAME.setFont(new Font ("arial",Font.BOLD,16));	
				lblLNAME.setBounds(200,0,200,30);
				
			JTextField txfFullname= new JTextField ();
				txfFullname.setFont(new Font ("arial",Font.BOLD,16));
				txfFullname.setToolTipText("Enter your fullname");
				txfFullname.requestFocus();
				txfFullname.setBounds(200,30,200,30);
				
//          Address	
			JLabel lblLADDRESS = new JLabel("Full Address:");
				lblLADDRESS.setFont(new Font ("arial",Font.BOLD,16));	
				lblLADDRESS.setBounds(100,70,300,30);					
			JTextField txfFullAddress= new JTextField ();
				txfFullAddress.setFont(new Font ("arial",Font.BOLD,16));
				txfFullAddress.setToolTipText("Enter your full address");
				txfFullAddress.requestFocus();	
				txfFullAddress.setBounds(100,100,400,30);
				
// 			RESIDING 
				JLabel lblRES = new JLabel("H O M E O W E R  |  R E S I D E N T");
					lblRES.setFont(FONT2);
					lblRES.setForeground(Color.decode("#262626"));
					lblRES.setBounds(200,100,200,30);
					
				JRadioButton cbMORE = new JRadioButton ("MORE than 6 months");
					cbMORE.setFont(new Font ("arial",Font.PLAIN,16));
					cbMORE.setBackground(Color.decode("#f2f2f2"));
					cbMORE.setBounds(200, 150, 200, 30);
					
				JRadioButton cbLESS= new JRadioButton("LESS than 6 months"); 
					cbLESS.setBackground(Color.decode("#f2f2f2"));
					cbLESS.setFont(new Font ("arial",Font.PLAIN,16));
					cbLESS.setBounds(200, 180, 200, 30);
					
				ButtonGroup cbGROUP = new ButtonGroup ();
					cbGROUP.add(cbMORE);
					cbGROUP.add(cbLESS);

//			Enter new passwords
				JLabel NewPass = new JLabel("New Password");
					NewPass.setFont(new Font ("arial",Font.BOLD,16));	
					NewPass.setBounds(200,250,200,30);
					
				JTextField txfNewPASS = new JTextField();
					txfNewPASS.setFont(new Font ("arial",Font.BOLD,16));
					txfNewPASS.setBounds(200,280,200,30);
					
				JLabel ConPass = new JLabel("Confirm Password");
					ConPass.setFont(new Font ("arial",Font.BOLD,16));	
					ConPass.setBounds(200,320,200,30);	
					
				JTextField txfPASScon = new JTextField();
					txfPASScon.setFont(new Font ("arial",Font.BOLD,16));
					txfPASScon.setBounds(200,350,200,30);
			
//			Buttons
				JButton btnCancel = new JButton ("Cancel");
					btnCancel.setFont(BUTTON);
					btnCancel.setForeground(Color.decode("#f2f2f2"));
					btnCancel.setBackground(Color.decode("#737373"));
					btnCancel.setBounds(200,450,200,30);
					
				JButton signUp = new JButton("Sign Up");
					signUp.setFont(BUTTON);
					signUp.setForeground(Color.decode("#f2f2f2"));
					signUp.setBackground(Color.decode("#000000"));
					signUp.setBounds(200,400,200,30);
					
			//ADD TO PANEL
				signUpPane.add(lblLNAME);
				signUpPane.add(txfFullname);
				
				signUpPane.add(lblLADDRESS);
				signUpPane.add(txfFullAddress);
				
				signUpPane.add(lblRES);
				signUpPane.add(cbMORE);
				signUpPane.add(cbLESS);	
				
				signUpPane.add(NewPass);
				signUpPane.add(txfNewPASS);
				
				signUpPane.add(ConPass);
				signUpPane.add(txfPASScon);
				
				signUpPane.add(btnCancel);
				signUpPane.add(signUp);

		
// events
				
				signUp.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {	
						String randomUsername = txfFullname.getText().toUpperCase().substring(0, 1);
						usernamePassword.add("Username: " + randomUsername);
						usernamePassword.add("Password: " + txfPASScon.getText());
						
						System.out.println(usernamePassword);
						
						JOptionPane.showMessageDialog(null,"Signup Completed!" + "\n" + "USERNAME: " + randomUsername);
						signUpFrame.setVisible(false);
						loginFRAME.setVisible(true);
					}
				}
				);
				
//-------------------------- Login Frame --------------------------	
				
					
//------------------------------------------COMPONENTS----------------------------------------------//		
					
				
				/******** TITLE ********/
				JLabel lblMAINsa = new JLabel("Janssenville Subdivision");
					lblMAINsa.setFont(new Font ("Elephant",Font.ITALIC,40));
					lblMAINsa.setForeground(Color.decode("#0d0d0d"));
					lblMAINsa.setBounds(0,0,700,50);
					
				JLabel lblSUBaa = new JLabel("PLEASE LOGIN TO CONTINUE");
					lblSUBaa.setFont(new Font ("Century Gothic", Font.PLAIN, 25));
					lblSUBaa.setForeground(Color.decode("#262626"));
					lblSUBaa.setBounds(120, 90, 500, 50);
					
				JLabel lblLINEs = new JLabel("______________"
						+ "________________");
					lblLINEs.setFont(new Font ("Century Gothic", Font.PLAIN, 25));
					lblLINEs.setForeground(Color.decode("#262626"));
					lblLINEs.setBounds(100, 115, 600, 50);
					
				//ADD TO PANEL
					loginPANE.add(lblMAINsa);
					loginPANE.add(lblSUBaa);
					loginPANE.add(lblLINEs);	
					
					
					/******** USERNAME AND PASSWORD ********/
				//USERNAME
					JLabel lblUSER = new JLabel("USERNAME:");
						lblUSER.setFont(new Font ("arial",Font.BOLD,16));
						lblUSER.setForeground(Color.decode("#262626"));
					JTextField txfUSERs = new JTextField ();
						txfUSERs.setFont(new Font ("arial",Font.BOLD,16));
						txfUSERs.setToolTipText("Enter your Username");
						txfUSERs.requestFocus();
						
				//PASSWORD	
					JLabel lblPASS = new JLabel("PASSWORD:");
						lblPASS.setFont(new Font ("arial",Font.BOLD,16));
						lblPASS.setForeground(Color.decode("#262626"));
					JPasswordField txfPASSa = new JPasswordField ();
						txfPASSa.setFont(new Font ("arial",Font.BOLD,16));
						txfPASSa.setToolTipText("Enter your Password");
					JCheckBox cbPASS = new JCheckBox(" Show Password");
							cbPASS.setBackground(Color.decode("#f2f2f2"));	
							cbPASS.setFont(new Font ("arial",Font.PLAIN,16));
					//BUTTON
					JButton btnLOGINsss = new JButton("LOG IN");
						btnLOGINsss.setFont(BUTTON);
						btnLOGINsss.setForeground(Color.decode("#f2f2f2"));
						btnLOGINsss.setBackground(Color.decode("#000000"));
					JButton btnCANCEL = new JButton("CANCEL");
						btnCANCEL.setFont(BUTTON);
						btnCANCEL.setForeground(Color.decode("#f2f2f2"));
						btnCANCEL.setBackground(Color.decode("#731010"));
							
					//SET BOUNDS
						lblUSER.setBounds(140,200,130,35);
						txfUSERs.setBounds(270,200,170,30);
							
						lblPASS.setBounds(140,250,130,35);
						txfPASSa.setBounds(270,250,170,30);	
						cbPASS.setBounds(135,300,180,20);
							
						btnLOGINsss.setBounds(140,350,140,35);
						btnCANCEL.setBounds(298,350,140,35);							
					//ADD TO PANEL
						loginPANE.add(lblUSER);	
						loginPANE.add(txfUSERs);	
						loginPANE.add(btnLOGINsss);	
						loginPANE.add(cbPASS);
						loginPANE.add(lblPASS);	
						loginPANE.add(txfPASSa);	
						loginPANE.add(btnCANCEL);	
							
						btnLOGINsss.addActionListener(new ActionListener() {
							public void actionPerformed (ActionEvent e) {
								if (usernamePassword.contains("Username: " + txfUSERs.getText()) && 
										usernamePassword.contains("Password: " + txfPASSa.getText())){
									System.out.println(usernamePassword.contains("Username: " + txfUSERs.getText()));
									System.out.println(usernamePassword.contains("Password: " + txfPASSa.getText()));
									JOptionPane.showMessageDialog(null,"Successfully Logged-in as Human");
								}else {
									JOptionPane.showMessageDialog(null,"You are failure");
								}

							}
						});
							
			
				
	}
	

	public static void main(String[] args) {
		new test();
	}
}
