import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class LoginForm {

	private JFrame frmTakeControl;
	private JTextField txtLoginUsername;
	private JPasswordField txtLoginPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frmTakeControl.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTakeControl = new JFrame();
		frmTakeControl.setTitle("Take Control of your finances ");
		frmTakeControl.setBounds(100, 100, 450, 314);
		frmTakeControl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTakeControl.getContentPane().setLayout(null);
		
		JLabel lblLoginEmail = new JLabel(" Email : ");
		lblLoginEmail.setBounds(78, 89, 66, 15);
		frmTakeControl.getContentPane().add(lblLoginEmail);
		
		txtLoginUsername = new JTextField();
		txtLoginUsername.setBounds(188, 87, 124, 19);
		frmTakeControl.getContentPane().add(txtLoginUsername);
		txtLoginUsername.setColumns(10);
		
		JLabel lblLoginPassword = new JLabel("Password :");
		lblLoginPassword.setBounds(78, 116, 89, 15);
		frmTakeControl.getContentPane().add(lblLoginPassword);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(198, 148, 114, 25);
		frmTakeControl.getContentPane().add(btnConnect);
		
		JLabel lblRegistration = new JLabel("Don't have an account?");
		lblRegistration.setBounds(22, 215, 168, 15);
		frmTakeControl.getContentPane().add(lblRegistration);
		
		txtLoginPassword = new JPasswordField();
		txtLoginPassword.setBounds(188, 118, 124, 19);
		frmTakeControl.getContentPane().add(txtLoginPassword);
		
		JLabel lblWelcome = new JLabel("Welcome to the personal finances software ");
		lblWelcome.setBounds(78, 12, 334, 15);
		frmTakeControl.getContentPane().add(lblWelcome);
		
		JButton btnNewRegistration = new JButton("Register");
		btnNewRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				RegisterForm RegistrationForm = new RegisterForm();
				RegistrationForm.newRegistrationForm();
			
			}
		});
		btnNewRegistration.setBounds(208, 210, 114, 25);
		frmTakeControl.getContentPane().add(btnNewRegistration);
		
		JLabel lblYouHaveQuestions = new JLabel("You have questions ?Contact us");
		lblYouHaveQuestions.setBounds(22, 252, 202, 14);
		frmTakeControl.getContentPane().add(lblYouHaveQuestions);
		
		JButton btnContactUs = new JButton("Contact us");
		btnContactUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactForm ContactForm = new ContactForm();
				ContactForm.newContactForm();
				
			}
		});
		btnContactUs.setBounds(208, 248, 114, 25);
		frmTakeControl.getContentPane().add(btnContactUs);
	
	}
}
