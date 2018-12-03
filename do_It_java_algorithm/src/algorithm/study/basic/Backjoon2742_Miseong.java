package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon2742_Miseong
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
                //1 <= N <=100000
                if (!(1 > inputNumber || inputNumber > 100000))
                {

                    for (int i = 0; i < inputNumber; i++)
                    {
                        bufferedWriter.write(inputNumber - i + "\n");
                        System.out.println(inputNumber - i);
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
