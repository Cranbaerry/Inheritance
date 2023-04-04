package quiz02;

public class Dosen extends Person {
    String kodeDosen;

    Dosen(String name, String bornDate, String kodeDosen) {
        super(name, bornDate);
        this.kodeDosen = kodeDosen;
    }

    void selfDev() {
        System.out.println(name + " is self developing");
    }

    void teach() {
        System.out.println(name + " is teaching");
    }

    void p2m() {
        System.out.println(name + " is doing p2m");
    }

    void research() {
        System.out.println(name + " is doing research");
    }

    void otherWorks() {
        System.out.println(name + " is doing other works");
    }
    
    @Override
    void printAttributes() {
        super.printAttributes();
        System.out.println("Kode dosen: " + kodeDosen);
    }
}
