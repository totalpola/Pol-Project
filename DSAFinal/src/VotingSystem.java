import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.Stack;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;

public class VotingSystem extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String currentLogin = "";
	
//	signUp credentials
	ArrayList<String> userInfo = new ArrayList<String> ();
	
//	current Voter users
	ArrayList<String> voterList = new ArrayList<String> ();
	
// para sa jlist
	DefaultListModel<String> listModel1 = new DefaultListModel<String>();	
	
//	Candidates
	ArrayList<String> candidates = new ArrayList<String>();
	
//mga binoto ni user
	Stack<String> votersPush = new Stack<String>();
	
//stack candidatess
	Stack<String> ROSIE = new Stack<String>();  
	Stack<String> JISOO = new Stack<String>();  
	Stack<String> LISA = new Stack<String>();  
	Stack<String> JENNIE = new Stack<String>();  
	Stack<String> MINA = new Stack<String>();  
	Stack<String> MOMO = new Stack<String>();  
	Stack<String> SANA = new Stack<String>();  
	Stack<String> DAHYUN = new Stack<String>(); 
	Stack<String> TZUYU = new Stack<String>();  
	Stack<String> IU = new Stack<String>(); 
	
	private JLabel lblROS = new JLabel("ROSIE - 0");
	private JLabel lblLIS = new JLabel("LISA - 0");
	private JLabel lblJIS = new JLabel("JISOO - 0");
	private JLabel lblJEN = new JLabel("JENNIE - 0");
	private JLabel lblJIU = new JLabel("IU - 0");
	private JLabel lblMIN = new JLabel("MINA - 0");
	private JLabel lblMOM = new JLabel("MOMO - 0");
	private JLabel lblSAN = new JLabel("SANA - 0");
	private JLabel lblDAH = new JLabel("DAHYUN - 0");
	private JLabel lblTZU = new JLabel("TZUYU - 0");
	
	private JPanel contentPane;
	private JTextField textFieldFN;
	private JTextField textFieldAD;
	private JTextField textFieldPS;
	private JTextField txtPleaseEnterYour;
	
	
	private JPanel mainMenu = new JPanel();
	private JPanel votE = new JPanel();
	private	JPanel viewV = new JPanel();
	private JPanel welcoME = new JPanel();
	private JPanel signUP = new JPanel();
	private JPanel logIN = new JPanel();
	
	private JRadioButton rdbtnLESS = new JRadioButton("LESS than 6 months");
	private JRadioButton rdbtnMORE = new JRadioButton("MORE than 6 months");
	private JPasswordField passwordField;
	
	JButton btnPOP = new JButton("POP");
	
	private JTextArea textArea = new JTextArea();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VotingSystem frame = new VotingSystem();
			        //PANG CENTER NG FRAME ITOOOO
			        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
			        
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//	custome function para sa pag clear ng text pag clinick
	@SuppressWarnings("unused")
	private void clearTextField(JTextField textfield1, String textfield1Get, String textfield1Set) {
		if(textfield1.getText().equals(textfield1Get)) {
			textfield1.setText(textfield1Set);
		}
	}

