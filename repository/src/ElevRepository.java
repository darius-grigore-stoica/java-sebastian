import java.util.ArrayList;
import java.util.List;

public class ElevRepository implements IRepository<Elev> {

    private List<Elev> elevi;

    public ElevRepository() {
        this.elevi = new ArrayList<>();
    }

    // ADD, DELETE, UPDATE, GET = CRUD (CREATE, READ, UPDATE, DELETE)
    @Override
    public void save(Elev entity) {
        System.out.println("Se salveaza elevul in memorie.");
        elevi.add(entity);
    }

    @Override
    public void delete(Elev entity) {
        // TODO: Implementation needed
    }

    @Override
    public Elev findById(int id) {
        return null;
    }

    @Override
    public List<Elev> findAll() {
        return this.elevi;
    }

    @Override
    public Elev update(Elev oldEntity, Elev newEntity) {
        return null;
    }

}
