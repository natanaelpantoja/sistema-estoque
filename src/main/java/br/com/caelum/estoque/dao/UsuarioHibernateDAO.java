package br.com.caelum.estoque.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioHibernateDAO implements UsuarioDAO {
	
	
	private final EntityManager em;
	
	@Autowired
	public UsuarioHibernateDAO(EntityManagerFactory factory) {
		this.em = factory.createEntityManager();
	}

	@SuppressWarnings({"rawtypes" })
	@Override
	public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException, DataAccessException {
		List usuarios = em.createQuery("from Usuario where login = :login").setParameter("login", username).getResultList();
		
		if(!usuarios.isEmpty()) {
			return (UserDetails) usuarios.get(0);
		}
		return null;
	}


}
