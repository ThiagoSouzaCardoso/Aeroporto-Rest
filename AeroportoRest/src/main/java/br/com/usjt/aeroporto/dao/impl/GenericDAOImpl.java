package br.com.usjt.aeroporto.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import br.com.usjt.aeroporto.dao.interfaces.GenericDAO;

@Transactional
public abstract class GenericDAOImpl<T> implements GenericDAO<T>, Serializable {

	protected Class<T> classe;

	private static final long serialVersionUID = -264962146839198419L;

	@PersistenceContext
	protected EntityManager entityManager;

	public GenericDAOImpl(Class<T> classe) {
		this.classe = classe;
	}

	@Override
	public void save(T t) {

		getCurrentSession().persist(t);

	}

	@Override
	public T update(T t) {
		return getCurrentSession().merge(t);

	}

	@Override
	public void delete(T t) {
		entityManager.remove(t);

	}

	@Override
	public T findById(Long id) {
		return getCurrentSession().find(classe, id);
	}

	@Override
	public List<T> findByAll() {
		String jpql = "select p from :pClasse p";
		Query query = this.getCurrentSession().createQuery(jpql);
		query.setParameter("pClasse", classe);
		return query.getResultList();
	}

	public EntityManager getCurrentSession() {
		return entityManager;
	}

}
