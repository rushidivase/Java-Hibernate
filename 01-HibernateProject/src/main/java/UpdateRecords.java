import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateRecords {

    
    public static void main(String[] args) {

    	SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Scanner s = new Scanner(System.in);
        Transaction txn = session.beginTransaction();
        
        System.out.println("Enter Roll No to Update Record:");
        Student stu = new Student();
        stu.setSid(s.nextInt());
        
        System.out.println("Enter New Name:");
        stu.setSname(s.next());
        
        System.out.println("Enter New Marks:");
        stu.setMarks(s.nextFloat());
        
        session.update(stu);
        txn.commit();
        System.out.println("Record Updated..");
      
	}
}
