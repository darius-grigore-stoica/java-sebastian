import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String name = new String("Andrei");
        String CNP = new String("1234567890");
        String clasa = new String("12B");
        ArrayList<Integer> note = new ArrayList<Integer>();
        note.add(5);
        note.add(0, 10);

        Student s = new Student(name, CNP, clasa, note);

        System.out.println(s);
    }
}