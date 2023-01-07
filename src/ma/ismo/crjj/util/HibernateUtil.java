package ma.ismo.crjj.util;

import java.lang.module.Configuration;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.SessionFactory;

import com.models.Rue;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;
	private static final ServiceRegistry serviceRegistry;
	
	static {
		Configuration config = new Configuration();
		config.configure();
		
		config.addAnnotatedClass(Rue.class);
		
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sessionFactory = config.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

}
