package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon2440_Miseong
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputText = null;
        int inputNumber;
        final String star = "*";
        while ((inputText = bufferedReader.readLine()) != null)
        {
            try
            {
                inputNumber = Integer.valueOf(inputText);
                // 1<= N <=100
                if (!(1 > inputNumber || inputNumber > 100))
                {
                    for (int i = 0; i < inputNumber; i++)
                    {
                        for (int j = 0; j < inputNumber; j++)
                        {
                            if (i <= j)
                            {
                                //System.out.print(star);
                                bufferedWriter.write(star);
                            }
                        }
                        //System.out.println();
                        bufferedWriter.write("\n");
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
