package jpa;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	public class JpaDemo {

		public static void main(String[] args) {

			EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
			EntityManager em = factory.createEntityManager();

		//	Employee emp = new Employee(101, "Sonu", 50000);
			//Employee emp = new Employee(102, "Monu", 50000);
			Employee emp = new Employee(103, "Tonu", 60000);

			em.getTransaction().begin();

			em.persist(emp); // insert
//			em.merge(emp); // update
//			em.remove(emp); // delete
			Employee emp2 = em.find(Employee.class, 101); 
			em.getTransaction().commit();
			System.out.println(emp2.toString());

			em.getTransaction().commit();

		}

	}


