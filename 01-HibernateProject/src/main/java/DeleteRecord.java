import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeleteRecord {
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
	    Session session = factory.openSession();
	    Scanner s = new Scanner(System.in);
	    Transaction txn = session.beginTransaction();

	    System.out.println("Enter Id to Delete Record:");
	    Student stu = session.get(Student.class, s.nextInt());
	    session.delete(stu);
	    System.out.println("Record Deleted..!");
	}
	

}
