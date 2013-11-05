package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.SessionFactoryUtil;


public abstract class GenericDao<T> {
	
	private Class<T> classEntity;
	private Session session;
	
	public void openSession(){
		this.session = SessionFactoryUtil.openSession();
	}
	
	public void closeSession(){
		this.session.close();
	}
	
	public void save(T entity){
					
	}
	

}
