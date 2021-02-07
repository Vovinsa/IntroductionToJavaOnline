public class Student {

    private final String name;
    private final String age;

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Студент " +
                "имя:" + name +
                ", возраст: " + age + '\n';
    }
}
