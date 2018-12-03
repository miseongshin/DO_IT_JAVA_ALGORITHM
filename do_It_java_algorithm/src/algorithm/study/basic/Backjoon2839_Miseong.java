package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon2839_Miseong
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = null;
        int inputNumber;
        int a = 5;
        int b = 3;
        int countA , countB;
        int maxA = 0;

        while ((inputText = bufferedReader.readLine()) != null)
        {
            try
            {
                countA = 0;
                countB = 0;
                inputNumber = Integer.valueOf(inputText);
                if (!(3 > inputNumber || inputNumber > 5000))
                {

                    maxA = inputNumber / a;

                    for (int i = maxA; i >= 0; i--)
                    {
                        if (countA==0 && (inputNumber - i * a) % b == 0)
                        {
                            countA = i;
                            countB = (inputNumber - i * a) / b;
                        }
                    }

                    if (countA == 0 && countB == 0)
                    {
                        System.out.println(-1);
                    }
                    else
                    {
                        System.out.println(countA + countB);
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
