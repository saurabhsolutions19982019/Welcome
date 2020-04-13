package com.hey1.hi1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@ComponentScan
@Controller
public class Hicontr {
	@RequestMapping("/hey")
	public String greeting() {
		return("HeyBoy");
	}

}
