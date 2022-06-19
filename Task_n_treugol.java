import java.util.Scanner;

public class Task_n_treugol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int T = (n * (n + 1)) / 2;
        System.out.println(T);
    }
}