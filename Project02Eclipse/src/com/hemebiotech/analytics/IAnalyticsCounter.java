package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface IAnalyticsCounter {
	 Map<String, Long> countOccurence(List<String> allSymptoms);

}
