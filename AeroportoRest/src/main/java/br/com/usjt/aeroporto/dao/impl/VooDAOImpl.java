package br.com.usjt.aeroporto.dao.impl;

import br.com.usjt.aeroporto.dao.interfaces.VooDAO;
import br.com.usjt.aeroporto.entity.Voo;

public class VooDAOImpl extends GenericDAOImpl<Voo> implements VooDAO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3824575598339387318L;

	public VooDAOImpl() {
		super(Voo.class);
	}

}
