package BPHAI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.time.LocalDateTime;

public class LoginFrame  {
	mainClass newWelcome = new mainClass(); 
	
	public LoginFrame() {
//------------------------------------------FONT----------------------------------------------//	
		Font BUTTON = new Font ("Century Gothic", Font.BOLD, 18);
		
//------------------------------------------PANEL----------------------------------------------//		
		JPanel loginPANE = new JPanel ();
			loginPANE.setBackground(Color.decode("#f2f2f2"));
			loginPANE.setLayout(null);
			
//------------------------------------------COMPONENTS----------------------------------------------//	
		/******** TITLE ********/
			JLabel lblMAIN = new JLabel("Janssenville Subdivision");
				lblMAIN.setFont(new Font ("Elephant",Font.ITALIC,40));
				lblMAIN.setForeground(Color.decode("#0d0d0d"));
			JLabel lblSUBa = new JLabel("PLEASE LOGIN TO CONTINUE");
				lblSUBa.setFont(new Font ("Century Gothic", Font.PLAIN, 25));
				lblSUBa.setForeground(Color.decode("#262626"));
			JLabel lblLINE = new JLabel("______________"
					+ "________________");
				lblLINE.setFont(new Font ("Century Gothic", Font.PLAIN, 25));
				lblLINE.setForeground(Color.decode("#262626"));	
			//SET BOUNDS
				lblMAIN.setBounds(30,15,700,50);
				lblSUBa.setBounds(120, 90, 500, 50);
				lblLINE.setBounds(100, 115, 600, 50);
			//ADD TO PANEL
				loginPANE.add(lblMAIN);
				loginPANE.add(lblSUBa);
				loginPANE.add(lblLINE);
		/******** USERNAME AND PASSWORD ********/
		//USERNAME
			JLabel lblUSER = new JLabel("USERNAME:");
				lblUSER.setFont(new Font ("arial",Font.BOLD,16));
				lblUSER.setForeground(Color.decode("#262626"));
			JTextField txfUSER = new JTextField ();
				txfUSER.setFont(new Font ("arial",Font.BOLD,16));
				txfUSER.setToolTipText("Enter your Username");
				txfUSER.requestFocus();
		//PASSWORD	
			JLabel lblPASS = new JLabel("PASSWORD:");
				lblPASS.setFont(new Font ("arial",Font.BOLD,16));
				lblPASS.setForeground(Color.decode("#262626"));
			JPasswordField txfPASS = new JPasswordField ();
				txfPASS.setFont(new Font ("arial",Font.BOLD,16));
				txfPASS.setToolTipText("Enter your Password");
			JCheckBox cbPASS = new JCheckBox(" Show Password");
				cbPASS.setBackground(Color.decode("#f2f2f2"));	
				cbPASS.setFont(new Font ("arial",Font.PLAIN,16));
		//BUTTON
			JButton btnLOGIN = new JButton("LOG IN");
				btnLOGIN.setFont(BUTTON);
				btnLOGIN.setForeground(Color.decode("#f2f2f2"));
				btnLOGIN.setBackground(Color.decode("#000000"));
			JButton btnCANCEL = new JButton("CANCEL");
				btnCANCEL.setFont(BUTTON);
				btnCANCEL.setForeground(Color.decode("#f2f2f2"));
				btnCANCEL.setBackground(Color.decode("#731010"));
			//SET BOUNDS
				lblUSER.setBounds(140,200,130,35);
				txfUSER.setBounds(270,200,170,30);
				
				lblPASS.setBounds(140,250,130,35);
				txfPASS.setBounds(270,250,170,30);	
				cbPASS.setBounds(135,300,180,20);
				
				btnLOGIN.setBounds(140,350,140,35);
				btnCANCEL.setBounds(298,350,140,35);							
			//ADD TO PANEL
				loginPANE.add(lblUSER);	
				loginPANE.add(txfUSER);	
				loginPANE.add(btnLOGIN);	
				loginPANE.add(cbPASS);
				loginPANE.add(lblPASS);	
				loginPANE.add(txfPASS);	
				loginPANE.add(btnCANCEL);	
		/*********LOWER*********/
		//BACK BUTTON
			JButton btnBACK = new JButton("BACK");
				btnBACK.setFont(BUTTON);
				btnBACK.setForeground(Color.decode("#f2f2f2"));
				btnBACK.setBackground(Color.decode("#737373"));
			//SET BOUNDS
				btnBACK.setBounds(20,450,120,35);
			//ADD TO PANELS
				loginPANE.add(btnBACK);
				
//------------------------------------------FRAME----------------------------------------------//	
		JFrame loginFRAME = new JFrame("JSCR 2022 ELECTION | Log In");
			loginFRAME.setVisible(true);
			loginFRAME.setResizable(false);
			loginFRAME.setBounds(430, 100, 600, 540);
			loginFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			loginFRAME.add(loginPANE);	
			
			
//------------------------------------------EVENTS----------------------------------------------//	
			cbPASS.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						txfPASS.setEchoChar((char) 0);
			        } else {
			             txfPASS.setEchoChar('\u2022');
			        }
				}
			});
			
//LOGN BUTTON			
			btnLOGIN.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {
			
					String usrNAME = txfUSER.getText();  
					String usrPASS = txfPASS.getText();
								
					System.out.println(newWelcome.EmailAndPass.contains("Username: " + usrNAME));
					System.out.println(newWelcome.EmailAndPass.contains("Password: " + usrPASS));

				}
			});
			
//CANCEL BUTTON			
			btnCANCEL.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {

//					if (!cbPASS.isSelected()) {
//					txfPASS.setEchoChar('\u2022');
//					
//					txfUSER.setText("");		
//					txfUSER.requestFocus();
//					
//					txfPASS.setText("");
//					}
//					else {
//						txfUSER.setText("");
//						txfUSER.requestFocus();
//						
//						txfPASS.setText("");
//						cbPASS.setSelected(false);
//					}
					
				}
			});
			
			
//Back Button			
			btnBACK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					new WelcomeFrame();		
				}
			});
}
	
public static void main(String[] args) {
//		new LoginFrame();
	}

}
