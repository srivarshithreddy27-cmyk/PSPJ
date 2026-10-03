import java.util.Scanner;
public class problem1c {

    static int calculatetotal(int morningusage , int eveningusage){
        return morningusage+eveningusage;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter morning usage");
        int morningusage = sc.nextInt();

        System.out.println("enter evening usage");
        int eveningusage = sc.nextInt();

        int total=calculatetotal(morningusage,eveningusage);
        System.out.println("total water consumption: "+total);

        sc.close();
    }
  }
    

