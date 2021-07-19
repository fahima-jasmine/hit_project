package basic;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
public class Email {
	//SETUP MAIL SERVER PROPERTIES
	//DRAFT AN EMAIL
	//SEND EMAIL
		
	Session newSession = null;
	MimeMessage mimeMessage = null;
	public static void main(String[] args)throws AddressException, MessagingException, IOException {
			
	
		Email mail = new Email();
		mail.setupServerProperties();
		mail.CreatingEmail();
		mail.sendEmail();
	}

	private void sendEmail() throws MessagingException {
		String fromUser = "fahijascs@gmail.com";  //Enter sender email id
		String fromUserPassword = "fahima@2903";  //Enter sender gmail password , this will be authenticated by gmail smtp server
		String emailHost = "smtp.gmail.com";
		Transport transport = newSession.getTransport("smtp");
		transport.connect(emailHost, fromUser, fromUserPassword);
		transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
		transport.close();
		System.out.print("All	Emails are successfully sended!!!");
	}

	private MimeMessage CreatingEmail() throws AddressException, MessagingException, IOException {
		String[] emailReceipients = {"12naina07@gmail.com","nainasnian@gmail.com","20it56.fahima@measiit.edu.in"};  //Enter list of email recepients
		String emailSubject = "Test Mail";
		//String emailBody = "i completed my project";
		mimeMessage = new MimeMessage(newSession);
		
		Map <String,String> map=new HashMap();
		map.put("1","12naina07@gmail.com");
		map.put("2","nainsnaina02@gmail.com");
		map.put("3", "20it56.fahima@measiit.edu.in");		
		for(Entry<String, String> abc: map.entrySet()) {
			String id=abc.getValue();
			System.out.println("Sending mail to "+id);
			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(id));
		}
		mimeMessage.setSubject(emailSubject);
	   
      // CREATE MIMEMESSAGE 
	    // CREATE MESSAGE BODY PARTS 
	    // CREATE MESSAGE MULTIPART 
	    // ADD MESSAGE BODY PARTS ----> MULTIPART 
	    // FINALLY ADD MULTIPART TO MESSAGECONTENT i.e. mimeMessage object 
	    
	    
		 MimeBodyPart bodyPart = new MimeBodyPart();
		 bodyPart.setContent("<h1>i completed my project</h1>","text/html" );
		 MimeMultipart multiPart = new MimeMultipart();
		 multiPart.addBodyPart(bodyPart);
		 mimeMessage.setContent(multiPart);
		 return mimeMessage;
	}

	private void setupServerProperties() {
		Properties properties = System.getProperties();
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		newSession = Session.getDefaultInstance(properties,null);
	}
}
