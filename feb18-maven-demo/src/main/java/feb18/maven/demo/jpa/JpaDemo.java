package feb18.maven.demo.jpa;

import feb18.maven.demo.jpa.dao.EmployeeDao;
import feb18.maven.demo.jpa.entity.Employee;

public class JpaDemo {

		public static void main(String[] args) {

			EmployeeDao dao = new EmployeeDao();
			Employee emp = new Employee(105, "Ponu", 75000);
			/*
			 * dao.addEmployee(emp); System.out.println(dao.getEmployeeById(105));
			 */
			
			
			//  emp.setSalary(60000);
			  //dao.updateEmployee(emp);
			  //System.out.println(dao.getEmployeeById(105));
			   dao.deleteEmployee(emp);
			//  System.out.println(dao.getEmployeeById(105));
			 
		}

	}










/*package feb18.maven.demo.jpa;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

import feb18.maven.demo.jpa.entity.Employee;

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
*/

