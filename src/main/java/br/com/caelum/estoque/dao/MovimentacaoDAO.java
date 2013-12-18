package br.com.caelum.estoque.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.caelum.estoque.model.Movimentacao;

@Repository
public class MovimentacaoDAO {

	private final EntityManager em;
	
	@Autowired
	public MovimentacaoDAO(EntityManagerFactory factory) {
		this.em = factory.createEntityManager();
	}
	
	public void salvar(Movimentacao movimentacao){
		em.persist(movimentacao);
	}
}
