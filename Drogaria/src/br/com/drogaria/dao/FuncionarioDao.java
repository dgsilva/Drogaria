package br.com.drogaria.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import br.com.drogaria.entity.Funcionario;

public class FuncionarioDao {

	public void Salvar(Funcionario funcionario){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		//Está feito no manual do Hibernate
		try{
		transacao = sessao.beginTransaction();
		sessao.save(funcionario);
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
	
	public void Editar(Funcionario funcionario){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		//Está feito no manual do Hibernate
		try{
		transacao = sessao.beginTransaction();
		sessao.update(funcionario);
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
