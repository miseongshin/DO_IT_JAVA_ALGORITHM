package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon2558_Miseong
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = null;
        int sum = 0;
        int count = 0;
        int inputNumber;
        while ((inputText = bufferedReader.readLine()) != null)
        {
            try
            {
                count++;
                inputNumber = Integer.valueOf(inputText);
                if (count % 2 == 1)
                {
                    if (0 < inputNumber)
                    {
                        sum += inputNumber;
                    }
                    else
                    {
                        count = 0;
                    }
                }
                else
                {
                    if (inputNumber < 10)
                    {
                        sum += inputNumber;
                        System.out.println(sum);
                        sum = 0;
                    }
                    else
                    {
                        count = 0;
                    }
                }

            }
            catch (Exception e)
            {
                // 
            }
        }
        bufferedReader.close();
    }
}
