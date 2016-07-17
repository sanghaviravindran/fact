public class Factorial {
     public static void main(String args[]){
         int num,fact1=1;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         num=sc.nextInt();
         for(int i=1;i<=num;i++)
         {
             fact1=fact1*i;
             
         }
         System.out.println("Factorial of"+n+"is"+fact1);
     }
}