
class Laptop
{
    String name;
    int price;

    public String toString()
    {
        return "toString method called";
    }

    public boolean isEqual(Laptop that)
    {
        if(this.name == that.name && this.price == that.price)
            return true;
        else
            return false;    
    }

    //using source action and genrating hashcode and equals methods

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        return true;
    }


}


public class objtostring 
{
    public static void main(String[] args) 
    {
        Laptop lap = new Laptop();
        System.out.println(lap);

        lap.name = "Lenovo";
        lap.price = 1000;

        Laptop lap2 = new Laptop();
        lap2.name = "Lenovo";
        lap2.price = 1000;
    
        System.out.println(lap.isEqual(lap2));
        
        boolean res = lap.equals(lap2);
        System.out.println(res);
    }    
}
