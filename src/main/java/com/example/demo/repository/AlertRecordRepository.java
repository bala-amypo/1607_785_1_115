public interface AlertRecordRepository extends JpaRepository<AlertRecord, Long> {
    List<AlertRecord> findByShipment_Id(Long shipmentId);
}
