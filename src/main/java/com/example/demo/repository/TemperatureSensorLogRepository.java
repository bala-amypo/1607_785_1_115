public interface TemperatureSensorLogRepository {
    TemperatureSensorLog save(TemperatureSensorLog l);
    List<TemperatureSensorLog> findByShipmentId(Long id);
}
