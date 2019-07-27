import java.util.Scanner;
class Pascal{
  public static void main(String[] args) {
     System.out.print("dose arithmo seiron:");
     Scanner input=new Scanner(System.in);
     int seires=input.nextInt();
     for(int i=0; i<seires; i++){
       for(int j=0; j<seires-i; j++){
         System.out.print(" ");
       }
       int number=1;
       for (int k=0; k<=i ;k++) {
         System.out.print(number+" ");
         number = number * (i - k) / (k+ 1);
       }
        System.out.println();
     }
  }
}
