package fthHW;

public class Reader {
    private String fio;
    private String readNum;
    private String faculty;
    private String birthDate;
    private String telNum;

    public Reader (String fio,String readNum, String faculty, String birthDate, String telNum){
       this.birthDate=birthDate;
       this.fio=fio;
       this.readNum=readNum;
       this.faculty=faculty;
       this.telNum=telNum;
    };
    public String getFio() {
        return fio;
    }

    public String getReadNum() {
        return readNum;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getTelNum() {
        return telNum;
    }

    void takeBook(int countBook) {
        System.out.println(fio+" взял "+countBook+" книги");
    }

    void takeBook(String[] arrBook) {
        System.out.print(fio + " взял книги:");
        for (int i = 0; i < arrBook.length; i++) {
            System.out.print(arrBook[i] + " ");
        }
    }
    void takeBook(Book[] books) {
        System.out.print(fio + " взял книги:");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getNameBook() + "; ");
        }
    }
        void returnBook(int countBook) {
            System.out.println(fio+" взял "+countBook+" книги");
        }

        void returnBook(String[] arrBook) {
            System.out.print(fio + " взял книги:");
            for (int i = 0; i < arrBook.length; i++) {
                System.out.print(arrBook[i] + " ");
            }
        }
        void returnBook(Book[] books) {
            System.out.print(fio+" взял книги:");
            for (int i = 0; i < books.length; i++) {
                System.out.print(books[i].getNameBook()+"; ");
            }
    }

}




