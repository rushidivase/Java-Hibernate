import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GetRecord {

	public static void main(String[] args) {
	
		SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Scanner s = new Scanner(System.in);
			
        System.out.println("Enter ROll No to get Record:");
        Student stu = session.get(Student.class, s.nextInt());
        System.out.println(stu);
			
	}
}
