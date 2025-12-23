public interface BreachRecordRepository extends JpaRepository<BreachRecord, Long> {
    List<BreachRecord> findByShipment_Id(Long shipmentId);
}