//	check lang kung final naba desisyon ng user
	@SuppressWarnings("unused")
	private void yesOrNo(String Name , JPanel viewVote, JPanel voteNow) {
		 int result = JOptionPane.showConfirmDialog(new VotingSystem(),"Final na? sila ba talaga bet mo ?", "Botohohan ng idolo",
                 JOptionPane.YES_NO_OPTION,
                 JOptionPane.QUESTION_MESSAGE);
        
		 
         //check muna kung final na sila
         if (result == JOptionPane.YES_OPTION) {
//				setBounds(100, 100, 413, 545);
        	 
        	 textArea.setText(textArea.getText() + currentLogin + "\n" +
        			 	"votelist \n");
        	 
				for (String votes : votersPush){
					switch(votes) {
					case "ROSIE":
						ROSIE.push(Name);
						lblROS.setText("ROSIE - " + String.valueOf(ROSIE.size()));
						System.out.println("1 point kay ROSIE: " + String.valueOf(ROSIE.size()));
						
						textArea.setText(textArea.getText() + lblROS.getText().toString() + "\n");
						
					break;
					case "JISOO":
						JISOO.push(Name);
						lblJIS .setText("JISOO - " + String.valueOf(JISOO.size()));
						System.out.println("1 point kay JISOO: " + String.valueOf(JISOO.size()));
						
						textArea.setText(textArea.getText() + lblJIS.getText().toString() + "\n");
					break;
					case "LISA":
						LISA.push(Name);
						lblLIS.setText("LISA - " + String.valueOf(LISA.size()));
						System.out.println("1 point kay LISA: " + String.valueOf(LISA.size()));
						
						textArea.setText(textArea.getText() + lblLIS.getText().toString() + "\n");
					break;
					case "JENNIE":
						JENNIE.push(Name);
						lblJEN.setText("JENNIE - " + String.valueOf(JENNIE.size()));
						System.out.println("1 point kay JENNIE: " + String.valueOf(JENNIE.size()));
						
						textArea.setText(textArea.getText() + lblJEN.getText().toString() + "\n");
					break;
					case "MINA":
						MINA.push(Name);
						lblMIN.setText("MINA - " + String.valueOf(MINA.size()));
						System.out.println("1 point kay MINA: " + String.valueOf(MINA.size()));
						
						textArea.setText(textArea.getText() + lblMIN.getText().toString() + "\n");
					break;
					case "MOMO":
						MOMO.push(Name);
						lblMOM.setText("MOMO - " + String.valueOf(MOMO.size()));
						System.out.println("1 point kay MOMO: " + String.valueOf(MOMO.size()));
						
						textArea.setText(textArea.getText() + lblMOM.getText().toString() + "\n");
					break;
					case "SANA":
						SANA.push(Name);
						lblSAN.setText("SANA - " + String.valueOf(SANA.size()));
						System.out.println("1 point kay SANA: " + String.valueOf(SANA.size()));
						
						textArea.setText(textArea.getText() + lblSAN.getText().toString() + "\n");
					break;
					case "DAHYUN":
						DAHYUN.push(Name);
						lblDAH.setText("DAHYUN - " + String.valueOf(DAHYUN.size()));
						System.out.println("1 point kay DAHYUN: " + String.valueOf(DAHYUN.size()));
						
						textArea.setText(textArea.getText() + lblDAH.getText().toString() + "\n");
					break;
					case "TZUYU":
						TZUYU.push(Name);
						lblTZU.setText("TZUYU - " + String.valueOf(TZUYU.size()));
						System.out.println("1 point kay TZUYU: " + String.valueOf(TZUYU.size()));
						
						textArea.setText(textArea.getText() + lblTZU.getText().toString() + "\n");
					break;
					case "IU":
						IU.push(Name);
						lblJIU.setText("IU - " + String.valueOf(IU.size()));
						System.out.println("1 point kay IU: " + String.valueOf(IU.size()));
						
						textArea.setText(textArea.getText() + lblJIU.getText().toString() + "\n");
					break;
					}
				}
				
				
				voterList.add(currentLogin);
				
				try {
					JOptionPane.showMessageDialog(new VotingSystem(), 
							"Please be patient while we print the receipt.");
					
					textArea.setText(textArea.getText().toString() + "\n" + "\n" + "\n" +
					"************** pag nagustuhan nyo yung features nato edi regalo kona senyo ********************");
					textArea.print();
				} catch (PrinterException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				voteNow.setVisible(false);
				viewVote.setVisible(true);
				
         }
	}
	
	public VotingSystem() {

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		welcoME.setVisible(true); //default hide false except sa welome
		signUP.setVisible(false); //default hide false except sa welome
		logIN.setVisible(false); //default hide false except sa welome
		viewV.setVisible(false); //default hide false except sa welome
		mainMenu.setVisible(false); //default hide false except sa welome
		votE.setVisible(false); //default hide false except sa welome
		

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
		
		JList list = new JList();
		list.setBounds(43, 81, 316, 147);
		votE.add(list);
		
		JComboBox<String> cmbCNDTS = new JComboBox<String>();
		cmbCNDTS.setModel(new DefaultComboBoxModel(new String[] {"ROSIE", "JISOO", "LISA", "JENNIE", "MINA", "MOMO", "SANA", "DAHYUN", "TZUYU", "IU"}));
		cmbCNDTS.setBounds(100, 239, 202, 22);
		votE.add(cmbCNDTS);
		
		JButton btnPUSH = new JButton("PUSH");
		
//		push button vote now
		btnPUSH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnPOP.setEnabled(true); 
				
				if (list.getModel().getSize() == 5) {
					
					//kapag nareach na niya ang 5 votes
					
					JOptionPane.showMessageDialog(new VotingSystem(), "you have cast all of your votes."); 
					btnPUSH.setEnabled(false);

				}else {
					// kapag hindi pa
					btnPUSH.setEnabled(true); // just in case mag disable ang pop button kelangan niya i enable ito
					
					listModel1.addElement(cmbCNDTS.getSelectedItem().toString()); //i add muna sa isang list
					
					// dito sa voterPush doon istack mga boto ng user
					votersPush.push(cmbCNDTS.getSelectedItem().toString());  
					 
					list.setModel(listModel1); //katsa idisiplay sa jlist
					
					//para maremove ang item sa selected sa combobox
					cmbCNDTS.removeItem(cmbCNDTS.getSelectedItem().toString());
				}
				System.out.println(votersPush);		//eme lang to				
			}
		});
		btnPUSH.setBackground(new Color(160, 82, 45));
		btnPUSH.setForeground(new Color(245, 255, 250));
		btnPUSH.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPUSH.setBounds(65, 272, 125, 23);
		votE.add(btnPUSH);
		

		
