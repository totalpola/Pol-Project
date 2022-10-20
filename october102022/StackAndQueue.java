package october102022;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StackAndQueue {
	
	Stack<Integer> stack = new Stack<>();
	Queue<Integer> que = new LinkedList<>();

	JTextArea AreaStack;
	
	private JFrame frame;
	private JTextField txtStack;
	private JTextField txtQueue;
	private JTextArea AreaQue;
	private JButton btnAddQue;
	private JButton btnRemoveQue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StackAndQueue window = new StackAndQueue();
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
	public StackAndQueue() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 880, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtStack = new JTextField();
		txtStack.setFont(new Font("Arial", Font.PLAIN, 16));
		txtStack.setText("Stack");
		txtStack.setBounds(163, 38, 86, 20);
		frame.getContentPane().add(txtStack);
		txtStack.setColumns(10);
		
		txtQueue = new JTextField();
		txtQueue.setFont(new Font("Arial", Font.PLAIN, 16));
		txtQueue.setText("Queue");
		txtQueue.setBounds(438, 38, 86, 20);
		frame.getContentPane().add(txtQueue);
		txtQueue.setColumns(10);
		
		JButton btnPush = new JButton("PUSH");
		btnPush.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int stack_size = stack.size(); // created a variable stack_size
				stack.push(stack_size +1); // push method to add elements into the stack
				populateTxtAreaStack();
			}
		});
		btnPush.setFont(new Font("Arial", Font.PLAIN, 13));
		btnPush.setBounds(10, 93, 89, 23);
		frame.getContentPane().add(btnPush);
		
		JButton btnPOP = new JButton("POP");
		btnPOP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stack.pop();
				populateTxtAreaStack();
			}
		});
		btnPOP.setFont(new Font("Arial", Font.PLAIN, 13));
		btnPOP.setBounds(10, 159, 89, 23);
		frame.getContentPane().add(btnPOP);
		
		AreaStack = new JTextArea();
		AreaStack.setFont(new Font("Arial", Font.PLAIN, 13));
		AreaStack.setBounds(144, 92, 152, 153);
		frame.getContentPane().add(AreaStack);
		
		AreaQue = new JTextArea();
		AreaQue.setFont(new Font("Arial", Font.PLAIN, 13));
		AreaQue.setBounds(624, 92, 152, 169);
		frame.getContentPane().add(AreaQue);
		
		btnAddQue = new JButton("ADD");
		btnAddQue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddQue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int Que_size = que.size();
				que.add( Que_size +1);
				populateTxtAreaQue();
			}
		});
		btnAddQue.setFont(new Font("Arial", Font.PLAIN, 14));
		btnAddQue.setBounds(438, 93, 89, 23);
		frame.getContentPane().add(btnAddQue);
		
		btnRemoveQue = new JButton("POLL");
		btnRemoveQue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				que.poll();
				populateTxtAreaQue();
			}
		});
		btnRemoveQue.setFont(new Font("Arial", Font.PLAIN, 14));
		btnRemoveQue.setBounds(438, 159, 89, 23);
		frame.getContentPane().add(btnRemoveQue);
	}
	public void populateTxtAreaStack() {
		AreaStack.setText("");
		
		for( int count : stack)
		{
			AreaStack.append("Stack #: " + count + "\n");
			
		}
		
		
	}
	public void populateTxtAreaQue() {
		AreaQue.setText("");
		
		for (int count: que) {
			
			AreaQue.append("Stack #: " + count + "\n");
		}
		
	}
}
