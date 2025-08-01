package com.ifba.display.decorator;

import com.ifba.display.IDisplay;

public abstract class SensorDisplayDecorator implements IDisplay {
    
    protected IDisplay wrappedDisplay;

    public SensorDisplayDecorator(IDisplay wrappedDisplay) {
        this.wrappedDisplay = wrappedDisplay;
    }

    @Override
    public void mostrarDados(String tipo, String valor) {
        wrappedDisplay.mostrarDados(tipo, valor);
    }
}
