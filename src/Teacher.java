public class Teacher extends LibraryUser {
    private String teacherId;

    public Teacher(String teacherId, String name, int age){
        super(name, age);
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}
