@RestController
@RequestMapping("/api/shipments")
public class ShipmentRecordController {

    private final ShipmentRecordService service;

    public ShipmentRecordController(ShipmentRecordService service) {
        this.service = service;
    }

    @PostMapping
    public ShipmentRecord create(@RequestBody ShipmentRecord s) {
        return service.createShipment(s);
    }

    @PutMapping("/{id}/status")
    public ShipmentRecord update(@PathVariable Long id, @RequestParam String status) {
        return service.updateShipmentStatus(id, status);
    }

    @GetMapping("/{id}")
    public ShipmentRecord getById(@PathVariable Long id) {
        return service.getShipmentById(id);
    }

    @GetMapping("/code/{code}")
    public ShipmentRecord getByCode(@PathVariable String code) {
        return service.getShipmentByCode(code);
    }

    @GetMapping
    public List<ShipmentRecord> getAll() {
        return service.getAllShipments();
    }
}
