package fthHW;

public class AppLibrary {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Иванов В.В.","001","Физика","01.01.1998","+79655476354");
        Reader reader2 = new Reader("Петров А.К.","002","Математика","02.04.1999","+79658656351");
        Reader reader3 = new Reader("Кузнец И.Г.","003","История","12.06.1997","+79655476935");
        reader1.takeBook(3);
        reader1.takeBook(new String[]{"Приключения","Словарь","Энциклопедия"});
        System.out.println();
        Book book1 = new Book("Война и мир","Толстой Л.В.");
        Book book2 = new Book("Преступление и наказание","Достоевский М.Ф.");
        Book book3 = new Book("Ревизор","Гоголь Н.В.");
        reader1.takeBook(new Book[] {book1,book2,book3});

    }
}
