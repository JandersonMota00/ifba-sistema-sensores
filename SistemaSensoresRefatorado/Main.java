package SistemaSensoresRefatorado;

import SistemaSensoresRefatorado.sensor.SensorManager;

public class Main {
    public static void main(String[] args) {
        SensorManager manager = new SensorManager();
        manager.exibirDadosSensores();
    }
}