//		pop button in vote now frame
		btnPOP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnPUSH.setEnabled(true); // just in case mag disable ang push button kelangan niya i enable ito
					
					cmbCNDTS.addItem(votersPush.peek()); // iadd ule sa combobox ang na peek mula sa Voterpush
					
					listModel1.removeElement(votersPush.peek()); // katsa tatanggalin ang item mula sa list via voterpush.peek()
					votersPush.pop(); // katsa niya ipop 
					
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "wala kanang ma pop brad"); 
					btnPOP.setEnabled(false);
				}
			}
		});
		btnPOP.setBackground(new Color(218, 165, 32));
		btnPOP.setForeground(new Color(245, 255, 250));
		btnPOP.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPOP.setBounds(214, 272, 125, 23);
		votE.add(btnPOP);
		
		JButton btnFINAL = new JButton("FINAL VOTE");
		btnFINAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
		//check muna kung may laman ang voter push
		if (votersPush.isEmpty()) {
					JOptionPane.showMessageDialog(new VotingSystem(), "Boto ka muna friend");
		}else {
					//gumawa ako ng function para elegant tingnan
				yesOrNo(currentLogin,viewV,votE);
					//NOTE:
					// ang function may paramter na JLabel at Jpanel
					// pinasa ko yung Name label at viewVote panel and voteNow Panel sa function nato
		        }
			}
		});
		btnFINAL.setBackground(new Color(178, 34, 34));
		btnFINAL.setForeground(new Color(245, 255, 250));
		btnFINAL.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFINAL.setBounds(43, 302, 155, 23);
		votE.add(btnFINAL);
		
		JButton btnCANCEL = new JButton("CANCEL");
		
