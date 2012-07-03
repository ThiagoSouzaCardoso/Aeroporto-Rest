package br.com.usjt.aeroporto.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.usjt.aeroporto.dao.interfaces.PassageiroDAO;
import br.com.usjt.aeroporto.entity.Passageiro;

@Repository("PassageiroDAO")
@Transactional
public class PassageiroDAOImpl extends GenericDAOImpl<Passageiro> implements PassageiroDAO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -264962146839198419L;

	public PassageiroDAOImpl() {
		super(Passageiro.class);
	}

}
