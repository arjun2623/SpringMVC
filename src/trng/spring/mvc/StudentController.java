package trng.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,ste);
	}
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Customer cust = new Customer();
		model.addAttribute("customer", cust);
		return "student-form";
	}
	@RequestMapping("/showProductForm")
	public String showProductForm(Model model) {
		Customer cust = new Customer();
		model.addAttribute("customer", cust);
		return "product-form";
	}
	@RequestMapping("/processForm")
	public String processForm(
		@Valid @ModelAttribute("student") Customer cust,
		BindingResult bind) {
		if(bind.hasErrors()) {
			return "student-form";
		}else {
			System.out.println("Student"+ cust.getFname()+" "+cust.getLname());
			return "student-confirmation";
		}
	}
	@RequestMapping("/processProductForm")
	public String processProductForm(
			@Valid @ModelAttribute("student") Product prod,
			BindingResult bind) {
		if(bind.hasErrors()) {
			return "product-form";
		}else {
			return "product-confirmation";
		}
	}
	
	
}
