package com.main.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.main.model.Counter;
import com.main.service.ApplicationService;


/**
 * @author arun
 *
 */
@Controller
public class MainController {
	
	@Autowired
	private ApplicationService applicationService;

	@GetMapping("/")
    public String root() {
        return "index";
    }
	
	@RequestMapping(value = "/increment/{id}", method = RequestMethod.GET)
    public ResponseEntity<Counter> increment(@PathVariable(value="id") Long id) {
		try {
			applicationService.increment(id);

		} catch (Exception e) {
			return new ResponseEntity<Counter>(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<Counter>(HttpStatus.OK);
	
    }

}