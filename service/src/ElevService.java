import java.util.List;
import java.util.Map;

public class ElevService {
    private ElevRepository elevRepository;

    public ElevService() {
        this.elevRepository = new ElevRepository();
    }

    public void save(String nume, Map<String, List<Integer>> foaieMatricola, List<String> profesori){
        System.out.println("Se formeaza elevul cu numele=" + nume);

        Elev elev = new Elev(nume, foaieMatricola, profesori);
        System.out.println("Se trimit datele catre repository");

        elevRepository.save(elev);
    }

    public List<Elev> findAll(){
        return elevRepository.findAll();
    }
}
