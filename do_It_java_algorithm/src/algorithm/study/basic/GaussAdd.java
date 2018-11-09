package algorithm.study.basic;

import java.util.Scanner;

public class GaussAdd
{
    public static void main(final String[] args)
    {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력  ex) 1000000>>");
        final long bitNum = scanner.nextInt();
        long sum;
        long start = System.currentTimeMillis();
        sum = 0;
        for (int i = 1; i <= bitNum; i++)
        {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(bitNum + " sum : " + sum + "|" + (end - start) / 1000.0 + "초");

        start = System.currentTimeMillis();
        sum = 0;
        sum = (1 + bitNum) * (bitNum / 2);
        end = System.currentTimeMillis();

        System.out.println(bitNum + " 가우스 공식 실행 : " + sum + "|" + (end - start) / 1000.0 + "초");

        System.out.println("숫자 두개 입력>>");
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        start = System.currentTimeMillis();
        final int betweenSum = getBetweenSum(a, b);
        end = System.currentTimeMillis();
        System.out.println("betweenSum 공식 실행 : " + betweenSum + "|" + (end - start) / 1000.0 + "초");
        scanner.close();
    }

    private static int getBetweenSum(final int a, final int b)
    {
        if (a > b)
        {
            return (1 + a) * a / 2 - (1 + b) * b / 2;
        }
        return (1 + b) * b / 2 - (1 + a) * a / 2;
    }
}
