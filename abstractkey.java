
// abstract method is defined in abstract class
abstract class car{
    
    // public void drive()
    // {

    // }
    
    // declare drive() method
    public abstract void drive();

    public abstract void fly();


    public void playmusic()
    {
        System.out.println("playing music...");
    }

}

abstract class alto extends car
{
    public void drive()
    {
        System.out.println("driving alto...");
    }
}

class updatedalto extends alto
{
    public void fly()
    {
        System.out.println("flying...");
    }
}



public class abstractkey {
    public static void main(String[] args) {
        
        // cannot create abstract class object
        // car obj = new car();


        //using alto reference obj of car type
        car obj = new updatedalto();

        obj.drive();
        obj.playmusic();
        obj.fly();

        

    }
}
