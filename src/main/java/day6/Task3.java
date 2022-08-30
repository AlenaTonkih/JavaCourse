package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alex", "Math");
        Student student = new Student("Elena");

        teacher.evaluate(student);

    }
}
class Teacher{
    private String teachersName;
    private String lesson;
    public Teacher(String teachersName, String lesson) {
        this.teachersName = teachersName;
        this.lesson = lesson;
    }
    public String getTeachersName() {
        return teachersName;
    }

    public void setTeachersName(String teachersName) {
        this.teachersName = teachersName;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void evaluate(Student student){ //Приняли в кач-ве аргумента метода класс
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;

        if(randomValue == 2){
            System.out.println("Преподаватель " + this.teachersName + " оценил студента с именем " + student.getStudentsName() +
                    " по предмету " + lesson + " на оценку неудовлетворительно");
        } else if (randomValue == 3) {
            System.out.println("Преподаватель " + this.teachersName + " оценил студента с именем " + student.getStudentsName() +
                    " по предмету " + lesson + " на оценку удовлетворительно");
        } else if (randomValue == 4) {
            System.out.println("Преподаватель " + this.teachersName + " оценил студента с именем " + student.getStudentsName() +
                    " по предмету " + lesson + " на оценку хорошо");
        }else{
            System.out.println("Преподаватель " + this.teachersName + " оценил студента с именем " + student.getStudentsName() +
                    " по предмету " + lesson + " на оценку отлично");
        }
    }
}
class Student{
    private String studentsName;
    public Student(String studentsName) {
        this.studentsName = studentsName;
    }

    public String getStudentsName() {
        return studentsName;
    }

    public void setStudentsName(String studentsName) {
        this.studentsName = studentsName;
    }
}

