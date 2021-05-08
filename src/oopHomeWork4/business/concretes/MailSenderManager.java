package oopHomeWork4.business.concretes;

import oopHomeWork4.business.abstracts.MailSendService;
import oopHomeWork4.entities.concretes.User;

public class MailSenderManager implements MailSendService{

	@Override
	public boolean send(User user) {
		System.out.println("Verify code sended: "+ user.getEMail());
		return true;
	}

}
