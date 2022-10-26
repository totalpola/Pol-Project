import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VotingSystem extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFN;
	private JTextField textFieldAD;
	private JTextField textFieldPS;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VotingSystem frame = new VotingSystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VotingSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel welcoME = new JPanel();
		welcoME.setBackground(new Color(139, 0, 0));
		welcoME.setBounds(0, 0, 644, 336);
		contentPane.add(welcoME);
		welcoME.setLayout(null);
		
		JLabel lblJAN = new JLabel("Janssenville");
		lblJAN.setForeground(new Color(238, 232, 170));
		lblJAN.setFont(new Font("Georgia", Font.PLAIN, 65));
		lblJAN.setHorizontalAlignment(SwingConstants.CENTER);
		lblJAN.setBounds(131, 25, 396, 61);
		welcoME.add(lblJAN);
		
		JLabel lblSUB = new JLabel("SUBDIVISION");
		lblSUB.setForeground(new Color(245, 245, 245));
		lblSUB.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 25));
		lblSUB.setHorizontalAlignment(SwingConstants.CENTER);
		lblSUB.setBounds(188, 78, 286, 34);
		welcoME.add(lblSUB);
		
		JLabel lblWEL = new JLabel("Welcome to 2022 Elections");
		lblWEL.setForeground(new Color(245, 245, 245));
		lblWEL.setHorizontalAlignment(SwingConstants.CENTER);
		lblWEL.setFont(new Font("Vivaldi", Font.BOLD, 40));
		lblWEL.setBounds(115, 139, 427, 38);
		welcoME.add(lblWEL);
		
		JLabel lblLN = new JLabel("_______________________________");
		lblLN.setForeground(new Color(238, 232, 170));
		lblLN.setHorizontalAlignment(SwingConstants.CENTER);
		lblLN.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblLN.setBounds(43, 153, 556, 38);
		welcoME.add(lblLN);
		
		JButton btnLOG = new JButton("LOGIN");
		btnLOG.setForeground(new Color(245, 255, 250));
		btnLOG.setBackground(new Color(255, 127, 80));
		btnLOG.setFont(new Font("Century Gothic", Font.BOLD, 25));
		btnLOG.setBounds(127, 221, 195, 41);
		welcoME.add(btnLOG);
		
		JButton btnSIGN = new JButton("SIGNUP");
		btnSIGN.setForeground(new Color(245, 255, 250));
		btnSIGN.setBackground(new Color(255, 127, 80));
		btnSIGN.setFont(new Font("Century Gothic", Font.BOLD, 25));
		btnSIGN.setBounds(332, 221, 195, 41);
		welcoME.add(btnSIGN);
		
		JPanel logIN = new JPanel();
		logIN.setBackground(new Color(176, 196, 222));
		logIN.setBounds(0, 0, 644, 336);
		contentPane.add(logIN);
		logIN.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Janssenville Subdivision");
		lblNewLabel.setForeground(new Color(160, 82, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(74, 24, 509, 44);
		logIN.add(lblNewLabel);
		
		JLabel lblPleaseLoginTo = new JLabel("PLEASE LOGIN TO CONTINUE");
		lblPleaseLoginTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseLoginTo.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblPleaseLoginTo.setBounds(74, 87, 509, 44);
		logIN.add(lblPleaseLoginTo);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME:");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(74, 157, 121, 31);
		logIN.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(74, 190, 121, 31);
		logIN.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(200, 150, 345, 33);
		logIN.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(200, 190, 345, 33);
		logIN.add(textField_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(198, 230, 121, 23);
		logIN.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(new Color(178, 34, 34));
		btnNewButton.setForeground(new Color(245, 255, 250));
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNewButton.setBounds(131, 270, 188, 33);
		logIN.add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBackground(new Color(0, 0, 0));
		btnCancel.setForeground(new Color(245, 255, 250));
		btnCancel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnCancel.setBounds(327, 270, 188, 33);
		logIN.add(btnCancel);
		
		JPanel signUP = new JPanel();
		signUP.setBackground(new Color(189, 183, 107));
		signUP.setBounds(0, 0, 644, 336);
		contentPane.add(signUP);
		signUP.setLayout(null);
		
		JLabel lblJANS = new JLabel("Janssenville Subdivision");
		lblJANS.setFont(new Font("Georgia", Font.ITALIC, 20));
		lblJANS.setHorizontalAlignment(SwingConstants.CENTER);
		lblJANS.setBounds(10, 20, 235, 34);
		signUP.add(lblJANS);
		
		JLabel lbl20 = new JLabel("2022");
		lbl20.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl20.setFont(new Font("Impact", Font.PLAIN, 13));
		lbl20.setBounds(530, 18, 84, 23);
		signUP.add(lbl20);
		
		JLabel lblELE = new JLabel("ELECTIONS");
		lblELE.setHorizontalAlignment(SwingConstants.RIGHT);
		lblELE.setFont(new Font("Impact", Font.PLAIN, 13));
		lblELE.setBounds(530, 25, 84, 34);
		signUP.add(lblELE);
		
		JLabel lblHOME = new JLabel("HOMEOWNERS | RESIDENTS ");
		lblHOME.setHorizontalAlignment(SwingConstants.CENTER);
		lblHOME.setFont(new Font("Century Gothic", Font.PLAIN, 29));
		lblHOME.setBounds(133, 65, 398, 52);
		signUP.add(lblHOME);
		
		JLabel lblLIN = new JLabel("___________________________________");
		lblLIN.setHorizontalAlignment(SwingConstants.CENTER);
		lblLIN.setFont(new Font("Century Gothic", Font.PLAIN, 29));
		lblLIN.setBounds(42, 83, 572, 52);
		signUP.add(lblLIN);
		
		JLabel lblFUL = new JLabel("FULL NAME:");
		lblFUL.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFUL.setBounds(99, 146, 156, 23);
		signUP.add(lblFUL);
		
		JLabel lblADR = new JLabel("ADDRESS:");
		lblADR.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblADR.setBounds(99, 175, 156, 23);
		signUP.add(lblADR);
		
		JLabel lblPASS = new JLabel("PASSWORD:");
		lblPASS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPASS.setBounds(99, 204, 156, 23);
		signUP.add(lblPASS);
		
		textFieldFN = new JTextField();
		textFieldFN.setBounds(231, 146, 274, 23);
		signUP.add(textFieldFN);
		textFieldFN.setColumns(10);
		
		textFieldAD = new JTextField();
		textFieldAD.setColumns(10);
		textFieldAD.setBounds(231, 175, 274, 23);
		signUP.add(textFieldAD);
		
		textFieldPS = new JTextField();
		textFieldPS.setColumns(10);
		textFieldPS.setBounds(231, 204, 274, 23);
		signUP.add(textFieldPS);
		
		JRadioButton rdbtnMORE = new JRadioButton("MORE than 6 months");
		rdbtnMORE.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnMORE.setBackground(new Color(255, 99, 71));
		rdbtnMORE.setBounds(99, 247, 202, 23);
		signUP.add(rdbtnMORE);
		
		JRadioButton rdbtnLESS = new JRadioButton("LESS than 6 months");
		rdbtnLESS.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnLESS.setBackground(new Color(178, 34, 34));
		rdbtnLESS.setBounds(318, 247, 202, 23);
		signUP.add(rdbtnLESS);
		
		JButton btnUP = new JButton("SIGNUP");
		btnUP.setForeground(new Color(245, 245, 245));
		btnUP.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnUP.setBackground(new Color(178, 34, 34));
		btnUP.setBounds(155, 277, 146, 34);
		signUP.add(btnUP);
		
		JButton btnCAN = new JButton("CANCEL");
		btnCAN.setForeground(new Color(245, 245, 245));
		btnCAN.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnCAN.setBackground(new Color(0, 0, 0));
		btnCAN.setBounds(318, 277, 146, 34);
		signUP.add(btnCAN);
		
		JButton btnBACK = new JButton("BACK");
		btnBACK.setForeground(new Color(245, 245, 220));
		btnBACK.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnBACK.setBackground(new Color(220, 220, 220));
		btnBACK.setBounds(512, 296, 122, 29);
		signUP.add(btnBACK);
		
		JPanel mainMenu = new JPanel();
		mainMenu.setBackground(new Color(240, 230, 140));
		mainMenu.setBounds(0, 0, 644, 336);
		contentPane.add(mainMenu);
		mainMenu.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Janssenville Subdivision");
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 34));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(94, 11, 474, 72);
		mainMenu.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hello Resident and welcome to 2022 elections");
		lblNewLabel_3.setForeground(new Color(178, 34, 34));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Vivaldi", Font.BOLD, 30));
		lblNewLabel_3.setBounds(44, 112, 557, 60);
		mainMenu.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("MAIN MENU");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel_3_1.setBounds(191, 65, 259, 51);
		mainMenu.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("_________________________________");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblNewLabel_3_1_1.setBounds(61, 80, 519, 51);
		mainMenu.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_1 = new JButton("VOTE");
		btnNewButton_1.setForeground(new Color(245, 255, 250));
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1.setFont(new Font("Century Gothic", Font.BOLD, 33));
		btnNewButton_1.setBounds(207, 167, 229, 38);
		mainMenu.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("VIEW VOTE");
		btnNewButton_1_1.setBackground(new Color(165, 42, 42));
		btnNewButton_1_1.setForeground(new Color(245, 255, 250));
		btnNewButton_1_1.setFont(new Font("Century Gothic", Font.BOLD, 33));
		btnNewButton_1_1.setBounds(207, 209, 229, 38);
		mainMenu.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("BACK");
		btnNewButton_1_1_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1_1_1.setForeground(new Color(248, 248, 255));
		btnNewButton_1_1_1.setFont(new Font("Century Gothic", Font.BOLD, 33));
		btnNewButton_1_1_1.setBounds(207, 294, 229, 38);
		mainMenu.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2 = new JButton("LOGOUT");
		btnNewButton_1_2.setForeground(new Color(248, 248, 255));
		btnNewButton_1_2.setBackground(new Color(139, 69, 19));
		btnNewButton_1_2.setFont(new Font("Century Gothic", Font.BOLD, 33));
		btnNewButton_1_2.setBounds(207, 252, 229, 38);
		mainMenu.add(btnNewButton_1_2);
		
		JPanel votE = new JPanel();
		votE.setBackground(new Color(70, 130, 180));
		votE.setBounds(0, 0, 644, 336);
		contentPane.add(votE);
		votE.setLayout(null);
		
		JLabel lblWISE = new JLabel("PLEASE VOTE WISELY");
		lblWISE.setFont(new Font("Century Gothic", Font.PLAIN, 35));
		lblWISE.setHorizontalAlignment(SwingConstants.CENTER);
		lblWISE.setBounds(140, 23, 378, 46);
		votE.add(lblWISE);
		
		JLabel lblNOT = new JLabel("-NOTICE-");
		lblNOT.setForeground(new Color(178, 34, 34));
		lblNOT.setHorizontalAlignment(SwingConstants.CENTER);
		lblNOT.setFont(new Font("Century Gothic", Font.BOLD, 35));
		lblNOT.setBounds(399, 68, 218, 46);
		votE.add(lblNOT);
		
		JLabel lblNO1 = new JLabel("1. Select 5 candidates from the checklist.");
		lblNO1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNO1.setBounds(381, 125, 236, 27);
		votE.add(lblNO1);
		
		JLabel lblNOT2 = new JLabel("2. Double-check the selected candidates.");
		lblNOT2.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNOT2.setBounds(381, 147, 236, 27);
		votE.add(lblNOT2);
		
		JLabel lblNOT3 = new JLabel("3. Once you selected candidates click ");
		lblNOT3.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNOT3.setBounds(382, 174, 236, 27);
		votE.add(lblNOT3);
		
		JLabel lblNTP = new JLabel("PUSH to add your votes and POP to remove.");
		lblNTP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNTP.setBounds(382, 201, 252, 27);
		votE.add(lblNTP);
		
		JLabel lblNot4 = new JLabel("4. To finalize vote click FINAL VOTE or CANCEL");
		lblNot4.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNot4.setBounds(381, 224, 252, 27);
		votE.add(lblNot4);
		
		JLabel lblNTC = new JLabel("to cancel voting.");
		lblNTC.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNTC.setBounds(381, 246, 252, 27);
		votE.add(lblNTC);
		
		JList listCHECK = new JList();
		listCHECK.setBounds(43, 81, 316, 147);
		votE.add(listCHECK);
		
		JComboBox cmbCNDTS = new JComboBox();
		cmbCNDTS.setModel(new DefaultComboBoxModel(new String[] {"ROSIE", "JISOO", "LISA", "JENNIE", "MINA", "MOMO", "SANA", "DAHYUN", "TZUYU", "IU"}));
		cmbCNDTS.setBounds(100, 239, 202, 22);
		votE.add(cmbCNDTS);
		
		JButton btnPUSH = new JButton("PUSH");
		btnPUSH.setBackground(new Color(160, 82, 45));
		btnPUSH.setForeground(new Color(245, 255, 250));
		btnPUSH.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPUSH.setBounds(65, 272, 125, 23);
		votE.add(btnPUSH);
		
		JButton btnPOP = new JButton("POP");
		btnPOP.setBackground(new Color(218, 165, 32));
		btnPOP.setForeground(new Color(245, 255, 250));
		btnPOP.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPOP.setBounds(214, 272, 125, 23);
		votE.add(btnPOP);
		
		JButton btnFINAL = new JButton("FINAL VOTE");
		btnFINAL.setBackground(new Color(178, 34, 34));
		btnFINAL.setForeground(new Color(245, 255, 250));
		btnFINAL.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFINAL.setBounds(43, 302, 155, 23);
		votE.add(btnFINAL);
		
		JButton btnCANCEL = new JButton("CANCEL");
		btnCANCEL.setBackground(new Color(0, 0, 0));
		btnCANCEL.setForeground(new Color(245, 255, 250));
		btnCANCEL.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCANCEL.setBounds(204, 302, 155, 23);
		votE.add(btnCANCEL);
		
		JPanel viewV = new JPanel();
		viewV.setBackground(new Color(250, 128, 114));
		viewV.setBounds(0, 0, 644, 336);
		contentPane.add(viewV);
		viewV.setLayout(null);
		
		JLabel lblSTAT = new JLabel("CANDIDATE STATUS");
		lblSTAT.setForeground(new Color(245, 255, 250));
		lblSTAT.setHorizontalAlignment(SwingConstants.CENTER);
		lblSTAT.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblSTAT.setBounds(179, 22, 284, 42);
		viewV.add(lblSTAT);
		
		JLabel lblLNE = new JLabel("____________________________________");
		lblLNE.setForeground(new Color(240, 230, 140));
		lblLNE.setHorizontalAlignment(SwingConstants.CENTER);
		lblLNE.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblLNE.setBounds(42, 40, 565, 42);
		viewV.add(lblLNE);
		
		JLabel lblROS = new JLabel("ROSIE - ");
		lblROS.setHorizontalAlignment(SwingConstants.LEFT);
		lblROS.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblROS.setBounds(61, 94, 208, 33);
		viewV.add(lblROS);
		
		JLabel lblLIS = new JLabel("LISA - ");
		lblLIS.setHorizontalAlignment(SwingConstants.LEFT);
		lblLIS.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblLIS.setBounds(61, 138, 208, 33);
		viewV.add(lblLIS);
		
		JLabel lblJIS = new JLabel("JISOO - ");
		lblJIS.setHorizontalAlignment(SwingConstants.LEFT);
		lblJIS.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblJIS.setBounds(61, 182, 208, 33);
		viewV.add(lblJIS);
		
		JLabel lblJEN = new JLabel("JENNIE -");
		lblJEN.setHorizontalAlignment(SwingConstants.LEFT);
		lblJEN.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblJEN.setBounds(61, 226, 208, 33);
		viewV.add(lblJEN);
		
		JLabel lblJIU = new JLabel("IU -");
		lblJIU.setHorizontalAlignment(SwingConstants.LEFT);
		lblJIU.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblJIU.setBounds(61, 269, 208, 33);
		viewV.add(lblJIU);
		
		JLabel lblMIN = new JLabel("MINA -");
		lblMIN.setHorizontalAlignment(SwingConstants.LEFT);
		lblMIN.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblMIN.setBounds(295, 93, 208, 33);
		viewV.add(lblMIN);
		
		JLabel lblMOM = new JLabel("MOMO - ");
		lblMOM.setHorizontalAlignment(SwingConstants.LEFT);
		lblMOM.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblMOM.setBounds(295, 138, 208, 33);
		viewV.add(lblMOM);
		
		JLabel lblSAN = new JLabel("SANA - ");
		lblSAN.setHorizontalAlignment(SwingConstants.LEFT);
		lblSAN.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblSAN.setBounds(295, 182, 208, 33);
		viewV.add(lblSAN);
		
		JLabel lblDAH = new JLabel("DAHYUN -");
		lblDAH.setHorizontalAlignment(SwingConstants.LEFT);
		lblDAH.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblDAH.setBounds(295, 226, 208, 33);
		viewV.add(lblDAH);
		
		JLabel lblTZU = new JLabel("TZUYU -");
		lblTZU.setHorizontalAlignment(SwingConstants.LEFT);
		lblTZU.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblTZU.setBounds(295, 269, 208, 33);
		viewV.add(lblTZU);
		
		JButton btnBAK = new JButton("BACK");
		btnBAK.setBackground(new Color(238, 232, 170));
		btnBAK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBAK.setBounds(502, 292, 132, 33);
		viewV.add(btnBAK);
	}
}
