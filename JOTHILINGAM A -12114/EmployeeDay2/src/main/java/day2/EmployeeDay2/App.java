package day2.EmployeeDay2;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args)

	{
		Employee emp = new Employee();
		Configuration cfc = new Configuration().configure();
		SessionFactory factory = cfc.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		boolean task = true;
		while (task) {
			System.out.println("Enter youe choice!!!!");
			System.out.println(" 1.add\n 2.delete \n 3.update \n 4.View \n 5.View by ID \n 6.exit application");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.println("Enter the id");
				int id = sc.nextInt();
				System.out.println("Enter the name");
				String name = sc.next();
				System.out.println("Enter the Designation");
				String desig = sc.next();
				emp.setEid(id);
				emp.setName(name);
				emp.setDesignation(desig);
				session.save(emp);
				t.commit();
				break;

			case 2:
				System.out.println("Enter the id you want to Delete");
				int id1 = sc.nextInt();
				emp = session.find(Employee.class, id1);
				System.out.println(emp);
				session.remove(emp);
				t.commit();
				break;

			case 3:
				System.out.println("Enter the id you want to update");
				int id2 = sc.nextInt();
				emp = session.find(Employee.class, id2);

				System.out.println("Enter the updated name:");
				String name1 = sc.next();
				System.out.println("Enter the updated designation:");
				String desig1 = sc.next();
				emp.setName(name1);
				emp.setDesignation(desig1);

				session.save(emp);
				t.commit();
				break;

			case 4:
				List<Employee> emplist = session.createQuery("from Employee").list();

				for (Employee e : emplist) {
					System.out.println(e);
				}
				break;

			case 5:
				System.out.println("Enter the id you want to view");
				int id3 = sc.nextInt();
				emp = session.find(Employee.class, id3);
				System.out.println(emp);
				break;
			case 6:
				System.out.println("Thanks for using the application");
				System.exit(0);
				task = false;

			default:
				System.out.println("Enter the correct choice!!!!");
				break;

			}
		}
	}
}
