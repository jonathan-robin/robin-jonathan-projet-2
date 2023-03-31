package com.hemebiotech.analytics;

import java.util.Map;


/**
 * Anything the will write symptom data on a valid data output format.
 *
 */
public interface ISymptomWriter {

  /**
  * Write symptoms into a file.
  * @param symptoms Map of name of symptoms, occurence
  */
  public void writeSymptoms(Map<String, Integer> symptoms);
}