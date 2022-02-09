package hibernetdemo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class MainLogic {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();

		Query qr = session.createQuery("from Student s");

		//Query qr = session.createQuery(" select s.name from Student s");

		//Query qr = session.createQuery("delete from Student s where s.id =:p");
		//qr.setParameter("p",102);

//		Query qr = session.createQuery(" update student set name=: sname where id=:sid");
//		qr.setParameter("sname","Jones");
//		qr.setParameter("sid", 101);

		//int re = qr.executeUpdate();

		//System.out.println(re);

		List studentsList = qr.list();
		Iterator itr = studentsList.iterator();

		while(itr.hasNext()) {
			Student x = (Student) itr.next();
			System.out.println(x.getId()+" "+x.getName()+" "+x.getMarks());
		}
		t.commit();
		session.close();
	}
}