package BPHAI;

import javax.swing.*;
import javax.swing.text.NumberFormatter;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;



public class SignUpFrame {
	static String strNAME, strADDRESS;
	
	
	mainClass mainClass = new mainClass();  //Main Frame
	
	public SignUpFrame() {
//------------------------------------------FONT----------------------------------------------//	
		Font FONT5 = new Font ("ARIAL BLACK", Font.PLAIN, 28);
		Font BUTTON = new Font ("Century Gothic", Font.BOLD, 20);
//------------------------------------------PANE----------------------------------------------//			
		JPanel signupPANE = new JPanel ();
			signupPANE.setBackground(Color.decode("#f2f2f2"));
			signupPANE.setLayout(null);

//------------------------LOGIN------------------------//
		/******** TITLE ********/
			JLabel lblMAIN = new JLabel("Sillicon valley Subdivision ");
				lblMAIN.setFont(new Font ("Elephant",Font.ITALIC,40));
				lblMAIN.setForeground(Color.decode("#0d0d0d"));
			JLabel lblSUBa = new JLabel("2022");
				lblSUBa.setFont(new Font ("Impact", Font.PLAIN, 20));
				lblSUBa.setForeground(Color.decode("#262626"));
			JLabel lblSUBb = new JLabel("ELECTION");
				lblSUBb.setFont(new Font ("Impact", Font.PLAIN, 20));
				lblSUBb.setForeground(Color.decode("#262626"));		
				//SET BOUNDS
					lblMAIN.setBounds(30,15,700,50);
					lblSUBa.setBounds(1282,15,50,35);
					lblSUBb.setBounds(1250,40,100,30);
				//ADD TO PANEL
					signupPANE.add(lblMAIN);
					signupPANE.add(lblSUBa);
					signupPANE.add(lblSUBb);
					
		/******** NAME ********/
			JLabel lblNAME = new JLabel("N A M E");
				lblNAME.setFont(FONT5);
				lblNAME.setForeground(Color.decode("#262626"));
			JLabel lblLNAME = new JLabel("Last Name:");
				lblLNAME.setFont(new Font ("arial",Font.BOLD,16));
			JTextField txfLNAME = new JTextField();
				txfLNAME.setFont(new Font ("arial",Font.PLAIN,16));
				txfLNAME.setToolTipText("Enter your Last Name");
			JLabel lblFNAME = new JLabel("First Name: ");
				lblFNAME.setFont(new Font ("arial",Font.BOLD,16));
			JTextField txfFNAME = new JTextField();
				txfFNAME.setFont(new Font ("arial",Font.PLAIN,16));
				txfFNAME.setToolTipText("Enter your First Name");
				//SET BOUNDS
					lblNAME.setBounds(637,150,150,30);
					
					lblLNAME.setBounds(330,200,90,30);
					txfLNAME.setBounds(430,200,200,27);
					
					lblFNAME.setBounds(750,200,100,30);
					txfFNAME.setBounds(850,200,200,27);
				//ADD TO PANELS
					signupPANE.add(lblNAME);
					signupPANE.add(lblLNAME);
					signupPANE.add(txfLNAME);
					signupPANE.add(lblFNAME);
					signupPANE.add(txfFNAME);
					
		/******** ADDRESS ********/
			NumberFormat longFormat = NumberFormat.getIntegerInstance();
			NumberFormatter numFORMAT = new NumberFormatter(longFormat);
			numFORMAT.setAllowsInvalid(false);
			
			JLabel lblADD = new JLabel("A D D R E S S");
				lblADD.setFont(FONT5);
				lblADD.setForeground(Color.decode("#262626"));
			JLabel lblPHASE = new JLabel("Phase:");
				lblPHASE.setFont(new Font ("arial",Font.BOLD,16));
			Choice chPHASE = new Choice ();
				chPHASE.setFont(new Font ("arial",Font.PLAIN,14));
				chPHASE.addItem(" 1");
				chPHASE.addItem(" 2");
			JLabel lblBLK = new JLabel("Block:");
				lblBLK.setFont(new Font ("arial",Font.BOLD,16));
			Choice chBLK = new Choice();
				chBLK.setFont(new Font ("arial",Font.PLAIN,14));
				chBLK.addItem(" 1");
				chBLK.addItem(" 2");
				chBLK.addItem(" 3");
				chBLK.addItem(" 4");
				chBLK.addItem(" 5");
				chBLK.addItem(" 6");
				chBLK.addItem(" 7");
				chBLK.addItem(" 8");
				chBLK.addItem(" 9");
				chBLK.addItem(" 10");
				chBLK.addItem(" 11");
				chBLK.addItem(" 12");
			JLabel lblLOT = new JLabel("Lot:");
				lblLOT.setFont(new Font ("arial",Font.BOLD,16));
			JFormattedTextField txfLOT = new JFormattedTextField(numFORMAT);
				txfLOT.setToolTipText("LOT#");
			JLabel lblSNAME = new JLabel("Street: ");
				lblSNAME.setFont(new Font ("arial",Font.BOLD,16));
			Choice chSNAME = new Choice();
				chSNAME.setFont(new Font ("arial",Font.PLAIN,14));
				chSNAME.addItem(" Saint Anne           ");
				chSNAME.addItem(" Saint Paul    ");
				chSNAME.addItem(" Saint Lukes  ");
				chSNAME.addItem(" Saint Magdalene          ");
				chSNAME.addItem(" Saint Monica   ");
				chSNAME.addItem(" Saint Ignacius   ");
				chSNAME.addItem(" Saint John   ");
				chSNAME.addItem(" Saint Francis       ");
				chSNAME.addItem(" Saint Benedict      ");
				chSNAME.addItem(" Saint Elizabeth        ");
				chSNAME.addItem(" Saint Theresa     ");
				chSNAME.addItem(" Saint Martin  ");
				//SET BOUNDS
					lblADD.setBounds(603,280,250,30);
						
					lblPHASE.setBounds(330,330,60,30);
					chPHASE.setBounds(410, 333, 50, 30);
							
					lblBLK.setBounds(510,330,70,30);
					chBLK.setBounds(580,333,40,30);
							
					lblLOT.setBounds(680,330,50,30);
					txfLOT.setBounds(730,332,50,27);
						
					lblSNAME.setBounds(825,330,60,30);
					chSNAME.setBounds(900,333,150,32);
					
				//ADD TO PANEL
					signupPANE.add(lblADD);
					signupPANE.add(lblPHASE);
					signupPANE.add(chPHASE);
					signupPANE.add(lblBLK);
					signupPANE.add(chBLK);
					signupPANE.add(lblLOT);
					signupPANE.add(txfLOT);
					signupPANE.add(lblSNAME);
					signupPANE.add(chSNAME);
					
		/******** RESIDING ********/
			JLabel lblRES = new JLabel("H O M E O W E R  |  R E S I D E N T");
				lblRES.setFont(FONT5);
				lblRES.setForeground(Color.decode("#262626"));
			JRadioButton cbMORE = new JRadioButton ("MORE than 6 months");
				cbMORE.setFont(new Font ("arial",Font.PLAIN,16));
				cbMORE.setBackground(Color.decode("#f2f2f2"));
			JRadioButton cbLESS= new JRadioButton("LESS than 6 months"); 
				cbLESS.setBackground(Color.decode("#f2f2f2"));
				cbLESS.setFont(new Font ("arial",Font.PLAIN,16));
			ButtonGroup cbGROUP = new ButtonGroup ();
				cbGROUP.add(cbMORE);
				cbGROUP.add(cbLESS);
				//SET BOUNDS
					lblRES.setBounds(440,430,600,30);
		
					cbMORE.setBounds(495, 480, 200, 30);
					cbLESS.setBounds(715, 480, 200, 30);
				//ADD TO PANEL
					signupPANE.add(lblRES);
					signupPANE.add(cbMORE);
					signupPANE.add(cbLESS);			
					
		/********USERNAME AND PASS********/
			JLabel lblUSER = new JLabel ("U S E R N A M E");
				lblUSER.setFont(FONT5);
				lblUSER.setForeground(Color.decode("#262626"));	
			JLabel lblUSER1 = new JLabel("Username is auto-generated");
				lblUSER1.setFont(new Font ("arial",Font.ITALIC,16));
			JLabel lblPASS = new JLabel ("P A S S W O R D ");
				lblPASS.setFont(FONT5);
				lblPASS.setForeground(Color.decode("#262626"));	
			JLabel lblPASSnew = new JLabel ("Type Password:");
				lblPASSnew.setFont(new Font ("arial",Font.PLAIN,16));
				lblPASSnew.setForeground(Color.decode("#262626"));
			JLabel lblPASScon = new JLabel ("Confirm Password:");
				lblPASScon.setFont(new Font ("arial",Font.PLAIN,16));
				lblPASScon.setForeground(Color.decode("#262626"));
			JTextField txfPASS = new JTextField();
			JTextField txfPASScon = new JTextField();
				//SET BOUNDS
					lblUSER.setBounds(588,150,250,30);
					lblUSER1.setBounds(605,190,250,30);
						
				    lblPASS.setBounds(583,290,250,30);
				    
				    lblPASSnew.setBounds(540,350,250,30);
				    txfPASS.setBounds(690,350,175,27);
					 
					lblPASScon.setBounds(520,400,250,30);
					txfPASScon.setBounds(690,400,175,27);
				//ADD TO PANEL
					 signupPANE.add(lblUSER);
					 signupPANE.add(lblUSER1);
					 signupPANE.add(lblPASS);
					 signupPANE.add(lblPASSnew);
					 signupPANE.add(txfPASS);
					 signupPANE.add(lblPASScon);
					 signupPANE.add(txfPASScon);
		/******** BUTTONS ********/
					 
		
			JButton btnBACK1 = new JButton ("BACK");
				btnBACK1.setFont(BUTTON);
				btnBACK1.setForeground(Color.decode("#f2f2f2"));
				btnBACK1.setBackground(Color.decode("#737373"));
				
			JButton btnNEXT = new JButton("NEXT");
				btnNEXT.setFont(BUTTON);
				btnNEXT.setForeground(Color.decode("#f2f2f2"));
				btnNEXT.setBackground(Color.decode("#333333"));
				//SET BOUNDS
					btnNEXT.setBounds(715,620,200,35);
					btnBACK1.setBounds(470,620,200,35);
				//ADD TO PANEL
					signupPANE.add(btnNEXT);
					signupPANE.add(btnBACK1);
					
			JButton btnBACK2 = new JButton ("BACK");
				btnBACK2.setFont(BUTTON);
				btnBACK2.setForeground(Color.decode("#f2f2f2"));
				btnBACK2.setBackground(Color.decode("#737373"));
			JButton btnSIGNUP = new JButton("LOGIN");
				btnSIGNUP.setFont(BUTTON);
				btnSIGNUP.setForeground(Color.decode("#f2f2f2"));
				btnSIGNUP.setBackground(Color.decode("#000000"));
			btnBACK2.setVisible(false);
			btnBACK2.setEnabled(false);
			btnSIGNUP.setVisible(false);
			btnSIGNUP.setEnabled(false);
				//SET BOUNDS
					btnSIGNUP.setBounds(715,620,200,35);
					btnBACK2.setBounds(470,620,200,35);
				//ADD TO PANEL
					signupPANE.add(btnSIGNUP);
					signupPANE.add(btnBACK2);			
//------------------------------------------FRAME----------------------------------------------//	
		JFrame signupFRAME = new JFrame("JSCR 2022 ELECTION | Sign Up");
			signupFRAME.setVisible(true);
			signupFRAME.setResizable(false);
			signupFRAME.setBounds(-6, 0,1500, 733);
			signupFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			signupFRAME.add(signupPANE);
//------------------------------------------EVENTS----------------------------------------------//	
				
			lblUSER.setVisible(false);
			lblUSER1.setVisible(false);
			lblPASS.setVisible(false);
			lblPASSnew.setVisible(false);
			txfPASS.setVisible(false);
			lblPASScon.setVisible(false);
			txfPASScon.setVisible(false);
			btnBACK2.setVisible(false);
			btnBACK2.setEnabled(false);
			btnSIGNUP.setVisible(false);
			btnSIGNUP.setEnabled(false);
			
//**********************************BACK			
				btnBACK1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						signupFRAME.setVisible(false);
						new WelcomeFrame();
					}
				});
				
