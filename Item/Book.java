package Item;

class Book{
    private String title;
    private String author;
    public int year;
    private double price;

    public Book(String title, String author, int year, double price){
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
//    public int getYear(){
//        return year;
//    }
    public double getPrice(){
        return price;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
//    public void setYear(int year){
//        this.year = year;
//    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getTitle2(){
        return title+" by "+ author;
    }
    public String getDescription() {
        return "Title: " + title + "\nAuthor: " + author + "\nYear: " + year + "\nPrice: $" + price;
    }
    public double discountPrice(){
        return price *0.7;
    }
//    public void print(){
//        System.out.println("Title: " + title);
//        System.out.println("Author: " + author);
//        System.out.println("Year: " + year);
//        System.out.println("Price: " + price);
//    }


}