//		vote now cancel button
		btnCANCEL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				votE.setVisible(false);
				mainMenu.setVisible(true);
			}
		});
		btnCANCEL.setBackground(new Color(0, 0, 0));
		btnCANCEL.setForeground(new Color(245, 255, 250));
		btnCANCEL.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCANCEL.setBounds(204, 302, 155, 23);
		votE.add(btnCANCEL);
		

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
		
//		VOTE FRAME		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (voterList.contains(currentLogin)) {
					JOptionPane.showMessageDialog(new VotingSystem(), 
							"As of right now, you have cast your ballot");
					btnNewButton_1.setEnabled(false);
				}else {
					mainMenu.setVisible(false);
					votE.setVisible(true);
				}
			}
		});
		btnNewButton_1.setForeground(new Color(245, 255, 250));
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1.setFont(new Font("Century Gothic", Font.BOLD, 33));
		btnNewButton_1.setBounds(207, 167, 229, 38);
		mainMenu.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("VIEW VOTE");
		
//		view vote MAIN MENU
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainMenu.setVisible(false);
				viewV.setVisible(true);
			}
		});
		btnNewButton_1_1.setBackground(new Color(165, 42, 42));
		btnNewButton_1_1.setForeground(new Color(245, 255, 250));
		btnNewButton_1_1.setFont(new Font("Century Gothic", Font.BOLD, 33));
		btnNewButton_1_1.setBounds(207, 209, 229, 38);
		mainMenu.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("LOGOUT");
		
//		LOGOUT MAIN MENU
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				reset defaults
				btnPUSH.setEnabled(true);
				listModel1.removeAllElements();
				list.removeAll();
				cmbCNDTS.setModel(new DefaultComboBoxModel<String>(new String[] {"ROSIE", "JISOO", "LISA", "JENNIE", "MINA", "MOMO", "SANA", "DAHYUN", "TZUYU", "IU"}));

				btnNewButton_1.setEnabled(true);
				
				mainMenu.setVisible(false);
				welcoME.setVisible(true);
			}
		});
		btnNewButton_1_2.setForeground(new Color(248, 248, 255));
		btnNewButton_1_2.setBackground(new Color(139, 69, 19));
		btnNewButton_1_2.setFont(new Font("Century Gothic", Font.BOLD, 33));
		btnNewButton_1_2.setBounds(207, 252, 229, 38);
		mainMenu.add(btnNewButton_1_2);
		

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
		

		lblROS.setHorizontalAlignment(SwingConstants.LEFT);
		lblROS.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblROS.setBounds(61, 94, 208, 33);
		viewV.add(lblROS);
		

		lblLIS.setHorizontalAlignment(SwingConstants.LEFT);
		lblLIS.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblLIS.setBounds(61, 138, 208, 33);
		viewV.add(lblLIS);
		

		lblJIS.setHorizontalAlignment(SwingConstants.LEFT);
		lblJIS.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblJIS.setBounds(61, 182, 208, 33);
		viewV.add(lblJIS);
		

		lblJEN.setHorizontalAlignment(SwingConstants.LEFT);
		lblJEN.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblJEN.setBounds(61, 226, 208, 33);
		viewV.add(lblJEN);
		

		lblJIU.setHorizontalAlignment(SwingConstants.LEFT);
		lblJIU.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblJIU.setBounds(61, 269, 208, 33);
		viewV.add(lblJIU);
		

		lblMIN.setHorizontalAlignment(SwingConstants.LEFT);
		lblMIN.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblMIN.setBounds(295, 93, 208, 33);
		viewV.add(lblMIN);
		

		lblMOM.setHorizontalAlignment(SwingConstants.LEFT);
		lblMOM.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblMOM.setBounds(295, 138, 208, 33);
		viewV.add(lblMOM);
		

		lblSAN.setHorizontalAlignment(SwingConstants.LEFT);
		lblSAN.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblSAN.setBounds(295, 182, 208, 33);
		viewV.add(lblSAN);
		

		lblDAH.setHorizontalAlignment(SwingConstants.LEFT);
		lblDAH.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblDAH.setBounds(295, 226, 208, 33);
		viewV.add(lblDAH);
		

		lblTZU.setHorizontalAlignment(SwingConstants.LEFT);
		lblTZU.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblTZU.setBounds(295, 269, 208, 33);
		viewV.add(lblTZU);
		
		JButton btnBAK = new JButton("BACK");
		
