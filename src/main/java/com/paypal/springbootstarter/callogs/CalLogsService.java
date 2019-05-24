/**
 * 
 */
package com.paypal.springbootstarter.callogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.paypal.springbootstarter.pojo.CalLogSummaryResponse;
import com.paypal.springbootstarter.pojo.CorrelationResponse;

/**
 * @author vrathinavel
 *
 */
@Service
public class CalLogsService implements CommandLineRunner {
	
	@Autowired
	CalLogsFilterForCtrl calLogsFilterForCtrl;
	
	@Autowired
	CalLogSummaryResponse calLogSummaryResponse;
	
	RestTemplate restTemplate = new RestTemplate();
	
	public CalLogSummaryResponse getCalLogsInfo(String id) {
		CorrelationResponse correlationResponse = restTemplate.getForObject("http://calhadoop-vip-a.slc.paypal.com/idsearch/id/" + id, CorrelationResponse.class);
		System.out.println("CalLogSERVICE:"+correlationResponse);
		calLogSummaryResponse = calLogsFilterForCtrl.getCalLogFilterSummary(correlationResponse);
		return calLogSummaryResponse;
		
		
	}

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
