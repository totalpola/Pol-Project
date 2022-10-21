package dryTest;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import java.awt.SystemColor;
import javax.swing.UIManager;




public class votingSystemLangNila extends JFrame {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//	Candidates
	ArrayList<String> candidates = new ArrayList<String>();
	
	//mga binoto ni user
	Stack<String> votersPush = new Stack<String>();
	
	//mga bomoto
	Stack<String> voterUser = new Stack<String>();
	
	// para sa jlist
	DefaultListModel<String> listModel1 = new DefaultListModel<String>();
	
	//stack candidatess
	Stack<String> Nayeon = new Stack<String>();  
	Stack<String> Sana = new Stack<String>();  
	Stack<String> Momo = new Stack<String>();  
	Stack<String> Mina = new Stack<String>();  
	Stack<String> Chaeryoung = new Stack<String>();  
	Stack<String> IU = new Stack<String>();  
	Stack<String> Jisoo = new Stack<String>();  
	Stack<String> Jennie = new Stack<String>(); 
	
	//nilabas kulang sila di kasi maread ng ginawang function ko sa baba : 416
	private JLabel candid1 = new JLabel("Nayeon = 0");
	private JLabel candid2 = new JLabel("Sana = 0");
	private JLabel candid3 = new JLabel("Momo = 0");
	private JLabel candid4 = new JLabel("Mina = 0");
	private JLabel candid5 = new JLabel("Chaeryoung = 0");
	private JLabel candid6 = new JLabel("Lee Jieun = 0");
	private JLabel candid7 = new JLabel("Jisoo = 0");
	private JLabel candid8 = new JLabel("Jennie = 0");
	

	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {					
					votingSystemLangNila frame = new votingSystemLangNila();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


//	add candidates
	private void candidatesList() {
		
		listModel1.addElement("==========================================");
		listModel1.addElement("*************** Choice top 5 of your idolo **************");
		listModel1.addElement("==========================================");
		
//		pang add sa combobox
		candidates.add("Nayeon");
		candidates.add("Sana");
		candidates.add("Momo");
		candidates.add("Mina");
		candidates.add("Chaeryoung");
		candidates.add("Lee Jieun");
		candidates.add("Jisoo");
		candidates.add("Jennie");
	}
	public votingSystemLangNila() {
			
//gumawa ako ng function tas tinawag ko para elegant tingnan
		candidatesList();		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.decode("#FFF0C4"));
		setBounds(100, 100, 453, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
			
			JPanel voteNow = new JPanel();
			voteNow.setBounds(0, 0, 397, 506);
			voteNow.setBackground(Color.decode("#FFF0C4"));
			contentPane.add(voteNow);
			voteNow.setLayout(null);
			voteNow.setVisible(false); //*************************************** VOTE NOW frame
			
				
				
				JList<String> list = new JList<String>();
				list.setBackground(new Color(255, 255, 255));
				list.setModel(new AbstractListModel() {
					String[] values = new String[] {"==========================================", "*************** Choice top 5 of your idolo **************", "=========================================="};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				list.setBounds(48, 30, 300, 297);
				
				
				voteNow.add(list);
				
				JButton btnNewButton = new JButton("push");
				btnNewButton.setBackground(Color.WHITE);
				btnNewButton.setBounds(94, 376, 89, 23);
				voteNow.add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("pop");
				btnNewButton_1.setBackground(Color.WHITE);
				btnNewButton_1.setBounds(209, 376, 89, 23);
				voteNow.add(btnNewButton_1);
				
				JButton btnNewButton_2 = new JButton("Final Vote");
				btnNewButton_2.setBackground(Color.WHITE);
				btnNewButton_2.setBounds(37, 433, 146, 39);
				voteNow.add(btnNewButton_2);
				
				JButton btnNewButton_3 = new JButton("Cancel");
				btnNewButton_3.setBackground(Color.WHITE);
				btnNewButton_3.setBounds(218, 435, 130, 35);
				voteNow.add(btnNewButton_3);
				
				JComboBox<String> comboBox = new JComboBox<String>();
				comboBox.setBackground(Color.WHITE);
				comboBox.setBounds(110, 343, 175, 22);
				voteNow.add(comboBox);
				
				//Pang Add sa comobox
				comboBox.setModel(new DefaultComboBoxModel<String>(candidates.toArray(new String[0])));			
				

		
	
		
			JPanel mainMenu = new JPanel();
			mainMenu.setBackground(Color.decode("#FFF0C4"));
			mainMenu.setBounds(0, 0, 443, 306);
			contentPane.add(mainMenu);
			mainMenu.setLayout(null);
			
			mainMenu.setVisible(true); //***************************************Main Menu frame
			
			JLabel welcome = new JLabel("Hello Friend");
			welcome.setHorizontalAlignment(SwingConstants.CENTER);
			welcome.setFont(new Font("Century Gothic", Font.PLAIN, 23));
			welcome.setBounds(10, 11, 414, 41);
			mainMenu.add(welcome);
			
			JLabel Name = new JLabel("Art Lisboa");
			Name.setHorizontalAlignment(SwingConstants.CENTER);
			Name.setFont(new Font("Century Gothic", Font.PLAIN, 24));
			Name.setBounds(10, 51, 414, 38);
			mainMenu.add(Name);
			
			JPanel borderVote = new JPanel();
			borderVote.setBackground(new Color(0, 0, 0));
			borderVote.setBounds(54, 120, 340, 41);
			mainMenu.add(borderVote);
			borderVote.setLayout(null);
			
			JButton voteBttn = new JButton("Vote Now");
			voteBttn.setBounds(1, 1, 338, 39);
			borderVote.add(voteBttn);
			voteBttn.setForeground(Color.decode("#FFF0C4"));
			voteBttn.setBackground(Color.decode("#315E4C"));
			voteBttn.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			
			JPanel borderViewVote = new JPanel();
			borderViewVote.setLayout(null);
			borderViewVote.setBackground(Color.BLACK);
			borderViewVote.setBounds(54, 172, 340, 41);
			mainMenu.add(borderViewVote);
			
			JButton viewVoteBttn = new JButton("View vote");
			viewVoteBttn.setForeground(new Color(255, 240, 196));
			viewVoteBttn.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			viewVoteBttn.setBackground(new Color(49, 94, 76));
			viewVoteBttn.setBounds(1, 1, 338, 39);
			borderViewVote.add(viewVoteBttn);
			
			JPanel borderViewVote_1 = new JPanel();
			borderViewVote_1.setLayout(null);
			borderViewVote_1.setBackground(Color.BLACK);
			borderViewVote_1.setBounds(54, 224, 340, 41);
			mainMenu.add(borderViewVote_1);
			
			JButton viewVoteBttn_1 = new JButton("Logout");
			viewVoteBttn_1.setForeground(new Color(255, 240, 196));
			viewVoteBttn_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			viewVoteBttn_1.setBackground(new Color(49, 94, 76));
			viewVoteBttn_1.setBounds(1, 1, 338, 39);
			borderViewVote_1.add(viewVoteBttn_1);
			
		
		JPanel viewVote = new JPanel();
		viewVote.setBackground(Color.decode("#FFF0C4"));;
		viewVote.setBounds(0, 0, 397, 538);
		contentPane.add(viewVote);
		viewVote.setLayout(null);
		viewVote.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("Vote Tally");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 8, 377, 39);
		viewVote.add(lblNewLabel);
		

		candid1.setHorizontalAlignment(SwingConstants.CENTER);
		candid1.setBackground(new Color(153, 255, 255));
		candid1.setFont(new Font("Courier New", Font.PLAIN, 18));
		candid1.setBounds(10, 55, 377, 46);
		viewVote.add(candid1);
		

		candid2.setHorizontalAlignment(SwingConstants.CENTER);
		candid2.setFont(new Font("Courier New", Font.PLAIN, 18));
		candid2.setBounds(10, 109, 377, 46);
		viewVote.add(candid2);
		
		candid3.setHorizontalAlignment(SwingConstants.CENTER);
		candid3.setFont(new Font("Courier New", Font.PLAIN, 18));
		candid3.setBounds(10, 163, 377, 46);
		viewVote.add(candid3);
		

		candid4.setHorizontalAlignment(SwingConstants.CENTER);
		candid4.setFont(new Font("Courier New", Font.PLAIN, 18));
		candid4.setBounds(10, 217, 377, 46);
		viewVote.add(candid4);
		
		candid5.setHorizontalAlignment(SwingConstants.CENTER);
		candid5.setFont(new Font("Courier New", Font.PLAIN, 18));
		candid5.setBounds(10, 271, 377, 46);
		viewVote.add(candid5);
		
		candid6.setHorizontalAlignment(SwingConstants.CENTER);
		candid6.setFont(new Font("Courier New", Font.PLAIN, 18));
		candid6.setBounds(10, 325, 377, 46);
		viewVote.add(candid6);
		
		candid7.setHorizontalAlignment(SwingConstants.CENTER);
		candid7.setFont(new Font("Courier New", Font.PLAIN, 18));
		candid7.setBounds(10, 379, 377, 46);
		viewVote.add(candid7);
		
		candid8.setHorizontalAlignment(SwingConstants.CENTER);
		candid8.setFont(new Font("Courier New", Font.PLAIN, 18));
		candid8.setBounds(10, 433, 377, 46);
		viewVote.add(candid8);
		
		JButton btnNewButton_4 = new JButton("back to mainmenu");
		btnNewButton_4.setForeground(new Color(255, 240, 196));
		btnNewButton_4.setBackground(Color.decode("#315E4C"));
		btnNewButton_4.setBounds(10, 487, 377, 39);
		viewVote.add(btnNewButton_4);

			
//*************************** event functsion ***************************
			
		
// ******************* main menu events  button ****************** // 		
			
			// vote now button
			voteBttn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (voterUser.contains(Name.getText().toString())) {
						voteBttn.setEnabled(false);
						JOptionPane.showMessageDialog(new votingSystemLangNila(), "naka boto kana pre");
					}else {
						voterUser.add(Name.getText().toString());
						mainMenu.setVisible(false);
						voteNow.setVisible(true);
						setBounds(100, 100, 405, 538);	
					}

				}
			});		
			
			
			//view Vote button
			viewVoteBttn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mainMenu.setVisible(false);
					viewVote.setVisible(true);
					setBounds(100, 100, 408, 577);
				}
			});		
		
