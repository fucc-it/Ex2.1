import java.util.Scanner;

public class Louader {
    public static void main(String[] args) {
        Book book = new Book();
        Scanner in = new Scanner(System.in);
        String type;
        System.out.println("Введите название и автора книги:");
        type = in.nextLine();
        book.setWright(type);
        type = in.nextLine();
        book.setName(type);
        System.out.println("Введите кол-во глав и страниц:");
        int a = in.nextInt();
        book.setSect(a);
        a = in.nextInt();
        book.setNumb(a);

        System.out.println("Сравните данные:");
        System.out.println(book.getWright() + " " + book.getName() + " " + book.getSect() + " " + book.getNumb());
    }
}
