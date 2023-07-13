class Computer
{
    public void playMusic()
    {
        System.out.println("playing music...");
    }
    public String getMeAPen(int cost)
    {
        if(cost >=10) 
          return "pen";
        else 
          return "Nothing";
    } 
}

public class Demo1
 {
        public static void main (String a [])
        {
            Computer obj = new Computer();
            obj.playMusic();
            String str = obj.getMeAPen(5);
             System.out.println(str);
        }
 }