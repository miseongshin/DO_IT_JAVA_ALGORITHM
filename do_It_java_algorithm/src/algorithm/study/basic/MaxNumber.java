package algorithm.study.basic;

import java.util.Scanner;

public class MaxNumber
{

    public static void main(final String[] args)
    {
        ///Q1. 정수 3~4개 입력 최대 & 최소값 출력
        final Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 4개 입력 >>");
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        final int d = scanner.nextInt();

        final int max4 = max4(a, b, c, d);
        final int min3 = min3(a, b, c);
        final int min4 = min4(a, b, c, d);

        System.out.println("max4:" + max4 + ", min3(앞에 세개 최소값):" + min3 + ",min4:" + min4);

        scanner.close();
    }

    private static int min4(final int a, final int b, final int c, final int d)
    {
        int min = a;

        if (min > b)
            min = b;

        if (min > c)
            min = c;

        if (min > d)
            min = d;

        return min;
    }

    private static int min3(final int a, final int b, final int c)
    {
        int min = a;

        if (min > b)
            min = b;

        if (min > c)
            min = c;

        return min;
    }

    private static int max4(final int a, final int b, final int c, final int d)
    {
        int max = a;

        if (max < b)
            max = b;

        if (max < c)
            max = c;

        if (max < d)
            max = d;

        return max;
    }

}
