package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon15552_Miseong
{
    final static String SPACE = " ";
    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputText = null;
        String[] numbers;
        int number1,number2;

        while ((inputText = bufferedReader.readLine()) != null)
        {
            try
            {
                numbers = inputText.split(SPACE);
                number1 = Integer.valueOf(numbers[0]);
                number2 = Integer.valueOf(numbers[1]);
                
                if (isValidNumber(number1) && isValidNumber(number2))
                {
                    //System.out.println(number1+number2);
                    bufferedWriter.write(number1+number2 +" \n");
                }

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
        if (!(1>number || number>1000))
        {
            return true;
        }
        return false;
    }
}
