package Emailablereport;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.testng.annotations.Test;

public class SendEmailReportSeleniumCases {
	@Test
	public static void f() {
		try {
			
			Thread.sleep(6000);
			// Recipient's Mail id
			String[] recipients = new String[2]; 
			//String receipientTo = "ramthakurjava@gmail.com";
			//String receipientTo = "himanshubakshi279@gmail.com";
			//String receipientTo = "himanshu9977@gmail.com";
			
		
			  
		
			recipients[0] = "himanshuqa0509@gmail.com"; 
			recipients[1] = "himanshubakshi279@gmail.com";
		 
		
			
			// Sender's Mail id
			String senderFrom = "himanshuqa0509@gmail.com";
			// Path of PDF test report
			//String path = "C:\\Users\\admin\\eclipse-workspace\\WenoQA\\test-output\\index.html";
			
			String path = "C:\\Users\\admin\\eclipse-workspace\\WenoQA\\test-output\\emailable-report.html";
			// Getting System properties
			Properties prop = System.getProperties();
			// Setting up smtp host
			prop.setProperty("mail.smtp.host", "smtp.gmail.com");
			// Creating a new session for smtp
			Session session = Session.getDefaultInstance(prop);
			MimeMessage msg = new MimeMessage(session);
			// Instance of From Internet address
			InternetAddress frmAddress = new InternetAddress(senderFrom);
		
			// Setting up sender's address
			msg.setFrom(frmAddress);
			// Setting up recipient's address

			InternetAddress[] mailAddress_TO = new InternetAddress[recipients.length];

			for (int i = 0; i < recipients.length; i++)
			{
			    mailAddress_TO[i] = new InternetAddress(recipients[i]);
			}

			msg.addRecipients(Message.RecipientType.TO, mailAddress_TO);
			//InternetAddress[] ress_TO = new InternetAddress[recipients.length]; 

			// Setting email's subject
			msg.setSubject("Test Status Report of WenoExchange");
			BodyPart msgBody = new MimeBodyPart();
			// Setting email's message body
			msgBody.setText("This is test report through mail of WenoExchange");
			// Instance of second part
			Multipart multiPart = new MimeMultipart();
			multiPart.addBodyPart(msgBody);
			// Another mail body
			msgBody = new MimeBodyPart();
			// Path to pdf file for attachment
			DataSource source = new FileDataSource(path);
			DataHandler dataHandler = new DataHandler(source);
			msgBody.setDataHandler(dataHandler);
			msgBody.setFileName("emailable-report.html");
			multiPart.addBodyPart(msgBody);
			msg.setContent(multiPart,"text/html;charset=utf-8");
			// Authentication and connection establishment to the sender's mail
			Transport transport = session.getTransport("smtps");
			transport.connect("smtp.gmail.com", 465, "himanshuqa0509@gmail.com", "nkelbwbokngmpgnz");
			transport.sendMessage(msg, msg.getAllRecipients());
			transport.close();
			System.out.println("Mail Sent");
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("::::::::::::::::finalellllllll::::::::::::::::::::::::::::"+e);
		}
	}
}
