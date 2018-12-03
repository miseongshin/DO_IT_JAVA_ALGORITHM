package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon10817_Miseong_important
{
    final static String SPACE = " ";

    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputText = null;
        String[] numbers;
        int a, b, c;
        int secondNumber;

        while ((inputText = bufferedReader.readLine()) != null)
        {
            try
            {
                numbers = inputText.split(SPACE);
                a = Integer.valueOf(numbers[0]);
                b = Integer.valueOf(numbers[1]);
                c = Integer.valueOf(numbers[2]);

                if (!isValidNumber(a) || !isValidNumber(b) || !isValidNumber(c))
                {
                    continue;
                }

                if (a >= b)
                    if (b >= c)
                        secondNumber = b;
                    else if (a <= c)
                        secondNumber = a;
                    else
                        secondNumber = c;
                else if (a > c)
                    secondNumber = a;
                else if (b > c)
                    secondNumber = c;
                else
                    secondNumber = b;

                //System.out.println(secondNumber);
                bufferedWriter.write(secondNumber + " \n");

            }
            catch (Exception e)
            {
                // 
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    private static boolean isValidNumber(int number)
    {
        //  1 <= number <= 1,000
        if (!(1 > number || number > 1000))
        {
            return true;
        }
        return false;
    }
}
