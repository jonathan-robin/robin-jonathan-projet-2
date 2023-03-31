package com.hemebiotech.analytics;
import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.TreeMap;

public class AnalyticsCounter {

	private ISymptomWriter writer ;
	private ISymptomReader reader ;

	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer){ 
		this.reader = reader;
		this.writer = writer;
	}

	public List<String> getSymptoms(){ 
		return this.reader.getSymptoms(); 
	}
	
	public Map<String, Integer> countSymptoms(List<String> symptoms){ 
		TreeMap<String, Integer> sorted = new TreeMap<>();
		for(String symptom : symptoms){ 
			sorted.merge(symptom, 1, Integer::sum);
			// if (sorted.containsKey(symptom)){
			// 	sorted.get(symptom).intValue += 1;
			// }
			// else sorted.put(symptom, 1);
		}
		return sorted;
	}

	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms){ 
		return symptoms;
		// return new TreeMap<symptoms>();
	}

	public void writeSymptoms(Map<String, Integer> symptoms) {
		//  System.out.println(symptoms);
			this.writer.writeSymptoms(symptoms);
	 }

	public static void main(ISymptomReader reader, ISymptomWriter writer) {
    // new AnalyticsCounter(reader, writer);
		// first get input
		// String line = reader.readLine();
		// BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));

		// int i = 0;	
		// int headCount = 0;	// counts headaches
		// while (line != null) {
		// 	i++;	
		// 	
		// 	if (line.equals("headache")) {
		// 		headCount++;
		// 		System.out.println("number of headaches: " + headCount);
		// 	}
		// 	else if (line.equals("rush")) {
		// 		rashCount++;
		// 	}
		// 	else if (line.contains("pupils")) {
		// 		pupilCount++;
		// 	}

		// 	line = reader.readLine();	// get another symptom
		// }
		
		// // next generate output
		// FileWriter writer = new FileWriter ("result.out");
		// writer.write("headache: " + headacheCount + "\n");
		// writer.write("rash: " + rashCount + "\n");
		// writer.write("dialated pupils: " + pupilCount + "\n");
		// writer.close();
	}
}