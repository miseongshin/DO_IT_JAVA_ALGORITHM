package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon10869_Miseong
{
    public static void main(String[] args) throws IOException
    {
        final String space = " "; 
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputValue;
        String[] numbers = new String[2];
        while ((inputValue = bufferedReader.readLine()) != null)
        {
            numbers = inputValue.split(space);
            int number1 = Integer.valueOf(numbers[0]);
            int number2 = Integer.valueOf(numbers[1]);
            
            if (1 <=number1 && number2 <=10000)
            {
                System.out.println(number1+number2);
                System.out.println(number1-number2);
                System.out.println(number1*number2);
                System.out.println(number1/number2);
                System.out.print(number1%number2);
                
                //System.out.print(number1.add(number2) +"\n");
                //System.out.print(number1.subtract(number2)+"\n");
                //System.out.print(number1.multiply(number2)+"\n");
                //System.out.print(number1.divide(number2,0, BigDecimal.ROUND_FLOOR)+"\n");
                //System.out.print(number1.remainder(number2));
            }
        }
    }
}
