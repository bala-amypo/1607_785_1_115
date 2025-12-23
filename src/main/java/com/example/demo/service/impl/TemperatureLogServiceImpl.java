@Service
public class TemperatureLogServiceImpl implements TemperatureLogService {

    private final TemperatureSensorLogRepository repo;

    public TemperatureLogServiceImpl(TemperatureSensorLogRepository repo) {
        this.repo = repo;
    }

    public TemperatureSensorLog recordLog(TemperatureSensorLog log) {
        return repo.save(log);
    }

    public List<TemperatureSensorLog> getLogsByShipment(Long shipmentId) {
        return repo.findByShipment_Id(shipmentId);
    }

    public List<TemperatureSensorLog> getAllLogs() {
        return repo.findAll();
    }
}
