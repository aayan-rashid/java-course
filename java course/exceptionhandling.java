
// custom exception class extending super class Exception

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException extends Exception
{
    public MyException(String str)
    {
        super(str);
        //System.out.println(str);
    }
}

class four extends five
{
    
}

class five
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("javacourse");
        System.out.println("class name not found!");
    }

}


public class exceptionhandling {
    public static void main(String[] args) throws IOException {

        int i = 2;
        int j = 0;

        j = 18/i;
        System.out.println("value of j : " + j);

        int k = 0;

        // stops execution after this statement of all further parts of program as division by 0 not possible
        // ArithmeticException thrown
        // j = 18/k;
        // System.out.println("new value of j : " + j);


        // try-catch block to fix this
        // try block always executes
        try
        {
            j = 18/k;
        }

        // exception class with object e in catch block
        // only executed when try block faces exception or error
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
            System.out.println("still value of j : " + j);
        }

        System.out.println("final value of j : " + j);

        int m = 2;
        int n = 0;

        System.out.println();

        System.out.println("old value of n : " + n);

        try 
        {
            n = 10/m;
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
            System.out.println("still value of n : " + n);
        }

        System.out.println("final value of n : " + n);

        System.out.println();


        int[] arr = new int[5];

        try 
        {
            String str = null;
            System.out.println(str.length());
            
            // array index out of bounds error
            System.out.println(arr[10]);

            // arithmetic exception not executed as 
            //when array index exception encountered the try block exits and catch block executes            
            int p = 15/0;
            System.out.println(p);

            // for this create different catch blocks for different types of exceptions
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception occured : " + e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception occured : " + e);
        }
        // general other exception handling catch block
        // must be on the lowest level of catch blocks as it handles all exceptions
        catch(Exception e)
        {
            System.out.println("Genreal exception occured : " + e);
        }
        

        System.out.println();



        int a = 10;
        int b = 0;

        // custom exceptions


        // throw keyword
        try
        {
            b = 16/a;
            System.out.println("b : " + b);
            
            if(b == 0)
            {
                // throw used for ArithmeicException object e with custom message 
                throw new ArithmeticException("value must be greater than 0!");
            }

            if(b == 1)
            {
                throw new MyException("value must be greater than 1!");
            }
        }
        catch(MyException e)
        {
            System.out.println(e);
            b = 0;
            System.out.println("default value of b : " + b);
        }
        catch(ArithmeticException e)
        {
            b = 16;
            System.out.println(e);
            System.out.println("default value of b : " + b );
        }
        System.out.println();

        // using throws from class
        five obj = new five();
        
        try
        {
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class name not available!... " + e);
        }

        four objFour = new four();

        try
        {
            objFour.show();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class name not available!... " + e);
        }

        //using bufferedReader with finally block

        int x = 0;
        int y = 0;
        int num;
        BufferedReader bf = null;
        try
        {
            System.out.println("enter number 1 : ");
            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);
            num = Integer.parseInt(bf.readLine());

            System.out.println("enter number 2 to get it's ASCII value : ");
            int num2 = bf.read();
            System.out.println("num 1 : " + num);

            //gives ASCII values
            System.out.println("num 2 ASCII value: " + num2);

            // exception arises
            y = 10/x;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            // clsoing bufferedReader object
            bf.close();
            System.out.println("BufferedReader closed");
        }
    }
}
