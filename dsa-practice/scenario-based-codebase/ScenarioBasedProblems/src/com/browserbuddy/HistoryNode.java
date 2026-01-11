package com.browserbuddy;

public class HistoryNode {

	// Web page URL
    String url;
    // Previous page
    HistoryNode prev;        
    // Next page
    HistoryNode next;        

    public HistoryNode(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}
