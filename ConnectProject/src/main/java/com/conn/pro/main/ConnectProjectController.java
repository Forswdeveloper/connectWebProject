package com.conn.pro.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConnectProjectController {
	
	
	@RequestMapping(value ="/")
	public String connectMain() {
		System.err.println("Test");
		return "connectMain";
	}
}
