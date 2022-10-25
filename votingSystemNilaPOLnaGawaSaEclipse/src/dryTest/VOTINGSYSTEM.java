package dryTest;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

public class VOTINGSYSTEM extends JFrame {
	
	

	private JPanel contentPane;
	private JTextField fullName;
	private JTextField newPass;
	private JTextField conPass;
	private JTextField username;
	private JTextField password;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VOTINGSYSTEM frame = new VOTINGSYSTEM();
					
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

	/**
	 * Create the frame.
	 */
	
	//for usernameAndPassword    
	ArrayList<String> NameUsernamePassword = new ArrayList<String>();
	
	//Voters List
	ArrayList<String> voters = new ArrayList<String>();

	//List for voters choice
	DefaultListModel<String> voteList = new DefaultListModel();
	
	//candidates
	Stack<String> LeeJiun = new Stack<String>();  
	Stack<String> momo = new Stack<String>();  
	Stack<String> sana = new Stack<String>();  
	Stack<String> jisoo = new Stack<String>();  
	Stack<String> mina = new Stack<String>();  
	Stack<String> nayeon = new Stack<String>();  

	
//	ichehcheck lang niya kung nasa `votelist` ba yung nka check
    @SuppressWarnings("unused")
	private int check(JCheckBox check){
        if (voteList.contains(check.getText().toString()))
        {
            return 1;
        }else{
            return 0;
        }
    }
	
	public VOTINGSYSTEM() {
//=================
//        VOTE 3 ONLY
//----------------------------------
		voteList.addElement("===================");
		voteList.addElement("           VOTE 3 ONLY");
		voteList.addElement("----------------------------------");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 377);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel nameLabel = new JLabel("New label");
		JPanel welcomePanel = new JPanel(); //welcome frame
		JPanel voteFrame = new JPanel(); //	Vote Frame
		JPanel viewVote = new JPanel(); //view vote frame
		JPanel mainMenuFrame = new JPanel(); //mainmenu Frame
		
		
		viewVote.setVisible(false);
		voteFrame.setVisible(false);
		
		
		voteFrame.setBounds(0, 0, 434, 292);
		contentPane.add(voteFrame);
		voteFrame.setLayout(null);
		
