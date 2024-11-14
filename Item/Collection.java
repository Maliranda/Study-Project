package Item;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection {

    private int count;
    private Book[] books;

    public Collection() {
        this.count=0;
        this.books=new Book[0];
    }

    public void add(Book a){
        books = Arrays.copyOf(books, count +1);
        books[count]=a;
        count++;
    }
//    public void remove(int in){
//        Book[] b = new Book[count-1];
//    int j = 0;
//        for (int i=0; i<count; i++){
//            if ( i != in){
//                b[j++]=books[i];
//            }
//        }
//        books = b;
//        count--;
//        printList();
//
//    }
    public void remove(int in){
        for(int i=in;i<count-1;i++){
            books[i]=books[i+1];
        }
        count--;
        books =Arrays.copyOf(books, count);
        printList();

    }
    public void printOne(int i){
        System.out.println(books[i].getDescription());
    }
    public void printAll(){
        for (Book books : books) {
            System.out.println(books.getDescription());
        }
    }
    public void printList(){
        for (int i = 0; i < books.length; i++) {
            System.out.println((i+1)+". "+ books[i].getTitle() + ", "+books[i].getAuthor());
        }
    }
    public void searchByAuthor (String s){
        for(Book books : books){
            if(books.getAuthor().equalsIgnoreCase(s)){
                System.out.println(books.getDescription());
            }
        }

    }
    public void sortByPrice(){
        boolean swapped = true;
        for (int i = 0; i < books.length; i++) {
            swapped = false;
            for (int j = 0; j < books.length-1-i; j++) {
                if (books[j].getPrice()>books[j+1].getPrice()) {
                    Book temp = books[j];
                    books[j] = books[j+1];
                    books[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        printList();
    }
    public void sortByYear(){
        for (int i = 0; i < books.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < books.length-1-i; j++) {
                if (books[j].year>books[j+1].year) {
                    Book temp = books[j];
                    books[j] = books[j+1];
                    books[j+1] = temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        printList();
    }
    public void searchByYear(int year){
        for(int i = 0; i < books.length; i++){
            if(books[i].year == year){
                System.out.println(books[i].getDescription());
            }
        }
    }



}

