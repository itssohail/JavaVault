package Arrays.ArrayLists;

public class Bookshelf {
    // Books on the shelf (array)
    String[] books = {"Book A", "Book B", "Book C", "Book D"};

    // Method to swap books
    void swapBooks(String[] shelf, int index1, int index2) {
        String temp = shelf[index1];
        shelf[index1] = shelf[index2];
        shelf[index2] = temp;
    }

    // Display bookshelf contents
    void displayShelf() {
        System.out.println("Bookshelf: " + java.util.Arrays.toString(books));
    }

    public static void main(String[] args) {
        Bookshelf myShelf = new Bookshelf();

        System.out.println("Before Swap:");
        myShelf.displayShelf();

        // Swap books just like swapping array elements
        myShelf.swapBooks(myShelf.books, 1, 3);

        System.out.println("After Swap:");
        myShelf.displayShelf();
    }
}