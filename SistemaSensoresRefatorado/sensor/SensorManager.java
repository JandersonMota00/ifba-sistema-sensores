package SistemaSensoresRefatorado.sensor;

import SistemaSensoresRefatorado.sensor.legacy.SensorTemperatura;
import SistemaSensoresRefatorado.sensor.legacy.SensorUmidade;
import SistemaSensoresRefatorado.sensor.legacy.SensorLuminosidade;

import java.util.ArrayList;
import java.util.List;

import SistemaSensoresRefatorado.display.DisplayConsole;
import SistemaSensoresRefatorado.display.IDisplay;

public class SensorManager {
    
    private static SensorManager instance; // Instância única (Singleton)
    private List<ISensor> sensores;
    private IDisplay display; // Agora depende da interface IDisplay

    private SensorManager() {
        sensores = new ArrayList<>();
    }

    public static synchronized SensorManager getInstance() { // Método de acesso à instância
        if (instance == null) {
            instance = new SensorManager();
        }
        return instance;
    }

    public void adicionarSensor(ISensor sensor) {
        this.sensores.add(sensor);
    }

    // Método para configurar o display (Injeção de Dependência)
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