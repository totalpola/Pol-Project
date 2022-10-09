package BPHAI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class NewPasswordFrame {
	public NewPasswordFrame(){
//------------------------------------------FONT----------------------------------------------//	
		Font FONT1 = new Font ("Elephant", Font.ITALIC, 40);
		Font FONT2 = new Font ("Century Gothic", Font.PLAIN, 25);
		Font FONT3 = new Font ("Arial Black",Font.BOLD,18);
		Font BUTTON = new Font ("Century Gothic", Font.BOLD, 18);
//------------------------------------------PANEL----------------------------------------------//		
		JPanel passwordPANE = new JPanel ();
			passwordPANE.setBackground(Color.decode("#f2f2f2"));
			passwordPANE.setLayout(null);
//----------------------------------------COMPONENTS----------------------------------------------//
		/******** TITLE ********/
			JLabel lblMAIN = new JLabel("Janssenville Subdivision");
				lblMAIN.setFont(FONT1);
				lblMAIN.setForeground(Color.decode("#0d0d0d"));
			JLabel lblSUBa = new JLabel("PROTECT YOUR ACCOUNT!");
				lblSUBa.setFont(FONT2);
				lblSUBa.setForeground(Color.decode("#262626"));
			JLabel lblLINE = new JLabel("______________"
					+ "________________");
				lblLINE.setFont(FONT2);
				lblLINE.setForeground(Color.decode("#262626"));
			//SET BOUNDS
				lblMAIN.setBounds(30, 15, 600, 50);
				lblSUBa.setBounds(135, 90, 500, 50);
				lblLINE.setBounds(100, 115, 600, 50);
			//ADD TO PANEL
				passwordPANE.add(lblMAIN);
				passwordPANE.add(lblSUBa);
				passwordPANE.add(lblLINE);
		/********NAME*******/
			JLabel lblNAME = new JLabel ("USERNAME: " + LoginFrame.usrNAME.toString().toUpperCase() );
				lblNAME.setFont(FONT3);
				lblNAME.setForeground(Color.decode("#0d0d0d"));
			//SET BOUNDS
				lblNAME.setBounds(100, 170, 630, 35);
			//ADD TO PANEL
				passwordPANE.add(lblNAME);
		/********PASS********/
			JLabel lblTEXTa = new JLabel ("New Password:");
				 lblTEXTa.setFont(new Font ("Arial",Font.PLAIN,18));
				 lblTEXTa.setForeground(Color.decode("#262626"));
			JTextField txfPASS = new JTextField();
			JLabel lblTEXTb = new JLabel ("Confirm Password:");
				lblTEXTb.setFont(new Font ("Arial",Font.PLAIN,18));
				lblTEXTb.setForeground(Color.decode("#262626"));
			JTextField txfPASScon = new JTextField();
			//SET BOUNDS
				 lblTEXTa.setBounds(143,220,230,35);
				 txfPASS.setBounds(290,220,170,30);
				 
				 lblTEXTb.setBounds(118,270,230,35);
				 txfPASScon.setBounds(290,270,170,30);
			//ADD TO PANEL
				 passwordPANE.add(lblTEXTa);
				 passwordPANE.add(txfPASS);
				 passwordPANE.add(lblTEXTb);
				 passwordPANE.add(txfPASScon);	
		/********BUTTONS********/
			JButton btnLOGIN = new JButton ("ENTER");
				 btnLOGIN.setForeground(Color.decode("#f2f2f2"));
				 btnLOGIN.setFont(BUTTON);
				 btnLOGIN.setBackground(Color.decode("#262626"));
			JButton btnBACK = new JButton ("BACK");
				btnBACK.setForeground(Color.decode("#f2f2f2"));
				btnBACK.setBackground(Color.decode("#737373"));
				btnBACK.setFont(BUTTON);
			//SET BOUNDS
				 btnLOGIN.setBounds(160,330,120,35);
				 btnBACK.setBounds(300,330,120,35);
			//ADD TO PANEL
				 passwordPANE.add(btnLOGIN);
				 passwordPANE.add(btnBACK);
//----------------------------------------FRAME----------------------------------------------//		
		JFrame passwordFRAME = new JFrame("JSCR 2022 ELECTION | Change Password");
			passwordFRAME.setVisible(true);
			passwordFRAME.setResizable(false);
			passwordFRAME.setBounds(440, 100, 600, 450);
			passwordFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			passwordFRAME.add(passwordPANE);
			
//----------------------------------------EVENTS----------------------------------------------//
			btnLOGIN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (txfPASS.getText().length() >= 8 && txfPASS.getText().equals(txfPASScon.getText())) {
						try 
		        		{
							Class.forName("com.mysql.cj.jdbc.Driver");
							java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oopr213","root","");
							String SQL = "UPDATE tbl_userinfo SET bp_PASSWORD=? WHERE bp_USERNAME='"+LoginFrame.usrNAME+"'";
							java.sql.PreparedStatement prpstm = ((Connection) con).prepareStatement(SQL);
							prpstm.setString(1, "" + txfPASS.getText());
							
							prpstm.executeUpdate();
							((Connection) con).close();
							
							JOptionPane.showMessageDialog(null,"PASSWORD UPDATED");
		        		}
		        		catch(Exception ex)
		        		{
		        			JOptionPane.showMessageDialog(null, ex.getMessage());
		        		}
						passwordFRAME.setVisible(false);
						new AccountFrame();
					}
					else if (txfPASS.getText().length() < 8){
						JOptionPane.showMessageDialog(null,"PASSWORD SHOULD ATLEAST BE 8 CHARACTERS.");
						txfPASS.setText("");
						txfPASScon.setText("");
						txfPASS.requestFocus();
					}else if(!txfPASS.getText().equals(txfPASScon.getText())) {
						JOptionPane.showMessageDialog(null,"PASSWORDS DO NOT MATCH");
						txfPASScon.setText("");
						txfPASScon.requestFocus();
					}else {}
				}
			});
			btnBACK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					passwordFRAME.setVisible(false);
					new AccountFrame();		
				}
			});
	}
	
	public static void main(String[] args) {
		new PasswordFrame();
	}
}
