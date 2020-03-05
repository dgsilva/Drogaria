package br.com.drogaria.teste;

import org.junit.Test;

import br.com.drogaria.dao.FabricanteDao;
import br.com.drogaria.entity.Fabricante;

public class FabricanteTest {
	@Test
	public void salva(){
		Fabricante f1 = new Fabricante();
		f1.setDescricao("teste2");
		FabricanteDao dao = new FabricanteDao();
		dao.Salvar(f1);
		
	}

}
