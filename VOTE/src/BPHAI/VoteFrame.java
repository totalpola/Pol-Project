package BPHAI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.time.LocalDateTime;

public class VoteFrame {
	private List listCHECK;
	public VoteFrame() {
//-----------------------------------------FONT------------------------------------------------//
		Font BUTTON = new Font ("Century Gothic", Font.BOLD, 18);
//------------------------------------------PANEL----------------------------------------------//		
		JPanel votePANE = new JPanel ();
			votePANE.setBackground(Color.decode("#f2f2f2"));
			votePANE.setLayout(null);
//-----------------------------------------COMPONENTS------------------------------------------//
		/********TITLE********/
			JLabel lblMAIN = new JLabel("Janssenville Subdivision");
				lblMAIN.setFont(new Font ("Elephant", Font.ITALIC,40));
				lblMAIN.setForeground(Color.decode("#0d0d0d"));
			JLabel lblSUBa = new JLabel("2022");
				lblSUBa.setFont(new Font ("Impact", Font.PLAIN, 20));
				lblSUBa.setForeground(Color.decode("#262626"));
			JLabel lblSUBb = new JLabel("ELECTION");
				lblSUBb.setFont(new Font ("Impact", Font.PLAIN, 20));
				lblSUBb.setForeground(Color.decode("#262626"));
			JLabel lblSUBc = new JLabel("VOTE WISELY");
				lblSUBc.setFont(new Font ("Century Gothic", Font.PLAIN, 35));
				lblSUBc.setForeground(Color.decode("#262626"));
			JLabel lblLINE = new JLabel("________________________"
						+ "________________________________");
				lblLINE.setFont(new Font ("Century Gothic", Font.PLAIN, 35));
				lblLINE.setForeground(Color.decode("#262626"));
				//SET BOUNDS
					lblMAIN.setBounds(30,15,700,50);
					lblSUBa.setBounds(1280,15,50,35);
					lblSUBb.setBounds(1250,40,100,30);
					lblSUBc.setBounds(600,80,700,50);
					lblLINE.setBounds(170,100,1100,50);
				//ADD TO PANE
					votePANE.add(lblMAIN);
					votePANE.add(lblSUBa);
					votePANE.add(lblSUBb);
					votePANE.add(lblSUBc);
					votePANE.add(lblLINE);
		/********NOTICE********/
			JLabel lblNAME = new JLabel("USERNAME: " + LoginFrame.usrNAME);
				lblNAME.setFont(new Font("Arial Black", Font.PLAIN, 16));
				lblNAME.setForeground(Color.decode("#0d0d0d"));
			JLabel lblINS = new JLabel("NOTICE");
				lblINS.setFont(new Font("arial", Font.BOLD, 22));
				lblINS.setForeground(Color.decode("#0d0d0d"));
			JLabel lblDIR1 = new JLabel ("1. Select 10 candidates from the checklist.");
				lblDIR1.setFont(new Font("Arial Narrow", Font.ITALIC, 18));
				lblDIR1.setForeground(Color.decode("#0d0d0d"));
			JLabel lblDIR2 = new JLabel ("2. Double-check the candidates from the list.");
				lblDIR2.setFont(new Font("Arial Narrow", Font.ITALIC, 18));
				lblDIR2.setForeground(Color.decode("#0d0d0d"));
			JLabel lblDIR3 = new JLabel("3. Re-click on the checkbox to delete.");
				lblDIR3.setFont(new Font("Arial Narrow", Font.ITALIC, 18));
				lblDIR3.setForeground(Color.decode("#0d0d0d"));
			JLabel lblDIR4 = new JLabel("4. Click CANCEL if you want to clear the list.");
				lblDIR4.setFont(new Font("Arial Narrow", Font.ITALIC, 18));
				lblDIR4.setForeground(Color.decode("#0d0d0d"));
			JLabel lblDIR5 = new JLabel("5. Finally, click the VOTE button to proceed.");
				lblDIR5.setFont(new Font("Arial Narrow", Font.ITALIC, 18));
				lblDIR5.setForeground(Color.decode("#0d0d0d"));
				//SET BOUNDS
					lblINS.setBounds(980,250,200,30);
					lblNAME.setBounds(880,160,300,40);
					lblDIR1.setBounds(880,300,300,30);
					lblDIR2.setBounds(880,330,300,30);
					lblDIR3.setBounds(880,360,400,30);
					lblDIR4.setBounds(880,390,300,30);
					lblDIR5.setBounds(880,420,300,30);
				//ADD TO PANE
					votePANE.add(lblINS);
					votePANE.add(lblNAME);
					votePANE.add(lblDIR1);
					votePANE.add(lblDIR2);
					votePANE.add(lblDIR3);
					votePANE.add(lblDIR4);
					votePANE.add(lblDIR5);				
		/********CANDIDATES*******/
			JLabel cbCANDIDATES = new JLabel("2022 CANDIDATES");
				cbCANDIDATES.setFont(new Font("Arial Black", Font.PLAIN, 24));
				cbCANDIDATES.setForeground(Color.decode("#0d0d0d"));
			Checkbox cbCAN1 = new Checkbox("Bañes, Mariflor");
				cbCAN1.setFont(new Font("arial narrow", Font.PLAIN, 18));
				cbCAN1.setForeground(Color.decode("#0d0d0d"));
				cbCAN1.setBackground(Color.decode("#f2f2f2"));
			cbCAN1.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(cbCAN1.getState() == true) {
						listCHECK.add("Bañes, Mariflor".toUpperCase());
					}else {
						listCHECK.remove("Bañes, Mariflor".toUpperCase());
					}		
				}
			});
			Checkbox cbCAN2 = new Checkbox("Colis, Andres");
				cbCAN2.setFont(new Font("arial narrow", Font.PLAIN, 18));
				cbCAN2.setForeground(Color.decode("#0d0d0d"));
				cbCAN2.setBackground(Color.decode("#f2f2f2"));
			cbCAN2.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(cbCAN2.getState() == true) {
						listCHECK.add("Colis, Andres".toUpperCase());
					}else {
						listCHECK.remove("Colis, Andres".toUpperCase());
					}		
				}
			});
			Checkbox cbCAN3 = new Checkbox("Dinglasan, Evelyn");
				cbCAN3.setFont(new Font("arial narrow", Font.PLAIN, 18));
				cbCAN3.setForeground(Color.decode("#0d0d0d"));
				cbCAN3.setBackground(Color.decode("#f2f2f2"));
			cbCAN3.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(cbCAN3.getState() ==  true) {
						listCHECK.add("Dinglasan, Evelyn".toUpperCase());
					}else {
						listCHECK.remove("Dinglasan, Evelyn".toUpperCase());
					}		
				}
			});
			Checkbox cbCAN4 = new Checkbox("Empeño, Corazon");
				cbCAN4.setFont(new Font("arial narrow", Font.PLAIN, 18));
				cbCAN4.setForeground(Color.decode("#0d0d0d"));
				cbCAN4.setBackground(Color.decode("#f2f2f2"));
			cbCAN4.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(cbCAN4.getState() == true) {
						listCHECK.add("Empeño, Corazon".toUpperCase());
					}else {
						listCHECK.remove("Empeño, Corazon".toUpperCase());
					}		
				}
			});
			Checkbox cbCAN5 = new Checkbox("Fajardo, Jose");
				cbCAN5.setFont(new Font("arial narrow", Font.PLAIN, 18));
				cbCAN5.setForeground(Color.decode("#0d0d0d"));
				cbCAN5.setBackground(Color.decode("#f2f2f2"));
			cbCAN5.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(cbCAN5.getState() == true) {
						listCHECK.add("Fajardo, Jose".toUpperCase());
					}else {
						listCHECK.remove("Fajardo, Jose".toUpperCase());
					}		
				}
			});
			Checkbox cbCAN6 = new Checkbox("Gilo, Ronalyn");
				cbCAN6.setFont(new Font("arial narrow", Font.PLAIN, 18));
				cbCAN6.setForeground(Color.decode("#0d0d0d"));
				cbCAN6.setBackground(Color.decode("#f2f2f2"));
			cbCAN6.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(cbCAN6.getState() == true) {
						listCHECK.add("Gilo, Ronalyn".toUpperCase());
					}else {
						listCHECK.remove("Gilo, Ronalyn".toUpperCase());
					}		
				}
			});
			Checkbox cbCAN7 = new Checkbox("Buhay, Erwin");
				cbCAN7.setFont(new Font("arial narrow", Font.PLAIN, 18));
				cbCAN7.setForeground(Color.decode("#0d0d0d"));
				cbCAN7.setBackground(Color.decode("#f2f2f2"));
			cbCAN7.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(cbCAN7.getState() == true) {
						listCHECK.add("Buhay, Erwin".toUpperCase());
					}else {
						listCHECK.remove("Buhay, Erwin".toUpperCase());
					}		
				}
			});
			Checkbox cbCAN8 = new Checkbox("Naceda, Bhel");
				cbCAN8.setFont(new Font("arial narrow", Font.PLAIN, 18));
				cbCAN8.setForeground(Color.decode("#0d0d0d"));
				cbCAN8.setBackground(Color.decode("#f2f2f2"));
			cbCAN8.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(cbCAN8.getState() == true) {
						listCHECK.add("Naceda, Bhel".toUpperCase());
					}else {
						listCHECK.remove("Naceda, Bhel".toUpperCase());
					}		
				}
			});
			Checkbox cbCAN9 = new Checkbox("Ero, Adrianne");
				cbCAN9.setFont(new Font("arial narrow", Font.PLAIN, 18));
				cbCAN9.setForeground(Color.decode("#0d0d0d"));
				cbCAN9.setBackground(Color.decode("#f2f2f2"));
			cbCAN9.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(cbCAN9.getState() == true) {
						listCHECK.add("Ero, Adrianne".toUpperCase());
					}else {
						listCHECK.remove("Ero, Adrianne".toUpperCase());
					}		
				}
			});
			Checkbox cbCAN10 = new Checkbox("Baldemoro, Rafael");
				cbCAN10.setFont(new Font("arial", Font.PLAIN, 18));
				cbCAN10.setForeground(Color.decode("#0d0d0d"));
				cbCAN10.setBackground(Color.decode("#f2f2f2"));
			cbCAN10.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(cbCAN10.getState() == true) {
						listCHECK.add("Baldemoro, Rafael".toUpperCase());
					}else {
						listCHECK.remove("Baldemoro, Rafael".toUpperCase());
					}		
				}
			});
			Checkbox cbCAN11 = new Checkbox("Requillo, Zenaida");
				cbCAN11.setFont(new Font("arial narrow", Font.PLAIN, 18));
				cbCAN11.setForeground(Color.decode("#0d0d0d"));
				cbCAN11.setBackground(Color.decode("#f2f2f2"));
			cbCAN11.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(cbCAN11.getState() == true) {
						listCHECK.add("Requillo, Zenaida".toUpperCase());
					}else {
						listCHECK.remove("Requillo, Zenaida".toUpperCase());
					}		
				}
			});
			Checkbox cbCAN12 = new Checkbox("Gadian, Ester");
				cbCAN12.setFont(new Font("arial narrow", Font.PLAIN, 18));
				cbCAN12.setForeground(Color.decode("#0d0d0d"));
				cbCAN12.setBackground(Color.decode("#f2f2f2"));
			cbCAN12.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(cbCAN12.getState() == true) {
						listCHECK.add("Gadian, Ester".toUpperCase());
					}else {
						listCHECK.remove("Gadian, Ester".toUpperCase());
					}		
				}
			});
		Checkbox cbCAN13 = new Checkbox("Maramag, Letty");
			cbCAN13.setFont(new Font("arial narrow", Font.PLAIN, 18));
			cbCAN13.setForeground(Color.decode("#0d0d0d"));
			cbCAN13.setBackground(Color.decode("#f2f2f2")); 	
		cbCAN13.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(cbCAN13.getState() == true) {
					listCHECK.add("Maramag, Letty".toUpperCase());
				}else {
					listCHECK.remove("Maramag, Letty".toUpperCase());
				}		
			}
		});
				//SET BOUNDS
					cbCANDIDATES.setBounds(200,160,300,40);
					cbCAN1.setBounds(200, 225, 200, 30);
					cbCAN2.setBounds(200, 250, 200, 30);
					cbCAN3.setBounds(200, 275, 200, 30);
					cbCAN4.setBounds(200, 300, 200, 30);
					cbCAN5.setBounds(200, 325, 200, 30);
					cbCAN6.setBounds(200, 350, 200, 30);
					cbCAN7.setBounds(200, 375, 200, 30);
					cbCAN8.setBounds(200, 400, 200, 30);
					cbCAN9.setBounds(200, 425, 200, 30);
					cbCAN10.setBounds(200, 450, 200, 30);
					cbCAN11.setBounds(200, 475, 200, 30);
					cbCAN12.setBounds(200, 500, 200, 30);
					cbCAN13.setBounds(200, 525, 200, 30);
				//ADD TO PANE
					votePANE.add(cbCANDIDATES);
					votePANE.add(cbCAN1);
					votePANE.add(cbCAN2);
					votePANE.add(cbCAN3);
					votePANE.add(cbCAN4);
					votePANE.add(cbCAN5);
					votePANE.add(cbCAN6);
					votePANE.add(cbCAN7);
					votePANE.add(cbCAN8);
					votePANE.add(cbCAN9);
					votePANE.add(cbCAN10);
					votePANE.add(cbCAN11);
					votePANE.add(cbCAN12);
					votePANE.add(cbCAN13);
		/********VOTE LIST********/
			listCHECK = new List();
				listCHECK.setFont(new Font ("Century Gothic", Font.PLAIN, 16));
				listCHECK.add("     ..................."
						+ "...........................................");
				listCHECK.add("                 "
						+"               VOTE");
				listCHECK.add("                "
						+ "```````````````````````````````````");
				//SET BOUNDS 
			listCHECK.setBounds(520, 250, 300, 255);
				//ADD TO PANE
					votePANE.add(listCHECK);
		/********BUTTONS********/
			JButton btnVOTE = new JButton("VOTE");
				btnVOTE.setFont(BUTTON);
				btnVOTE.setForeground(Color.decode("#f2f2f2"));
				btnVOTE.setBackground(Color.decode("#0d0d0d"));
			JButton btnCANCEL= new JButton("CANCEL");
				btnCANCEL.setFont(BUTTON);
				btnCANCEL.setForeground(Color.decode("#f2f2f2"));
				btnCANCEL.setBackground(Color.decode("#731010"));
			JButton btnBACK = new JButton ("BACK");
				btnBACK.setFont(BUTTON);
				btnBACK.setForeground(Color.decode("#f2f2f2"));
				btnBACK.setBackground(Color.decode("#737373"));
				//SET BOUNDS
					btnVOTE.setBounds(520, 530, 120, 35);
					btnCANCEL.setBounds(700, 530, 120, 35);
					btnBACK.setBounds(1210,620,120,35);
				//ADD TO PANE
					votePANE.add(btnVOTE);
					votePANE.add(btnCANCEL);
					votePANE.add(btnBACK);
