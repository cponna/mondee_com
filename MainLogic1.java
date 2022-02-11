package hibernetdemo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import com.vehicle.*;
import com.animal.*;

public class MainLogic1 {

	public static void main(String[] args) {

		Session se = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = se.beginTransaction();

		CreditCard obj = new CreditCard();
		obj.setPaymentId(101);
		obj.setAmount(24900);
		obj.setCardType("VISA");

		Cheque obj1 = new Cheque();
		obj1.setPaymentId(102);
		obj1.setAmount(24900);
		obj1.setChequeType("AXIS");

		Car c = new Car();
		c.setId(101);
		c.setCarName("Kia");

		Bike b = new Bike();
		c.setId(102);
		b.setBikeName("KTM");

		Dog d = new Dog();
		d.setAid(101);
		d.setName("Dog");
		d.setLifeTime("4y");

		se.save(d);

		//se.save(c);
		//se.save(b);

		//se.save(obj1);
		//se.save(obj);

		tx.commit();
		se.close();
	}
}
