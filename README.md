# Java Quiz App

This Java program allows the user to create objects of different classes, namely `Person`, `Mahasiswa` (Indonesian for student), and `Dosen` (Indonesian for lecturer), and perform certain actions based on the class.

## Installation

1. Download the source code.
2. Compile the program using `javac App.java`.
3. Run the program using `java App`.

## Usage

1. Upon running the program, the user will be prompted to select a class to create an object from.
2. Depending on the selected class, the user will be prompted to input certain attributes of the object.
3. The program will then perform certain actions based on the selected class, such as printing information about the object and calling certain methods.

## Classes

### Person

The `Person` class represents a generic person, with attributes such as `name` and `bornDate`. It has the following methods:

- `sleep()`: Prints a message indicating that the person is sleeping.
- `printAttributes()`: Prints the person's name and born date.

### Mahasiswa

The `Mahasiswa` class represents a student, and extends the `Person` class. In addition to the attributes inherited from `Person`, it has the `studentId` and `point` attributes, and the following methods:

- `helpingDosen()`: Prints a message indicating that the student is helping a lecturer, and adds 10 to the `point` attribute.
- `printAttributes()`: Prints the student's name, born date, student ID, and point.

### Dosen

The `Dosen` class represents a lecturer, and extends the `Person` class. In addition to the attributes inherited from `Person`, it has the `kodeDosen` attribute, and the following methods:

- `selfDev()`: Prints a message indicating that the lecturer is self-developing.
- `teach()`: Prints a message indicating that the lecturer is teaching.
- `p2m()`: Prints a message indicating that the lecturer is doing p2m.
- `research()`: Prints a message indicating that the lecturer is doing research.
- `otherWorks()`: Prints a message indicating that the lecturer is doing other works.
- `printAttributes()`: Prints the lecturer's name, born date, and kode dosen.

and so on
