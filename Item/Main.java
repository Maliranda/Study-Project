package Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Collection myCollection = new Collection();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Welcome to the book database!\n" +
                    "Choose an option to proceed:\n" +
                    "1 - print book list\n" +
                    "2 - add new book\n" +
                    "3 - remove book\n" +
                    "4 - sort books by year\n" +
                    "5 - search books by author\n" +
                    "6 - search books by year\n" +
                    "7 - print detailed book list\n" +
                    "0 - exit the program");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    myCollection.printAll();
                    break;
                case 2:
                    addNewBook(myCollection);
                    break;
                case 3:
                    remove(myCollection);
                    break;
                case 4:
                    myCollection.sortByYear();
                    break;
                case 6:
                    searchByYear(myCollection);
                    break;
                case 5:
                    searchByAuthor(myCollection);
                    break;
                case 7:
                    myCollection.printList();
                    break;
            }
        } while (choice!=0);

    }
    public static void addNewBook(Collection myCollection) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the book: ");
        String bookName = scanner.nextLine();
        System.out.println("Please enter the author of the book: ");
        String author = scanner.nextLine();
        System.out.println("Please enter the year of the book: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter the price of the book: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        Book newBook = new Book(bookName, author, year, price);
        myCollection.add(newBook);
    }
    public static void remove(Collection myCollection) {
        Scanner scanner = new Scanner(System.in);
        myCollection.printList();
        System.out.println("Please enter the number of the book: ");
        int bookNumber = scanner.nextInt();
        scanner.nextLine();
        myCollection.remove(bookNumber-1);

    }
    public static void searchByYear(Collection myCollection) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year of the book to search: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        myCollection.searchByYear(year);
    }
    public static void searchByAuthor(Collection myCollection) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the author of the book to search: ");
        String author = scanner.nextLine();
        myCollection.searchByAuthor(author);
    }
}
