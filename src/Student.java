public class Student extends LibraryUser {
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Student(String level, String name, int age) {
        super(name, age);
        this.level = level;


    }
}
