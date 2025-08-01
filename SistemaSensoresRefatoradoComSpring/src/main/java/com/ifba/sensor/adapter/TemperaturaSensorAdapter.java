package com.ifba.sensor.adapter;

import com.ifba.sensor.ISensor;
import com.ifba.sensor.legacy.SensorTemperatura;

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
