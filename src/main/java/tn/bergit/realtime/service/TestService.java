package tn.bergit.realtime.service;

import java.util.List;

import tn.bergit.realtime.dto.TestDTO;

public interface TestService {

	
	public List<TestDTO> findAllByCategorie(String iCategorieName);
	public void testFn();
	
}
