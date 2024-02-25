import java.util.LinkedList;

public class Main {
    // Function to detect loop in a linked list
    static <T> boolean detectLoop(LinkedList<T> list) {
        int slowPointer = 0;
        int fastPointer = 0;

        while (fastPointer < list.size() && fastPointer + 1 < list.size()) {
            slowPointer++;
            fastPointer += 2;

            // If slowPointer and fastPointer meet at some node, then there is a loop
            if (list.get(slowPointer).equals(list.get(fastPointer)))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Create a linked list with a loop
        list.add(20);
        list.add(4);
        list.add(15);
        list.add(20);

        // Create a loop for testing
        list.add(list.get(0)); // Adding the first element as the last element to create a loop

        if (detectLoop(list))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
    }
}