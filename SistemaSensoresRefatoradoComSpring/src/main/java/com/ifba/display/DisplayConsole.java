package com.ifba.display;

public class DisplayConsole implements IDisplay {
    @Override
    public void mostrarDados(String tipo, String valor) {
        System.out.println("[" + tipo + "]: " + valor);
    }
}