//		backbutton view Vote
		btnBAK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewV.setVisible(false);
				mainMenu.setVisible(true);
			}
		});
		btnBAK.setBackground(new Color(238, 232, 170));
		btnBAK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBAK.setBounds(502, 292, 132, 33);
		viewV.add(btnBAK);
		
		
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
		
		txtPleaseEnterYour = new JTextField();
		txtPleaseEnterYour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
// NOTE: gumawa ako ng function na nag clear ng textfield para di na ako paulit ulit mag if statement kasi
// katamad at ang dugyot				
				clearTextField(txtPleaseEnterYour, "Please enter your username","");
				clearTextField(passwordField, "","Password");				
			}
		});
		txtPleaseEnterYour.setText("Please enter your username");
		txtPleaseEnterYour.setBounds(200, 150, 345, 33);
		logIN.add(txtPleaseEnterYour);
		txtPleaseEnterYour.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		
//		showpassword check sa Login form
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
// NOTE: gumawa ako ng function na nag clear ng textfield para di na ako paulit ulit mag if statement kasi
// katamad at ang dugyot				
				clearTextField(txtPleaseEnterYour, "","Please enter your username");
				clearTextField(passwordField, "","Password");
				
				if (chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}else {
					passwordField.setEchoChar('*');
				}
			
				
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(198, 230, 121, 23);
		logIN.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("LOGIN");
		
// login button sa Login frame		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
// NOTE: gumawa ako ng function na nag clear ng textfield para di na ako paulit ulit mag if statement kasi
// katamad at ang dugyot				
			clearTextField(txtPleaseEnterYour, "","Please enter your username");
			clearTextField(passwordField, "","Password");	
			
			
//			validate login credentials
			if (userInfo.contains("Username: " + txtPleaseEnterYour.getText().toString()) && 
					userInfo.contains("Password: " + passwordField.getText().toString())) {
				JOptionPane.showMessageDialog(new VotingSystem(), 
						"you have successfully logged in");
				
				currentLogin =  "Username: " + txtPleaseEnterYour.getText().toString();
				
//				reset default text
				txtPleaseEnterYour.setText("Please enter your username");
				passwordField.setText("Password");
				
				logIN.setVisible(false);
				mainMenu.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(new VotingSystem(), 
						"invalid username or passwor");
			}
			
				
			}
		});
		btnNewButton.setBackground(new Color(178, 34, 34));
		btnNewButton.setForeground(new Color(245, 255, 250));
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNewButton.setBounds(131, 270, 188, 33);
		logIN.add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		
//		CANCEL SA LOG IN FRAME
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcoME.setVisible(true);
				logIN.setVisible(false);
				
//				reset default text
				txtPleaseEnterYour.setText("Please enter your username");
				passwordField.setText("Password");
			}
		});
		btnCancel.setBackground(new Color(0, 0, 0));
		btnCancel.setForeground(new Color(245, 255, 250));
		btnCancel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnCancel.setBounds(327, 270, 188, 33);
		logIN.add(btnCancel);
		
		passwordField = new JPasswordField("Password");
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
// NOTE: gumawa ako ng function na nag clear ng textfield para di na ako paulit ulit mag if statement kasi
// katamad at ang dugyot				
				clearTextField(txtPleaseEnterYour, "","Please enter your username");
				clearTextField(passwordField, "Password","");

			}
		});
		passwordField.setBounds(200, 190, 345, 33);
		logIN.add(passwordField);
		
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
		
//		keyPress sa signUpframe
		textFieldFN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
