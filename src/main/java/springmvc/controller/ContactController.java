package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		
		m.addAttribute("Header", "Spring MVC");
		m.addAttribute("Desc", "Spring Model View Controller");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
//		m.addAttribute("Header", "Spring MVC");
//		m.addAttribute("Desc", "Spring Model View Controller");
		
		
		return "contact";
	}
	/*
	 * @RequestMapping(path="/processform", method = RequestMethod.POST) public
	 * String handleForm(
	 * 
	 * @RequestParam("email") String userEmail,
	 * 
	 * @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("userPassword") String userPassword, Model model) {
	 * 
	 * 
	 * String email = request.getParameter("email");
	 * System.out.println("user email is: " + email);
	 * 
	 * 
	 * User user = new User(); user.setEmail(userEmail); user.setUserName(userName);
	 * user.setPassword(userPassword);
	 * 
	 * System.out.println(user);
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * // System.out.println("user email: "+ userEmail); //
	 * System.out.println("user name: "+ userName); //
	 * System.out.println("user password: "+ userPassword);
	 * 
	 * // process
	 * 
	 * // model.addAttribute("name", userName); // model.addAttribute("email",
	 * userEmail); // model.addAttribute("password", userPassword);
	 * 
	 * return "success"; }
	 */

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, Model model) {
		
		/* @ModelAttribute -- use to accept FORM data */
		System.out.println(user);
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		int createUser = this.userService.createUser(user);
		
		model.addAttribute("msg", "User created with id: " +createUser);
		
		return "success";
	}
}
