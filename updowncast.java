
class up{
    public void upclass()
    {
        System.out.println("in upper class");
    }
}

class down extends up
{
    public void downclass()
    {
        System.out.println("in down class");        
    }
}

public class updowncast 
{
    public static void main(String[] args) {
        up u1 = new up();

        u1.upclass();
        //u1.downclass(); --not works
        
        up u2 = new down();
        u2.upclass();
        //u2.downclass(); --not works

        // up u3 = (up) new down(); //up-casting
        // u3.upclass();

        down d1 = (down) u1; //down-casting uing obj of up class
        d1.downclass();
        d1.upclass();



        


        

    }    
}


