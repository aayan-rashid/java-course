
class counter 
{
    int count;
    
    // using synchronized keyword so that no 2 or more threads can call the method at same time
    public synchronized void increment()
    {
        count++;
    }
}

public class threadrace {
    public static void main(String[] args) throws InterruptedException {
        
        counter c = new counter();


        Runnable r1 = () ->
        {
            for(int i=1; i<=10000; i++)
            {
                c.increment();
            }
        };
        
        Runnable r2 = () ->
        {
            for(int i=1; i<=10000; i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();


        // using join method for waiting main() statement to execute further statements after t1 and t2 finished
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