// ******************* View Vote events  button ****************** // 		
		
		//back to mainmenu
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBounds(100, 100, 453, 339);
				mainMenu.setVisible(true);
				viewVote.setVisible(false);
			}
		});
		
		
// ******************* Vote NOW events  button ****************** // 		
				//push event
				btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							if (list.getModel().getSize() == 8) {
								
								//kapag nareach na niya ang 5 votes
								
								JOptionPane.showMessageDialog(null, "tama na ang pag push pare"); 
								btnNewButton.setEnabled(false);

							}else {
								// kapag hindi pa
								btnNewButton_1.setEnabled(true); // just in case mag disable ang pop button kelangan niya i enable ito
								
								listModel1.addElement(comboBox.getSelectedItem().toString()); //i add muna sa isang list
								
								// dito sa voterPush doon istack mga boto ng user
								votersPush.push(comboBox.getSelectedItem().toString());  
								 
								list.setModel(listModel1); //katsa idisiplay sa jlist
								
								//para maremove ang item sa selected sa combobox
								comboBox.removeItem(comboBox.getSelectedItem().toString());
							}
							System.out.println(votersPush);		//eme lang to
				
						}
				});
				

				
				//pop event
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							btnNewButton.setEnabled(true); // just in case mag disable ang push button kelangan niya i enable ito
							
							comboBox.addItem(votersPush.peek()); // iadd ule sa combobox ang na peek mula sa Voterpush
							
							listModel1.removeElement(votersPush.peek()); // katsa tatanggalin ang item mula sa list via voterpush.peek()
							votersPush.pop(); // katsa niya ipop 
							
						}catch(Exception ex) {
							JOptionPane.showMessageDialog(null, "wala kanang ma pop brad"); 
							btnNewButton_1.setEnabled(false);
						}

					}
				});
				
				//cancel
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setBounds(100, 100, 453, 339);
						voterUser.remove(Name.getText().toString());
						voteBttn.setEnabled(true);
						mainMenu.setVisible(true);
						voteNow.setVisible(false);
					}
				});
				
				//final vote
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						//check muna kung may laman ang voter push
						if (votersPush.isEmpty()) {
							JOptionPane.showMessageDialog(new votingSystemLangNila(), "Boto ka muna friend");
						}else {
							//gumawa ako ng function para elegant tingnan
							yesOrNo(Name,viewVote,voteNow);
							//NOTE:
							// ang function may paramter na JLabel at Jpanel
							// pinasa ko yung Name label at viewVote panel and voteNow Panel sa function nato
				        }				
					}
				});		
		
	}
	
