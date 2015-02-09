package com.duckduckgo.mobile.android.events.searchBarEvents;

import com.duckduckgo.mobile.android.events.Event;

public class SearchBarSetTextEvent extends Event {

	public String text;

	public SearchBarSetTextEvent(String text) {
		this.text = text;
	}
}
