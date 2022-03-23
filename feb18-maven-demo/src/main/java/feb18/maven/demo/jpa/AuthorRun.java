package feb18.maven.demo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import feb18.maven.demo.jpa.entity.Author;

public class AuthorRun {

	public static void main(String[] args) {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("vaman");
	EntityManager au = factory.createEntityManager();
	au.getTransaction().begin();
	
	Author author = new Author();
	author.setAuthorId(2);
	author.setFirstName("Roadshan");
	author.setLastName("Choudhdfury");
	author.setMiddleName("Pauefl");
	author.setPhoneno("90623wes75");
	
	//au.persist(author);
	
	System.out.println("Added Data to database.");

	
	
	//au.merge(author); // update
	//au.getTransaction().commit();
	//au.remove(author); // delete
	
	 Author emp2 = au.find(Author.class, 1); au.getTransaction().commit();
	  System.out.println(emp2.toString());
	  
	  au.getTransaction().commit();
	 
	au.close();
	factory.close();
	
}
}
