package dryTest;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class registrationSytemLang extends JFrame {

	private JPanel contentPane;
	private JTextField txtText;
	private JTextField txtText_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationSytemLang frame = new registrationSytemLang();
					
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
	public registrationSytemLang() {
		
		

        
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("para lang di mag register pag empty mga textbox");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 434, 37);
		contentPane.add(lblNewLabel);
		
		txtText = new JTextField();
		txtText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				through mouse event function pag clicnick yung field mawalwala ang text
//				additional info: kung napapansin mo sa mga website may grey text dun na nagsaaad ng 
//				Username etc pag clicnk katsa mawawala. ang tawag sa mga text dun ay placeholder
				
				if (txtText.getText().equals("Text1")) {
					txtText.setText("");
				}
				
//				usaername
				if (txtText_1.getText().equals("")) {
					txtText_1.setText("Username");
				}
				
//				password
				if (passwordField.getText().equals("")) {
					passwordField.setText("Password");
				}				
			}
		});
		txtText.setText("Text1");
		txtText.setBounds(10, 60, 414, 20);
		contentPane.add(txtText);
		txtText.setColumns(10);
		
		txtText_1 = new JTextField();
		txtText_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
//				usaername
				if (txtText_1.getText().equals("Username")) {
					txtText_1.setText("");
				}
				
//				text1
				if (txtText.getText().equals("")) {
					txtText.setText("Text1");
				}
//				password
				if (passwordField.getText().equals("")) {
					passwordField.setText("Password");
				}					
			}
		});
		txtText_1.setText("Username");
		txtText_1.setBounds(10, 91, 414, 20);
		contentPane.add(txtText_1);
		txtText_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				text1
				if (txtText.getText().equals("")) {
					txtText.setText("Text1");
				}
				
//				usaername
				if (txtText_1.getText().equals("")) {
					txtText_1.setText("Username");
				}
				
//				password
				if (passwordField.getText().equals("Password")) {
					passwordField.setText("");
				}
			}
		});
		passwordField.setBounds(10, 140, 414, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("passwordfield");
		lblNewLabel_1.setBounds(10, 115, 414, 14);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("ipakita ang paswword");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				************* para lang mabalik placeholder
//				text1
				if (txtText.getText().equals("")) {
					txtText.setText("Text1");
				}
				
//				usaername
				if (txtText_1.getText().equals("")) {
					txtText_1.setText("Username");
				}
				
//				password
				if (passwordField.getText().equals("")) {
					passwordField.setText("Password");
				}
				
//				pang show ng char sa password field
				if (chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}else {
					passwordField.setEchoChar('*');
				}

			}
		});
		chckbxNewCheckBox.setBounds(6, 167, 181, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("ipush muna");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				text1
				if (txtText.getText().equals("")) {
					txtText.setText("Text1");
				}
				
//				usaername
				if (txtText_1.getText().equals("")) {
					txtText_1.setText("Username");
				}
				
//				password
				if (passwordField.getText().equals("")) {
					passwordField.setText("Password");
				}
				
//				kapag empty ang mga textbox or naka default text 
				if (txtText.getText().equals("Text1") || txtText_1.getText().equals("Username") || passwordField.getText().equals("Password")) {
					JOptionPane.showMessageDialog(null, "boi may empty field"); 
				}else {
					JOptionPane.showMessageDialog(null, "hehehehe wala na"); 
				}
				
			}
		});
		btnNewButton.setBounds(10, 207, 414, 23);
		contentPane.add(btnNewButton);
		
//		passwordField field lagyan lang ng laman
		passwordField.setText("Password");
	}
}
