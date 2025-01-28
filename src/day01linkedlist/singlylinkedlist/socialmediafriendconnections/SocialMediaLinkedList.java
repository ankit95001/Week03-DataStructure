package day01linkedlist.singlylinkedlist.socialmediafriendconnections;

class SocialMediaLinkedList {
    private UserNode head;

    static class UserNode {
        User user;
        UserNode next;

        public UserNode(User user) {
            this.user = user;
            this.next = null;
        }
    }

    // Add a new user to the list
    public void addUser(User user) {
        UserNode newNode = new UserNode(user);
        if (head == null) {
            head = newNode;
        } else {
            UserNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("User added successfully.");
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        addFriend(user1, userId2);
        addFriend(user2, userId1);
        System.out.println("Friend connection added between User " + userId1 + " and User " + userId2);
    }

    private void addFriend(User user, int friendId) {
        FriendNode newFriend = new FriendNode(friendId);
        if (user.friends == null) {
            user.friends = newFriend;
        } else {
            FriendNode current = user.friends;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newFriend;
        }
    }

    // Remove a friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        removeFriend(user1, userId2);
        removeFriend(user2, userId1);
        System.out.println("Friend connection removed between User " + userId1 + " and User " + userId2);
    }

    private void removeFriend(User user, int friendId) {
        FriendNode current = user.friends, prev = null;

        while (current != null && current.friendId != friendId) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Friend not found.");
            return;
        }

        if (prev == null) {
            user.friends = current.next;
        } else {
            prev.next = current.next;
        }
    }

    // Display all friends of a specific user
    public void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of User " + userId + ":");
        FriendNode current = user.friends;
        while (current != null) {
            System.out.print(current.friendId + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        System.out.println("Mutual friends between User " + userId1 + " and User " + userId2 + ":");
        FriendNode current1 = user1.friends;
        while (current1 != null) {
            FriendNode current2 = user2.friends;
            while (current2 != null) {
                if (current1.friendId == current2.friendId) {
                    System.out.print(current1.friendId + " ");
                }
                current2 = current2.next;
            }
            current1 = current1.next;
        }
        System.out.println();
    }

    // Search for a user by Name or User ID
    public User findUserById(int userId) {
        UserNode current = head;
        while (current != null) {
            if (current.user.userId == userId) {
                return current.user;
            }
            current = current.next;
        }
        return null;
    }

    public void searchUser(String nameOrId) {
        UserNode current = head;
        while (current != null) {
            if (current.user.name.equalsIgnoreCase(nameOrId) ||
                    Integer.toString(current.user.userId).equals(nameOrId)) {
                System.out.println("User Found: " + current.user);
                return;
            }
            current = current.next;
        }
        System.out.println("User not found.");
    }

    // Count the number of friends for each user
    public void countFriends(int userId) {
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        int count = 0;
        FriendNode current = user.friends;
        while (current != null) {
            count++;
            current = current.next;
        }

        System.out.println("User " + userId + " has " + count + " friends.");
    }

    // Display all users
    public void displayUsers() {
        if (head == null) {
            System.out.println("No users in the list.");
            return;
        }

        UserNode current = head;
        System.out.println("Users:");
        while (current != null) {
            System.out.println(current.user);
            current = current.next;
        }
    }
}
