package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class SessionFactoryUtil {
	
	private final static SessionFactory sessionFactory;
	
	static{		
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();	
	}
	
	public static Session openSession(){
		return sessionFactory.openSession();
	}

}
