package com.elsoproject.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elsoproject.domain.Story;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String stories(Model model)
	{
		model.addAttribute("pageTitle","Minden napra egy Post");
		model.addAttribute("stories",getStories()); //Ez a sztorikat adja hozzá az oldalra.
		return "stories"; //Ez a stories.html-t adja vissza a "/" utvonalnak.
	}
	
	private ArrayList<Story> getStories() {
		
		ArrayList<Story> stories = new ArrayList<Story>();
		
//		Story story1 = new Story();
//		story1.setTitle("Első Sztori!");
//		story1.setPosted(new Date());
//		story1.setAuthor("Dávid");
//		story1.setContent("<p>Ez az első éles poszt tartalma!!</p>");
//		
//		Story story2 = new Story();
//		story2.setTitle("Második Sztori!");
//		story2.setPosted(new Date());
//		story2.setAuthor("Dávid");
//		story2.setContent("<p>Ez már nem olyan izgi.</p>");
//		
//		stories.add(story1);
//		stories.add(story2);
		
		return  stories;
		
	}
	
}
