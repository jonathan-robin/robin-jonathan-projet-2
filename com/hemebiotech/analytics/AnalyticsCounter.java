package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.TreeMap;

public class AnalyticsCounter {

  private ISymptomWriter writer;
  private ISymptomReader reader;

  public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) { 
    this.reader = reader;
    this.writer = writer;
  }

  public List<String> getSymptoms() { 
    return this.reader.getSymptoms(); 
  }

  /**
  * Count from a text file the number of occurence for each symptoms.
  * @param  symptoms  list of the symptoms
  * @return a map with name of the symptoms, number of occurence
  */
  public Map<String, Integer> countSymptoms(List<String> symptoms) { 
    TreeMap<String, Integer> sorted = new TreeMap<>();
    for (String symptom : symptoms) { 
      sorted.merge(symptom, 1, Integer::sum);
    }
    return sorted;
  }

  public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) { 
    return symptoms;
  }

  public void writeSymptoms(Map<String, Integer> symptoms) {
    this.writer.writeSymptoms(symptoms);
  }

}