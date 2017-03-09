/**
 * 
 */
package com.example.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.example.mdoel.TollUsage;
import com.example.repository.TollUsageFeignMSRepo;

/**
 * @author Administrator
 *
 */
@RestController
public class TollServiceClient {

	/*@Autowired
	DiscoveryClient client;*/
	
	@Autowired
	TollUsageFeignMSRepo feignRepo;
	
	@RequestMapping("/client")
	public List<TollUsage> findAll(){
		return feignRepo.findAll();
	}
	
	@RequestMapping("/client/{id}")
	public List<TollUsage> findById(@PathVariable("id") String id){
		return feignRepo.findById(id);
	}
	
	
	/*@SuppressWarnings("unchecked")
	@RequestMapping(value="/client")
	public List<TollUsage> findAll(){
		List<ServiceInstance> list = client.getInstances("tollusagems");
		ServiceInstance serviceInstance=list.get(0);
		URI uri=serviceInstance.getUri();
		List<TollUsage> tolls=null;
		try {
			tolls = new RestTemplate().getForEntity(new URI(uri.toString().concat("/tolls")), List.class).getBody();
		} catch (RestClientException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tolls;
	}*/
}
