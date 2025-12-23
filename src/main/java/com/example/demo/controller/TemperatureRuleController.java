@RestController
@RequestMapping("/api/rules")
public class TemperatureRuleController {

    private final TemperatureRuleService service;

    public TemperatureRuleController(TemperatureRuleService service) {
        this.service = service;
    }

    @PostMapping
    public TemperatureRule create(@RequestBody TemperatureRule r) {
        return service.createRule(r);
    }

    @PutMapping("/{id}")
    public TemperatureRule update(@PathVariable Long id, @RequestBody TemperatureRule r) {
        return service.updateRule(id, r);
    }

    @GetMapping
    public List<TemperatureRule> getAll() {
        return service.getAllRules();
    }
}
