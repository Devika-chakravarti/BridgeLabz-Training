package com.linkedlist.doublylinkedlist.undoredofunctionality;

class TextStateNode {
	String text;
	TextStateNode next;
	TextStateNode prev;

	TextStateNode(String text) {
		this.text = text;
		this.next = null;
		this.prev = null;
	}
}