// NOTE: gumawa ako ng function na nag clear ng textfield para di na ako paulit ulit mag if statement kasi
// katamad at ang dugyot
								
			//full Name
			clearTextField(textFieldFN,"Please enter your full name","");
								
			//address
			clearTextField(textFieldAD,"","Please enter your full address");
								
			//password
			clearTextField(textFieldPS,"","Type your new password");
			
			}
		});
		
//		mouse clicked sa signUp frame
		textFieldFN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
// NOTE: gumawa ako ng function na nag clear ng textfield para di na ako paulit ulit mag if statement kasi
// katamad at ang dugyot
				
				//full Name
				clearTextField(textFieldFN,"Please enter your full name","");
				
				//address
				clearTextField(textFieldAD,"","Please enter your full address");
				
				//password
				clearTextField(textFieldPS,"","Type your new password");
			}
		});
		textFieldFN.setText("Please enter your full name");
		textFieldFN.setBounds(231, 146, 274, 23);
		signUP.add(textFieldFN);
		textFieldFN.setColumns(10);
		
		textFieldAD = new JTextField();
		textFieldAD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

// NOTE: gumawa ako ng function na nag clear ng textfield para di na ako paulit ulit mag if statement kasi
// katamad at ang dugyot				
				
				//full Name
				clearTextField(textFieldFN,"","Please enter your full name");
				
				//address
				clearTextField(textFieldAD,"Please enter your full address","");
				
				//password
				clearTextField(textFieldPS,"","Type your new password");
				
			}
		});
		textFieldAD.setText("Please enter your full address");
		textFieldAD.setColumns(10);
		textFieldAD.setBounds(231, 175, 274, 23);
		signUP.add(textFieldAD);
		
		textFieldPS = new JTextField();
		textFieldPS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
// NOTE: gumawa ako ng function na nag clear ng textfield para di na ako paulit ulit mag if statement kasi
// katamad at ang dugyot				
								
			//full Name
			clearTextField(textFieldFN,"","Please enter your full name");
								
			//address
			clearTextField(textFieldAD,"","Please enter your full address");
								
			//password
			clearTextField(textFieldPS,"Type your new password","");
			
			}
		});
		textFieldPS.setText("Type your new password");
		textFieldPS.setColumns(10);
		textFieldPS.setBounds(231, 204, 274, 23);
		signUP.add(textFieldPS);
		rdbtnMORE.setSelected(true);
		
		
//		radioButton sa Signup Frame
		rdbtnMORE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
// NOTE: gumawa ako ng function na nag clear ng textfield para di na ako paulit ulit mag if statement kasi
// katamad at ang dugyot				
												
			//full Name
			clearTextField(textFieldFN,"","Please enter your full name");
												
			//address
			clearTextField(textFieldAD,"","Please enter your full address");
												
			//password
			clearTextField(textFieldPS,"","Type your new password");				
				
//			para mafalse ang less
			rdbtnLESS.setSelected(false);
			
			}
		});
		rdbtnMORE.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnMORE.setBackground(new Color(255, 99, 71));
		rdbtnMORE.setBounds(99, 247, 202, 23);
		signUP.add(rdbtnMORE);
		
		
//		radioButton sa Signup Frame		
		rdbtnLESS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
// NOTE: gumawa ako ng function na nag clear ng textfield para di na ako paulit ulit mag if statement kasi
// katamad at ang dugyot				
																
			//full Name
			clearTextField(textFieldFN,"","Please enter your full name");
																
			//address
			clearTextField(textFieldAD,"","Please enter your full address");
																
			//password
			clearTextField(textFieldPS,"","Type your new password");	
			
//			para mafalse ang more
			rdbtnMORE.setSelected(false);
			
			}
		});
		rdbtnLESS.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnLESS.setBackground(new Color(178, 34, 34));
		rdbtnLESS.setBounds(318, 247, 202, 23);
		signUP.add(rdbtnLESS);
		
		JButton btnUP = new JButton("SIGNUP");
		
//		signUp button Events 
		btnUP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
