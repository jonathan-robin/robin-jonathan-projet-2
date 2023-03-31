package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main{ 

	private ISymptomWriter writer ;
	private ISymptomReader reader ;

  public static void main(String[] args){ 
    ISymptomWriter writer = new WriteSymptomDataToFile();
    ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
    AnalyticsCounter counter = new AnalyticsCounter(reader, writer); 

    List<String> symptoms = counter.getSymptoms();
    Map<String, Integer> countSymptoms = counter.countSymptoms(symptoms); 
    Map<String, Integer> sortSymptoms = counter.sortSymptoms(countSymptoms); 
    counter.writeSymptoms(sortSymptoms);

  }

}