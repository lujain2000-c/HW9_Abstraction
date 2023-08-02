// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Home alone", 50.0,"Chris Columbus");
        System.out.println("Movie Name: " + movie.getName());
        System.out.println("Price: " + movie.getPrice());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Discount: " + movie.getDiscount());
        movie.setPrice(75.0);
        System.out.println("New Price: " + movie.getPrice());


        Book book = new Book("Rich Dad Poor Dad", 70.0,"Robert Toru Kiyosaki");
        System.out.println("Book Name: " + book.getName());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Discount: " + book.getDiscount());
        book.setPrice(40.0);
        System.out.println("New Price: " + book.getPrice());


    }
}