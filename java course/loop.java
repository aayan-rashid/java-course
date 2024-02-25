class loop
{
    public static void main(String args[])
    {
        //if-else loop

        int x = 5;

        if(x>3)
        {
            System.out.println("yes");
        }

        if(true)
        {
            System.out.println("yes");
        }

        if(x>10)
        {
            System.out.println("no");
        }
        
        if(x>10 && x<20)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

        int y = 9;

        if(x>y)
            System.out.println(x);
        else
            System.out.println(y);

        int z = 10;

        if(x>y && x>z)
        {
            System.out.println(x);
        }        
        else if(y>z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }

        int a = 5;
        String result = a%2==0 ? "even":"odd";
        System.out.println(result);



        //switch case

        int n = 9;

        switch(n)
        {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);    
                break;
            case 3:
                System.out.println(3);    
                break;
            case 4:
                System.out.println(4);     
                break;
            case 5:
                System.out.println(5);     
                break;
            default:
                System.out.println("invalid");     
        }

        String day = "Monday";
        String rez = "";

        switch(day)
        {
            case "Saturday","Sunday" -> System.out.println("holiday");
            case "Monday" -> rez = "Shit!";
            default -> System.out.println("7 A.M");    
        }
        System.out.println(rez);
         



        // while-loop        

        int i = 1;

        while(i<=10)
        {
            System.out.println("i = " + i);
            int j = 1;
            while (j<=3)
            {
                System.out.println("j = " + j);    
                j++;
            }
            i++; 
        }



        // do-while loop

        int p = 3;
        do
        {
            System.out.println("hello");
        }while(p>5);



        // for-loop

        for(int k = 1; k<=5; k++)
        {
            System.out.println("for working : " + k);
        }
        
            
    }
}