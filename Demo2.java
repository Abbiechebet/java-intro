public class Demo2
{
    public static void main(String a[])
    {
        int nums[] = {3,7,4,5};
        System.out.println(nums[3]);

        int nums1[] = new int[4];
        nums1[0] = 9;
        nums1[1] = 6;
        nums1[2] = 2;
        nums1[3] = 1; 

        for (int i=0; i<4; i++)
        {
        System.out.println(nums1[i]);
        }
        


        int nums2 [][] = new int [3][4];
        for(int j=0; j<3; j++)
        {
            for(int k=0; k<4; k++)
            {
                //type casting
                nums2[j][k] =   (int)(Math.random() * 10);
                //System.out.println(nums2[j][k]);
            }
        }

        for(int j=0; j<3; j++)
        {
            for(int k=0; k<4; k++)
            {
                System.out.print(nums2[j][k] + " ");
            }
            System.out.println();
        } 
        // //enhanced for loop
        // for(int n[] : nums2)
        // {
        //     for(int m:n)
        //     {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }



        int nums3 [][] = new int [3][]; //jagged array

        nums3[0] =new int[3];
        nums3[1] =new int[4];
        nums3[2] =new int[2];

        for(int b=0; b<nums3.length; b++)
        {
            for(int c=0; c<nums3[b].length; c++)
            {
                //type casting
                nums3[b][c] =   (int)(Math.random() * 10);
                //System.out.println(nums2[j][k]);
            }
        }

        for(int n[] : nums3)
        {
            for(int m:n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }





         int nums4 [][][] = new int [3][5][4]; //3D array

        for(int d=0; d<nums4.length; d++)
        {
            for(int e=0; e<nums4.length; e++)
            {
                    for(int f=0; f<nums4.length; f++)
                {
                nums4[d][e][f] =   (int)(Math.random() * 10);
               }
            }
        }

// for (int[][] array2D : nums4) {
//     for (int[] array1D : array2D) {
//         for (int num : array1D) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
// }




        for(int n1[][]: nums4)
        {
            for(int[] p1:n1)
            {
                   for(int m1:p1)
                {
                System.out.print(m1 + " ");
                }
            }
          
            System.out.println();
        }
    }
}