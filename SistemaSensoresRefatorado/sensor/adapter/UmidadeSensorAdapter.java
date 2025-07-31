package SistemaSensoresRefatorado.sensor.adapter;

import SistemaSensoresRefatorado.sensor.ISensor;
import SistemaSensoresRefatorado.sensor.legacy.SensorUmidade;

public class UmidadeSensorAdapter implements ISensor {
    
    private SensorUmidade sensorUmidade;

    public UmidadeSensorAdapter() {
        this.sensorUmidade = new SensorUmidade();
    }

    @Override
    public String obterTipo() {
        return "Umidade";
    }

    @Override
    public String lerDados() {
        return String.valueOf(sensorUmidade.lerUmidade()) + " %";
    }
}
