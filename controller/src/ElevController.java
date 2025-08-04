import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElevController {

    private ElevService service;

    public ElevController() {
        this.service = new ElevService();
    }

    public void saveElev(){
        Map<String, List<Integer>> foaieMatricola = new HashMap<>();

        List<Integer> note = new ArrayList<>();
        note.add(10);
        note.add(6);

        List<Integer> noteMate = new ArrayList<>();
        noteMate.add(5);

        foaieMatricola.put("Franceza", note);
        foaieMatricola.put("Matematica", noteMate);

        List<String> profesori = new ArrayList<>();
        profesori.add("A. Goga");
        profesori.add("M. Popescu");
        System.out.println("Se trimit datele catre service");
        service.save("Mihai", foaieMatricola, profesori);
    }

    public void findAllElevi(){
        List<Elev> elevi = service.findAll();

        for(Elev e : elevi){
            System.out.println(e);
        }
    }
}
