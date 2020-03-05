package br.com.drogaria.teste;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;



public class GerarTeste {
	@Test
	public void teste(){
	
		Configuration cfg = new Configuration().
				configure("config/mysql_hibernate.cfg.xml");
		new SchemaExport(cfg).create(true,true);
		//Se não tive o driver do mysql não irá rodar o projeto.
		System.out.println("Foi conectado com sucesso");
	}

}
