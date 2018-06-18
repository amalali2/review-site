package com.example.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ReviewRepositorySite {
	
	private Map<Long, Review> reviewRepository = new HashMap<Long, Review> ();
	
	
	public Map<Long, Review> getReviewRepository() {
		return reviewRepository;
	}

	public ReviewRepositorySite() {

		
		Review dumplings = new Review(1L, "Mandu Palace", "/img/dumplings.jpg", "Asian Cuisine",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
				+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure "
				+ "dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non "
				+ "proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
				reviewRepository.put(1L, dumplings);
		
		Review pasta = new Review(2L, "Pastaria", "/img/pasta.jpg", "Italian Cuisine", 
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
						+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure "
						+ "dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non "
						+ "proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
				reviewRepository.put(2L, pasta);
		
		Review cafe = new Review(3L, "Red Velvet Cafe", "/img/cafe.jpg", "Cafe", 
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
						+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure "
						+ "dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non "
						+ "proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
				reviewRepository.put(3L, cafe);
				
				this.addReview(cafe);
				this.addReview(pasta);
				this.addReview(dumplings);

		
	
	}

	public void addReview(Review review) {
		
		reviewRepository.put(review.getFoodID(), review);
		
	}

	public Collection<Review> findAll() {
	
		return reviewRepository.values();
	}

	public Review findById(long l) {
	
		return reviewRepository.get(l);
	}
	
	

}
