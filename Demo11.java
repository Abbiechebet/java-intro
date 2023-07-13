interface A
{ 
    // variables in interface are final and static
    int age = 45;
    String area = "Nairobi";

    void show();
    void config();
}

interface X
{
    void run();
}

interface Y extends X
{

}

class B implements A,Y
{
    public void show() 
    {
        System.out.println("B implements show");
    }

    public void config() 
    {
        System.out.println("B implements config");
    }
    public void run() 
    {
        System.out.println("B implements run");
    }
    
}
public class Demo11 
{
   public static void main(String a[])
   {
      A obj;
      obj = new B();
      obj.show();
      obj.config();

      X obj1;
      obj1 = new B();
      obj1.run();
   }
}
