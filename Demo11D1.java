//Lambda expression
@FunctionalInterface
interface A3
{
    //void show(int i);
    int add(int i, int j);
}

public class Demo11D1
{
    public static void main(String a[])
    {
        A3 obj = (i,j) -> i + j;
                //System.out.println("Functional interface with anonymous inner class and lambda expression "+ i);
            int result = obj.add( 45, 60); 
            System.out.println(result);
      
    }
}