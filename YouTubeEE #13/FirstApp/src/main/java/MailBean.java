import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Message.RecipientType;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


@ViewScoped
@ManagedBean
public class MailBean {

	@Resource(name="mail/gmail")
	private Session session;
	
	public void send() {
		System.out.println("Send start");
		Message msg = new MimeMessage(session);
		try {
			msg.setSubject("Example Subject");
			msg.setText("Example Text");
			msg.setRecipients(RecipientType.TO, InternetAddress.parse("npb08548@cdnqa.com"));
			
			Transport.send(msg);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		System.out.println("Send finished");
		
	}
	
}
