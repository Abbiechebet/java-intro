class Intro
{
    //public static void main(String a[])
    public static void main(String [] args)
    {
           System.out.println("Hello Abbie");
         int num1 = 3;
         int num2 = 3;
         int result= num1 + num2;
         System.out.println(result);

        //  int num = 89;
        //  byte by = 127;
        //  short sh = 558;
        //  long l = 5854l;

        //  float f = 4.9f;
        //  double d = 4.9;

        //  char ab = 'k';

        //  boolean bo= true;

         //literals
         int numa = 0b101;
             System.out.println(numa);
         int numb = 0x7E;
             System.out.println(numb);
         int numc = 10_00_00_000;
             System.out.println(numc);
         double numd = 12e10;
             System.out.println(numd); 
         char e = 'a';
         e++;
             System.out.println(e);
       

byte m = 127;
int n = m;
System.out.println(n); 

//type promotion
byte s1 = 20;
byte m2 = 30;
int result0 = s1 * m2;
System.out.println(result0);


//operatos
//increment and decrement
int m1 = 7;
System.out.println(m1);
int mA = m1 + 1;
System.out.println(mA);
m1 += 1;
System.out.println(m1);
++ m1;
System.out.println(m1);
m1++;
System.out.println(m1);



//Switch Case
         int z = 4;

         switch (z){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break; 
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;  
            case 6:
                System.out.println("Saturday");
                break;   
            case 7:
                System.out.println("Sunday");
                break;                    
         }

    }
}
