public interface BreachRecordRepository {
    BreachRecord save(BreachRecord b);
    Optional<BreachRecord> findById(Long id);
    List<BreachRecord> findByShipmentId(Long id);
}
