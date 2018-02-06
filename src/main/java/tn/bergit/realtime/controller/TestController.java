package tn.bergit.realtime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.bergit.realtime.dto.TestDTO;
import tn.bergit.realtime.service.TestService;

/**
 * 
 * @author ABG
 *
 */
//http://localhost:8090/api/cabman/testfn

@RestController
@RequestMapping(value = "/api/realtime")
public class TestController extends BaseController {

	
	private @Autowired TestService gTestService;
	
	
	
	
	/**
	 * 
	 * @param iCategorieName
	 * @return
	 */
	@RequestMapping(path = "/testfn", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public void testFn()
	{
		LOGGER.info("TestController::findAllByCategorie::Données reçus {}");
		gTestService.testFn();
		
	}
	
	
	/**
	 * 
	 * @param iCategorieName
	 * @return
	 */
	@RequestMapping(path = "findByCat/{categorieName}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<TestDTO> findAllByCategorie(@PathVariable("categorieName") String iCategorieName)
	{
		LOGGER.info("TestController::findAllByCategorie::Données reçus {}", iCategorieName);
		
		List<TestDTO> vRp = gTestService.findAllByCategorie(iCategorieName);
		
		return vRp;
	}
	
	
	
}
