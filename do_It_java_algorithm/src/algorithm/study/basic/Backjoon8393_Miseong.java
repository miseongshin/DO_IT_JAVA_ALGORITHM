package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon8393_Miseong
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

                //1≤inputNumber≤10000
                if (!(1 > inputNumber || inputNumber > 10000))
                {
                    System.out.print((1 + inputNumber) * inputNumber / 2);
                    //bufferedWriter.write((1 + inputNumber) * inputNumber / 2);
                }

/*                int numbersum = 0;
                for (int i = 1; i <= inputNumber; i++)
                {
                    numbersum += i;
                }
                System.out.println(numbersum);*/

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
