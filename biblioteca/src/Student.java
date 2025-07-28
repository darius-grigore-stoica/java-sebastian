import java.util.List;

public class Student {
    private String name;

    private String CNP;

    private String clasa;

    private List<Integer> note;

    public Student(String name, String CNP, String clasa, List<Integer> note) {
        this.name = name;
        this.CNP = CNP;
        this.clasa = clasa;
        this.note = note;
    }

    public List<Integer> getNote(){
        return note;
    }

    @Override
    public String toString(){
        return "Name: " + name + " CNP: " + CNP + " CLASA: " + clasa;
    }
}