package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon9498_Miseong
{
    static enum Level
    {
        A, B, C, D, E, F
    }

    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputText = null;
        int number;

        while ((inputText = bufferedReader.readLine()) != null)
        {
            try
            {
                number = Integer.valueOf(inputText);
                //  0 <= number <= 100
                if (!(0 > number || number > 100))
                {
                    switch (number / 10)
                    {
                        case 10:
                        case 9:
                            System.out.println(Level.A.toString());
                            break;
                        case 8:
                            System.out.println(Level.B.toString());
                            break;
                        case 7:
                            System.out.println(Level.C.toString());
                            break;
                        case 6:
                            System.out.println(Level.D.toString());
                            break;
                        default:
                            System.out.println(Level.F.toString());
                            break;
                    }
                }

            }
            catch (Exception e)
            {
                // 
            }
        }
        // bufferedWriter.flush();
        // bufferedWriter.close();
        bufferedReader.close();
    }
}
