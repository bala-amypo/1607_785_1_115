public interface TemperatureSensorLogRepository extends JpaRepository<TemperatureSensorLog, Long> {
    List<TemperatureSensorLog> findByShipment_Id(Long shipmentId);
}