		JList jList1 = new JList();
		jList1.setModel(new AbstractListModel() {
			String[] values = new String[] {"=================", "             VOTE 3 ONLY", "----------------------------------"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		jList1.setBackground(new Color(238, 232, 170));
		jList1.setBounds(154, 32, 141, 178);
		voteFrame.add(jList1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Nayeon");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if (chckbxNewCheckBox.isSelected()){
		            voteList.addElement(chckbxNewCheckBox.getText().toString());
		            jList1.setModel(voteList);  
		            nayeon.add(nameLabel.getText());
		        }else{
		           voteList.removeElement(chckbxNewCheckBox.getText().toString());
		            jList1.setModel(voteList);  
		            nayeon.pop();
		        }
			}
		});
		chckbxNewCheckBox.setBounds(18, 29, 97, 23);
		voteFrame.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Momo");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if (chckbxNewCheckBox_1.isSelected()){
		            voteList.addElement(chckbxNewCheckBox_1.getText().toString());
		            jList1.setModel(voteList);  
		            momo.add(nameLabel.getText());
		            
		        }else{
		           voteList.removeElement(chckbxNewCheckBox_1.getText().toString());
		            jList1.setModel(voteList); 
		            momo.pop();
		        }
			}
		});
		chckbxNewCheckBox_1.setBounds(18, 55, 97, 23);
		voteFrame.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Mina");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if (chckbxNewCheckBox_2.isSelected()){
		            voteList.addElement(chckbxNewCheckBox_2.getText().toString());
		            jList1.setModel(voteList);  
		            mina .add(nameLabel.getText());
		        }else{
		           voteList.removeElement(chckbxNewCheckBox_2.getText().toString());
		            jList1.setModel(voteList);  
		            mina.pop();
		        }
			}
		});
		chckbxNewCheckBox_2.setBounds(18, 81, 97, 23);
		voteFrame.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Sana");
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if (chckbxNewCheckBox_3.isSelected()){
		            voteList.addElement(chckbxNewCheckBox_3.getText().toString());
		            jList1.setModel(voteList);  
		            sana.add(nameLabel.getText());
		        }else{
		           voteList.removeElement(chckbxNewCheckBox_3.getText().toString());
		            jList1.setModel(voteList);  
		            sana.pop();
		        }
			}
		});
		chckbxNewCheckBox_3.setBounds(18, 107, 97, 23);
		voteFrame.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Jisoo");
		chckbxNewCheckBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if (chckbxNewCheckBox_4.isSelected()){
		            voteList.addElement(chckbxNewCheckBox_4.getText().toString());
		            jList1.setModel(voteList);  
		            jisoo.add(nameLabel.getText());
		        }else{
		           voteList.removeElement(chckbxNewCheckBox_4.getText().toString());
		            jList1.setModel(voteList); 
		            jisoo.pop();
		        }
			}
		});
		chckbxNewCheckBox_4.setBounds(18, 133, 97, 23);
		voteFrame.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Lee jieun");
		chckbxNewCheckBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if (chckbxNewCheckBox_5.isSelected()){
		            voteList.addElement(chckbxNewCheckBox_5.getText().toString());
		            jList1.setModel(voteList);
		            LeeJiun.add(nameLabel.getText());
		            
		        }else{
		           voteList.removeElement(chckbxNewCheckBox_5.getText().toString());
		            jList1.setModel(voteList);  
		            LeeJiun.pop();
		        }
			}
		});
		chckbxNewCheckBox_5.setBounds(18, 159, 97, 23);
		voteFrame.add(chckbxNewCheckBox_5);
		
		//Vote nowsss
		JButton voteNow = new JButton("voteNow");
		
				voteNow.setBounds(57, 221, 141, 23);
				voteFrame.add(voteNow);
				
				JButton cancelNow = new JButton("cancel");
				cancelNow.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						voteFrame.setVisible(false);
						mainMenuFrame.setVisible(true);
						voters.remove(nameLabel.getText().toString());
					}
				});
				cancelNow.setBounds(227, 221, 141, 23);
				voteFrame.add(cancelNow);
				
				
	
		
		viewVote.setBackground(new Color(255, 182, 193));
		viewVote.setBounds(0, 0, 434, 299);
		contentPane.add(viewVote);
		viewVote.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("view vote");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(136, 11, 106, 14);
		viewVote.add(lblNewLabel_5);
		
		JButton btnNewButton_2 = new JButton("back to main menu");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewVote.setVisible(false);
				mainMenuFrame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(136, 265, 157, 23);
		viewVote.add(btnNewButton_2);
		
		JLabel NayeonLabel = new JLabel("Nayeon = 0");
		NayeonLabel.setBounds(156, 36, 86, 14);
		viewVote.add(NayeonLabel);
		
		JLabel momoLabel = new JLabel("Momo = 0");
		momoLabel.setBounds(156, 61, 86, 14);
		viewVote.add(momoLabel);
		
		JLabel minaLabel = new JLabel("mina = 0");
		minaLabel.setBounds(156, 86, 86, 14);
		viewVote.add(minaLabel);
		
		JLabel sanaLabel = new JLabel("sana = 0");
		sanaLabel.setBounds(156, 111, 86, 14);
		viewVote.add(sanaLabel);
		
		JLabel IULabel = new JLabel("Lee Jieun = 0");
		IULabel.setBounds(156, 136, 86, 14);
		viewVote.add(IULabel);
		
		JLabel jisooLabel = new JLabel("Jisoo = 0");
		jisooLabel.setBounds(156, 159, 86, 14);
		viewVote.add(jisooLabel);

		voteNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if (jList1.getModel().getSize() == 6){
		            System.out.println("Wow Ang Galing");

		            
//		            LeeJiun += check(chckbxNewCheckBox);
//		            momo += check(chckbxNewCheckBox_1);
//		            sana += check(chckbxNewCheckBox_2);
//		            jisoo += check(chckbxNewCheckBox_3);
//		            mina += check(chckbxNewCheckBox_4);
//		            jennie += check(chckbxNewCheckBox_5);
		            
		            IULabel.setText("Lee Jieun = " + String.valueOf(LeeJiun.size()));
		            momoLabel.setText("Momo = " + String.valueOf(momo.size()));
		            sanaLabel.setText("Somo = " + String.valueOf(sana.size()));
		            jisooLabel.setText("Jisoo = " + String.valueOf(jisoo.size()));
		            minaLabel.setText("Mina = " + String.valueOf(mina.size()));
		            NayeonLabel.setText("Nayeon = " + String.valueOf(nayeon.size()));
		            
		            voteFrame.setVisible(false);
		            viewVote.setVisible(true);
		            
		        }else{
		            JOptionPane.showMessageDialog(null, "Please choice Top 3 only :(((");
		        }
			}
		});		
		JPanel loginPanel = new JPanel();  //Login frame
		loginPanel.setBackground(SystemColor.scrollbar);
		
		
		
		loginPanel.setBounds(0, 0, 434, 274);
		contentPane.add(loginPanel);
		loginPanel.setLayout(null);
		loginPanel.setVisible(false);
		
		JLabel lblNewLabel_3 = new JLabel("Login");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(127, 11, 183, 14);
		loginPanel.add(lblNewLabel_3);
		
		username = new JTextField();
		username.setBounds(77, 62, 245, 20);
		loginPanel.add(username);
		username.setColumns(10);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setLabelFor(username);
		usernameLabel.setBounds(77, 43, 132, 14);
		loginPanel.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(77, 93, 132, 14);
		loginPanel.add(passwordLabel);
		
		password = new JTextField();
		passwordLabel.setLabelFor(password);
		password.setColumns(10);
		password.setBounds(77, 112, 245, 20);
		loginPanel.add(password);
		
		JButton btnNewButton_1 = new JButton("Login ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				username password
				
//				check if the userName and Password are correct
				if (NameUsernamePassword.contains("Username: " + username.getText().toString()) &&
					NameUsernamePassword.contains("Password: " + password.getText().toString())) {
					JOptionPane.showMessageDialog(null, "goods"); 
					
					loginPanel.setVisible(false);
					mainMenuFrame.setVisible(true);
				}else {
					
					JOptionPane.showMessageDialog(null, "not goods"); 
				}
			}
		});
		btnNewButton_1.setBounds(146, 143, 89, 23);
		loginPanel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("cancel");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcomePanel.setVisible(true);
				loginPanel.setVisible(false);
			}
		});
		btnNewButton_1_1.setBounds(146, 177, 89, 23);
		loginPanel.add(btnNewButton_1_1);
		JPanel signUpPanel = new JPanel(); //signUp frame
		signUpPanel.setBackground(SystemColor.activeCaptionBorder);
		
		
		signUpPanel.setBounds(0, 0, 412, 263);
		contentPane.add(signUpPanel);
		signUpPanel.setLayout(null);
		signUpPanel.setVisible(false);
		
		fullName = new JTextField();
		fullName.setBounds(55, 66, 277, 20);
		signUpPanel.add(fullName);
		fullName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("full name");
		lblNewLabel_1.setBounds(56, 41, 89, 14);
		signUpPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New Password");
		lblNewLabel_1_1.setBounds(56, 97, 115, 14);
		signUpPanel.add(lblNewLabel_1_1);
		
		newPass = new JTextField();
		newPass.setColumns(10);
		newPass.setBounds(55, 122, 277, 20);
		signUpPanel.add(newPass);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Confirm Password");
		lblNewLabel_1_1_1.setBounds(56, 153, 115, 14);
		signUpPanel.add(lblNewLabel_1_1_1);
		
		conPass = new JTextField();
		conPass.setColumns(10);
		conPass.setBounds(55, 178, 277, 20);
		signUpPanel.add(conPass);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				fullName newPass conPass
			try {
	            String randomUsername = fullName.getText().toUpperCase().substring(0, 1) + 
	            		newPass.getText().toUpperCase().substring(0, 1) +
	            		fullName.getText().toUpperCase().substring(0, 2);
	            
				NameUsernamePassword.add("Name: " + fullName.getText().toString());
				NameUsernamePassword.add("Username: " + randomUsername);
				NameUsernamePassword.add("Password: " + conPass.getText().toString());
				
				JOptionPane.showMessageDialog(null, "Your new Username is " + randomUsername);
				
//				main menu label for name
				nameLabel.setText(fullName.getText().toString());
				
				signUpPanel.setVisible(false);
				loginPanel.setVisible(true);
				
		    }catch(Exception ex){
	            JOptionPane.showMessageDialog(null, "please [ut all empty fields"); 
	        } 
			
			}
		});
		btnNewButton.setBounds(82, 209, 89, 23);
		signUpPanel.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcomePanel.setVisible(true);
				signUpPanel.setVisible(false);				
			}
		});
		btnCancel.setBounds(191, 209, 89, 23);
		signUpPanel.add(btnCancel);
		
		JLabel lblNewLabel_2 = new JLabel("User Registration");
		lblNewLabel_2.setBounds(82, 16, 268, 14);
		signUpPanel.add(lblNewLabel_2);

		
		
		welcomePanel.setBackground(SystemColor.inactiveCaption);
		welcomePanel.setBounds(10, 11, 414, 239);
		contentPane.add(welcomePanel);
		welcomePanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Frame");
		lblNewLabel.setBounds(165, 35, 122, 14);
		welcomePanel.add(lblNewLabel);
		
