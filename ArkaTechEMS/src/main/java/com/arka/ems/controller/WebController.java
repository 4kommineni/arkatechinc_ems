package com.arka.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {		
		return "index";
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {		
		return "about";
	}
	
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String profile() {		
		return "profile";
	}
	
	@RequestMapping(value = "/mission", method = RequestMethod.GET)
	public String mission() {		
		return "mission";
	}
	@RequestMapping(value = "/management", method = RequestMethod.GET)
	public String management() {		
		return "management";
	}
	
	@RequestMapping(value = "/services", method = RequestMethod.GET)
	public String services() {		
		return "services";
	}
	
	@RequestMapping(value = "/application_management", method = RequestMethod.GET)
	public String application_management() {		
		return "application_management";
	}
	
	@RequestMapping(value = "/project_management", method = RequestMethod.GET)
	public String project_management() {		
		return "project_management";
	}
	@RequestMapping(value = "/content_management", method = RequestMethod.GET)
	public String content_management() {		
		return "content_management";
	}
	
	@RequestMapping(value = "/risk_management", method = RequestMethod.GET)
	public String risk_management() {		
		return "risk_management";
	}
	
	@RequestMapping(value = "/application_development", method = RequestMethod.GET)
	public String application_development() {		
		return "application_development";
	}
	
	@RequestMapping(value = "/middleware_services", method = RequestMethod.GET)
	public String middleware_services() {		
		return "middleware_services";
	}
	@RequestMapping(value = "/system_integration", method = RequestMethod.GET)
	public String system_integration() {		
		return "system_integration";
	}
	
	@RequestMapping(value = "/consulting_services", method = RequestMethod.GET)
	public String consulting_services() {		
		return "consulting_services";
	}
	
	@RequestMapping(value = "/solutions", method = RequestMethod.GET)
	public String solutions() {		
		return "solutions";
	}
	
	@RequestMapping(value = "/e_r_planning", method = RequestMethod.GET)
	public String e_r_planning() {		
		return "e_r_planning";
	}
	@RequestMapping(value = "/business_process_modeling", method = RequestMethod.GET)
	public String business_process_modeling() {		
		return "business_process_modeling";
	}
	
	@RequestMapping(value = "/business_intelligence", method = RequestMethod.GET)
	public String business_intelligence() {		
		return "business_intelligence";
	}
	
	@RequestMapping(value = "/quality_assurance", method = RequestMethod.GET)
	public String quality_assurance() {		
		return "quality_assurance";
	}
	
	@RequestMapping(value = "/careers", method = RequestMethod.GET)
	public String careers() {		
		return "careers";
	}
	@RequestMapping(value = "/contacts", method = RequestMethod.GET)
	public String contacts() {		
		return "contacts";
	}
	@RequestMapping(value = "/search-results", method = RequestMethod.GET)
	public String search_results() {		
		return "search-results";
	}

}
