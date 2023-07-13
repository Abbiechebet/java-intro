class A
{
    public A()
    {
          System.out.println("Object created");
    }
    public void show()
    {
        System.out.println("In A show");
    }
}

public class Demo9 
{
    public static void main(String a[])
    {
        //reference object 
        A obj = new A(); 
        obj.show();

        //unonymous object
        new A();
        new A().show();
    }
}
