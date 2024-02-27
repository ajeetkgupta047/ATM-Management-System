
import java.util.Scanner;

public class shortHandOpr {
    public static void main(String[] args) {
        // boolean b1=(5<6) ? true : false ;
        // System.out.println(b1);
        // int res=(2>8)? 2+8 : 2-8 ;
        // System.out.println(res);
        // Scanner sc = new Scanner(System.in);

        // // System.out.println("enter the no");
        // String word = sc.nextLine();

        // // boolean even =(num%2==0) ? true : false;
        // // System.out.println(" no is even " + even);
        // //

        // for (int i = 1; i <= 100; i++) {
        // System.out.println(word + i);

        // }
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        
         
        // for (int i = 2; i < num; i++) {
        //     if (num % i == 0) {
        //        return ;
            

        //     } else {
        //         System.out.println("no is prime");

        //     }
        // }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact= 1;
        
        for (int i =1;i<=num;i++){
            fact*=i;
            System.out.println(fact);

        }


    }
}