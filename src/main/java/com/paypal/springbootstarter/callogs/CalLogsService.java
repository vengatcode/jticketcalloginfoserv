/**
 * 
 */
package com.paypal.springbootstarter.callogs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.paypal.springbootstarter.pojo.CorrelationResponse;

/**
 * @author vrathinavel
 *
 */
@Service
public class CalLogsService implements CommandLineRunner {
	
	RestTemplate restTemplate = new RestTemplate();

	public CorrelationResponse getCalLogsInfo() {
		CorrelationResponse correlationResponse = restTemplate.getForObject("http://calhadoop-vip-a.slc.paypal.com/idsearch/id/a797dcbcc8ea2", CorrelationResponse.class);
		System.out.println(correlationResponse);
		return correlationResponse;
		
		
	}
	
	public CorrelationResponse getCalLogsInfo(String id) {
		CorrelationResponse correlationResponse = restTemplate.getForObject("http://calhadoop-vip-a.slc.paypal.com/idsearch/id/" + id, CorrelationResponse.class);
		System.out.println(correlationResponse);
		return correlationResponse;
		
		
	}

	public void run(String... args) throws Exception {
		getCalLogsInfo();
		
	}

}
