//Enum class
enum Laptop
{
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);
     
      private int price;
      //default constructor
    private Laptop() 
    {
       price = 1500;
    }

    private Laptop(int price) {
        this.price = price;
          System.out.println("In Laptop " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }   
}

public class Demo11B1
{
     public static void main(String a[])
     {
        //   Laptop Lap = Laptop.Macbook;
        //   System.out.println(Lap +" : "+ Lap.getPrice());

        for(Laptop Lap : Laptop.values())
        {
            System.out.println(Lap +" : "+ Lap.getPrice());
        }
     }
}
