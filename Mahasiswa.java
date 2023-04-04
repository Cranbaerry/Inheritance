package quiz02;

public class Mahasiswa extends Person {
    int studentId, point;

    Mahasiswa(String name, String bornDate, int studentId) {
        super(name, bornDate);
        this.studentId = studentId;
        this.point = 0;
    }

    void helpingDosen() {
        System.out.println(studentId + " is helping dosen, added +10 point");
        this.point += 10;
    }

    @Override
    void printAttributes() {
        super.printAttributes();
        System.out.println("Student id: " + studentId);
        System.out.println("Point: " + point);
    }
}
