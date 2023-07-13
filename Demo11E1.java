//Ducking exception using throws
class AB1 
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Calc12");
        // try
        // {
        //     Class.forName("Demo11E1");
        // }
        // catch(ClassNotFoundException e)
        // {
        //     System.out.println("Not able to find the class");
        // }
    }
}

public class Demo11E1 
{
    static
    {
        System.out.println("Class Loaded");
    }
    public static void main(String a[])
    {
        AB1 obj = new AB1();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
