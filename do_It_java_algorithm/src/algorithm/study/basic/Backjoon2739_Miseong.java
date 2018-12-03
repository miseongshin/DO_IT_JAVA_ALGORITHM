package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon2739_Miseong
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputText = null;
        int inputNumber;

        while ((inputText = bufferedReader.readLine()) != null)
        {
            try
            {
                inputNumber = Integer.valueOf(inputText);
                // n<= N <=9
                if (!(1 > inputNumber || inputNumber > 9))
                {
                    for (int i = 1; i < 10; i++)
                    {
                        System.out.println(inputNumber + " * " + i + " = " + (inputNumber * i));
                        //bufferedWriter.write(inputNumber + " * " + i + " = " + (inputNumber * i)+"\n");
                    }
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
}
