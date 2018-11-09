package algorithm.study.basic;

import java.util.Scanner;

public class MediamNumber
{

    public static void main(final String[] args)
    {
        // 정수 3개중 중앙값 출력  >> 퀵정렬 참고
        ///Q1. 정수 3~4개 입력 최대 & 최소값 출력
        final Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 3개 입력 >>");
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        final int mediamNumber = getMediamNumber(a, b, c);
        System.out.println("mediamNumber:" + mediamNumber);
        scanner.close();
    }

    private static int getMediamNumber(final int a, final int b, final int c)
    {
        //수정함  같다-- 중복검토
        if (a > b)
        {
            if (a > c)
            {
                if (b > c)
                    return b;
                return c;
            }
            return a;
        } //수정함 else if 아래로 정렬
        else if (b > c)
            return c;
        else if (a > c)
            return a;
        return c;
    }

}
