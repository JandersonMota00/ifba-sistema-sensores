package com.ifba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ifba.sensor.ISensor;
import com.ifba.sensor.SensorFactory;
import com.ifba.sensor.SensorManager;

import com.ifba.display.IDisplay;
import com.ifba.display.decorator.FormatacaoDisplayDecorator;
import com.ifba.display.decorator.LimiteAlertaDisplayDecorator;

import com.ifba.display.decorator.LogDisplayDecorator;
import com.ifba.display.DisplayConsole;

@SpringBootApplication
public class RefatoracaoDoSistemaDeSensoresApplication {

	public static void main(String[] args) {

        SensorManager manager = SensorManager.getInstance();

        ISensor sensorTemperatura = SensorFactory.criarSensor("temperatura");
        ISensor sensorUmidade = SensorFactory.criarSensor("umidade");
        ISensor sensorLuminosidade = SensorFactory.criarSensor("luminosidade");

        manager.adicionarSensor(sensorTemperatura);
        manager.adicionarSensor(sensorUmidade);
        manager.adicionarSensor(sensorLuminosidade);

        IDisplay baseDisplay = new DisplayConsole();

        IDisplay decoratedDisplay = new LogDisplayDecorator(baseDisplay);
        decoratedDisplay = new FormatacaoDisplayDecorator(decoratedDisplay);
        decoratedDisplay = new LimiteAlertaDisplayDecorator(decoratedDisplay, 40.0);

        manager.setDisplay(decoratedDisplay);
        manager.exibirDadosSensores();

        System.out.println("\n--- Teste com display básico sem decoradores ---");
        manager.setDisplay(baseDisplay);
        manager.exibirDadosSensores();
	}

}
