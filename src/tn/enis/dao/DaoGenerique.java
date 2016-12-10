package tn.enis.dao;

import java.io.Serializable;
import java.util.List;

public interface DaoGenerique<E, PK extends Serializable> {
	
	public void add(E entity);

	public void update(E entity);

	public void remove(E entity);

	@SuppressWarnings("rawtypes")
	public E findByID(Class clazz, Integer id);
	
    @SuppressWarnings("rawtypes")
	public List<E> findAll(Class clazz);

}
