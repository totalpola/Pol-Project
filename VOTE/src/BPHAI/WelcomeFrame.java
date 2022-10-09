package BPHAI;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WelcomeFrame  {
	

	
	public WelcomeFrame() {
//------------------------------------------FONT----------------------------------------------//	
		Font FONT1 = new Font ("Elephant", Font.ITALIC, 40);
		Font FONT2 = new Font ("Century Gothic", Font.PLAIN, 25);
		Font BUTTON = new Font ("Century Gothic", Font.BOLD, 25);
//------------------------------------------PANEL----------------------------------------------//		
		JPanel welcomePANE = new JPanel ();
			welcomePANE.setBackground(Color.decode("#0d0d0d"));
			welcomePANE.setLayout(null);
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
				
			JButton btnLOGIN = new JButton("LOGIN");
				btnLOGIN.setFont(BUTTON);
				btnLOGIN.setForeground(Color.decode("#fffceb"));
				btnLOGIN.setBackground(Color.decode("#262626"));
				
			JButton btnSIGNUP = new JButton("SIGNUP");
				btnSIGNUP.setFont(BUTTON);
				btnSIGNUP.setForeground(Color.decode("#262626"));
				btnSIGNUP.setBackground(Color.decode("#f2f2f2"));
				
			//SET BOUNDS
				btnLOGIN.setBounds(120, 240, 350, 50);
				btnSIGNUP.setBounds(120, 310, 350, 50);
				btnLOGINNINGS.setBounds(120, 400, 350, 50);
			//ADD TO PANEL
				welcomePANE.add(btnLOGIN);
				welcomePANE.add(btnSIGNUP);
				welcomePANE.add(btnLOGINNINGS);
//------------------------------------------FRAME----------------------------------------------//				
		JFrame welcomeFRAME = new JFrame("JSCR 2022 ELECTION");
			welcomeFRAME.setVisible(true);
			welcomeFRAME.setResizable(false);
			welcomeFRAME.setBounds(440, 90, 600, 500);
			welcomeFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			welcomeFRAME.add(welcomePANE);		
//------------------------------------------EVENTS----------------------------------------------//	
			btnLOGIN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					welcomeFRAME.setVisible(false);

					new LoginFrame();
				}
			});
			
			btnSIGNUP.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					welcomeFRAME.setVisible(false);
					new SignUpFrame();
				}
			});
			
			btnLOGINNINGS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(new mainClass().EmailAndPass);
				}
			});
}
//	public static void main(String[] args) {
//		new WelcomeFrame();
//	}

}
