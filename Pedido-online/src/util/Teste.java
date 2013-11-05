package util;

import org.hibernate.Session;

public class Teste {

	public static void main(String[] args) {
		
		
		Session session = SessionFactoryUtil.openSession();		
		session.close();

	}

}
