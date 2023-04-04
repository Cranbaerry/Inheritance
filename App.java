package quiz02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Select class [Person, Dosen, Mahasiswa] ");
        String input = scanner.nextLine();

        switch(input) {
            case "Mahasiswa":
                Mahasiswa mahasiswa;
                System.out.println("Input name, born date, student id");
                mahasiswa = new Mahasiswa(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
                mahasiswa.helpingDosen();
                mahasiswa.printAttributes();     
                break;

            case "Dosen":
                Dosen dosen;
                System.out.println("Input name, born date, kode dosen");
                dosen = new Dosen(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
                dosen.selfDev();
                dosen.teach();
                dosen.p2m();
                dosen.research();
                dosen.otherWorks();
                dosen.printAttributes();
                break;

            default:
            case "Person":
                Person person;
                System.out.println("Input name, born date");
                person = new Person(scanner.nextLine(), scanner.nextLine());
                person.sleep();
                person.printAttributes();
                break;
        }

        scanner.close();
    }
}
