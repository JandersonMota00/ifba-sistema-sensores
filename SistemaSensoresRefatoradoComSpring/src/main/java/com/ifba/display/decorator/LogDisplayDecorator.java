package com.ifba.display.decorator;

import com.ifba.display.IDisplay;
import com.ifba.util.Logger;

public class LogDisplayDecorator extends SensorDisplayDecorator {
    
    public LogDisplayDecorator(IDisplay wrappedDisplay) {
        super(wrappedDisplay);
    }

    @Override
    public void mostrarDados(String tipo, String valor) {
        Logger.log("LOG: Lendo dados do sensor " + tipo + ": " + valor);
        super.mostrarDados(tipo, valor);
    }
}