//***********************************NEXT				
				btnNEXT.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(txfLNAME.getText().toString().isEmpty() || txfFNAME.getText().toString().isEmpty()) {
							
							JOptionPane.showMessageDialog(null, "COMPLETE NAME INFORMATION");
							
							}else if(txfLOT.getText().toString().isEmpty()){
								
								JOptionPane.showMessageDialog(null, "INPUT LOT NUMBER");
								
							}else if(cbMORE.isSelected()==false && cbLESS.isSelected()==false){
								
								JOptionPane.showMessageDialog(null, "INFORMATION NOT COMPLETE");
								
							}else if(cbLESS.isSelected()) {
								
								JOptionPane.showMessageDialog(null, "YOU ARE NOT QUALIFIED TO VOTE");
								
							}else {

								lblNAME.setVisible(false);
		    					lblLNAME.setVisible(false);
		    					txfLNAME.setVisible(false);
		    					lblFNAME.setVisible(false);
		    					txfFNAME.setVisible(false);
		    					lblADD.setVisible(false);
		    					lblPHASE.setVisible(false);
		    					chPHASE.setVisible(false);
		    					lblBLK.setVisible(false);
		    					chBLK.setVisible(false);
		    					lblLOT.setVisible(false);
		    					txfLOT.setVisible(false);
		    					lblSNAME.setVisible(false);
		    					chSNAME.setVisible(false);
		    					lblRES.setVisible(false);
		    					cbMORE.setVisible(false);
		    					cbLESS.setVisible(false);
		    									
		    					btnBACK1.setVisible(false);
		    					btnBACK1.setEnabled(false);
		    					btnNEXT.setVisible(false);
		    					btnNEXT.setEnabled(false);
		    									
		    					lblUSER.setVisible(true);
		    					lblUSER1.setVisible(true);
		    					lblPASS.setVisible(true);
		    					lblPASSnew.setVisible(true);
		    					txfPASS.setVisible(true);
		    					lblPASScon.setVisible(true);
		    					txfPASScon.setVisible(true);
		    					btnBACK2.setVisible(true);
		    					btnBACK2.setEnabled(true);
		    					btnSIGNUP.setVisible(true);
		    					btnSIGNUP.setEnabled(true);
		    									
		    					strNAME = txfLNAME.getText().toUpperCase() + ", " 
		    			        			+ txfFNAME.getText().toUpperCase();
		    					strADDRESS = "" + chPHASE.getSelectedItem().toString() + "" +chBLK.getSelectedItem().toString()
		    					+ " " + txfLOT.getText()+ "" + chSNAME.getSelectedItem()+"'";
		    					JOptionPane.showMessageDialog(null, "HOME ADDRESS ALREADY REGISTERED");

		    				}		
					}
				});
				
