package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon11720_Miseong
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputText = null;
        int sumSize = 0;
        boolean isSetTotalNum= false;
        int totalNum;

        while ((inputText = bufferedReader.readLine()) != null)
        {
            try
            {

                if (!isSetTotalNum)
                {
                    isSetTotalNum = true;
                    sumSize = Integer.valueOf(inputText);
                }
                else
                {
                    totalNum = 0;
                    isSetTotalNum = false;
                    for (int i = 1; i <= sumSize; i++)
                    {
                        totalNum += Integer.valueOf(inputText.substring(i-1, i));
                    }

                    System.out.print(totalNum);
                    //bufferedWriter.write(totalNum);
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
