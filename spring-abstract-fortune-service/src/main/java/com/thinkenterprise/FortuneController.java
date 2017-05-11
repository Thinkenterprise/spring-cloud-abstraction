package com.thinkenterprise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FortuneController {
	
	Logger logger = LoggerFactory.getLogger(FortuneController.class);
	
	@Autowired
	FortuneRepository fortuneRepository;

	@RequestMapping("/random")
	public Fortune fortune() {
		
		Iterable<Fortune> result = fortuneRepository.randomFortunes();
		
		return result.iterator().next();
	}

}
