package Java101.Classes.StudentInformationSystem;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            System.out.println("Successfully Added To The Course " + this.name + " By " + teacher.name);
        } else {
            System.out.println(teacher.name + " Cannot Teach This Course.");
        }
    }

    void printTeacher() {
        if (teacher != null) {
            System.out.println("Instructor For The Course " + this.name + " : " + teacher.name);
        } else {
            System.out.println("No Instructor Assigned To The Course " + this.name + ".");
        }
    }

}