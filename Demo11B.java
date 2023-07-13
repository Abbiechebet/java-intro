//enum
//enum if and switch
enum Status
{
    Running, Failed, Pending, Success;
}

public class Demo11B 
{
    public static void main(String a[])
    {
        Status [] ss = Status.values();
        System.out.println(ss[0]);

        //enhanced for loop
        for(Status s:ss)
        {
            System.out.println(s +" : "+ s.ordinal());
        }

        Status s = Status.Success;
        System.out.println(s.getClass().getSuperclass());

        if(s ==  Status.Running)
        System.out.println("All Good");
        else if(s ==  Status.Failed)
        System.out.println("Try Again");
        else if(s ==  Status.Pending)
        System.out.println("Please Wait");
        else
        System.out.println("Done");

        switch(s)
        {
            case Running:
                 System.out.println("All Good");
                 break;

            case Failed:
                 System.out.println("Try Again");
                 break;
                 
            case Pending:
                 System.out.println("Please Wait");
                 break;
                 
            //case Success:
            default:
                 System.out.println("Done");
                 break;     
        }

    }
}
