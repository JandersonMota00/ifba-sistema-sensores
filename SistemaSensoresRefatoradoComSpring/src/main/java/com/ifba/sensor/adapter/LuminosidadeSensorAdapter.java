package com.ifba.sensor.adapter;

import com.ifba.sensor.ISensor;
import com.ifba.sensor.legacy.SensorLuminosidade;

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
