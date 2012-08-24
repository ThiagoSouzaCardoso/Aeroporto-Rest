package br.com.usjt.aeroporto.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.usjt.aeroporto.dao.interfaces.UsuarioDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class TesteAeronave {

	@Autowired
	@Qualifier("usuarioDaoJPAImpl")
	UsuarioDAO usuarioDAO;

	@Test
	public void usuarioLogado() {

		System.out.println(usuarioDAO.loadUserByUsername("eu"));

	}
}
