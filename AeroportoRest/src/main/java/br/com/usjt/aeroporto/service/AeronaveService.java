package br.com.usjt.aeroporto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.usjt.aeroporto.dao.interfaces.AeronaveDAO;
import br.com.usjt.aeroporto.entity.Aeronave;

@Service("aeronaveService")
public class AeronaveService {

	@Autowired
	AeronaveDAO aeronaveDAO;

	public void createAeronave(Aeronave aeronave) {
		aeronaveDAO.save(aeronave);
	}

	public List<Aeronave> getAllAeronave() {
		return aeronaveDAO.findByAll();
	}

	public void updateAeronave(Aeronave aeronave) {
		aeronaveDAO.update(aeronave);
	}

	public void deleteAeronave(Aeronave aeronave) {
		aeronaveDAO.delete(aeronave);
	}

}
