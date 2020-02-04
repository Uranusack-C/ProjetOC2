package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Uraa
 * Count all occurence of symptoms and put it on a Map
 */
public class AnalyticsCounter
{
	/**
	 * 
	 * @param allSymptoms
	 * 		List of all symptoms (duplicate)
	 * @return 
	 * 		Map of symptoms (no duplicate) + occurence
	 *  
	 */
	public static Map<String, Long> countOccurence(List<String> allSymptoms)
	{
		Set<String> existingSymptoms	= new HashSet<>(allSymptoms);

		Map<String, Long> all			= new HashMap<String, Long>();
		existingSymptoms.forEach( symptomName -> {
				all.put(symptomName, allSymptoms.stream().filter(symptom -> symptom.equals(symptomName)).count());
			});
		return all;
	}
}