package com.hemebiotech.analytics;

import java.util.Map;

public class Launcher
{
    public static void main(String[] args)
    {
    	ReadSymptomDataFromFile rsdff;
    	Map<String, Long> myMap;

    	rsdff	= new ReadSymptomDataFromFile("../Project02Eclipse/symptoms.txt");
    	myMap	= AnalyticsCounter.countOccurence(rsdff.getSymptoms());
    	FileOutput.output(myMap);
    }
}