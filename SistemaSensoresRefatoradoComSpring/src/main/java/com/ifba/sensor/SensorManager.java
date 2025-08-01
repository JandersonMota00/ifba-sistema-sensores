package com.ifba.sensor;

import com.ifba.sensor.legacy.SensorTemperatura;
import com.ifba.sensor.legacy.SensorUmidade;
import com.ifba.sensor.legacy.SensorLuminosidade;

import java.util.ArrayList;
import java.util.List;

import com.ifba.display.DisplayConsole;
import com.ifba.display.IDisplay;

public class SensorManager {
    
    private static SensorManager instance;
    private List<ISensor> sensores;
    private IDisplay display;

    private SensorManager() {
        sensores = new ArrayList<>();
    }

    public static synchronized SensorManager getInstance() {
        if (instance == null) {
            instance = new SensorManager();
        }
        return instance;
    }

    public void adicionarSensor(ISensor sensor) {
        this.sensores.add(sensor);
    }

    public void setDisplay(IDisplay display) {
        this.display = display;
    }

    public void exibirDadosSensores() {
        if (display == null) {
            System.out.println("Nenhum display configurado para o SensorManager.");
            return;
        }
        for (ISensor sensor : sensores) {
            String tipo = sensor.obterTipo();
            String valor = sensor.lerDados();
            display.mostrarDados(tipo, valor);
        }
    }
 }