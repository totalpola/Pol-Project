package october102022;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Stack;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StackQueue {
	
	//create an instance of Stack class and Queue Implementation in LinkedList
	Stack<Integer> stack = new Stack<>();
	//Queue<Integer> que = new Queue<>();

    //reference outside of the initialize function
	JTextArea textAreaStack;
	
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StackQueue window = new StackQueue();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StackQueue() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1237, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStack = new JLabel("Stack");
		lblStack.setFont(new Font("Arial", Font.PLAIN, 25));
		lblStack.setBounds(221, 66, 133, 42);
		frame.getContentPane().add(lblStack);
		
		JButton btnPush = new JButton("PUSH");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPush.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnPush.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				int stack_size = stack.size();
				stack.push(stack_size + 1);
				populateTxtAreaStack();
			}
			
		});
		btnPush.setFont(new Font("Arial", Font.PLAIN, 20));
		btnPush.setBounds(30, 168, 95, 42);
		frame.getContentPane().add(btnPush);
		
		JButton btnPop = new JButton("POP");
		btnPop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stack.pop();
				populateTxtAreaStack();
			}
		});
		
		btnPop.setFont(new Font("Arial", Font.PLAIN, 20));
		btnPop.setBounds(30, 279, 95, 42);
		frame.getContentPane().add(btnPop);
		
		textAreaStack = new JTextArea();
		textAreaStack.setFont(new Font("Arial", Font.PLAIN, 15));
		textAreaStack.setBounds(204, 168, 285, 269);
		frame.getContentPane().add(textAreaStack);
		
	}
	public void populateTxtAreaStack()
	{
		//clear text area for stack
		textAreaStack.setText(" ");
		
		for (int count: stack)
		{
			textAreaStack.append("Stack No:" + count + "\n");
		}
	}
}
