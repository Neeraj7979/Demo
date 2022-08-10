public class Book {
    String title;
    int yearOfPublishing;
    long isbnNumber;
    String authorName;
    public void display(){
        System.out.println("title = " + title);
        System.out.println("authorName = " + authorName);
        System.out.println("yearOfPublishing = " + yearOfPublishing);
        System.out.println("isbnNumber = " + isbnNumber);
    }

    public static void main(String[] args) {
        Book bookDetails;
        bookDetails=new Book();
        bookDetails.title="Let Us Java";
        bookDetails.authorName="Yashvant kanetkar";
        bookDetails.isbnNumber=189000456789L;
        bookDetails.yearOfPublishing=2005;
        bookDetails.display();

    }
}
