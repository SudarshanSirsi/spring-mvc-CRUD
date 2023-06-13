package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Adto;

public class Adao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public String insert(Adto dto) {
		et.begin();
		em.persist(dto);
		et.commit();
		return "data inserted";
	}

	public List<Adto> fetchall() {
//		Query q = em.createQuery("select data from Adto data");
//		 List<Adto> li = q.getResultList();
		return em.createQuery("select x from Adto x").getResultList();
	}

	public String delete(int id) {
		Adto dto = em.find(Adto.class, id);
		if(dto!=null) {
			et.begin();
			em.remove(dto);
			et.commit();
			return "<h2>Data is deleted</h2>";
		}
		
		return "<h2>Data is not found</h2>";
		
		
	}

}
