package BPHAI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.time.LocalDateTime;

public class AccountFrame {
	List listNAME, listHOME, listUSERNAME, listPASSWORD, listVOTE;
	public AccountFrame(){
//-----------------------------------------FONT------------------------------------------------//
		Font BUTTON = new Font ("Century Gothic", Font.BOLD, 18);
//------------------------------------------PANEL----------------------------------------------//
		JPanel accountPANE = new JPanel();
			accountPANE.setBackground(Color.decode("#f2f2f2"));
			accountPANE.setLayout(null);
//----------------------------------------COMPONENTS--------------------------------------------//
		/********TITLE********/
			JLabel lblMAIN = new JLabel("Janssenville Subdivision");
				lblMAIN.setFont(new Font ("Elephant", Font.ITALIC,40));
				lblMAIN.setForeground(Color.decode("#0d0d0d"));
			JLabel lblSUBa = new JLabel("VIEW ACCOUNT");
			lblSUBa.setFont(new Font ("Century Gothic", Font.PLAIN, 25));
				lblSUBa.setForeground(Color.decode("#262626"));
			JLabel lblLINE = new JLabel("_________________________________");
				lblLINE.setFont(new Font ("Century Gothic_", Font.PLAIN, 25));
				lblLINE.setForeground(Color.decode("#262626"));	
				//SET BOUNDS
					lblMAIN.setBounds(50,15,700,50);
					lblSUBa.setBounds(218, 70, 500, 50);
					lblLINE.setBounds(75, 95, 800, 50);
				//ADD TO PANEL
					accountPANE.add(lblMAIN);
					accountPANE.add(lblSUBa);
					accountPANE.add(lblLINE);
		/********USER INFO********/
			JLabel lblNAME = new JLabel("HOMEOWNER: ");
				lblNAME.setFont(new Font("Arial Black", Font.BOLD, 16));
				lblNAME.setForeground(Color.decode("#262626"));
			listNAME = new List();
				listNAME.setFont(new Font("century gothic", Font.PLAIN, 16));
			JLabel lblHOME = new JLabel("ADDRESS: ");
				lblHOME.setFont(new Font("Arial Black", Font.BOLD, 16));
				lblHOME.setForeground(Color.decode("#262626"));
			listHOME = new List();
				listHOME.setFont(new Font("century gothic", Font.PLAIN, 16));
			JLabel lblUSERNAME = new JLabel("USERNAME: ");
				lblUSERNAME.setFont(new Font("Arial Black", Font.BOLD, 16));
				lblUSERNAME.setForeground(Color.decode("#262626"));
			listUSERNAME = new List();
				listUSERNAME.setFont(new Font("century gothic", Font.PLAIN, 16));
			JLabel lblPASSWORD = new JLabel("PASSWORD: ");
				lblPASSWORD.setFont(new Font("Arial Black", Font.BOLD, 16));
				lblPASSWORD.setForeground(Color.decode("#262626"));
			listPASSWORD = new List();
				listPASSWORD.setFont(new Font("century gothic", Font.PLAIN, 16));
			JButton btnPASSWORD = new JButton("NEW PASSWORD");
				btnPASSWORD.setFont(new Font("century gothic", Font.BOLD, 16));
				btnPASSWORD.setForeground(Color.decode("#f2f2f2"));
				btnPASSWORD.setBackground(Color.decode("#0d0d0d"));
				//SET BOUNDS
					lblNAME.setBounds(75,150,150,40);
					listNAME.setBounds(240,160,300,24);
					lblHOME.setBounds(75, 190, 150, 40);
					listHOME.setBounds(240,200,300,24);
					lblUSERNAME.setBounds(75, 230, 150, 40);
					listUSERNAME.setBounds(240,240,300,24);
					lblPASSWORD.setBounds(75, 270, 150, 40);
					listPASSWORD.setBounds(240, 280, 300, 24);
					btnPASSWORD.setBounds(380,320,160,35);					
				//ADD TO PANE
					accountPANE.add(lblNAME);
					accountPANE.add(listNAME);
					accountPANE.add(lblHOME);
					accountPANE.add(listHOME);
					accountPANE.add(lblUSERNAME);
					accountPANE.add(listUSERNAME);
					accountPANE.add(lblPASSWORD);
					accountPANE.add(listPASSWORD);
					accountPANE.add(btnPASSWORD);
		/********LIST OF VOTES********/
			listVOTE = new List();
				listVOTE.setFont(new Font ("Century Gothic", Font.PLAIN, 16));
				listVOTE.add("     ..................."
						+ "...........................................");
				listVOTE.add("                 "
						+"               VOTE");
				listVOTE.add("                "
						+ "```````````````````````````````````");
				//SET BOUNDS 
					listVOTE.setBounds(170, 375, 300, 255);
				//ADD TO PANE
					accountPANE.add(listVOTE);
		/********BUTTONS********/
			JButton btnBACK = new JButton ("BACK");
				btnBACK.setFont(BUTTON);
				btnBACK.setForeground(Color.decode("#f2f2f2"));
				btnBACK.setBackground(Color.decode("#737373"));
			JButton btnDEL = new JButton("DELETE ACCOUNT");
				btnDEL.setFont(BUTTON);
				btnDEL.setForeground(Color.decode("#f2f2f2"));
				btnDEL.setBackground(Color.decode("#731010"));
				//SET BOUNDS
				btnBACK.setBounds(20,645,120,35);
				btnDEL.setBounds(400,645,200,35);
				//ADD TO PANE
				accountPANE.add(btnBACK);
				accountPANE.add(btnDEL);
//------------------------------------------FRAME----------------------------------------------//
		JFrame accountFRAME = new JFrame("JSCR 2022 ELECTION | User Account");
			accountFRAME.setVisible(true);
			accountFRAME.setResizable(false);
			accountFRAME.setBounds(410, 0, 640, 732);
			accountFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			accountFRAME.add(accountPANE);	
			
			
//------------------------------------------EVENTS----------------------------------------------//
			btnBACK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					accountFRAME.setVisible(false);
					new MainFrame();
				}
			});
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oopr213","root","");
				java.sql.Statement stmt=con.createStatement();
				String SQL ="SELECT * FROM tbl_userinfo WHERE bp_USERNAME = '" +LoginFrame.usrNAME+"'";
				//String votes;
				ResultSet rs = stmt.executeQuery(SQL);	 
					if(rs.next()) {
					/********USER INFO********/
						String strNAME = rs.getString("bp_NAME").toString();
						String strHOME = rs.getString("bp_HOME").toString();
						String strUSERNAME = rs.getString("bp_USERNAME").toString();
						String strPASSWORD = rs.getString("bp_PASSWORD").toString();
						
						listNAME.add(" " + strNAME);
						listHOME.add("" + strHOME);
						listUSERNAME.add(" " + strUSERNAME);
						listPASSWORD.add(" " + strPASSWORD);
					}					
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oopr213","root","");
				java.sql.Statement stmt=con.createStatement();
				String SQL ="SELECT * FROM tbl_votes WHERE bp_USERNAME ='" +LoginFrame.usrNAME+"'";
				ResultSet rs = stmt.executeQuery(SQL);	
				
				if(!rs.next()) {
					listVOTE.removeAll();
					listVOTE.add("     ..................."
							+ "...........................................");
					listVOTE.add("                 "
							+"               VOTE");
					listVOTE.add("                "
							+ "```````````````````````````````````");
					listVOTE.add("                       NO VOTES YET");
				}else {
					String strV1 = rs.getString("bp_V1").toString();
					String strV2 = rs.getString("bp_V2").toString();
					String strV3 = rs.getString("bp_V3").toString();
					String strV4 = rs.getString("bp_V4").toString();
					String strV5 = rs.getString("bp_V5").toString();
					String strV6 = rs.getString("bp_V6").toString();
					String strV7 = rs.getString("bp_V7").toString();
					String strV8 = rs.getString("bp_V8").toString();
					String strV9 = rs.getString("bp_V9").toString();
					String strV10 = rs.getString("bp_V10").toString();
					
					listVOTE.add("1.  " + strV1);
					listVOTE.add("2.  " + strV2);
					listVOTE.add("3.  " + strV3);
					listVOTE.add("4.  " + strV4);
					listVOTE.add("5.  " + strV5);
					listVOTE.add("6.  " + strV6);
					listVOTE.add("7.  " + strV7);
					listVOTE.add("8.  " + strV8);
					listVOTE.add("9.  " + strV9);
					listVOTE.add("10. " + strV10);
				}
			}catch(Exception ex) {
			}
			btnPASSWORD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					accountFRAME.setVisible(false);
					new NewPasswordFrame();
				}
			});
			
			btnDEL.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int	yes = JOptionPane.showConfirmDialog(null, "DELETE ACCOUNNT");
					if(yes==JOptionPane.YES_OPTION) {
							try {
								Class.forName("com.mysql.cj.jdbc.Driver");
								java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oopr213","root","");
								String rs ="INSERT INTO tbl_archive (bp_NAME, bp_HOME, bp_USERNAME, bp_PASSWORD, bp_ACTION, bp_DATE, "
										+ "bp_V1, bp_V2, bp_V3, bp_V4, bp_V5, bp_V6, bp_V7, bp_V8, bp_V9, bp_V10)"
							 			+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
								String date = LocalDateTime.now().toString();
								java.sql.PreparedStatement prpstm = ((Connection) con).prepareStatement(rs);
									prpstm.setString(1, "" + listNAME.getItem(0).toString());
									prpstm.setString(2, "" + listHOME.getItem(0).toString());
									prpstm.setString(3, "" + listUSERNAME.getItem(0).toString());
									prpstm.setString(4, "" + listPASSWORD.getItem(0).toString());
									prpstm.setString(5, "USER");
									prpstm.setString(6, "" + date);
									prpstm.setString(7, "" + listVOTE.getItem(3).toString().substring(4));
									prpstm.setString(8, "" + listVOTE.getItem(4).toString().substring(4));
									prpstm.setString(9, "" + listVOTE.getItem(5).toString().substring(4));
									prpstm.setString(10, "" + listVOTE.getItem(6).toString().substring(4));
									prpstm.setString(11, "" + listVOTE.getItem(7).toString().substring(4));
									prpstm.setString(12, "" + listVOTE.getItem(8).toString().substring(4));
									prpstm.setString(13, "" + listVOTE.getItem(9).toString().substring(4));
									prpstm.setString(14, "" + listVOTE.getItem(10).toString().substring(4));
									prpstm.setString(15, "" + listVOTE.getItem(11).toString().substring(4));
									prpstm.setString(16, "" + listVOTE.getItem(12).toString().substring(4));
									
									prpstm.executeUpdate();	
			    	        	((Connection) con).close();
								
							}catch(Exception ex) {
								JOptionPane.showMessageDialog(null, ex.getMessage());
							}
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oopr213","root","");
							String v1 ="DELETE FROM  tbl_userinfo WHERE  bp_USERNAME = '" + LoginFrame.usrNAME + "'";
	    		    		java.sql.PreparedStatement prpstm1 = ((Connection) con).prepareStatement(v1);			
	    		   	        	prpstm1.executeUpdate();	
	    		   	        	((Connection) con).close();
						}catch(Exception ex) {
						}
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oopr213","root","");
							String v1 ="DELETE FROM  tbl_votes WHERE  bp_USERNAME = '" + LoginFrame.usrNAME + "'";
	    		    		java.sql.PreparedStatement prpstm1 = ((Connection) con).prepareStatement(v1);			
	    		   	        	prpstm1.executeUpdate();	
	    		   	        	((Connection) con).close();
						}catch(Exception ex) {
						}
						
						JOptionPane.showMessageDialog(null, "ACCOUNT DELETED");
						accountFRAME.setVisible(false);
						new WelcomeFrame();
					}
				}
			});
	}
	public static void main(String[] args) {
		//new AccountFrame();
	}

}
