package com.fitrax.nutritionix4j.client;

import java.lang.Math;
import java.lang.Object;
import com.fitrax.nutritionix4j.client.dto.Brand;
import com.fitrax.nutritionix4j.client.dto.Item;
import com.fitrax.nutritionix4j.client.dto.SearchResults;

public interface NutritionixClientIF extends Main
{   
       int calorie_max number;
       int calorie_min number1;
       
       calorie(int calorie_max, int calorie_min){
               max = calorie_max;
	       min = calorie_min;
	       setSearchResults(newSearchResults);
       
       }

         public void setSearchResults(String phrase) {phrase = p;}
	 public string getSearchResults() {return phrase;}
	 
	 public int getMax() {return Max;}
	 public int getMin() {return Min;}
	 
	// Worker functions
	public abstract SearchResults search(String phrase)

	public abstract SearchResults search(String phrase, String brand_id,
			int calorie_max, int calorie_min, String resultsPage, String fields)		

	public abstract Item item(String id, String upc, String fields);

	public abstract Brand brand(String brand_id);

	public abstract void shutdown();

}
