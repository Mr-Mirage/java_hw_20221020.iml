import java.util.Scanner;

public class SecondLvl {
    public static void main(String[] args) {
        //(решается через while)
        //Вводится число (число может быть и маленьким и большим), но вмешается в int.
        //Найти сумму всех цифр этого числа

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);

    }
}
