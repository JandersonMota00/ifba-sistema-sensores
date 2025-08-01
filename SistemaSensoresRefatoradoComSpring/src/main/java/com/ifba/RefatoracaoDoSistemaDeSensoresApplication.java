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
		// Obter a única instância do SensorManager (Singleton)
        SensorManager manager = SensorManager.getInstance();

        // Criar adaptadores de sensores usando a Factory
        ISensor sensorTemperatura = SensorFactory.criarSensor("temperatura");
        ISensor sensorUmidade = SensorFactory.criarSensor("umidade");
        ISensor sensorLuminosidade = SensorFactory.criarSensor("luminosidade");

        // Adicionar sensores ao gerenciador
        manager.adicionarSensor(sensorTemperatura);
        manager.adicionarSensor(sensorUmidade);
        manager.adicionarSensor(sensorLuminosidade);

        // Configurar o display com Decoradores
        IDisplay baseDisplay = new DisplayConsole(); // Display base

        // Aplica os decoradores em cascata
        IDisplay decoratedDisplay = new LogDisplayDecorator(baseDisplay); // Adiciona log
        decoratedDisplay = new FormatacaoDisplayDecorator(decoratedDisplay); // Adiciona formatação
        decoratedDisplay = new LimiteAlertaDisplayDecorator(decoratedDisplay, 40.0); // Adiciona alerta de limite para temperatura > 40°C

        // Configurar o display decorado no SensorManager
        manager.setDisplay(decoratedDisplay);

        // Exibir os dados dos sensores usando o gerenciador
        manager.exibirDadosSensores();

        System.out.println("\n--- Teste com display básico sem decoradores ---");
        manager.setDisplay(baseDisplay); // Define o display original para comparação
        manager.exibirDadosSensores();

		//SpringApplication.run(RefatoracaoDoSistemaDeSensoresApplication.class, args);
	}

}
