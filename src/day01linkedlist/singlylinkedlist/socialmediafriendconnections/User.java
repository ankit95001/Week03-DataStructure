package day01linkedlist.singlylinkedlist.socialmediafriendconnections;

class User {
    int userId;
    String name;
    int age;
    FriendNode friends;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
    }

    @Override
    public String toString() {
        return "User ID: " + userId + ", Name: " + name + ", Age: " + age;
    }
}
