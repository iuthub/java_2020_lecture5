package community;

public class Student extends CommunityMember {
    private int level;
    private String course;
    private int[] marks;
    private String studentID;

    public Student(String fullName, int level, String course, String studentID) {
        super(fullName);
        this.level = level;
        this.course = course;
        this.studentID = studentID;
    }

    public String getStudentID() {
        return  this.studentID;
    }

    @Override
    public boolean equals(Object obj) {
        Student s2 = (Student) obj;
        return this.getStudentID() == s2.getStudentID();
    }

    @Override
    public String getNameTag() {
        String name = super.getNameTag() + ": ";
        name += String.format("Level %d of %s", level, course);
        return name;
    }

    @Override
    public String greet() {
        return "Good morning!";
    }

}
