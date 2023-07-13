//custom exception
class MyException extends Exception //or extends runtime exception 
{
    public MyException(String string)
    {
        super (string);
    }
}

public class Demo11E 
{
   public static void main(String a[])
   {
    int i = 20;
    int j = 0;
    int nums[] = new int [5];
    //String str = null;
    try 
    {
        j = 18/i;
        if (j == 0)
           //throw new ArithmeticException("I don't want to print zero");
           throw new MyException("I don't want to print zero");
        //System.out.println(str.length());
        System.out.println(nums[1]);
        System.out.println(nums[5]);
    } 
    //catch (ArithmeticException e) 
    catch (MyException e) 
    {
        j = 18/1;
        System.out.println("that's the default output " + e);
    }
    catch (ArrayIndexOutOfBoundsException e) 
    {
        System.out.println("Stay in your limit... ");
    }
     catch (Exception e) 
    {
        System.out.println("Something went wrong... " + e);
    }

      System.out.println("Holla");
      System.out.println(j);
   }
}