package com.ifba.sensor.adapter;

import com.ifba.sensor.ISensor;
import com.ifba.sensor.legacy.SensorUmidade;

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
