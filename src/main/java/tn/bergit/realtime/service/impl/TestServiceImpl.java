package tn.bergit.realtime.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import tn.bergit.realtime.dto.TestDTO;
import tn.bergit.realtime.repository.TestRepository;
import tn.bergit.realtime.service.TestService;

/**
 * 
 * @author ABG
 *
 */
@Service
public class TestServiceImpl implements TestService {

	
	@Autowired
	TestRepository gTestRepository;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly=true)
	public List<TestDTO> findAllByCategorie(String iCategorieName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly=true)
	public void testFn() {
		gTestRepository.testFn();
	}

}
