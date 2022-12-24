package enums;

public enum Status {

    TEACHER(1),
    SENIOR_STUDENT(2),
    JUNIOR_STUDENT(3);

    private int rank;
    Status(int rank){
        this.rank = rank;
    }
}
