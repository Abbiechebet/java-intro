 
interface Computer
{
    void code();
} 

 class Laptop implements Computer
 {
    public void code() 
    {
        System.out.println("Code, compile, run...");
    }
 }

  class Desktop implements Computer
 {
    public void code() 
    {
        System.out.println("Code, compile, run:faster...");
    }
 }


class Developer
{
    public void devApp(Computer Lap) 
    {
        //System.out.println("Coding...");
        Lap.code();
    }
}

public class Demo11A 
{
    public static void main(String a[])
    {
        Computer Lap = new Laptop();
        Computer desk = new Desktop();

        Developer abbie = new Developer();
        abbie.devApp(Lap);;
        abbie.devApp(desk);

    }
}
