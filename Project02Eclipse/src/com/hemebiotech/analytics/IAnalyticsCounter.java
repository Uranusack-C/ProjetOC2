package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;


/**
 * @author Uraa
 * We have in parameter the list of all symptoms that we read in the file
 * Count all occurence of symptoms and put it on a Map
 * we return a Map with all symptoms with their occurence without duplicate
 * 
 */
public interface IAnalyticsCounter {
	/**
	 * @param allSymptoms
	 * @return a Map of symptoms (no duplicate) + occurence
	 */
	 Map<String, Long> countOccurence(List<String> allSymptoms);
}
