package br.com.usjt.aeroporto.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.usjt.aeroporto.dao.interfaces.PassagemDAO;
import br.com.usjt.aeroporto.entity.Passagem;

@Repository("PassagemDAO")
@Transactional
public class PassagemDAOImpl extends GenericDAOImpl<Passagem> implements PassagemDAO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5421105056372865165L;

	public PassagemDAOImpl() {
		super(Passagem.class);
	}

}
