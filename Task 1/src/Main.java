import java.util.Scanner;

public class Main {
    static String booksInfo = "";

    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            double bookPrice = inputBookPrice();
            addBook(name);
            addBook(name, pageCount);
            addBook(name, pageCount, bookPrice);
            printInfo();
        }
    }

    public static String inputBookName() {
        System.out.println("Input book name:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Input count of pages:");
        return new Scanner(System.in).nextInt();
    }

    public static double inputBookPrice() {
        System.out.println("Input price:");
        return new Scanner(System.in).nextDouble();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0);
    }

    public static void addBook(String bookName, int pageCount) {
        addBook(bookName, pageCount, 0);
    }

    public static void addBook(String bookName, int pageCount, double bookPrice) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " pgs. Price: " +
                (bookPrice > 0 ? bookPrice + " usd." : " not define.\n");
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }

}
