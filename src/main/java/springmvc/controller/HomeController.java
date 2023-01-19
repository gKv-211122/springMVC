package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		
		model.addAttribute("name", "spring MVC");
		model.addAttribute("id", 1234);
		
		List<String> friends = new ArrayList<String>();
		friends.add("AAA");
		friends.add("BBB");
		friends.add("CCC");
		
		model.addAttribute("f", friends);
		
		return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		
		// creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		// setting the data
		modelAndView.addObject("name", "uttam");
		modelAndView.addObject("rollNumber", 32432);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		// setting the view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
}
