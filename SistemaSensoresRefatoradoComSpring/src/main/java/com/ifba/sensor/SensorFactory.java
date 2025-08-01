package com.ifba.sensor;

import com.ifba.sensor.adapter.LuminosidadeSensorAdapter;
import com.ifba.sensor.adapter.TemperaturaSensorAdapter;
import com.ifba.sensor.adapter.UmidadeSensorAdapter;

public class SensorFactory {
    public static ISensor criarSensor(String tipoSensor) {
        switch (tipoSensor.toLowerCase()) {
            case "temperatura":
                return new TemperaturaSensorAdapter();
            case "umidade":
                return new UmidadeSensorAdapter();
            case "luminosidade":
                return new LuminosidadeSensorAdapter();
            default:
                throw new IllegalArgumentException("Tipo de sensor desconhecido: " + tipoSensor);
        }
    }
}