//------------------------------------------FRAME----------------------------------------------//	
		JFrame voteFRAME = new JFrame("JSCR 2022 ELECTION | Vote");
			voteFRAME.setVisible(true);
			voteFRAME.setResizable(false);
			voteFRAME.setBounds(-6, 0,1500, 733);
			voteFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			voteFRAME.add(votePANE);
			
			/* JLabel lblHOME = new JLabel("ADDRESS: ");
				lblHOME.setFont(new Font("Arial Black", Font.PLAIN, 16));
				lblHOME.setForeground(Color.decode("#0d0d0d"));
				
				lblHOME.setBounds(880, 200, 300, 40);
				votePANE.add(lblHOME);*/
//----------------------------------------EVENTS---------------------------------------------//
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oopr213","root","");
				java.sql.Statement stmt=con.createStatement();
				String SQL ="SELECT bp_HOME FROM tbl_userinfo WHERE bp_USERNAME ='" +LoginFrame.usrNAME+"'";
				ResultSet rs = stmt.executeQuery(SQL);
				
				if(rs.next()) {
					 String db_HOME = rs.getString("bp_HOME").toString();
					 JLabel lblHOME = new JLabel("ADDRESS: "+ db_HOME);
						lblHOME.setFont(new Font("Arial Black", Font.PLAIN, 16));
						lblHOME.setForeground(Color.decode("#0d0d0d"));
						
						lblHOME.setBounds(880, 200, 500, 40);
						votePANE.add(lblHOME);
					}
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
					}
			btnVOTE.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String date = LocalDateTime.now().toString();
					if(listCHECK.getItemCount() > 13) {
						JOptionPane.showMessageDialog(null, "MAX OF 10 VOTES");
						//listCHECK.removeAll();
					}else if(listCHECK.getItemCount() < 13) {
						JOptionPane.showMessageDialog(null, "PLEASE DO 10 VOTES");
					}
					try{
		    			Class.forName("com.mysql.cj.jdbc.Driver");
		    			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oopr213","root","");
		    			String rs = "INSERT INTO tbl_votes"
		    						+ "(bp_USERNAME, bp_V1, bp_V2, bp_V3, bp_V4, bp_V5, bp_V6, bp_V7, bp_V8, bp_V9, bp_V10,bp_DATE)"
		    						+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		   	        		java.sql.PreparedStatement prpstm = ((Connection) con).prepareStatement(rs);
		    	       		prpstm.setString(1, "" + LoginFrame.usrNAME.toString().toUpperCase());
		    	       		prpstm.setString(2, "" + listCHECK.getItem(3).toString().toUpperCase());
		    	       		prpstm.setString(3, "" + listCHECK.getItem(4).toString().toUpperCase());
		            		prpstm.setString(4, "" + listCHECK.getItem(5).toString().toUpperCase());
		   	        		prpstm.setString(5, "" + listCHECK.getItem(6).toString().toUpperCase());
		   	        		prpstm.setString(6, "" + listCHECK.getItem(7).toString().toUpperCase());
		   	        		prpstm.setString(7, "" + listCHECK.getItem(8).toString().toUpperCase());
		    	        	prpstm.setString(8, "" + listCHECK.getItem(9).toString().toUpperCase());
		    	       		prpstm.setString(9, "" + listCHECK.getItem(10).toString().toUpperCase());
		    	       		prpstm.setString(10, "" + listCHECK.getItem(11).toString().toUpperCase());
		    	       		prpstm.setString(11, "" + listCHECK.getItem(12).toString().toUpperCase());
		    	       		prpstm.setString(12, "" + date);
		    	       			
		    	        	prpstm.executeUpdate();	
		    	        	((Connection) con).close();
		    	       		
		    	       		JOptionPane.showMessageDialog(null, "Voting Complete");
		    	       		try {
    							Class.forName("com.mysql.cj.jdbc.Driver");
        						java.sql.Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oopr213","root","");
        						String SQL1 ="INSERT INTO tbl_logs (bp_USERNAME, bp_ACTION, bp_DATE)" 
        								+ "VALUES ('"+ LoginFrame.usrNAME.toString().toUpperCase() + "', '                       VOTE', '"+ date +"')";
        						java.sql.PreparedStatement prpstm1 = ((Connection) con1).prepareStatement(SQL1);			
	    		   	        	prpstm1.executeUpdate();	
	    		   	        	((Connection) con1).close();
    						}catch(Exception ex) {
    						}
		    	       		voteFRAME.setVisible(false);
		    	       		new MainFrame();
		    		}catch(Exception ex) {
		    			JOptionPane.showMessageDialog(null,ex.getMessage());
		   				}
					}
				});
			btnCANCEL.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listCHECK.removeAll();
					listCHECK.add("     ..................."
							+ "...........................................");
					listCHECK.add("                 "
							+"               VOTE");
					listCHECK.add("                "
							+ "```````````````````````````````````");
					cbCAN1.setState(false);
					cbCAN2.setState(false);
					cbCAN3.setState(false);
					cbCAN4.setState(false);
					cbCAN5.setState(false);
					cbCAN6.setState(false);
					cbCAN7.setState(false);
					cbCAN8.setState(false);
					cbCAN9.setState(false);
					cbCAN10.setState(false);
					cbCAN11.setState(false);
					cbCAN12.setState(false);
					cbCAN13.setState(false);
				}
			});			
			btnBACK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					voteFRAME.setVisible(false);
					new MainFrame();
				}
			});
}
	public static void main(String[] args) {
	//	new VoteFrame();
	}
}
