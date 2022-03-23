package feb18.maven.demo.jpa;



import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import feb18.maven.demo.jpa.entity.Author_table;
import feb18.maven.demo.jpa.entity.Book_table;

public class JpaLab2 {
	
		public static void main(String[] args) {

			System.out.println("Start");
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("vaman");
			EntityManager em = factory.createEntityManager();

			Author_table author1 = new Author_table(108, "Sukumar", null);
//			Author_table author2 = new Author_table(107, "S.N. Dey", null);

			em.getTransaction().begin();

			em.persist(author1);
//			em.persist(author2);

			ArrayList<Author_table> al1 = new ArrayList<Author_table>();
			ArrayList<Author_table> al2 = new ArrayList<Author_table>();

			al1.add(author1);
//			al1.add(author2);

			al2.add(author1);
//			al2.add(author2);

			Book_table book1 = new Book_table("PF1274", "HaJaa", 550.0, al1);
//			Book_table book2 = new Book_table("MT5012", "Mathematics", 350.0, al2);

			em.persist(book1);
//			em.persist(book2);

			em.getTransaction().commit();
			em.close();
			factory.close();
//			System.out.println(empData.toString());
			System.out.println("End");
		}
	}

