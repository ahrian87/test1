import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj swoje imię: ");
        String name = sc.nextLine();
        int age = 35;
        System.out.println("Hello " + name + ", mam " + age + " lat. ");
    }
}