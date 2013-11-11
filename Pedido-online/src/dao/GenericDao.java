package dao;

import java.util.List;

import javax.persistence.Transient;

import org.hibernate.Session;

import util.SessionFactoryUtil;


public abstract class GenericDao<T> {
	
	@Transient
	private Class<T> classEntity;
	@Transient
	private Session session;
	
	public GenericDao(Class<T> classEntity) {
        this.classEntity = classEntity;
    }
	
	public void openSession(){
		this.session = SessionFactoryUtil.openSession();
	}
	
	public void closeSession(){
		this.session.close();
	}
	
	public void save(T entity){
		this.openSession();
		this.session.save(entity);
		this.closeSession();
	}
	
	public void delete(T entity){
		this.openSession();
		this.session.delete(entity);
		this.closeSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> list(){
		this.openSession();
		List<T> lst = this.session.createCriteria(this.classEntity).list();
		this.closeSession();
		return lst;
	}
	
	@SuppressWarnings("unchecked")
	public T getById(Long id){
		this.openSession();
		T obj = (T) this.session.load(classEntity, id);
		this.closeSession();
		return obj;
	}
	
	

}
