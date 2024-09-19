import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        People p10;
        People p1 = new People(id, name, age);
        System.out.println(p1);
    }
}
