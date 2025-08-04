import java.util.List;
import java.util.Map;

public class Elev {
    private String nume;
    private Map<String, List<Integer>> foaieMatricola;
    private List<String> profesori;

    public Elev(String nume, Map<String, List<Integer>> foaieMatricola, List<String> profesori) {
        this.nume = nume;
        this.foaieMatricola = foaieMatricola;
        this.profesori = profesori;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Map<String, List<Integer>> getFoaieMatricola() {
        return foaieMatricola;
    }

    public void setFoaieMatricola(Map<String, List<Integer>> foaieMatricola) {
        this.foaieMatricola = foaieMatricola;
    }

    public List<String> getProfesori() {
        return profesori;
    }

    public void setProfesori(List<String> profesori) {
        this.profesori = profesori;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "nume='" + nume + '\'' +
                ", foaieMatricola=" + foaieMatricola +
                ", profesori=" + profesori +
                '}';
    }
}
