public class Student {

    private final String name;
    private final String initials;
    private final int group;
    int[] grades = new int[5];
    int nGrades = 0;

    public Student(int group, String name, String initials) {
        this.group = group;
        this.name = name;
        this.initials = initials;
    }

    void addGrade(int grade) {
        grades[nGrades] = grade;
        nGrades++;
    }

    boolean isGood() {
        for (int i = 0; i < nGrades; i++) {
            if (grades[i] != 9 && grades[i] != 10) {
                return false;
            }
        }
        return true;
    }

    void print() {
        System.out.println(name + " " + initials);
        System.out.print("Group: " + group + ". Grades: ");
        for (int i = 0; i < nGrades; ++i) {
            System.out.print(grades[i] + " ");
            System.out.print("\n");
        }
    }

}
