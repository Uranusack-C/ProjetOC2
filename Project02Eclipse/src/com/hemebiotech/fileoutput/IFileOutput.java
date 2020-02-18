package com.hemebiotech.fileoutput;

import java.util.Map;

/**
 * 
 * Create a file "result.out" with all symptoms (no duplicate) with their occurence 
 * This file is sort by alpha
 *
 **/
public interface IFileOutput {
	/**
	 * 
	 * @param Symptoms
	 * 		Map of symptoms + occurence not sorted 
	 * 		
	 */
	void output(Map<String, Long> Symptoms);
}
