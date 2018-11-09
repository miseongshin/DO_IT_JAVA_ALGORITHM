package algorithm.study.basic;

import java.util.Scanner;

public class NumberOfNaturalNumber
{
    public static void main(final String[] args)
    {
        final Scanner scanner = new Scanner(System.in);
        int number = 0;
        do
        {
            System.out.println("자연수를 입력하세요 >>");
            number = scanner.nextInt();

        } while (number < 0);

        final int numberSize = String.valueOf(number).length();
        System.out.println(number + "의 자릿수: " + numberSize + "|지수 테스트" + (int) Math.pow(10, numberSize - 1));
        scanner.close();
    }
}
