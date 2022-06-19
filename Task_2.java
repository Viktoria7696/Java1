import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        System.out.println(n: "Введите число: ");
        iScanner.close();
        int sum = 0;
        while (n>0){
            sum = sum + n % 10;
            n/= 10;
        }
        System.out.println(sum);
        if (n % 10 == 0){
            System.out.println(n % sum);
            System.out.println(n: "Число делится");
        }
        else{
            System.out.println(n: "Число не делится");
        }
    }
    
}

//Syntax error on token ":", invalid AssignmentOperator
//Type mismatch: cannot convert from String to int
//Эти ошибки выводятся по 3 раза на 7, 17 и 20 строки