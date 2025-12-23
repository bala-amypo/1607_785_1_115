@RestController
@RequestMapping("/api/logs")
public class TemperatureLogController {

    private final TemperatureLogService service;

    public TemperatureLogController(TemperatureLogService service) {
        this.service = service;
    }

    @PostMapping
    public TemperatureSensorLog record(@RequestBody TemperatureSensorLog log) {
        return service.recordLog(log);
    }

    @GetMapping("/shipment/{shipmentId}")
    public List<TemperatureSensorLog> getByShipment(@PathVariable Long shipmentId) {
        return service.getLogsByShipment(shipmentId);
    }

    @GetMapping
    public List<TemperatureSensorLog> getAll() {
        return service.getAllLogs();
    }
}
