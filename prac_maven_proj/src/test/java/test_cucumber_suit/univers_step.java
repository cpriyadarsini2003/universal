package test_cucumber_suit;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Home;
import pages.Subscribe;

public class univers_step 


{

	Home hm = new Home();
	Subscribe sub = new Subscribe();
	
	    @Given("^user is in the home page$")
	    public void user_is_in_the_home_page() throws Throwable 
	    {
	       hm.open_url();
	       
	    }

	    @When("^enter course name and search$")
	    public void enter_course_name_and_search() throws Throwable 
	    {
	       hm.search();
	       
	    }

	    @Then("^releted courses are displayed$")
	    public void releted_courses_are_displayed() throws Throwable 
	    {
	        hm.validate_courses();
	    }
	    

	        @When("^click the dropdown menu$")
	        public void click_the_dropdown_menu() throws Throwable
	        {
	           sub.dropdown();
	        }

	        @And("^click subscribe$")
	        public void click_subscribe() throws Throwable 
	        {
	        	sub.subscribe();
	        }
	        @Then("^display the subscription plans$")
	        public void display_the_subscription_plans() throws Throwable 
	        {
	            
	        }
	    }

	    
	    
	    
	    
	    

	

	

