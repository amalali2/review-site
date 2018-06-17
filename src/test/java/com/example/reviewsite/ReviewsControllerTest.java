package com.example.reviewsite;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewsInventoryController.class)

public class ReviewsControllerTest {
	
	@Resource
	MockMvc mvc;
	
	@MockBean
	ReviewRepositorySite repo;
	
	@Mock
	Review review;
	
	@Test
	
		public void getReviewsShouldReturnReviewsView () throws Exception {
		
		mvc.perform(get("/reviews")).andExpect(view().name(is(equalTo("reviews"))));
	
	}
	
	@Test
	
		public void getReviewsShouldBeOk () throws Exception {
		
		mvc.perform(get("/reviews")).andExpect(status().is2xxSuccessful());
	}
	
	@Test
	
		public void getReviewsShouldReturnAllProducts() throws Exception {
		
		mvc.perform(get("/reviews")).andExpect(model().attribute("reviews", is(repo.findAll())));
		
	}
	
//	@Test
//	
//		public void getReviewShouldReturnView() throws Exception {
//		
//		mvc.perform(get("/reviews?id=1")).andExpect(view().name(is(equalTo("review"))));
//	
//	}
	
	@Test
	
		public void getReviewShouldBeOk() throws Exception {
		
		mvc.perform(get("/reviews?id=1")).andExpect(status().is2xxSuccessful());
		
	}
	
	@Test
	
	public void getReviewsShouldReturnOneProduct() throws Exception {
	
		
		mvc.perform(get("/reviews?id=1")).andExpect(model().attribute("review", is(repo.findById(42L))));
		
	}
	

}
	
	

