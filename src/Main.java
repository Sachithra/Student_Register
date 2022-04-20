import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Student {

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
    }

    public static void main(String[] args) {
        ArrayList<Object> a = new ArrayList<Object>();
        Scanner scan = new Scanner(System.in);

        Student s = new Student();

        try {
            System.out.println("********PLEASE ENTER YOUR NAME*********");
            String nam = s.setName(scan.nextLine());


            if (nam.isEmpty()) {
                System.exit(0);
            } else {
                System.out.println(" This is the name: " + s.getName());
            }

            System.out.println("*********PLEASE ENTER YOUR AGE***********");
            int ag = s.setAge(scan.nextInt());


            if (ag < 10) {
                System.out.println("Age is not Valid");
            } else {
                System.out.println(" This is the age: " + s.getAge());

            }
            System.out.println("*********PLEASE ENTER YOUR GRADE***********");
            int grd = s.setGrade(scan.nextInt());

            if (grd > 13 || grd == 0) {
                System.out.println("grade is not valid");
            } else {

                System.out.println(" This is the Grade: " + s.getGrade());
            }

            //DISPLAY DETAILS AND PUT TO THE ARRAYLIST

            a.add(nam);
            a.add(ag);
            a.add(grd);

            for (Object i : a) {
                System.out.println(i);
            }

            s.DisplayInfo();


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}