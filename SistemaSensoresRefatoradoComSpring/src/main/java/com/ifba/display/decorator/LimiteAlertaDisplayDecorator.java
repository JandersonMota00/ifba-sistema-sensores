package com.ifba.display.decorator;

import com.ifba.display.IDisplay;

public class LimiteAlertaDisplayDecorator extends SensorDisplayDecorator {
    
    private final double limiteTemperatura;

    public LimiteAlertaDisplayDecorator(IDisplay wrappedDisplay, double limiteTemperatura) {
        super(wrappedDisplay);
        this.limiteTemperatura = limiteTemperatura;
    }

    @Override
    public void mostrarDados(String tipo, String valor) {
        super.mostrarDados(tipo, valor);

        if (tipo.equals("Temperatura")) {
            try {
                double temp = Double.parseDouble(valor.replace(" °C", "").trim());
                if (temp > limiteTemperatura) {
                    System.out.println("!!! ALERTA: Temperatura acima do limite (" + limiteTemperatura + "°C) !!!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Erro ao analisar temperatura para alerta: " + valor);
            }
        }
    }
}
