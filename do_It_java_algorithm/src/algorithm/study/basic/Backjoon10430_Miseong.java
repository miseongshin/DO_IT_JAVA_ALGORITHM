package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon10430_Miseong
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = null;
        String[] textnumbers = new String[3];
        int[] numbers = new int[3];
        while ((inputText = bufferedReader.readLine()) != null)
        {
            textnumbers = inputText.split(" ");
            for (int i = 0; i < numbers.length; i++)
            {
                if (isValidNumber(textnumbers[i]))
                {
                    numbers[i] = Integer.valueOf(textnumbers[i]);
                }
            }

            System.out.println((numbers[0] + numbers[1]) % numbers[2]);
            System.out.println((numbers[0] % numbers[2] + numbers[1] % numbers[2]) % numbers[2]);
            System.out.println((numbers[0] * numbers[1]) % numbers[2]);
            System.out.println(((numbers[0] % numbers[2]) * (numbers[1] % numbers[2])) % numbers[2]);
        }
        bufferedReader.close();
    }

    private static boolean isValidNumber(String inputText)
    {
        try
        {
            int number = Integer.valueOf(inputText);
            if (!(2 > number || number > 10000))
            {
                return true;
            }
            return false;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
