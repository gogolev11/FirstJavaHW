package fthHW;

public class AppLibrary {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Иванов В.В.","001","Физика","01.01.1998","+79655476354");
        reader1.takeBook(3);
        reader1.takeBook(new String[]{"Приключения","Словарь","Энциклопедия"});

    }
}
