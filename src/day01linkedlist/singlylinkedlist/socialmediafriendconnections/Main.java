package day01linkedlist.singlylinkedlist.socialmediafriendconnections;

public class Main {
    public static void main(String[] args) {
        SocialMediaLinkedList sm = new SocialMediaLinkedList();

        // Adding some users
        sm.addUser(new User(1, "Ankit", 25));
        sm.addUser(new User(2, "Aakrati", 30));
        sm.addUser(new User(3, "Anand", 20));
        sm.addUser(new User(4, "Ananya", 28));

        // Adding friend connections
        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 4);

        // Display all users
        sm.displayUsers();

        // Display friends of a user
        sm.displayFriends(1);

        // Find mutual friends
        sm.findMutualFriends(1, 2);

        // Count friends of a user
        sm.countFriends(1);

        // Search for a user
        sm.searchUser("Ankit");
        sm.searchUser("3");

        // Remove a friend connection
        sm.removeFriendConnection(1, 3);
        sm.displayFriends(1);
    }
}
