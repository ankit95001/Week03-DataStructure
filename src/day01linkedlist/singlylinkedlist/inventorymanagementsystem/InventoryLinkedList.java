package day01linkedlist.singlylinkedlist.inventorymanagementsystem;

class InventoryLinkedList {
    private InventoryNode head;

    // Add an item to the inventory
    public void addItem(Item item, int position) {
        InventoryNode newNode = new InventoryNode(item);

        if (position == 0 || head == null) { // Add at the beginning or if the list is empty
            newNode.next = head;
            head = newNode;
        } else {
            InventoryNode current = head;
            int index = 0;

            while (current.next != null && index < position - 1) {
                current = current.next;
                index++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        System.out.println("Item added successfully.");
    }

    // Remove an item by Item ID
    public void removeItem(int itemId) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        if (head.item.itemId == itemId) { // Remove the head
            head = head.next;
            System.out.println("Item removed successfully.");
            return;
        }

        InventoryNode current = head;
        while (current.next != null && current.next.item.itemId != itemId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Item not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Item removed successfully.");
        }
    }

    // Update the quantity of an item by Item ID
    public void updateQuantity(int itemId, int newQuantity) {
        InventoryNode current = head;
        while (current != null) {
            if (current.item.itemId == itemId) {
                current.item.quantity = newQuantity;
                System.out.println("Quantity updated successfully.");
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found.");
    }

    // Search for an item by Item ID or Item Name
    public void searchItem(String itemNameOrId) {
        InventoryNode current = head;
        while (current != null) {
            if (current.item.itemName.equalsIgnoreCase(itemNameOrId) ||
                    Integer.toString(current.item.itemId).equals(itemNameOrId)) {
                System.out.println("Item Found: " + current.item);
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found.");
    }

    // Calculate and display the total value of inventory
    public void calculateTotalValue() {
        double totalValue = 0;
        InventoryNode current = head;
        while (current != null) {
            totalValue += current.item.quantity * current.item.price;
            current = current.next;
        }
        System.out.println("Total Inventory Value: " + totalValue);
    }

    // Sort the inventory by Item Name or Price
    public void sortInventory(String criteria, boolean ascending) {
        if (head == null || head.next == null) return; // No sorting needed for empty or single-node list

        head = mergeSort(head, criteria, ascending);
        System.out.println("Inventory sorted successfully.");
    }

    private InventoryNode mergeSort(InventoryNode head, String criteria, boolean ascending) {
        if (head == null || head.next == null) return head;

        InventoryNode middle = getMiddle(head);
        InventoryNode nextOfMiddle = middle.next;
        middle.next = null;

        InventoryNode left = mergeSort(head, criteria, ascending);
        InventoryNode right = mergeSort(nextOfMiddle, criteria, ascending);

        return merge(left, right, criteria, ascending);
    }

    private InventoryNode merge(InventoryNode left, InventoryNode right, String criteria, boolean ascending) {
        InventoryNode result;

        if (left == null) return right;
        if (right == null) return left;

        boolean comparison;
        if (criteria.equalsIgnoreCase("name")) {
            comparison = ascending ? left.item.itemName.compareToIgnoreCase(right.item.itemName) <= 0
                    : left.item.itemName.compareToIgnoreCase(right.item.itemName) > 0;
        } else { // Sort by price
            comparison = ascending ? left.item.price <= right.item.price
                    : left.item.price > right.item.price;
        }

        if (comparison) {
            result = left;
            result.next = merge(left.next, right, criteria, ascending);
        } else {
            result = right;
            result.next = merge(left, right.next, criteria, ascending);
        }

        return result;
    }

    private InventoryNode getMiddle(InventoryNode head) {
        if (head == null) return head;

        InventoryNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Display all items
    public void displayItems() {
        if (head == null) {
            System.out.println("No items in inventory.");
            return;
        }

        InventoryNode current = head;
        System.out.println("Inventory Items:");
        while (current != null) {
            System.out.println(current.item);
            current = current.next;
        }
    }
}
