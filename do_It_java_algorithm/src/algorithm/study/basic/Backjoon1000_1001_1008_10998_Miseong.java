package algorithm.study.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Backjoon1000_1001_1008_10998_Miseong
{
    public static void main(String[] args) throws IOException
    {
        final String regex = "^[1-9]$"; 
        final String space = " "; 
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputValue;
        String[] numbers = new String[2];
        while ((inputValue = bufferedReader.readLine()) != null)
        {
            numbers = inputValue.split(space);
            if (numbers[0].matches(regex) && numbers[1].matches(regex))
            {
                BigDecimal number1 = new BigDecimal(numbers[0]);
                BigDecimal number2 = new BigDecimal(numbers[1]);
                
                //System.out.print(Integer.valueOf(numbers[0]) + Integer.valueOf(numbers[1]));
                //System.out.print(Integer.valueOf(numbers[0]) - Integer.valueOf(numbers[1]));
                //System.out.print(Integer.valueOf(numbers[0]) * Integer.valueOf(numbers[1]));
                //System.out.printf("%.9g", Double.valueOf(numbers[0]) / Double.valueOf(numbers[1]));
                BigDecimal divideNumber = number1.divide(number2, 9 , BigDecimal.ROUND_HALF_UP);
                DecimalFormat format = new DecimalFormat("0.#########");
                System.out.print(format.format(divideNumber) );
            }
        }

        /*        // 메모리 14408   112
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (!(0 >= A || B >= 10))
            System.out.print(A + B);
        scanner.close();*/
        /*        // 메모리 14440 시간  112
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (0 < A && B < 10)
            System.out.print(A + B);
        scanner.close();*/
    }
}
