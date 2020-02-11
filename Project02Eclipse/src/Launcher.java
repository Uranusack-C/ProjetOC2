

import java.util.Map;

import com.hemebiotech.analytics.AnalyticsCounter;
import com.hemebiotech.analytics.IAnalyticsCounter;
import com.hemebiotech.fileoutput.FileOutput;
import com.hemebiotech.reader.ISymptomReader;
import com.hemebiotech.reader.ReadSymptomDataFromFile;

/**
 * @author Uraa
 * Principal function
 * instance of ReadSymptomDataFromFile, AnalyticsCounter
 *
 */
public class Launcher
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
		ISymptomReader rsdff		= new ReadSymptomDataFromFile("../Project02Eclipse/symptoms.txt");
    	IAnalyticsCounter counter	= new AnalyticsCounter();
    	Map<String, Long> myMap		= counter.countOccurence(rsdff.getSymptoms());

    	FileOutput.output(myMap);
    }
}