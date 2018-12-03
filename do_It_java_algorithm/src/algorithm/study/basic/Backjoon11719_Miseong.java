package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon11719_Miseong
{
    public static void main(String[] args) throws IOException
    {
        final String regex = "^[A-Za-z0-9 ]{0,100}$"; 
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = null;
        while ((inputText = bufferedReader.readLine()) != null)
        {
            if (inputText.matches(regex))
            {
                System.out.println(inputText);
            }
        }
        bufferedReader.close();
    }
}
