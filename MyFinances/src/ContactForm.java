import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;


public class ContactForm {

	private JFrame frame;
	private JTextField txtEmail;
	private JTextArea txtAreaMessage;

	/**
	 * Launch the application.
	 */
	public void newContactForm(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactForm window = new ContactForm();
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
	public ContactForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("We will be happy to answer any questions you might have");
		lblWelcome.setBounds(67, 11, 298, 14);
		frame.getContentPane().add(lblWelcome);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(40, 64, 49, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblNewLabel = new JLabel("Message :");
		lblNewLabel.setBounds(40, 101, 59, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnSend = new JButton("Send");
		btnSend.setBounds(204, 229, 89, 23);
		frame.getContentPane().add(btnSend);
		btnSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MessageToAdmin MailToAdmin = new MessageToAdmin(txtEmail.getText() , txtAreaMessage.getText() ) ;
				MailToAdmin.Send();
				frame.dispose();
				
			}
		});
		
		
		txtEmail = new JTextField();
		txtEmail.setBounds(142, 61, 96, 20);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtAreaMessage = new JTextArea();
		txtAreaMessage.setBounds(142, 96, 213, 117);
		frame.getContentPane().add(txtAreaMessage);
		
	}
	
	
}
