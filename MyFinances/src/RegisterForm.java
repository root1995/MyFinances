import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterForm {


	private JFrame RegistrationForm;
	private JTextField txtRegisterFirstName;
	private JTextField txtRegisterLastName;
	private JTextField txtRegisterEmail;
	private JPasswordField passwordFieldRegister;
	private JPasswordField passwordFieldRegisterConfirm;

	/**
	 * Launch the application.
	 */
	public void newRegistrationForm() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm window = new RegisterForm();
					window.RegistrationForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegisterForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		RegistrationForm = new JFrame();
		RegistrationForm.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) 
			{
				
			}
		});
		RegistrationForm.setBounds(100, 100, 450, 300);
		RegistrationForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		RegistrationForm.getContentPane().setLayout(null);
		
		JLabel lblRegisterFirstName = new JLabel("First Name :");
		lblRegisterFirstName.setBounds(42, 28, 142, 15);
		RegistrationForm.getContentPane().add(lblRegisterFirstName);
		
		JLabel lblRegisterLastName = new JLabel("Last Name :");
		lblRegisterLastName.setBounds(42, 58, 142, 15);
		RegistrationForm.getContentPane().add(lblRegisterLastName);
		
		JLabel lblRegisterEmail = new JLabel("Email :");
		lblRegisterEmail.setBounds(42, 88, 66, 15);
		RegistrationForm.getContentPane().add(lblRegisterEmail);
		
		JLabel lblRegisterPassword = new JLabel("Password :");
		lblRegisterPassword.setBounds(42, 118, 142, 15);
		RegistrationForm.getContentPane().add(lblRegisterPassword);
		
		JLabel lblRegisterConfirmPassword = new JLabel("Confirm Password :");
		lblRegisterConfirmPassword.setBounds(42, 148, 142, 15);
		RegistrationForm.getContentPane().add(lblRegisterConfirmPassword);
		
		txtRegisterFirstName = new JTextField();
		txtRegisterFirstName.setBounds(202, 28, 124, 19);
		RegistrationForm.getContentPane().add(txtRegisterFirstName);
		txtRegisterFirstName.setColumns(10);
		
		txtRegisterLastName = new JTextField();
		txtRegisterLastName.setColumns(10);
		txtRegisterLastName.setBounds(202, 58, 124, 19);
		RegistrationForm.getContentPane().add(txtRegisterLastName);
		
		txtRegisterEmail = new JTextField();
		txtRegisterEmail.setColumns(10);
		txtRegisterEmail.setBounds(202, 88, 124, 19);
		RegistrationForm.getContentPane().add(txtRegisterEmail);
		
		passwordFieldRegister = new JPasswordField();
		passwordFieldRegister.setBounds(202, 118, 124, 19);
		RegistrationForm.getContentPane().add(passwordFieldRegister);
		
		passwordFieldRegisterConfirm = new JPasswordField();
		passwordFieldRegisterConfirm.setBounds(202, 148, 124, 19);
		RegistrationForm.getContentPane().add(passwordFieldRegisterConfirm);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(143, 213, 114, 25);
		RegistrationForm.getContentPane().add(btnRegister);
	}

}
