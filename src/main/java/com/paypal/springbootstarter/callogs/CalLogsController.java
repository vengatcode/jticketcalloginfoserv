/**
 * 
 */
package com.paypal.springbootstarter.callogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.springbootstarter.pojo.CorrelationResponse;



/**
 * @author vrathinavel
 *
 */
@RestController
public class CalLogsController {
	
	@Autowired
	private CalLogsService calLogsService;
	
	@RequestMapping("/idsearch")
	public CorrelationResponse getImpactedComponent(){
		return calLogsService.getCalLogsInfo();
		
	}
	
	@RequestMapping("/idsearch/{id}")
	public CorrelationResponse getImpactedComponent(@PathVariable String id){
		return calLogsService.getCalLogsInfo(id);
		
	}

}
