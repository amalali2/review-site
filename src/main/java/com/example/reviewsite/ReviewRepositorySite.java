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
		Review reviewOne = new Review( 1L, "Drips & Swirls", "url", "Desserts", "");
		Review reviewTwo = new Review( 2L, "Lavash", "url", "Medditeraen", "");
		Review reviewThree = new Review( 3L, "Minga", "url", "Korean", "");
		
		this.addReview(reviewOne);
		this.addReview(reviewTwo);
		this.addReview(reviewThree);
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
