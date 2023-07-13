//Abstsract keyword
abstract class Car
{
   public abstract void drive();
   public abstract void fly();
  
   public void playMusic()
   {
        System.out.println("play music");
   } 
}
abstract class VW extends Car{
    public void drive()
    {
        System.out.println("Driving...");
    }
}
class UpdatedVW extends VW  //concrete class
{
    public void drive()
    {
        System.out.println("Driving...");
    }

    public void fly() 
    {
        System.out.println("Flying...");
    }
}
public class Demo10G 
{
   public static void main(String a[])
   {
   //Car obj = new Car();....cannot create object of an abstract class
    UpdatedVW obj = new UpdatedVW(); 
    obj.drive();
    obj.playMusic();

   }
}
