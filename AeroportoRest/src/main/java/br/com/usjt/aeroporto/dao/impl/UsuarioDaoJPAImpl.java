package br.com.usjt.aeroporto.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.usjt.aeroporto.dao.interfaces.UsuarioDAO;
import br.com.usjt.aeroporto.entity.Usuario;

@Repository("usuarioDaoJPAImpl")
public class UsuarioDaoJPAImpl extends GenericDAOImpl<Usuario> implements UsuarioDAO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8477540583577874518L;

	public UsuarioDaoJPAImpl() {
		super(Usuario.class);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {

		String jpql = "SELECT p FROM Usuario p WHERE p.login = :pUsername";
		Query query = this.getCurrentSession().createQuery(jpql);
		query.setParameter("pUsername", username);
		List usuarios = query.getResultList();

		if (!usuarios.isEmpty()) {
			return (Usuario) usuarios.get(0);
		}
		return null;
	}

}
