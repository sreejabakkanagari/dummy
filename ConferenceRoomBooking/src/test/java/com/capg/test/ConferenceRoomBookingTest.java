package com.capg.test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class ConferenceRoomBookingTest {
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features= {"features"},
			glue= {"com.cg.roorbooking.stepdefination"},
			tags= {"@execute"})
		
}
