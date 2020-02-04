package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
	
	public static void output(Map<String, Long> Symptoms)
	{
		Map<String, Long> sortedMap	= new TreeMap<String, Long>(Symptoms);
		Set<?> set2					= sortedMap.entrySet();
		Iterator<?> iterator2		= set2.iterator();

		try (FileWriter writer = new FileWriter("result.out");)
		{
			while (iterator2.hasNext())
			{
				Map.Entry me2 = (Map.Entry) iterator2.next();
				writer.write(me2.getKey() + " = " + me2.getValue() + "\n");
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
    public static void main(String[] args)
    {
    	ReadSymptomDataFromFile rsdff;
    	Map<String, Long> myMap;

    	rsdff	= new ReadSymptomDataFromFile("../Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");
    	myMap	= AnalyticsCounter.countOccurence(rsdff.getSymptoms());
    	output(myMap);
    }
}