// NOTE: gumawa ako ng function na nag clear ng textfield para di na ako paulit ulit mag if statement kasi
// katamad at ang dugyot				
																
			//full Name
			clearTextField(textFieldFN,"","Please enter your full name");
																
			//address
			clearTextField(textFieldAD,"","Please enter your full address");
																
			//password
			clearTextField(textFieldPS,"","Type your new password");
			
//			ichcheck kung naka select ba ang more
			if (rdbtnMORE.isSelected()) {

//				check if textfield are in default text	
				if (textFieldFN.getText().equals("Please enter your full name") || 
						textFieldAD.getText().equals("Please enter your full address") || 
						textFieldPS.getText().equals("Type your new password") ) {
					
					JOptionPane.showMessageDialog(new VotingSystem(), 
							"oops, it appears that you might not be able to enter some input fields.\n"
							+ "please check all fields");
					
				}else {
					try {
						String username = textFieldFN.getText().toUpperCase().substring(0, 1) + 
								textFieldFN.getText().toUpperCase().substring(0, 2).concat("VOTE2022");
						userInfo.add("FullName: " + textFieldFN.getText().toString());
						userInfo.add("Address: " + textFieldAD.getText().toString());
						userInfo.add("Username: " + username);
						userInfo.add("Password: " + textFieldPS.getText().toString());
						
						JOptionPane.showMessageDialog(new VotingSystem(), 
								"your registration was successful, therefore you can now log in.");
						
						JOptionPane.showMessageDialog(new VotingSystem(), 
								"your new username is : " + username);
						
						signUP.setVisible(false);
						logIN.setVisible(true);
						
//						set default text
						textFieldFN.setText("Please enter your full name");
						textFieldAD.setText("Please enter your full address");
						textFieldPS.setText("Type your new password");
						
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(new VotingSystem(), 
								"Please use proper Full name");
					}

				}

				
			}else {
				JOptionPane.showMessageDialog(new VotingSystem(), 
						"I apologize that you cannot vote at this time; voters should have a six-month residency.");
			}
				
			}
		});
		btnUP.setForeground(new Color(245, 245, 245));
		btnUP.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnUP.setBackground(new Color(178, 34, 34));
		btnUP.setBounds(155, 277, 146, 34);
		signUP.add(btnUP);
		
		JButton btnCAN = new JButton("CANCEL");
		
//		cancel sa signUp frame
		btnCAN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcoME.setVisible(true);
				signUP.setVisible(false);
				
//				set default text
				textFieldFN.setText("Please enter your full name");
				textFieldAD.setText("Please enter your full address");
				textFieldPS.setText("Type your new password");
			}
		});
		btnCAN.setForeground(new Color(245, 245, 245));
		btnCAN.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnCAN.setBackground(new Color(0, 0, 0));
		btnCAN.setBounds(318, 277, 146, 34);
		signUP.add(btnCAN);
		

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
		
//		LOGIN BUTTON SA WELCOME FRAME
		btnLOG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcoME.setVisible(false);
				logIN.setVisible(true);
			}
		});
		btnLOG.setForeground(new Color(245, 255, 250));
		btnLOG.setBackground(new Color(255, 127, 80));
		btnLOG.setFont(new Font("Century Gothic", Font.BOLD, 25));
		btnLOG.setBounds(127, 221, 195, 41);
		welcoME.add(btnLOG);
		
		JButton btnSIGN = new JButton("SIGNUP");
		
// 		SIGN UP SA WELCOME FRAME		
		btnSIGN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcoME.setVisible(false);
				signUP.setVisible(true);
			}
		});
		btnSIGN.setForeground(new Color(245, 255, 250));
		btnSIGN.setBackground(new Color(255, 127, 80));
		btnSIGN.setFont(new Font("Century Gothic", Font.BOLD, 25));
		btnSIGN.setBounds(332, 221, 195, 41);
		welcoME.add(btnSIGN);
	}
}
