import java.util.Scanner;
public class problem1b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter water consumption in litres");
        double consumtion = sc.nextDouble();

        if(consumtion<=500){
            System.out.println("the bill is 100");
        }
        else{
            System.out.println("the bill is 200");
        }

        sc.close();

    }
    
}
