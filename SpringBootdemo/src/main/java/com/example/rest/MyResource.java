/**
 * 
 */
package com.example.rest;

import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 *
*/
@RestController
public class MyResource {

	@RequestMapping(method= RequestMethod.GET,value = "/greet",produces={MediaType.APPLICATION_JSON_VALUE})
	//@GetMapping
	public String greet(){
	return "Hello" + new Date();
	}
}
