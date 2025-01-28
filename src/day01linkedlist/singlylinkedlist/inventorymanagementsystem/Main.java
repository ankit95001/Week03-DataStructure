package day01linkedlist.singlylinkedlist.inventorymanagementsystem;

public class Main {
    public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();

        // Adding some random items
        inventory.addItem(new Item("Laptop", 101, 10, 50000), 0);
        inventory.addItem(new Item("Mouse", 102, 50, 500), 1);
        inventory.addItem(new Item("Keyboard", 103, 30, 1000), 2);
        inventory.addItem(new Item("Monitor", 104, 20, 10000), 3);

        // Display all items
        inventory.displayItems();

        // Update quantity of an item
        inventory.updateQuantity(103, 40);

        // Search for an item
        inventory.searchItem("Mouse");
        inventory.searchItem("104");

        // Calculate total inventory value
        inventory.calculateTotalValue();

        // Sort inventory by name in ascending order
        inventory.sortInventory("name", true);
        inventory.displayItems();

        // Sort inventory by price in descending order
        inventory.sortInventory("price", false);
        inventory.displayItems();

        // Remove an item
        inventory.removeItem(102);
        inventory.displayItems();
    }
}
