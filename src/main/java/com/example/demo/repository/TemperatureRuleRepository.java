public interface TemperatureRuleRepository {
    TemperatureRule save(TemperatureRule r);
    List<TemperatureRule> findByActiveTrue();
    Optional<TemperatureRule> findApplicableRule(String product, java.time.LocalDate date);
}
