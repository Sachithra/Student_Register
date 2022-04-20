import java.awt.font.FontRenderContext;
import java.util.HashMap;

public  class Student {
    private String name;
    private int grade;
    private int age;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int setGrade(int grade) {
        this.grade = grade;
        return grade;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }
    public void DisplayInfo(){
        for (int i=1;i<2;i++){
            System.out.println("REGISTER COMPLETED"+"YOUR CODE IS:"+i);
        }

    }

}
