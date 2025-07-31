package SistemaSensoresRefatorado.sensor.adapter;

import SistemaSensoresRefatorado.sensor.ISensor;
import SistemaSensoresRefatorado.sensor.legacy.SensorTemperatura;

public class TemperaturaSensorAdapter implements ISensor {
    
    private SensorTemperatura sensorTemperatura;

    public TemperaturaSensorAdapter() {
        this.sensorTemperatura = new SensorTemperatura();
    }

    @Override
    public String obterTipo() {
        return "Temperatura";
    }

    @Override
    public String lerDados() {
        return String.valueOf(sensorTemperatura.lerTemperatura()) + " °C";
    }
}
