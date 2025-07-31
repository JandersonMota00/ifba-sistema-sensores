package SistemaSensoresRefatorado.sensor.adapter;

import SistemaSensoresRefatorado.sensor.ISensor;
import SistemaSensoresRefatorado.sensor.legacy.SensorLuminosidade;

public class LuminosidadeSensorAdapter implements ISensor {
    
    private SensorLuminosidade sensorLuminosidade;

    public LuminosidadeSensorAdapter() {
        this.sensorLuminosidade = new SensorLuminosidade();
    }

    @Override
    public String obterTipo() {
        return "Luminosidade";
    }

    @Override
    public String lerDados() {
        return String.valueOf(sensorLuminosidade.lerLuminosidade()) + " lux";
    }
}
