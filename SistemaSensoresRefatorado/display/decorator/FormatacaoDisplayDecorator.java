package SistemaSensoresRefatorado.display.decorator;

import SistemaSensoresRefatorado.display.IDisplay;

public class FormatacaoDisplayDecorator extends SensorDisplayDecorator {
    
    public FormatacaoDisplayDecorator(IDisplay wrappedDisplay) {
        super(wrappedDisplay);
    }

    @Override
    public void mostrarDados(String tipo, String valor) {
        // Exemplo de formatação: Converter para maiúsculas e adicionar bordas
        String valorFormatado = "--- " + valor.toUpperCase() + " ---";
        System.out.println("FORMATADO [" + tipo + "]: " + valorFormatado);
        // Não chama super.mostrarDados para evitar duplicação ou permite que decore outros displays
        // Se você quiser que a formatação seja "adicional" e não substitua, ajuste a lógica.
        // Para este exemplo, ele exibe diretamente o formatado.
        // wrappedDisplay.mostrarDados(tipo, valorFormatado); // Se você quiser que o original também seja chamado
    }
}
