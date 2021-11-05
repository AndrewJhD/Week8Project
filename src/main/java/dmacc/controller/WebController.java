package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Person;
import dmacc.repository.PersonRepository;

/**
	 * @author adowd1 - Andrew Dowd
	 * CIS175 - Fall 2021
	 * Nov 4, 2021
	 */

@Controller
public class WebController {
	
	@Autowired
	PersonRepository repo;
	
	@GetMapping({"viewAll"})
	public String viewAllPersons(Model model) {
	if(repo.findAll().isEmpty()) {
			return addNewPerson(model);
	}
	model.addAttribute("persons", repo.findAll());
	return "results";
	}
	
	@GetMapping("/inputPerson")
	public String addNewPerson(Model model) {
		Person p = new Person();
		model.addAttribute("newPerson", p);
		return "input";
	}
	
	@GetMapping("/edit/{id}")
    public String showUpdatePerson(@PathVariable("id") long id, Model model) {
        Person p = repo.findById(id).orElse(null);
        System.out.println("ITEM TO EDIT: " + p.toString());
        model.addAttribute("newPerson", p);
        return "input";
    }
	
	@PostMapping("/update/{id}")
    public String revisePerson(Person p, Model model) {
        repo.save(p);
        return viewAllPersons(model);
    }
	
	@GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        Person p = repo.findById(id).orElse(null);
        repo.delete(p);
        return viewAllPersons(model);
	}
	
	
}
