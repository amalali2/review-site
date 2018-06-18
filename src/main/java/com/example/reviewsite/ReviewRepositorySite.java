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
//		Review reviewOne = new Review( 1L, "Drips & Swirls", "url", "Desserts", "");
//		Review reviewTwo = new Review( 2L, "Lavash", "url", "Medditeraen", "");
//		Review reviewThree = new Review( 3L, "Minga", "url", "Korean", "");
		
		Review dumplings = new Review(1L, "Mandu Palace", "im/dumplings.jpg", "Asian Cuisine","This place was hoppin at the lunch hour! A few people looked like they were on lunch break from work, but most people seemed like they were trying it for the first time. I saw families, young adults, older folks. It definitely attracts all kinds of people!");
				reviewRepository.put(1L, dumplings);
		
		Review pasta = new Review(2L, "Pastaria", "img/pasta.jpg", "Italian Cuisine", "This place has the best lunch special in town.  Pay only $6.95 for an entree, eggroll, bowl of soup, and a drink for lunch.  This deal is one of the few that is valid 7 days a week!  Of course, the more authentic (and tastier) dishes are on the dinner menu for a few more dollars, but this is a definite go-to!  The Pad Thai comes with chicken, shrimp, or beef.  The chef makes his own chili sauce--definitely worth a try if you are a fan of spicy food.");
				reviewRepository.put(2L, pasta);
		
		Review cafe = new Review(3L, "Red Velvet Cafe", "img/cafe.jpg", "Cafe", "Spaghetti Warehouse is the best value Italian in Columbus.  The 15 Layer Lasagna gets you a great bang for your buck.  I've never finished an entire portion of this lasagna.  It is cheesy and saucy.  It is a great lasagna for the price and you don't have to clean the lasagna pan.");
				reviewRepository.put(3L, cafe);
		
		
		reviewRepository.put(cafe.getFoodID(), cafe);
		reviewRepository.put(pasta.getFoodID(), pasta);
		reviewRepository.put(dumplings.getFoodID(), dumplings);
	
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
