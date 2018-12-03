package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon1924_Miseong
{
    final static String[] WEEKS = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

    final static int[] DAYCOUNT = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    final static String SPACE = " ";

    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputText = null;
        int x, y;
        int totalDays;
        String[] numbers = new String[2];
        int[] DAYCOUNT_SUM = new int[12];

        for (int i = 0; i < DAYCOUNT_SUM.length; i++)
        {
            totalDays = 0;
            for (int j = 0; j < i; j++)
            {
                totalDays += DAYCOUNT[j];
            }
            DAYCOUNT_SUM[i] += totalDays;
        }

        while ((inputText = bufferedReader.readLine()) != null)
        {
            try
            {
                totalDays = 0;
                numbers = inputText.split(SPACE);
                x = Integer.valueOf(numbers[0]);
                y = Integer.valueOf(numbers[1]);
                //System.out.println(x + "|" + y);

                if (isValidNumber(x, y))
                {
                    totalDays += DAYCOUNT_SUM[x - 1];
                    totalDays = totalDays + y;
                    //System.out.println(totalDays);
                }

                //System.out.println(WEEKS[totalDays % 7]);
                bufferedWriter.write(WEEKS[totalDays % 7]);

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

    private static boolean isValidNumber(int x, int y)
    {
        //1≤x≤12
        if (!(1 > x || x > 12))
        {
            //1≤y≤31
            if (!(1 > y || y > DAYCOUNT[x - 1]))
            {
                return true;
            }
        }
        return false;
    }
}
