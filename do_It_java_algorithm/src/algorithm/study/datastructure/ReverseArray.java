package algorithm.study.datastructure;

import java.util.Random;
import java.util.Scanner;

public class ReverseArray
{

    private final static NumberArrayUtil commonUtil = new NumberArrayUtil();

    public static void main(final String[] args)
    {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("요솟수 입력>>");
        final int arraySize = scanner.nextInt();
        scanner.close();

        final int[] num = new int[arraySize];
        final Random random = new Random();
        for (int i = 0; i < num.length; i++)
        {
            num[i] = random.nextInt(100) + 1;
        }
        final int[] numClone = num.clone();
        getCommonutil().printArrayNumbers(numClone);

        final int numLength = num.length;
        for (int i = 0; i < numLength / 2; i++)
        {
            System.out.println("num[" + i + "]와 num[" + (numLength - i - 1) + "] 를 교환합니다.");
            getCommonutil().reverseNumber(num, i, numLength - i - 1);
            getCommonutil().printArrayNumbers(num);
        }
        System.out.println("역순정렬을 마쳤습니다.");

        getCommonutil().printArraySum(num);

    }

    private static NumberArrayUtil getCommonutil()
    {
        return commonUtil;
    }

}
