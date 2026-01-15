package com.parceltracker;

public class StageNode {
	String stageName;
	StageNode next;
	
	StageNode(String stageName){
		this.stageName = stageName;
		this.next = null;
	}
}
