package Java101.Classes.StudentInformationSystem;

public class Student {
    String name;
    String stuNo;
    int classes;
    double average;
    boolean isPass;

    Course course1;
    Course course2;
    Course course3;

    public Student(String name, String stuNo, int classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = calcAverage();
        this.isPass = false;
    }

    void addBulkExamNote(int matNote, int phyNote, int chemNote) {

        if (matNote >= 0 && matNote <= 100) {
            this.course1.note = matNote;
        }
        if (phyNote >= 0 && phyNote <= 100) {
            this.course2.note = phyNote;
        }
        if (chemNote >= 0 && chemNote <= 100) {
            this.course3.note = chemNote;
        }
    }

    void addVerbalNote(int matVerbalNote, int phyVerbalNote, int chemVerbalNote) {

        if (matVerbalNote >= 0 && matVerbalNote <= 100) {
            this.course1.verbalNote = matVerbalNote;
        }
        if (phyVerbalNote >= 0 && phyVerbalNote <= 100) {
            this.course2.verbalNote = phyVerbalNote;
        }
        if (chemVerbalNote >= 0 && chemVerbalNote <= 100) {
            this.course3.verbalNote = chemVerbalNote;
        }
    }

    double calcAverage() {
        double matNote = (this.course1.note * 0.80) + (this.course1.verbalNote * 0.20);
        double phyNote = (this.course2.note * 0.80) + (this.course2.verbalNote * 0.20);
        double chemNote = (this.course3.note * 0.80) + (this.course3.verbalNote * 0.20);
        return this.average = (matNote + phyNote + chemNote) / 3;
    }

    void isPass() {
        calcAverage();
        if (this.average >= 55) {
            System.out.println("You Passed The Class. Your Average : " + this.average);
            isPass = true;
        } else {
            System.out.println("You Failed The Class. Your Average : " + this.average);
            isPass = false;
        }
    }

    void printNote() {
        System.out.println("Student: " + this.name);
        System.out.println("Math Grade : " + this.course1.note + " && Math Verbal Grade : " + this.course1.verbalNote);
        System.out.println("Physics Grade: " + this.course2.note + " && Physics Verbal Grade : " + this.course2.verbalNote);
        System.out.println("Chemistry Grade: " + this.course3.note + " && Chemistry Verbal Grade : " + this.course3.verbalNote);
    }

}