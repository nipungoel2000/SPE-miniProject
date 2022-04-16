/*Author : NIPUN GOEL
Date : 13 April 2022 */
package Calculator;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

   private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int flag=0;
        double num, exp;
        System.out.println("Calculator Program");
        while(flag==0)
        {
            System.out.println(" ");
            System.out.println("Choose one from the following Operations:");
           logger.info("A user entered !");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.print("Enter your choice(number): ");
            int op;
            op = reader.nextInt();
            if(op==1)
            {
                System.out.println("You choose Square Root!!");
                System.out.print("Enter number: ");
                num = reader.nextDouble();
                squareRoot(num);
            }
            else if(op==2)
            {
                int numm;
                System.out.println("You choose Factorial!!");
                System.out.print("Enter number: ");
                numm = reader.nextInt();
                factorial(numm);
            }
            else if(op==3)
            {
                System.out.println("You choose Natural Log!!");
                System.out.print("Enter number: ");
                num = reader.nextDouble();
                naturalLog(num);
            }
            else if(op==4)
            {
                System.out.println("You choose Power!!");
                System.out.print("Enter number: ");
                num = reader.nextDouble();
                System.out.print("Enter exponent: ");
                exp = reader.nextDouble();
                power(num,exp);
            }
            else if(op==5)
            {
                flag = 1;
            }
            else
            {
                System.out.println("Please Enter Valid Number(1 to 5 only)!");
            }
        }
    }

    public static double squareRoot(double num){
        double c = Math.sqrt(num);
       logger.info("Square root of "+num+" = "+c);
        System.out.println("The Result is "+c);
        return c;
    }

    public static int factorial(int num){
        int c = 1 ;
        for(int i=1; i<=num; i++) c = c*i;
       logger.info("Factorial of "+num);
       logger.info("!"+num+" = "+c);
        System.out.println("The Result is "+c);
        return c;
    }
    public static double naturalLog(double num){
        double c = Math.log(num);
       logger.info("Natural logarithm of"+num);
       logger.info("log("+num+") = "+c	);
        System.out.println("The Result is "+ c);
        return c;
    }
    public static double power(double num, double exp){
        double c = Math.pow(num,exp);
       logger.info(num+" powers "+exp);
       logger.info(num+"^"+exp+" = "+c);
        System.out.println("The Result is "+ c);
        return c;
    }
}
