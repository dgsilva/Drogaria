package br.com.drogaria.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.drogaria.entity.Fabricante;

public class FabricanteDao {
	public void Salvar(Fabricante fabricante){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		//Está feito no manual do Hibernate
		try{
		transacao = sessao.beginTransaction();
		sessao.save(fabricante);
	     transacao.commit();
		}catch (RuntimeException ex) {
			ex.printStackTrace();
			if(transacao != null){
				transacao.rollback();
			}
		}finally {
			sessao.close();
		}
	}
	
	public void Editar(Fabricante fabricante){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		//Está feito no manual do Hibernate
		try{
		transacao = sessao.beginTransaction();
		sessao.update(fabricante);
	     transacao.commit();
		}catch (RuntimeException ex) {
			ex.printStackTrace();
			if(transacao != null){
				transacao.rollback();
			}
		}finally {
			sessao.close();
		}
	}

	
}
