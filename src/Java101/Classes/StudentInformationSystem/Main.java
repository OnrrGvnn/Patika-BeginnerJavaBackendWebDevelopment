package Java101.Classes.StudentInformationSystem;

public class Main {
    public static void main(String[] args) {

        Course math = new Course("Mathematics", "Mat101", "MAT");
        Course physic = new Course("Physics", "Phy101", "PHY");
        Course chem = new Course("Chemistry", "Chem101", "CHEM");

        Teacher t1 = new Teacher("Onch", "905500000000", "MAT");
        Teacher t2 = new Teacher("Alpi", "905500000001", "PHY");
        Teacher t3 = new Teacher("Yeto", "905500000002", "CHEM");

        System.out.println();

        math.addTeacher(t1);
        physic.addTeacher(t2);
        chem.addTeacher(t3);

        System.out.println("===============================================================");

        math.printTeacher();
        physic.printTeacher();
        chem.printTeacher();

        System.out.println("===============================================================");

        Student s1 = new Student("Efe", "1", 4, math, physic, chem);
        s1.addBulkExamNote(100, 50, 90);
        s1.addVerbalNote(100, 50, 60);

        s1.printNote();

        System.out.println("===============================================================");

        s1.isPass();

    }
}