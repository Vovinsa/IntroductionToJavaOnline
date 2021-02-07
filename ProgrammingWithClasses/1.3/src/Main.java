import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[10];

        students[0] = new Student(1, "A", "AA");
        students[1] = new Student(1, "B", "BB");
        students[2] = new Student(1, "C", "CC");
        students[3] = new Student(2, "D", "DD");
        students[4] = new Student(2, "E", "EE");
        students[5] = new Student(2, "F", "FF");
        students[6] = new Student(3, "G", "GG");
        students[7] = new Student(3, "H", "HH");
        students[8] = new Student(3, "K", "KK");
        students[9] = new Student(3, "L", "LL");

        Random random = new Random();

        for (int i = 0; i < 10; ++i) {
            students[i].addGrade(random.nextInt(6) + 5);
            students[i].addGrade(random.nextInt(6) + 5);
        }

        System.out.println("все студенты: ");
        for (int i = 0; i < 10; i++) {
            students[i].print();
        }
        System.out.println("хорошие студенты: ");
        for (int i = 0; i < 10; i++) {
            if (students[i].isGood()) {
                students[i].print();
            }
        }


    }
}