// ***************************SIGNUP				
				btnSIGNUP.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {		
				if (txfPASS.getText().toString().length() < 8) {
					
					JOptionPane.showMessageDialog(null,"PASSWORD SHOULD BE ATLEAST 8 CHARACTERS");
					txfPASScon.setText("");
					txfPASS.setText("");
					
				}
				else if (!txfPASS.getText().equals(txfPASScon.getText())) {
					
					JOptionPane.showMessageDialog(null,"PASSWORDS DO NOT MATCH");
					txfPASScon.setText("");
					txfPASScon.requestFocus();
					
				}
				else {		
					  
					 	String username = txfLNAME.getText().toUpperCase().substring(0, 1) + txfFNAME.getText().toUpperCase().substring(0,1) 
							+ chPHASE.getSelectedItem().toString().substring(1) + chBLK.getSelectedItem().toString().substring(1)
							+ txfLOT.getText().substring(0); 							

					 	lblUSER1.setText(username);
					 	
					 	mainClass.EmailAndPass.add("Username: " + username);
					 	mainClass.EmailAndPass.add("Password: " + txfPASScon.getText());
					 	
					 	JOptionPane.showMessageDialog(null,"Signup Completed!" + "\n" + "USERNAME: " + username);
           			
					 	signupFRAME.setVisible(false);
					 	new WelcomeFrame();
					
	        		}
					}
				});
				
				
