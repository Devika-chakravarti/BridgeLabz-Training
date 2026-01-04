package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

class SocialMediaLinkedList {
	private UserNode head;

	public void addUser(int id, String name, int age) {
		UserNode user = new UserNode(id, name, age);
		user.next = head;
		head = user;

		System.out.println("User created");
		System.out.println("User ID : " + id + " | Name : " + name + " | Age : " + age + "\n");
	}

	private UserNode findUser(int id) {
		UserNode temp = head;
		while (temp != null) {
			if (temp.userId == id)
				return temp;
			temp = temp.next;
		}
		return null;
	}

	public void addFriend(int uId, int fId) {
		UserNode user = findUser(uId);
		if (user == null)
			return;

		FriendNode f = new FriendNode(fId);
		f.next = user.friends;
		user.friends = f;

		System.out.println("Friend connection added");
		System.out.println("User " + uId + " is now connected with User " + fId + "\n");
	}

	public void removeFriend(int uId, int fId) {
		UserNode user = findUser(uId);
		if (user == null || user.friends == null)
			return;

		if (user.friends.friendId == fId) {
			user.friends = user.friends.next;
		} else {
			FriendNode temp = user.friends;
			while (temp.next != null && temp.next.friendId != fId) {
				temp = temp.next;
			}
			if (temp.next != null) {
				temp.next = temp.next.next;
			}
		}

		System.out.println("Friend connection removed");
		System.out.println("User " + uId + " is no longer connected with User " + fId + "\n");
	}

	public void displayFriends(int id) {
		UserNode user = findUser(id);
		FriendNode temp = user.friends;
		while (temp != null) {
			System.out.println("Friend ID : " + temp.friendId);
			temp = temp.next;
		}
		System.out.println();
	}

	public void searchUser(int id) {
		UserNode user = findUser(id);
		if (user != null) {
			System.out.println("User ID : " + user.userId);
			System.out.println("Name    : " + user.name);
			System.out.println("Age     : " + user.age + "\n");
		}
	}

	public void countFriends(int id) {
		UserNode user = findUser(id);
		int count = 0;
		FriendNode temp = user.friends;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println("User : " + user.name);
		System.out.println("Total Friends : " + count + "\n");
	}

	public void findMutualFriends(int id1, int id2) {
		UserNode u1 = findUser(id1);
		UserNode u2 = findUser(id2);

		FriendNode f1 = u1.friends;
		while (f1 != null) {
			FriendNode f2 = u2.friends;
			while (f2 != null) {
				if (f1.friendId == f2.friendId) {
					System.out.println("Mutual Friend ID : " + f1.friendId + "\n");
					return;
				}
				f2 = f2.next;
			}
			f1 = f1.next;
		}
	}
}
