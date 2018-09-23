package net.kzm.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PageController {
	
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		return mv; 
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv; 
	}
	
	
	@RequestMapping(value="/contact")
	public ModelAndView contact(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv; 
	}
	
	
	/*@RequestMapping(value="/test")
		public ModelAndView index(@RequestParam(value= "greeting",required=false) String s){
		if(s==null){
			s="welcome java strring";
		}
		ModelAndView mv=new ModelAndView("page");
			mv.addObject("greeting",s);
			return mv; 	
		
	}*/
	/*@RequestMapping(value="/test/{greeting}")
	public ModelAndView index(@PathVariable("greeting") String s){
	if(s==null){
		s="welcome java strring";
	}
	ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting",s);
		return mv; 	
	
}*/
	
	@RequestMapping("/test1")
	public String saying(){
		return "page";
	}
}
