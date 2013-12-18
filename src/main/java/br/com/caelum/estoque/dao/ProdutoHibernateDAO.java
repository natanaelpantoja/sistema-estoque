package br.com.caelum.estoque.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.caelum.estoque.model.Produto;

@Repository
@Primary
@Transactional
public class ProdutoHibernateDAO implements ProdutoDAO {
	
	
	private final EntityManager em;
	
	@Autowired
	public ProdutoHibernateDAO(EntityManagerFactory factory) {
		this.em = factory.createEntityManager();
	}
	

	@Override
	@Transactional
	public void salvar(Produto produto) {
		em.persist(produto);
	}

	@Override
	public void alterar(Produto produto) {
		em.merge(produto);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Produto> listar() {
		List<Produto>  produtos = em.createQuery("from Produto").getResultList();
		return produtos;
	}

	@Override
	public Produto buscarPorId(Long id) {
		return (Produto) em.find(Produto.class, id);
	}

	@Override
	public Integer estoqueAtual(Produto produto) {
		Query query = em.createQuery("select quantidade from Produto where id =:pid");
		query.setParameter("pid", produto.getId());
		
		return (Integer) query.getSingleResult();
	}

}