// back number 2				
				btnBACK2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						lblNAME.setVisible(true);
						lblLNAME.setVisible(true);
						txfLNAME.setVisible(true);
						lblFNAME.setVisible(true);
						txfFNAME.setVisible(true);
						lblADD.setVisible(true);
						lblPHASE.setVisible(true);
						chPHASE.setVisible(true);
						lblBLK.setVisible(true);
						chBLK.setVisible(true);
						lblLOT.setVisible(true);
						txfLOT.setVisible(true);
						lblSNAME.setVisible(true);
						chSNAME.setVisible(true);
						lblRES.setVisible(true);
						cbMORE.setVisible(true);
						cbLESS.setVisible(true);
						
						btnBACK1.setVisible(true);
						btnBACK1.setEnabled(true);
						btnNEXT.setVisible(true);
						btnNEXT.setEnabled(true);
						
						lblUSER.setVisible(false);
						lblUSER1.setVisible(false);
						lblPASS.setVisible(false);
						lblPASSnew.setVisible(false);
						txfPASS.setVisible(false);
						lblPASScon.setVisible(false);
						txfPASScon.setVisible(false);
						btnBACK2.setVisible(false);
						btnBACK2.setEnabled(false);
						btnSIGNUP.setVisible(false);
						btnSIGNUP.setEnabled(false);
					}
				});
					
	}
	public static void main(String[] args) {
		//new SignUpFrame();
	}
}

