// class name extends Thread super-class
// class which extends Thread must have run() method

class first extends Thread
{
    public void show()
    {
        for(int i=1; i<=100; i++){    
            System.out.println(i + " : in A");
        }    
        try 
        {
            Thread.sleep(10);    
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        finally
        {

        }
        
    }
    public void run()
    {
        for(int i=1; i<=100; i++){    
            System.out.println(i + " : in A");

            // try-catch block for putting a sleep/wait time for next operation to get executed
            try 
            {
                Thread.sleep(10);    
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            finally
            {

            }
        }    
    }
}

class second extends Thread
{
    public void show()
    {
        for(int i=1; i<=100; i++){
            System.out.println(i + " : in B");
        }    
    }

    public void run()
    {
        for(int i=1; i<=100; i++){    
            System.out.println(i + " : in B");

            // try-catch block for putting a sleep/wait time for next operation to get executed
            try 
            {
                Thread.sleep(10);    
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            finally
            {

            }
        }    
    }
}


class third implements Runnable
{
    public void run()
    {
        for(int i = 1; i<=100; i++)
        {
            System.out.println(i + " : third");
        }
    }
}

class four implements Runnable
{
    public void run()
    {
        for(int i = 1; i<=100; i++)
        {
            System.out.println(i + " : fourth");
        }
    }
}


public class threads {
    public static void main(String[] args) {
        
        first obj1 = new first();
        second obj2 = new second();
        
        //native approach not runs thread
        obj1.show();
        obj2.show();

        System.out.println();

        //call run() method of object class using start() method of thread super-class to execute threading
        obj1.start();
        obj2.start();

        System.out.println();
        
        // getting prioroty of objects
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        // setting 2nd object priority higher to 1
        obj1.setPriority(1);
        obj2.setPriority(Thread.MIN_PRIORITY);

        obj1.start();
        
        // starting obj2.start() method after 10ms sleep time
        try
        {
            Thread.sleep(10);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }    
        finally
        {
            
        }
        obj2.start();


        // using normal objects can not call run() of thread class
        third objThird = new third();
        four objFour = new four();

        // runnable type object of class third and fourth    
        Runnable r3 = new third();
        Runnable r4 = new four();

        // creating thread objects and passing runnable type arguments r3 , r4
        Thread t1 = new Thread(r3);
        Thread t2 = new Thread(r4);

        // starting t1 & t2    
        t1.start();
        t2.start();


        // // waiting for t1 and t2 to get finished
        // try {
        //     Thread.sleep(20);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // try {
        //     Thread.sleep(30);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // using lambda for runnable object as runnable is functional interface
        Runnable r5 = () ->
        {
            for (int i=1; i<=100; i++)      
            {
                System.out.println(i + " : five");
            }
        };

        Runnable r6 = () ->
        {
            for (int i=1; i<=100; i++)
            {
                System.out.println(i + " : six");
            }
        };

        Thread t3 = new Thread(r5);
        Thread t4 = new Thread(r6);

        t3.start();
        t4.start();

        
    }
}
