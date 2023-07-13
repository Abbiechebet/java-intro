class A 
{
    public void show()
    {
        System.out.println("In A show");
    }
    public void config()
    {
        System.out.println("In A config");
    }
}

class B extends A 
{
    //method overriding
    public void show()
    {
        System.out.println("In B show");
    } 
}

public class Demo10B 
{
      public static void main (String a[])
    {
         B obj = new B();
         obj.show();
         obj.config();
    }
}