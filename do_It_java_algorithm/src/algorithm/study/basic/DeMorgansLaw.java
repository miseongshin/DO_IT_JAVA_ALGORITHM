package algorithm.study.basic;

import java.util.Scanner;

public class DeMorgansLaw
{
    public static void main(final String[] args)
    {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("숫자입력>>");

        final int num = scanner.nextInt();

        if (num < 10 || num > 99)
        {
            System.out.println("두자리");
        }

        if (!(num >= 10 && num <= 99))
        {
            System.out.println("두자리");
        }
        scanner.close();
    }
}
