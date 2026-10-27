package Practice1;


import java.util.Objects;

class User {
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public void performRole() {

    }
}

class Member extends User {
    private String[] bookTitle = new String[50];
    String book;
    private int count = 0;
    private int index = -1;

    public Member(String name, String email) {
        super(name, email);

    }

    void borrowBook(String bookTitle) {
        this.bookTitle[count] = bookTitle;
        System.out.println(name + "borrowed the book: " + bookTitle);
        count++;
        if (bookTitle.isEmpty()) {
            System.out.println(name + "borrowed the book:None");
        }
    }

    void returnBook(String bookTitle) {
        for (int i = 0; i < count; i++) {
            if (Objects.equals(this.bookTitle[i], bookTitle)) {
                index = i;
                break;
            }
        }
        for (int i = index; i < count - 1; i++) {
            this.bookTitle[i] = this.bookTitle[i + 1];

        }
        this.bookTitle[--count] = null;
        System.out.println(name + " returned the book: " + bookTitle);

    }

    @Override
    public void performRole() {
        if (count==0){
            System.out.println(name + "'s borrowed the book:None");
        }
        else System.out.println(name + "'s borrowed the book: " + bookTitle);
    }
}

class Librarian extends User {
    private String[] bookTitle = new String[100];
    private int count = 0;
    private int index = -1;

    public Librarian(String name, String email) {
        super(name, email);

    }

    void addBook(String bookTitle) {
        this.bookTitle[count] = bookTitle;
        System.out.println(name + "added the book: " + bookTitle);
        count++;
    }

    void removeBook(String bookTitle) {
        for (int i = 0; i < count; i++) {
            if (Objects.equals(this.bookTitle[i], bookTitle)) {
                index = i;
                break;
            }
        }
        for (int i = index; i < count - 1; i++) {
            this.bookTitle[i] = this.bookTitle[i + 1];
        }
        this.bookTitle[--count] = null;
        System.out.println(name + "removed the book: " + bookTitle);

    }

    @Override
    public void performRole() {
        System.out.println(name + "'s added the book: " + bookTitle);
    }
}

class Administrator extends User {
    String[] userName = new String[100];
    private int count = 0;
    private int index = -1;

    public Administrator(String name, String email) {
        super(name, email);
    }

    void addUser(String userName) {
        this.userName[count] = userName;
        System.out.println(name + "added user: " + userName);
        count++;
    }

    void deleteUser(String userName) {

        for (int i = 0; i < count; i++) {
            if (Objects.equals(this.userName[i], userName)) {
                index = i;
                break;
            }
        }
        for (int i = index; i < count - 1; i++) {
            this.userName[i] = this.userName[i + 1];

        }
        this.userName[--count] = null;
        System.out.println(name + " deleted user: " + userName);
    }

    @Override
    public void performRole() {

        System.out.println(name + "'s Last action: added user: " + userName);
    }
}


public class Main {
    public static void main(String[] args) {
        Member mem = new Member("Alice", "alice@example.com");
        Librarian lib = new Librarian("Bob", "bob@example.com");
        Administrator ad = new Administrator("Charlie", "charlie@example.com");
        mem.borrowBook("The Great Gatsby");
        mem.performRole();
        mem.returnBook("The Great Gatsby");
        mem.performRole();
        lib.addBook("1984");
        lib.performRole();
        ad.addUser("Dave");
        ad.performRole();
        ad.deleteUser("Dave");
        ad.performRole();
    }
}
