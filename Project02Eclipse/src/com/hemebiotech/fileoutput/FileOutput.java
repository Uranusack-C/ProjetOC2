package com.hemebiotech.fileoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Uraa
 * Create a file "result.out" with all symptoms (no duplicate) with their occurence 
 *
 */
public class FileOutput
{
	/**
	 * @param Symptoms
	 * 		Map of symptoms (no duplicate) + occurrence
	 */
	public static void output(Map<String, Long> Symptoms)
	{
		Map<String, Long> sortedMap	= new TreeMap<String, Long>(Symptoms);
		Set<?> set					= sortedMap.entrySet();
		Iterator<?> iterator		= set.iterator();

		try (FileWriter writer = new FileWriter("result.out");)
		{
			while (iterator.hasNext())
			{
				Map.Entry me = (Map.Entry) iterator.next();
				System.out.println("Ajout de [" + me.getKey() + " = " + me.getValue() +"]"); // log
				writer.write(me.getKey() + " = " + me.getValue() + "\n");
				System.out.println();
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}