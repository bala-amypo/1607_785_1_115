public interface TemperatureRuleRepository extends JpaRepository<TemperatureRule, Long> {
    @Query("select r from TemperatureRule r where r.productType = ?1 and r.active = true")
    Optional<TemperatureRule> findActiveRule(String productType);
}
