package com.example.reviewsite;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller	
public class ReviewsInventoryController {
	
	@Resource
	ReviewRepositorySite reviewRepo;
	
	@RequestMapping ("/reviews")
	public String getReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}
	
	@RequestMapping("/review")
	public String getOneReview(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("reviews", reviewRepo.findById(id));
		return "review";
	}
	

}
