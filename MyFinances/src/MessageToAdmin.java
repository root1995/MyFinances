import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  

/**
 * @author Giovanni  Cedrick Camilien
 *@version 1.0	
 * 	
 * 
 * This Class creates a Message meant to be sent by email via an smtp server
 */
public class MessageToAdmin {
    
	private  String  MessageTo = "giovannicedrick@gmail.com" ;
	private  String  MessageFrom;
	private  boolean MessageSent;
	private String TheMessage; 
	
	/**
	 * Constructor
	 * 
	 * 
	 * @param MessageFrom (required) Email of the sender to that the admin can respond in due time
	 * @param TheMessage (required) The message  
	 * The email will be sent via an smtp server
	 */
	 public MessageToAdmin(String MessageFrom , String TheMessage)
	    {
	    	this.MessageFrom = MessageFrom;
	    	this.TheMessage = TheMessage ;
	    }
	
	
	public void Send()
	{
	

	    
	      String host = "localhost";

	      // Get system properties
	      Properties properties = System.getProperties();
	      
	      
	      

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try {
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(MessageFrom));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(MessageTo));

	         // Set Subject: header field
	         message.setSubject("MyFinances Question ");

	         // Now set the actual message
	         message.setText(TheMessage);

	         // Send message
	         Transport.send(message);
	        
	      } catch (MessagingException mex) {
	         mex.printStackTrace();
	         MessageSent = false ;
	         
	      }
	}
	
	
	//Getters and setters for the different properties

	
	
	public  boolean isMessageSent() {
		return MessageSent;
	}




	
   


	

	
}
