package com.spring.local;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	
		System.out.println("Hello ABCKDKFJHSFKASFKFL나러니ㅏㄹ머니ㅏ런이ㅏ");
		
		System.out.println("Servlet");
		
		System.out.println("CSS");
		
		System.out.println("HTML");
		
		System.out.println("HTML");
		
		System.out.println("노는게 제일 좋아");
		
		System.out.println("친구들 모여라");
		
		
		return "home";
	}
	
}
