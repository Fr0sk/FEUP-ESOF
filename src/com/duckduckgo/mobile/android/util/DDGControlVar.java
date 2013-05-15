package com.duckduckgo.mobile.android.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DDGControlVar {
	
	public static SCREEN START_SCREEN = SCREEN.SCR_STORIES;	// stories
	
	public static boolean hasUpdatedFeed = false;
	public static String regionString = "wt-wt";	// world traveler (none) as default
	
	public static String storiesJSON = null;
	public static boolean isDefaultsChecked = false;
	public static Set<String> defaultSources = null;
	public static Set<String> userAllowedSources = null;
	public static Set<String> userDisallowedSources = null;
	
	public static Map<String, String> sourceIconUrlMap = new HashMap<String, String>();
	
	public static String targetSource = null; 
		
	public static Set<String> readArticles = new HashSet<String>(); 
	
	public static boolean homeScreenShowing = true;
	
	public static boolean includeAppsInSearch = false;
	public static boolean alwaysUseExternalBrowser = false;
	public static boolean isAutocompleteActive = true;
	
	public static int fontProgress = DDGConstants.FONT_SEEKBAR_MID;	// over scale 0-10
	public static int fontPrevProgress = DDGConstants.FONT_SEEKBAR_MID;	// over scale 0-10
	public static float mainTextSize, prevMainTextSize;
	public static float recentTextSize, prevRecentTextSize; 
	public static int webViewTextSize = -1, prevWebViewTextSize = -1;
	public static int ptrHeaderSize, prevPtrHeaderSize;
	public static int ptrSubHeaderSize, prevPtrSubHeaderSize;
	public static float leftTitleTextSize, prevLeftTitleTextSize;
		
	public static boolean hasAppsIndexed = false;
	
	public static Set<String> getRequestSources() throws InterruptedException {
		Set<String> requestSources = new HashSet<String>(DDGControlVar.defaultSources);
		requestSources.removeAll(DDGControlVar.userDisallowedSources);
		requestSources.addAll(DDGControlVar.userAllowedSources);
		return requestSources;
	}
}
