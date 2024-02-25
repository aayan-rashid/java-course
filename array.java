
class student
{
    String name;
    int marks;
    int roll;
}


public class array 
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4};
        arr[0] = 100;
        arr[1] = 101;

        System.out.print("[");
        for(int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            if (i<arr.length-1) 
            {
                System.out.print(", ");    
            }
        }
        System.out.print("]");

        System.out.println();

        int nums[][] = new int[3][4];

        int rand = 0;
        for(int p=0; p<3; p++)
        {
            for(int q=0; q<4; q++)
            {
                rand = (int)(Math.random() * 100);
                nums[p][q] = rand;
                System.out.print(nums[p][q]);
                if(q!=3)
                    System.out.print(", ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(int i = 0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                if(j!=3){
                    System.out.print(nums[i][j] + ", ");
                }
                else{
                    System.out.println(nums[i][j]);
                }
            }
        }


        //jagged-array

        int arr1[][] = new int[3][];

        System.out.println(arr.length);

        arr1[0] = new int[2];
        arr1[1] = new int[4];
        arr1[2] = new int[3];

        for (int i=0; i<arr1.length; i++)
        {
            for (int j=0; j<arr1[i].length; j++)
            {
                arr1[i][j] = (int)(Math.random() * 100);
                if(j!=arr1[i].length-1)
                {
                    System.out.print(arr1[i][j] + ", ");
                }
                else
                {
                    System.out.print(arr1[i][j]);
                    System.out.println();
                }  
            }
        }

        
        //array of objects

        student s1 = new student();
        s1.name = "a";
        s1.roll = 1;
        s1.marks = 90;

        student s2 = new student();
        s2.name = "b";
        s2.roll = 2;
        s2.marks = 80;

        student s3 = new student();
        s3.name = "c";
        s3.roll = 3;
        s3.marks = 70;

        student stud[] = new student[3];

        stud[0]=s1;
        stud[1]=s2;
        stud[2]=s3;
        
        for (int i=0; i<stud.length; i++)
        {
            System.out.println(stud[i].name + ": " + stud[i].marks);
        }


        //enhanced for-loop

        int ar[] = new int[3];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;

        for (int n : ar)
        {
            System.out.println(n);
        }

        for (student s : stud)
        {
            System.out.println(s.name + " : " + s.marks);
        }

    }   


    
}
