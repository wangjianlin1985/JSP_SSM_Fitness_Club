// 
// 
// 

package com.stern.utils;

import javax.mail.Transport;
import javax.mail.MessagingException;
import javax.mail.Message;
import javax.mail.Address;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Session;
import java.util.Properties;

public class SendMail
{
    public static boolean sendMail(final String email, final String name) {
        final String from = "yuanmamatouemail@163.com";
        final String username = "yuanmamatouemail@163.com";
        final String password = "yuanmamatou1234";
        final String emailMsg = "\u6210\u529f\uff0c\u8bf7" + name + "\u4f7f\u7528'123456789'\u767b\u5f55\uff01";
        final Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.163.com");
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.transport.protocol", "smtp");
        props.setProperty("mail.smtp.socketFactory.port", "25");
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.starttls.enable", "false");
        props.setProperty("mail.smtp.ssl.enable", "false");
        final Session session = Session.getInstance(props);
        session.setDebug(true);
        try {
            final MimeMessage message = new MimeMessage(session);
            message.setFrom((Address)new InternetAddress(from));
            message.setSubject("\u7528\u6237\u91cd\u7f6e\u6210\u529f\u90ae\u4ef6");
            message.setContent((Object)emailMsg, "text/html;charset=utf-8");
            final Transport transport = session.getTransport();
            transport.connect("smtp.163.com", 25, "yuanmamatouemail@163.com", "yuanmamatou1234");
            transport.sendMessage((Message)message, new Address[] { new InternetAddress(email) });
            transport.close();
            return true;
        }
        catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }
    }
}
