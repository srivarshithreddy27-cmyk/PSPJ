import java.util.Scanner;
public class student {

    String studentName;
    int rollNumber;
    double marks;
    String courseName;
    int courseCredits;

    student(String studentName,int rollNumber,double marks,String courseName,int courseCredits){
        this.studentName=studentName;
        this.rollNumber=rollNumber;
        this.marks=marks;
        this.courseName=courseName;
        this.courseCredits=courseCredits;

    }

    public double calculateFee(){
        return courseCredits*1500;

    }

        public boolean checkEligibility(){
            if(marks>=50){
                return true;
            }

            else{
                return false;
            }
        }

        public double calculateScholarship(){
            double totalFee=calculateFee();
            if(marks>=85){
                return totalFee*0.20;

            }
            else if(marks>=70 && marks<=84){
                return totalFee*0.10;

            }
            else{
                return totalFee*0.0;
            }
        }

        public double calculateFinalFee(){
            return calculateFee()-calculateScholarship();

        }

        public void displayDetails(){
            System.out.println("student name:" + studentName);
            System.out.println("roll number:" + rollNumber);
            System.out.println("marks:" + marks);
            System.out.println("course name:" + courseName);
            System.out.println("course credits:" + courseCredits);
            System.out.println("eligibility status: eligible");
            System.out.println("total fee:" + calculateFee());
            System.out.println("scholarship:"  +calculateScholarship());
            System.out.println("final fee to pay:" + calculateFinalFee());

        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("enter student name");
            String name=sc.nextLine();

            System.out.println("enter roll number");
            int rollnumber=sc.nextInt();

            System.out.println("enter marks");
            double studentmarks=sc.nextDouble();
            sc.nextLine();

            System.out.println("enter course name");
            String coursename=sc.nextLine();


            System.out.println("enter course credits");
            int credits=sc.nextInt();

            student s= new student(name, rollnumber, studentmarks, coursename, credits);

            if(s.checkEligibility()){
                s.displayDetails();

            }
            else{
                System.out.println("student is not eligible ");
            }

            sc.close();
        }
}
