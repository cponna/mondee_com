package hibernetdemo;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil1 {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {

                Configuration configuration = new Configuration();

                Properties settings = new Properties();

                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/employee");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "kumari123");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

                settings.put(Environment.SHOW_SQL, "true");

                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                settings.put(Environment.HBM2DDL_AUTO, "update");   
                configuration.setProperties(settings);

                configuration.addAnnotatedClass(Payment.class);
                configuration.addAnnotatedClass(CreditCard.class);
                configuration.addAnnotatedClass(Cheque.class);

           
               configuration.addAnnotatedClass(com.vehicle.Bike.class);

               configuration.addAnnotatedClass(com.animal.Animal.class);
               configuration.addAnnotatedClass(com.animal.Dog.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
} 