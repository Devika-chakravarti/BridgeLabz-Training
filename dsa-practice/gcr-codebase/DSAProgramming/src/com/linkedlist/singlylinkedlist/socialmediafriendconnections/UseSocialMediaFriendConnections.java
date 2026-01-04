package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

public class UseSocialMediaFriendConnections {
	public static void main(String[] args) {

		SocialMediaLinkedList list = new SocialMediaLinkedList();

		System.out.println("============================================");
		System.out.println("   SOCIAL MEDIA FRIEND CONNECTION SYSTEM");
		System.out.println("============================================\n");

		System.out.println("--------------------------------------------");
		System.out.println("OPERATION 1: ADD USERS");
		System.out.println("--------------------------------------------");
		list.addUser(1, "Anjali", 22);
		list.addUser(2, "Devika", 21);
		list.addUser(3, "Sarthak", 23);

		System.out.println("--------------------------------------------");
		System.out.println("OPERATION 2: ADD FRIEND CONNECTIONS");
		System.out.println("--------------------------------------------");
		list.addFriend(1, 2);
		list.addFriend(1, 3);
		list.addFriend(2, 3);

		System.out.println("--------------------------------------------");
		System.out.println("OPERATION 3: DISPLAY FRIENDS OF A USER");
		System.out.println("--------------------------------------------");
		System.out.println("Friends of User : Anjali (ID 1)\n");
		list.displayFriends(1);

		System.out.println("--------------------------------------------");
		System.out.println("OPERATION 4: SEARCH USER");
		System.out.println("--------------------------------------------");
		list.searchUser(2);

		System.out.println("--------------------------------------------");
		System.out.println("OPERATION 5: COUNT NUMBER OF FRIENDS");
		System.out.println("--------------------------------------------");
		list.countFriends(1);

		System.out.println("--------------------------------------------");
		System.out.println("OPERATION 6: FIND MUTUAL FRIENDS");
		System.out.println("--------------------------------------------");
		System.out.println("Users Compared : 1 and 2\n");
		list.findMutualFriends(1, 2);

		System.out.println("--------------------------------------------");
		System.out.println("OPERATION 7: REMOVE FRIEND CONNECTION");
		System.out.println("--------------------------------------------");
		list.removeFriend(1, 3);

		System.out.println("--------------------------------------------");
		System.out.println("UPDATED FRIEND LIST OF USER 1");
		System.out.println("--------------------------------------------");
		list.displayFriends(1);

	}
}
