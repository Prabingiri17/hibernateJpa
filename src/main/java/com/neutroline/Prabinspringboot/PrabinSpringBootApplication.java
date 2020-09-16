package com.neutroline.Prabinspringboot;

import com.neutroline.Prabinspringboot.entities.User;
import com.neutroline.Prabinspringboot.utils.HibernateUtil;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//for non database based application (exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class PrabinSpringBootApplication {
	private static Logger logger = LoggerFactory.getLogger(PrabinSpringBootApplication.class);

	public static void main(String[] args) {
		/* now we create a session using our hibernateUtil class and open the session that will import our session type
		* and that is how we obtain  a session.*/

		Session session = HibernateUtil.getSessionFactory().openSession();
		logger.info("Session not established here");

		/* then we will open a transaction so we can perform a unit of work and everytime we open a transaction we need
		* to close it using session.close() that will close both the session and the transaction.*/
		session.getTransaction().begin();

		// here we create our entity that will be the object we are persisting to our database
		User user = new User();
		user.setFirstName("Prabin");
		user.setLastName("Giri");
		user.setEmailAddress("Prabin.giri.17@gmail.com");
		user.setBirthDate(new Date());
		user.setCreatedBy("Dr.Persis Mela Sapkota");
		user.setCreatedDate(new Date());
		user.setLastUpdatedDate(new Date());

		// once values are set; we call session.save() where user entity is persisted to database
		session.save(user);
		//to make sure this writes to the database we use commit(important)
		session.getTransaction().commit();
		session.close();


		SpringApplication.run(PrabinSpringBootApplication.class, args);
	}

}
