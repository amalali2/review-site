package com.example.reviewsite;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {
	
	ReviewRepositorySite testRepo = new ReviewRepositorySite();
	Review review = new Review( 1234L , "title", "imgUrl", "category", "content");
	
	@Test
	public void shouldAddNewReviewToSiteRepo()	{
		
		int repoSizeBeforeAddition = testRepo.getReviewRepository().size();
		testRepo.addReview(review);
		int repoSizeAfterAddition = testRepo.getReviewRepository().size();
		assertThat(repoSizeAfterAddition, is(equalTo(repoSizeBeforeAddition + 1)));
	}
	
	@Test
	
		public void findAllShouldReturnAllReviews() {
			
		Collection<Review> underTest = testRepo.findAll();
				
				for (Review review : underTest) {
					assertTrue(review instanceof Review);
		}
	}
	
	@Test
		public void findAllShouldReturnAllValues () {
			
			Collection<Review> underTest = testRepo.findAll();
			assertThat(underTest.size(), is(equalTo(3)));
			
	}
	
	@Test
		
	public void findOneShouldReturnOneReviewById () {
			
		Review underTest = testRepo.findById(1L);
		assertThat(underTest.getTitle(), is(equalTo("Drips & Swirls")));
		
	}
	
}

