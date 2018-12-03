package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon10871_Miseong
{
    final static String SPACE = " ";

    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputText = null;
        String[] a;
        boolean isGetSize = false;
        int n = 0;
        int x = 0;
        int number;

        while ((inputText = bufferedReader.readLine()) != null)
        {
            try
            {
                a = inputText.split(SPACE);

                if (!isGetSize)
                {
                    n = Integer.valueOf(a[0]);
                    x = Integer.valueOf(a[1]);

                    if (!isValidNumber(n) || !isValidNumber(x))
                    {
                        continue;
                    }

                    isGetSize = true;

                }
                else
                {

                    for (int i = 0; i < n; i++)
                    {
                        number = Integer.valueOf(a[i]);
                        if (number < x && isValidNumber(number))
                        {
                            System.out.print(a[i] + SPACE);
                            //bufferedWriter.write(numbers[i] + SPACE);
                        }
                    }
                    isGetSize = false;
                    System.out.println();
                }

            }
            catch (Exception e)
            {
                // 
            }
        }
        //bufferedWriter.flush();
        //bufferedWriter.close();
        bufferedReader.close();

    }

    private static boolean isValidNumber(int number)
    {
        //1 ≤ N, X ≤ 10,000
        if (!(1 > number || number > 1000))
        {
            return true;
        }
        return false;
    }
}
