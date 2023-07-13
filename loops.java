class Loops
{
    public static void main (String a [])
    {
         int i = 1;
         //while (true)   //runs continuously
         while(i <= 4)
         {
            System.out.println("Hi  " + i);

            //nesting 
            int j = 1;
            while (j <= 3)
            {
                System.out.println("Jambo " + j);
                j++;
            }
            i++;
         }
          System.out.println("Holla  " + i);



          //do while loop
          int d = 5;
          do
          {
            System.out.println("Hey" + d);
            d++;
            //false condition but it returns a value
          }while(d <= 4);



          //for loop
          for(int e=1; e<=7; e++ )
          {
            System.out.println("Day " + e);

            for(int y=1; y<=9;y++)
            {
              System.out.println("   " + (y+8) + "  -  " + (y+9));
            }
          }

    }
}