package feb18.maven.demo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import feb18.maven.demo.jpa.entity.Greet;

public class Client {
	

		public static void main(String[] args) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("vaman");
			EntityManager em = factory.createEntityManager();
			em.getTransaction().begin();
			
			Greet greet = new Greet();
		//	greet.setMessageId(1);
			greet.setMessage("Welcome to JPA 2121!");
			
			em.persist(greet);
			
			System.out.println("Added greeting to database.");

			em.getTransaction().commit();
			em.close();
			factory.close();
		}
	}



