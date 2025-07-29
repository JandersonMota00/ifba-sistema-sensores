package SistemaSensoresRefatorado.sensor;

import SistemaSensoresRefatorado.sensor.legacy.SensorTemperatura;
import SistemaSensoresRefatorado.sensor.legacy.SensorUmidade;
import SistemaSensoresRefatorado.sensor.legacy.SensorLuminosidade;
import SistemaSensoresRefatorado.display.DisplayConsole;

public class SensorManager {
    
    private SensorTemperatura sensorTemp = new SensorTemperatura();
    private SensorUmidade sensorUmidade = new SensorUmidade();
    private SensorLuminosidade sensorLuminosidade = new SensorLuminosidade();
    private DisplayConsole display = new DisplayConsole();

    public void exibirDadosSensores() {
        double temp = sensorTemp.lerTemperatura();
        double umidade = sensorUmidade.lerUmidade();
        int luminosidade = sensorLuminosidade.lerLuminosidade();
        display.mostrarDados("Temperatura", temp + " °C");
        display.mostrarDados("Umidade", umidade + " %");
        display.mostrarDados("Luminosidade", luminosidade + " lux");
    }
 }