package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {

  /**
   * write name of symptoms and occurence into a file.
   * @param symptoms map of name of the symptons and occurence
   */
  @Override
  public void writeSymptoms(Map<String, Integer> symptoms) {

    try { 

      FileWriter writer = new FileWriter("result.out");

      // Keep index for result.out formatting
      int index = 0;

      for (Map.Entry symp : symptoms.entrySet()) {

        if (index == 0) { 
          writer.write(symp.getKey() + " : " + symp.getValue());
        } else { // if its not the first line add a line break before 
          writer.write("\n" + symp.getKey() + " : " + symp.getValue());
        } 

        index++;

      }

      // add new line at end of text 
      writer.write("\n");

      writer.close();
    } catch (Exception e) { 
      System.err.println("Exception: " + e);
    } finally {  
      System.out.println("The 'try catch' is finished.");
    }
  }
}