package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class WriteSymptomDataToFile implements ISymptomWriter {

  /**
	 * @param 
	 */
  @Override
  public void writeSymptoms(Map<String, Integer> symptoms) {

    try{ 

		FileWriter writer = new FileWriter("result.out");

    // Keep index for result.out formatting
    int index = 0;

    for (Map.Entry symp : symptoms.entrySet()){

      if (index == 0) writer.write(symp.getKey() + " : " + symp.getValue());
      // if its not the first line add a line break before 
      else writer.write("\n"+symp.getKey() + " : " + symp.getValue());

      index++;

    }

		writer.close();
    }
    catch(Exception e){ 
      System.err.println("Exception: " + e);
    } finally{ 
      System.out.println("The 'try catch' is finished.");
    }
  }
}