//	check lang kung final naba desisyon ng user
	private void yesOrNo(JLabel Name , JPanel viewVote, JPanel voteNow) {
		 int result = JOptionPane.showConfirmDialog(new votingSystemLangNila(),"Final na? sila ba talaga bet mo ?", "Botohohan ng idolo",
                 JOptionPane.YES_NO_OPTION,
                 JOptionPane.QUESTION_MESSAGE);
         
         //check muna kung final na sila
         if (result == JOptionPane.YES_OPTION) {
//				setBounds(100, 100, 413, 545);
				
				for (String votes : votersPush){
					switch(votes) {
						case "Nayeon":
							Nayeon.push(Name.getText().toString());
							candid1.setText("Nayeon = " + String.valueOf(Nayeon.size()));
							System.out.println("1 point kay Nayeon: " + String.valueOf(Nayeon.size()));
						break;
						case "Sana":
							Sana.push(Name.getText().toString());
							candid2 .setText("Sana = " + String.valueOf(Sana.size()));
							System.out.println("1 point kay Sana: " + String.valueOf(Sana.size()));
						break;
						case "Momo":
							Momo.push(Name.getText().toString());
							candid3 .setText("Momo = " + String.valueOf(Momo.size()));
							System.out.println("1 point kay Momo: " + String.valueOf(Momo.size()));
						break;
						case "Mina":
							Mina.push(Name.getText().toString());
							candid4 .setText("Mina = " + String.valueOf(Mina.size()));
							System.out.println("1 point kay Mina: " + String.valueOf(Mina.size()));
						break;
						case "Chaeryoung":
							Chaeryoung.push(Name.getText().toString());
							candid5.setText("Chaeryoung = " + String.valueOf(Chaeryoung.size()));
							System.out.println("1 point kay Chaeryoung: " + String.valueOf(Chaeryoung.size()));
						break;
						case "Lee Jieun":
							IU.push(Name.getText().toString());
							candid6.setText("Lee Jieun = " + String.valueOf(IU.size()));
							System.out.println("1 point kay Lee Jieun: " + String.valueOf(IU.size()));
						break;
						case "Jisoo":
							Jisoo.push(Name.getText().toString());
							candid7.setText("Jisoo = " + String.valueOf(Jisoo.size()));
							System.out.println("1 point kay Jisoo: " + String.valueOf(Jisoo.size()));
						break;
						case "Jennie":
							Jennie.push(Name.getText().toString());
							candid8.setText("Jennie = " + String.valueOf(Jennie.size()));
							System.out.println("1 point kay Jennie: " + String.valueOf(Jennie.size()));
						break;
					}
					
					voteNow.setVisible(false);
					viewVote.setVisible(true);
					setBounds(100, 100, 408, 577);
				}
         }	
	
	}
}
