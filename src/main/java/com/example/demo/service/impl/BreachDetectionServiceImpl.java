@Service
public class BreachDetectionServiceImpl implements BreachDetectionService {

    private final BreachRecordRepository repo;

    public BreachDetectionServiceImpl(BreachRecordRepository repo) {
        this.repo = repo;
    }

    public BreachRecord logBreach(BreachRecord breach) {
        return repo.save(breach);
    }

    public BreachRecord resolveBreach(Long id) {
        BreachRecord b = repo.findById(id).orElseThrow();
        b.setResolved(true);
        return repo.save(b);
    }

    public List<BreachRecord> getBreachesByShipment(Long shipmentId) {
        return repo.findByShipment_Id(shipmentId);
    }

    public List<BreachRecord> getAllBreaches() {
        return repo.findAll();
    }
}
