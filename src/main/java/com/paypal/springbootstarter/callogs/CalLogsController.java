/**
 * 
 */
package com.paypal.springbootstarter.callogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.springbootstarter.pojo.CalLogSummaryResponse;



/**
 * @author vrathinavel
 *
 */
@RestController
public class CalLogsController {
	
	@Autowired
	private CalLogsService calLogsService;
	
	@RequestMapping("/idsearch/{id}")
	public CalLogSummaryResponse getImpactedComponent(@PathVariable String id){
		return calLogsService.getCalLogsInfo(id);
		
	}

}
