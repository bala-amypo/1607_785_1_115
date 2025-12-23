@Service
public class AlertServiceImpl implements AlertService {

    private final AlertRecordRepository repo;

    public AlertServiceImpl(AlertRecordRepository repo) {
        this.repo = repo;
    }

    public AlertRecord triggerAlert(AlertRecord alert) {
        return repo.save(alert);
    }

    public AlertRecord acknowledgeAlert(Long id) {
        AlertRecord a = repo.findById(id).orElseThrow();
        a.setAcknowledged(true);
        return repo.save(a);
    }

    public List<AlertRecord> getAlertsByShipment(Long shipmentId) {
        return repo.findByShipment_Id(shipmentId);
    }

    public List<AlertRecord> getAllAlerts() {
        return repo.findAll();
    }
}