//		Login Button for welcome frame
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcomePanel.setVisible(false);
				loginPanel.setVisible(true);
			}
		});
		loginButton.setBounds(162, 86, 89, 23);
		welcomePanel.add(loginButton);
		
		JButton signUpButton = new JButton("sign up");
		signUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcomePanel.setVisible(false);
				signUpPanel.setVisible(true);
			}
		});
		signUpButton.setBounds(162, 120, 89, 23);
		welcomePanel.add(signUpButton);

		
		mainMenuFrame.setVisible(false);	
		mainMenuFrame.setBackground(new Color(244, 164, 96));
		
		mainMenuFrame.setBounds(0, 0, 434, 285);
		contentPane.add(mainMenuFrame);
		mainMenuFrame.setLayout(null);
		
		JLabel mainMenuMain = new JLabel("Main Menu");
		mainMenuMain.setHorizontalAlignment(SwingConstants.CENTER);
		mainMenuMain.setBounds(126, 5, 196, 14);
		mainMenuFrame.add(mainMenuMain);
		
		
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setBounds(136, 32, 186, 14);
		mainMenuFrame.add(nameLabel);
		
		JButton voteButton = new JButton("vote");
		voteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				check if the voters are already vote
				if(voters.contains(nameLabel.getText().toString())) {
					voteButton.setEnabled(false);
					JOptionPane.showMessageDialog(null, "naka boto kana kaibigan"); 
				}else {
					System.out.println("boto kana kapatid");
					voters.add(nameLabel.getText().toString());
					voteFrame.setVisible(true);
					mainMenuFrame.setVisible(false);
				}
				
			}
		});
		voteButton.setBounds(102, 72, 238, 23);
		mainMenuFrame.add(voteButton);
		
		JButton viewVoteButton = new JButton("View Vote");
		viewVoteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewVote.setVisible(true);
				mainMenuFrame.setVisible(false);
			}
		});
		viewVoteButton.setBounds(102, 106, 238, 23);
		mainMenuFrame.add(viewVoteButton);
		
		JButton logoutButton = new JButton("Logout");
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainMenuFrame.setVisible(false);
				welcomePanel.setVisible(true);
				
//				remove all vote
				voteList.removeAllElements();
				voteList.addElement("===================");
				voteList.addElement("           VOTE 3 ONLY");
				voteList.addElement("----------------------------------");
				jList1.setModel(voteList);
				
//				Reset chec box
				chckbxNewCheckBox.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
				chckbxNewCheckBox_2.setSelected(false);
				chckbxNewCheckBox_3.setSelected(false);
				chckbxNewCheckBox_4.setSelected(false);
				chckbxNewCheckBox_5.setSelected(false);
				
				voteButton.setEnabled(true);
			}
		});
		logoutButton.setBounds(102, 140, 238, 23);
		mainMenuFrame.add(logoutButton);
	}
}
