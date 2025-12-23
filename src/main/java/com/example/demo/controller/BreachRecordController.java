@RestController
@RequestMapping("/api/breaches")
public class BreachRecordController {

    private final BreachDetectionService service;

    public BreachRecordController(BreachDetectionService service) {
        this.service = service;
    }

    @PostMapping
    public BreachRecord log(@RequestBody BreachRecord b) {
        return service.logBreach(b);
    }

    @PutMapping("/{id}/resolve")
    public BreachRecord resolve(@PathVariable Long id) {
        return service.resolveBreach(id);
    }

    @GetMapping("/shipment/{shipmentId}")
    public List<BreachRecord> getByShipment(@PathVariable Long shipmentId) {
        return service.getBreachesByShipment(shipmentId);
    }

    @GetMapping
    public List<BreachRecord> getAll() {
        return service.getAllBreaches();
    }
}
