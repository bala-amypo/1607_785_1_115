@Service
public class TemperatureRuleServiceImpl implements TemperatureRuleService {

    private final TemperatureRuleRepository repo;

    public TemperatureRuleServiceImpl(TemperatureRuleRepository repo) {
        this.repo = repo;
    }

    public TemperatureRule createRule(TemperatureRule rule) {
        return repo.save(rule);
    }

    public TemperatureRule updateRule(Long id, TemperatureRule rule) {
        TemperatureRule r = repo.findById(id).orElseThrow();
        r.setMinTemp(rule.getMinTemp());
        r.setMaxTemp(rule.getMaxTemp());
        r.setActive(rule.getActive());
        return repo.save(r);
    }

    public TemperatureRule getActiveRule(String productType, LocalDate date) {
        return repo.findActiveRule(productType).orElseThrow();
    }

    public List<TemperatureRule> getAllRules() {
        return repo.findAll();
    }
}
