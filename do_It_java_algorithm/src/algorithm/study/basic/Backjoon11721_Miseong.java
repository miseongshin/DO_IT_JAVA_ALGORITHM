package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon11721_Miseong
{
    final static String REGEX = "^[A-Za-z]{1,100}$";

    final static int PRINT_SIZE = 10;

    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputText = null;
        char[] words;

        while ((inputText = bufferedReader.readLine()) != null)
        {
            if (inputText.matches(REGEX))
            {
                words = inputText.toCharArray();

                for (int i = 0; i < words.length; i++)
                {
                    System.out.print(words[i]);

                    if ((i+1) % PRINT_SIZE == 0)
                    {
                        System.out.println();
                    }
                }

            }

        }
        //bufferedWriter.flush();
        //bufferedWriter.close();
        bufferedReader.close();

    }
}
