import java.util.Scanner;

public class FirstLvl {
    public static void main(String[] args) {
        //(решается через for)
        //Вводится n. Найдите сумму такого выражения: 1+1/2+1/3+1/4…..+1/n

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        double sum = 1;

        for (int i = 1; i <= number; i++) {

            sum += 1.0 / i;
        }
        System.out.println(sum);

    }
}