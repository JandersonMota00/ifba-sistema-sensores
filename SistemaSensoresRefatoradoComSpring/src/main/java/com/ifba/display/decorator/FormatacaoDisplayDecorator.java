package com.ifba.display.decorator;

import com.ifba.display.IDisplay;

public class FormatacaoDisplayDecorator extends SensorDisplayDecorator {
    
    public FormatacaoDisplayDecorator(IDisplay wrappedDisplay) {
        super(wrappedDisplay);
    }

    @Override
    public void mostrarDados(String tipo, String valor) {
        String valorFormatado = "--- " + valor.toUpperCase() + " ---";
        System.out.println("FORMATADO [" + tipo + "]: " + valorFormatado);
    }
}
