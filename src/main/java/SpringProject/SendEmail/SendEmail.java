package SpringProject.SendEmail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	public static void sendText(String email) throws AddressException, MessagingException {
		Properties mailServerProperties;
		Session getMailSession;
		MimeMessage mailMessage;

		// Step1: setup Mail Server
		mailServerProperties = System.getProperties();
		mailServerProperties.put("mail.smtp.port", "587");
		mailServerProperties.put("mail.smtp.auth", "true");
		mailServerProperties.put("mail.smtp.starttls.enable", "true");

		// Step2: get Mail Session
		getMailSession = Session.getDefaultInstance(mailServerProperties, null);
		mailMessage = new MimeMessage(getMailSession);

		mailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(email)); // Thay abc bằng địa
																									// chỉ người nhận

		// Bạn có thể chọn CC, BCC
//	    generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("cc@gmail.com")); //Địa chỉ cc gmail

		mailMessage.setSubject("Demo send gmail from Java");
		mailMessage.setText("Demo send text by gmail from Java");

		// Step3: Send mail
		Transport transport = getMailSession.getTransport("smtp");

		// Thay your_gmail thành gmail của bạn, thay your_password thành mật khẩu gmail
		// của bạn
		transport.connect("smtp.gmail.com", "nguyenanhtuyen10a5@gmail.com", "01677942718");
		transport.sendMessage(mailMessage, mailMessage.getAllRecipients());
		transport.close();
	}
}
