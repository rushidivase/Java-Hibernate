import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestMain {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
			Transaction txn = session.beginTransaction();
			
			Student stu = new Student();
			stu.setSid(103);
			stu.setSname("Mahesh");
			stu.setMarks(88);
			
			session.save(stu);
			txn.commit();
			System.out.println("Record Saved..!");
		
	}

	
}
