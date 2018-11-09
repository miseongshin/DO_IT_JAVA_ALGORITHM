package algorithm.study.datastructure;

public class NumberArrayUtil
{

    public void printArrayNumbers(final int[] numbers)
    {
        for (final int number : numbers)
        {
            System.out.print(number + " ");

        }
        System.out.println();
    }

    public void printArraySum(final int[] numbers)
    {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
        }
        System.out.println("\n합계:" + sum);
    }

    public void reverseNumber(final int[] numbers, final int i, final int j)
    {

        final int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
