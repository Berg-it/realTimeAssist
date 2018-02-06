package tn.bergit.realtime.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import tn.bergit.realtime.bo.Authority;
import tn.bergit.realtime.repository.TestRepository;

@Repository
public class TestRepositoryImpl  implements TestRepository{

	
	private @PersistenceContext EntityManager gEntityManager;
	
	@Override
	public void testFn() {
		Authority vAuthority =  gEntityManager.find(Authority.class, 1L);
		
		System.out.println("vAuthority "+ vAuthority.getId() ); 
	}

}
