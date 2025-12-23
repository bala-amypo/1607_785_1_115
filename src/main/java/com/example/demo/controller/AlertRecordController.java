@RestController
@RequestMapping("/api/alerts")
public class AlertRecordController {

    private final AlertService service;

    public AlertRecordController(AlertService service) {
        this.service = service;
    }

    @PostMapping
    public AlertRecord trigger(@RequestBody AlertRecord a) {
        return service.triggerAlert(a);
    }

    @PutMapping("/{id}/acknowledge")
    public AlertRecord acknowledge(@PathVariable Long id) {
        return service.acknowledgeAlert(id);
    }

    @GetMapping("/shipment/{shipmentId}")
    public List<AlertRecord> getByShipment(@PathVariable Long shipmentId) {
        return service.getAlertsByShipment(shipmentId);
    }

    @GetMapping
    public List<AlertRecord> getAll() {
        return service.getAllAlerts();
    }
}
