class stu{
    int roll;
    String name;
    int marks;
}




public class arrobj {
    public static void main(String[] args) {
   stu s1=new stu();
   s1.roll=1;
   s1.name="rohan";
   s1.marks=69;
   
   
   stu s2=new stu();
   s2.roll=2;
   s2.name="harish";
   s2.marks=96;
   
   stu s3=new stu();
   s3.roll=3;
   s3.name="harshit";
   s3.marks=99;
  System.out.println(s1.name+ " : "+ s1.marks);
   
   stu student[]=new stu[3];
    
   student[0]=s1;
   student[1]=s2;
   student[2]=s3;
//     for(int i=0;i<student.length;i++){
//    System.out.println();
//     }
   
        //    int arr[]=new int[9];
    //    arr[0]=4;
    //    arr[1]=8;
    //    arr[2]=9;
    //    arr[3]=5;
    //    for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]);
       }
       


    }

