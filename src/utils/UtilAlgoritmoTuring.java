package utils;

import enums.DirecaoEnum;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import java.util.TimerTask;
import javax.swing.JTextField;
import java.util.Timer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.Item;
import modelos.ItensEstados;

public final class UtilAlgoritmoTuring {

    public static void execute(List<Item> itens, List<String> operacao, Component[] components, JFrame frame) {
        updateDataFields(components, operacao);
        paintDataFieldFocus(0, components);
        enableFrame(false, frame);    
        
        System.out.println("Itens = "+itens.toString());        
        System.out.println("Operacao = "+operacao.toString());
        
        new Timer().scheduleAtFixedRate(new TimerTask() {
            Integer pos = 0;
            String estado = operacao.get(0);
            
            @Override
            public void run() {
                System.out.println("Executando...");
                try {
                    Item analisado = itens.get(itens.indexOf(new Item(estado)));

                    int indexEstado = analisado.getItensEstados().indexOf(new ItensEstados(operacao.get(pos)));

                    ItensEstados estadoAnalisado = analisado.getItensEstados().get(indexEstado);

                    operacao.set(pos, estadoAnalisado.getSimbolo());
                    estado = estadoAnalisado.getProxEstado();
                    
                    updateDataFields(components, operacao);
                    paintDataFieldFocus(pos, components);

                    if (estadoAnalisado.getDirecao().equals(DirecaoEnum.FIM.getSimbolo())) {
                        JOptionPane.showMessageDialog(null, "Execução realizada com sucesso!");
                        enableFrame(true, frame);
                        this.cancel();                        
                    }

                    if (estadoAnalisado.getDirecao().equals(DirecaoEnum.DIREITA.getSimbolo())) {
                        pos++;
                    } else {
                        pos--;
                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao executar algoritmo!", null, JOptionPane.ERROR_MESSAGE);
                    enableFrame(true, frame);
                    this.cancel();
                }

            }

        }, 1000, 1000);
    }

    private static void updateDataFields(Component[] components, List<String> operacao) {
        for (int i = 0; i < components.length; i++){
            Component component = components[i];
            if (component instanceof JTextField){
                JTextField field = (JTextField) component;
                field.setBackground(Color.WHITE);
                field.setText(operacao.size() > i ? operacao.get(i) : "");               
            }
        }
    }

    private static void paintDataFieldFocus(int pos, Component[] components) {
        Component component = components[pos];
        if (component instanceof JTextField) {
            JTextField field = (JTextField) component;
            field.setBackground(Color.YELLOW);            
        }
    }
    
    private static void enableFrame(boolean editable, JFrame frame){
        frame.setEnabled(editable);
    }
    
}
