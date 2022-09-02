package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alex", "Match");
        teacher.printInfo();
        System.out.println("Преподаватель ведет предмет " + teacher.subjectName);
        System.out.println();
        Student student = new Student("Elena", "1CS");
        student.printInfo();
        System.out.println("Студент учится в группе " + student.groupName);
    }
}
class Human{
    String name;
    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }
    public void printInfo(){
        System.out.println("Этот человек с именем " + name);
    }
}
class Student extends Human {
String groupName;
    public Student(String name) {
        super(name);
    }

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Это студент с именем " + name);
    }
}
class Teacher extends Human{
    String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + name);

    }
}
