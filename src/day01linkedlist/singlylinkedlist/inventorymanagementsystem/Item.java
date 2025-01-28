package day01linkedlist.singlylinkedlist.inventorymanagementsystem;

class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;

    public Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item Name: " + itemName + ", Item ID: " + itemId + ", Quantity: " + quantity + ", Price: " + price;
    }
}
