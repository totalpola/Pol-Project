package BPHAI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class AdminFrame {
	static String delUSERNAME;
	private List voteLIST, accountLIST, logsLIST;
	public AdminFrame() {
//-----------------------------------------FONTS---------------------------------------------//
		Font BUTTON = new Font ("Century Gothic", Font.BOLD, 18);
//------------------------------------------PANE----------------------------------------------//			
		JPanel adminPANE = new JPanel ();
			adminPANE.setBackground(Color.decode("#f2f2f2"));
			adminPANE.setLayout(null);
//-----------------------------------------COMPONENTS-----------------------------------------//
		/*******TITLE*******/
			JLabel lblMAIN = new JLabel("Janssenville Subdivision");
				lblMAIN.setFont(new Font ("Elephant", Font.ITALIC,40));
				lblMAIN.setForeground(Color.decode("#0d0d0d"));
			JLabel lblSUBa = new JLabel("2022");
				lblSUBa.setFont(new Font ("Impact", Font.PLAIN, 20));
				lblSUBa.setForeground(Color.decode("#262626"));
			JLabel lblSUBb = new JLabel("ELECTION");
				lblSUBb.setFont(new Font ("Impact", Font.PLAIN, 20));
				lblSUBb.setForeground(Color.decode("#262626"));	
			if(LoginFrame.usrNAME.equals("ADMIN") || LoginFrame.usrNAME.equals("admin")){
				JLabel lblADMIN = new JLabel("ADMIN");
				lblADMIN.setFont(new Font("Arial Black", Font.BOLD, 20));
				lblADMIN.setForeground(Color.decode("#262626"));
				lblADMIN.setBounds(50,120,100,30);
				adminPANE.add(lblADMIN);
			}else {
				JLabel lblADMIN = new JLabel("CHAIRMAN");
				lblADMIN.setFont(new Font("Arial Black", Font.BOLD, 20));
				lblADMIN.setForeground(Color.decode("#262626"));
				lblADMIN.setBounds(50,120,300,30);
				adminPANE.add(lblADMIN);
			}
			/*	JLabel lblADMIN = new JLabel("ADMIN");
				lblADMIN.setFont(new Font("Arial Black", Font.BOLD, 20));
				lblADMIN.setForeground(Color.decode("#262626"));
				lblADMIN.setBounds(50,120,100,30);
				adminPANE.add(lblADMIN);*/
				//SET BOUNDS
					lblMAIN.setBounds(50,15,700,50);
					lblSUBa.setBounds(1280,15,50,35);
					lblSUBb.setBounds(1250,40,100,30);
				//ADD TO PANE
					adminPANE.add(lblMAIN);
					adminPANE.add(lblSUBa);
					adminPANE.add(lblSUBb);
		/********BUTTONS********/
			JButton btnVOTES = new JButton("VIEW VOTES");
				btnVOTES.setFont(BUTTON);
				btnVOTES.setForeground(Color.WHITE);
				btnVOTES.setBackground(Color.decode("#969696"));
			JButton btnUSERS = new JButton("VIEW ACCOUNTS");
				btnUSERS.setFont(BUTTON);
				btnUSERS.setForeground(Color.WHITE);
				btnUSERS.setBackground(Color.decode("#595959"));
			JButton btnLOGS = new JButton("VIEW LOGS");
				btnLOGS.setFont(BUTTON);
				btnLOGS.setForeground(Color.WHITE);
				btnLOGS.setBackground(Color.decode("#262626"));
			JButton btnMENU = new JButton("MAIN MENU");
				btnMENU.setFont(BUTTON);
				btnMENU.setForeground(Color.WHITE);
				btnMENU.setBackground(Color.decode("#0d0d0d"));
				//SETBOUNDS
					btnVOTES.setBounds(50, 260, 350, 50);
					btnUSERS.setBounds(50, 320, 350, 50);
					btnLOGS.setBounds(50, 380, 350, 50);
					btnMENU.setBounds(50, 440, 350, 50);
				//ADD TO PANE
					adminPANE.add(btnVOTES);
					adminPANE.add(btnUSERS);
					adminPANE.add(btnLOGS);
					adminPANE.add(btnMENU);
		/*********OTHER FUNCTIONS**********/
			JTextField txfSEARCH = new JTextField();
				txfSEARCH.setFont(new Font("arial", Font.PLAIN, 15));
				txfSEARCH.setEnabled(false);
			JButton btnSEARCH = new JButton("SEARCH");
				btnSEARCH.setFont(BUTTON);
				btnSEARCH.setForeground(Color.decode("#dfdfdf"));
				btnSEARCH.setBackground(Color.decode("#262626"));
			JButton btnDEL = new JButton("DELETE ACCOUNT");
				btnDEL.setFont(BUTTON);
				btnDEL.setVisible(false);
				btnDEL.setForeground(Color.WHITE);
				btnDEL.setBackground(Color.decode("#731010"));
				//SET BOUNDS
					txfSEARCH.setBounds(50,213,220,30);
					btnSEARCH.setBounds(280,210,120,35);
					btnDEL.setBounds(1110,520,200,40);
				//ADD TO PANE
					adminPANE.add(txfSEARCH);
					adminPANE.add(btnSEARCH);
					adminPANE.add(btnDEL);
		/********************VOTES******************/
			voteLIST = new List();
				voteLIST.setFont(new Font ("Century Gothic", Font.PLAIN, 16)); 
				voteLIST.setVisible(false);
				//SET BOUNDS
					voteLIST.setBounds(440,200,870,300);
				//ADD TO PANE
					adminPANE.add(voteLIST);
		/********************ACCOUNTS************************/
			 accountLIST = new List();
			 	accountLIST.setFont(new Font ("Century Gothic", Font.PLAIN, 16)); 
				accountLIST.setVisible(false);
				//SET BOUNDS
					accountLIST.setBounds(440,200,870,300);
				//ADD TO PANE
					adminPANE.add(accountLIST);
		/********************LOGS************************/
			logsLIST = new List();
				logsLIST.setFont(new Font("Century Gothic", Font.PLAIN, 16));
				logsLIST.setVisible(false);
				//SET BOUNDS
					logsLIST.setBounds(440,200,870,300);
				//ADD TO PANE
					adminPANE.add(logsLIST);
//------------------------------------------FRAME----------------------------------------------//
		JFrame adminFRAME = new JFrame("JSCR 2022 ELECTION | Admin");
			adminFRAME.setVisible(true);
			adminFRAME.setResizable(false);
			adminFRAME.setBounds(-6, 0,1500, 733);
			adminFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			adminFRAME.add(adminPANE);
//------------------------------------------EVENTS-----------------//
			btnVOTES.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txfSEARCH.setEnabled(true);
					accountLIST.setVisible(false);
					btnDEL.setVisible(false);
					voteLIST.removeAll();
					voteLIST.setVisible(false);
					voteLIST.add("-------------------------------------------------------------------"
					+ "------------------------------------------------------------------------------"
					+ "------------------------------------------------------------------------------"
					+ "------------------------------------------------------------------------------"
					+ "------------------------------------------------------------------------------"
					+ "------------------------------------------------------------------------------"
					+ "-----------------------------------------------------------------");
					voteLIST.add("           USERNAME                                   DATE                                        VOTED CANDIDATES");
					voteLIST.add("*********************************************************************"
					+ "********************************************************************************"
					+ "********************************************************************************"
					+ "********************************************************************************"
					+ "********************************************************************************"
					+ "**********************************************");
					voteLIST.setVisible(true);
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oopr213","root","");
						String SQL ="SELECT bp_USERNAME, bp_DATE, bp_V1, bp_V2, bp_V3, bp_V4, bp_V5, bp_V6, bp_V7, bp_V8, bp_V9, bp_V10 FROM tbl_votes"
								+ " ORDER BY bp_ID DESC";
						PreparedStatement stmt=con.prepareStatement(SQL);
						ResultSet rs = stmt.executeQuery(SQL);	
						
						while(rs.next()) {
							String data;
							String strUSERNAME = rs.getString("bp_USERNAME").toString().toUpperCase();
							String strDATE = rs.getString("bp_DATE").toString();
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
							 
							data = "              " + strUSERNAME + "                            " + strDATE + "                          " + strV1 +  "                " + strV2 + "                " 
							+ strV3 + "                " + strV4 + "                " + strV5 + "                " + strV6  + "                " + strV7 + "                " 
							+ strV8 + "               "	+ strV9 + "                " + strV10 + "           ";
							
							voteLIST.add(data);
							voteLIST.add("-------------------------------------------------------------------"
									+ "------------------------------------------------------------------------------"
									+ "------------------------------------------------------------------------------"
									+ "------------------------------------------------------------------------------"
									+ "------------------------------------------------------------------------------"
									+ "------------------------------------------------------------------------------"
									+ "-----------------------------------------------------------------");
						}
							btnSEARCH.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									voteLIST.removeAll();
									voteLIST.add("-------------------------------------------------------------------"
											+ "------------------------------------------------------------------------------"
											+ "------------------------------------------------------------------------------"
											+ "------------------------------------------------------------------------------"
											+ "------------------------------------------------------------------------------"
											+ "------------------------------------------------------------------------------"
											+ "-----------------------------------------------------------------");
											voteLIST.add("           USERNAME                                   DATE                                        VOTED CANDIDATES");
											voteLIST.add("*********************************************************************"
											+ "********************************************************************************"
											+ "********************************************************************************"
											+ "********************************************************************************"
											+ "********************************************************************************"
											+ "**********************************************");
									try{
										Class.forName("com.mysql.cj.jdbc.Driver");
										java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oopr213","root","");
										String SQL = "SELECT * FROM tbl_votes WHERE bp_USERNAME LIKE '%"+txfSEARCH.getText().toString()+"%'"
												+ "OR bp_DATE LIKE  '%"+txfSEARCH.getText().toString()+"%'"
												+ "OR bp_V1 LIKE  '%"+txfSEARCH.getText().toString()+"%'"
												+ "OR bp_V2 LIKE  '%"+txfSEARCH.getText().toString()+"%'"
												+ "OR bp_V3 LIKE  '%"+txfSEARCH.getText().toString()+"%'"
												+ "OR bp_V4 LIKE  '%"+txfSEARCH.getText().toString()+"%'"
												+ "OR bp_V5 LIKE  '%"+txfSEARCH.getText().toString()+"%'"
												+ "OR bp_V6 LIKE  '%"+txfSEARCH.getText().toString()+"%'"
												+ "OR bp_V7 LIKE  '%"+txfSEARCH.getText().toString()+"%'"
												+ "OR bp_V8 LIKE  '%"+txfSEARCH.getText().toString()+"%'"
												+ "OR bp_V9 LIKE  '%"+txfSEARCH.getText().toString()+"%'"
												+ "OR bp_V10 LIKE '%"+txfSEARCH.getText().toString()+"%'"
												+ "ORDER BY bp_ID DESC";
										PreparedStatement sm = con.prepareStatement(SQL);
										ResultSet rs = sm.executeQuery(SQL);
											while(rs.next()) {
												String data;
												String strUSERNAME = rs.getString("bp_USERNAME").toString().toUpperCase();
												String strDATE = rs.getString("bp_DATE").toString();
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
												 
												data = "              " + strUSERNAME + "                            " + strDATE + "                          " + strV1 +  "                " + strV2 + "                " 
												+ strV3 + "                " + strV4 + "                " + strV5 + "                " + strV6  + "                " + strV7 + "                " 
												+ strV8 + "               "	+ strV9 + "                " + strV10 + "           ";
												
												voteLIST.add(data);
												voteLIST.add("-------------------------------------------------------------------"
														+ "------------------------------------------------------------------------------"
														+ "------------------------------------------------------------------------------"
														+ "------------------------------------------------------------------------------"
														+ "------------------------------------------------------------------------------"
														+ "------------------------------------------------------------------------------"
														+ "-----------------------------------------------------------------");
											}
									}catch(Exception ex) {
										JOptionPane.showMessageDialog(null, ex.getMessage());
									}
									
								}
							});
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());
					}
				} 
			});
			btnUSERS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txfSEARCH.setEnabled(true);
					voteLIST.setVisible(false);
					btnDEL.setVisible(true);
					accountLIST.removeAll();
					accountLIST.add("-------------------------------------------------------------------"
					+ "------------------------------------------------------------------------------"
					+ "------------------------------------------");
					accountLIST.add("           USERNAME                                           ADDRSSS"
							+ "                                PASSWORD                           HOMEOWNER");
					accountLIST.add("***********************************************************************"
					+ "*************************************************************************************");
					accountLIST.setVisible(true);
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oopr213","root","");
						String SQL ="SELECT bp_NAME, bp_HOME, bp_USERNAME, bp_PASSWORD FROM tbl_userinfo ORDER BY bp_ID DESC";
						PreparedStatement stmt=con.prepareStatement(SQL);
						ResultSet rs = stmt.executeQuery(SQL);	
						
						while(rs.next()) {
							String data;
							String strNAME = rs.getString("bp_NAME").toString().toUpperCase();
							String strHOME = rs.getString("bp_HOME").toString();
							String strUSERNAME = rs.getString("bp_USERNAME").toString();
							String strPASSWORD = rs.getString("bp_PASSWORD").toString();							
							data = "              " + strUSERNAME + "                                 " + strHOME + 
								   "                                " + strPASSWORD 
								   +  "                         " + strNAME + "           ";
							accountLIST.add(data);
							accountLIST.add("-------------------------------------------------------------------"
									+ "------------------------------------------------------------------------------"
									+ "------------------------------------------");
						}
							btnSEARCH.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									accountLIST.removeAll();
									accountLIST.add("-------------------------------------------------------------------"
											+ "------------------------------------------------------------------------------"
											+ "------------------------------------------");
											accountLIST.add("           USERNAME                                           ADDRSSS"
													+ "                                PASSWORD                           HOMEOWNER");
											accountLIST.add("***********************************************************************"
											+ "*************************************************************************************");
									try{
										Class.forName("com.mysql.cj.jdbc.Driver");
										java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oopr213","root","");
										String SQL = "SELECT * FROM tbl_userinfo WHERE bp_USERNAME LIKE '%"+txfSEARCH.getText().toString()+"%'"
												+ "OR bp_NAME LIKE  '%"+txfSEARCH.getText().toString()+"%'"
												+ "OR bp_HOME LIKE  '%"+txfSEARCH.getText().toString()+"%'"
												+ "OR bp_USERNAME LIKE  '%"+txfSEARCH.getText().toString()+"%'"
												+ "OR bp_PASSWORD LIKE  '%"+txfSEARCH.getText().toString()+"%'"
												+ "ORDER BY bp_ID DESC";
										PreparedStatement sm = con.prepareStatement(SQL);
										ResultSet rs = sm.executeQuery(SQL);
											while(rs.next()) {
												String data;
												String strNAME = rs.getString("bp_NAME").toString().toUpperCase();
												String strHOME = rs.getString("bp_HOME").toString();
												String strUSERNAME = rs.getString("bp_USERNAME").toString();
												String strPASSWORD = rs.getString("bp_PASSWORD").toString();
												data = "              " + strUSERNAME + "                                 " + strHOME + 
														   "                                " + strPASSWORD 
														   +  "                         " + strNAME + "           ";
												accountLIST.add(data);
												accountLIST.add("-------------------------------------------------------------------"
														+ "------------------------------------------------------------------------------"
														+ "------------------------------------------");
											}
									
									}catch(Exception ex) {
									}
								}
							});
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());
					}
					
				}
			});
			btnLOGS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txfSEARCH.setEnabled(true);
					logsLIST.setVisible(true);
					voteLIST.setVisible(false);
					accountLIST.setVisible(false);
					btnDEL.setVisible(false);
					logsLIST.removeAll();
					logsLIST.add("---------------------------------------------------------------------------"
							+ "------------------------------------------------------------------------------"
							+ "----------------"); 
					logsLIST.add("         DATE                                                              "
							+ "                        ACTION"
							+ "                                             USERNAME");
					logsLIST.add("*********************************************************************"
							+ "************************************************************************");
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oopr213","root","");
						String SQL ="SELECT bp_DATE, bp_ACTION, bp_USERNAME FROM tbl_logs ORDER BY bp_DATE DESC";
						PreparedStatement stmt=con.prepareStatement(SQL);
						ResultSet rs = stmt.executeQuery(SQL);
						while(rs.next()) {
							String data;
							String strDATE = rs.getString("bp_DATE").toString();
							String strACTION= rs.getString("bp_ACTION");
							String strUSERNAME = rs.getString("bp_USERNAME").toString().toUpperCase();
							
							data = "         " + strDATE + "                                         "   + strACTION 
								  +"                                             " + strUSERNAME+ "          ";
							logsLIST.add(data);
							logsLIST.add("---------------------------------------------------------------------------"
									+ "------------------------------------------------------------------------------"
									+ "---------------");
						}
						btnSEARCH.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								logsLIST.removeAll();
								logsLIST.add("---------------------------------------------------------------------------"
										+ "------------------------------------------------------------------------------"
										+ "----------------"); 
								logsLIST.add("         DATE                                                              "
										+ "                        ACTION"
										+ "                                             USERNAME");
								logsLIST.add("*********************************************************************"
										+ "************************************************************************");
								try{
									Class.forName("com.mysql.cj.jdbc.Driver");
									java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oopr213","root","");
									String SQL = "SELECT * FROM tbl_logs WHERE bp_USERNAME LIKE '%"+txfSEARCH.getText().toString()+"%'"
											+ "OR bp_DATE LIKE  '%"+txfSEARCH.getText().toString()+"%'"
											+ "OR bp_ACTION LIKE  '%"+txfSEARCH.getText().toString()+"%'"
											+ "ORDER BY bp_DATE DESC";
									PreparedStatement sm = con.prepareStatement(SQL);
									ResultSet rs = sm.executeQuery(SQL);
										while(rs.next()) {
											String data;
											String strDATE = rs.getString("bp_DATE").toString().toUpperCase();
											String strACTION = rs.getString("bp_ACTION").toString();
											String strUSERNAME = rs.getString("bp_USERNAME").toString();
											 
											data = "         " + strDATE + "                                         "   + strACTION 
													  +"                                             " + strUSERNAME+ "          ";
											logsLIST.add(data);
											logsLIST.add("---------------------------------------------------------------------------"
													+ "------------------------------------------------------------------------------"
													+ "-------------------");
										}
								}catch(Exception ex) {
								}
							}
						});
					}catch(Exception ex) {
						
					}
				}
			});
			btnMENU.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					adminFRAME.setVisible(false);
					new MainFrame();
				}
			});
	}

	public static void main(String[] args) {
		new AdminFrame();

	}

}
