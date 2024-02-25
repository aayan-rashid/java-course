
enum status
{
    running, failed, pending, success, restart;
}

enum laptop
{
    macbook(2000),hp, asus(800), lenovo(1000), dell(1200);
    
    // setting default price values in case price not specified
    private laptop()
    {
        price = 1100;
    }

    
    private int price;
    private laptop(int price)
    {
        this.price = price;
    }

    // getters and setters
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}



public interface enumeration {
    public static void main(String[] args) {

        status st = status.running;

        System.out.println(st);
        System.out.println(st.ordinal());

        // selecting all values of enum to a reference varaiable
        status[] s = status.values();
        for(int i = 0; i<5; i++)
        {
            System.out.println(s[i]);
        }

        System.out.println();

        // enhanced for loop to print all values of status
        for(status ss: s)
        {
            System.out.println(ss + " : " + ss.ordinal());
        }    
        
        // using if-else to check condition
        System.out.println();

        if(st == status.running)
        {
            System.out.println("running status...");
        }
        else
        {
            System.out.println("not running currently!");
        }


        // for s object array type compare using array index
        if(s[0] == status.pending)
        {
            System.out.println("still pending");
        }
        else
        {
            System.out.println("not pending!");
        }


        // using switch case to compare status

        status stat = status.failed;

        switch(stat)
        {
            case running:
                System.out.println("running case..");
                break;
            
            case failed:
                System.out.println("failed case!");
                break;
            
            case pending:
                System.out.println("pending case");    
                break;

            case success:
                System.out.println("success case!");    
                break;

            case restart:
                System.out.println("restart case!");
                break;

            default:
                System.out.println("not a valid case!");    

        }



        // converting status enum values to string and then using string methods
        String str = st.toString();
        System.out.println(str.length());


        laptop lap = laptop.lenovo;

        System.out.println(lap.getPrice());
        lap.setPrice(1500);
        System.out.println(lap.getPrice());


        laptop[] lappy = laptop.values();

        for( laptop i: lappy)
        {
            System.out.println(i + " : " + i.getPrice());
        }

    }
}
