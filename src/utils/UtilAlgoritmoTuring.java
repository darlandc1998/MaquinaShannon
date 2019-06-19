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
import javax.swing.JPanel;
import modelos.Item;
import modelos.ItensEstados;

public final class UtilAlgoritmoTuring {

    public static void execute(List<Item> itens, List<String> operacao, Component[] components, JFrame frame, JPanel panelLoader, Integer delaySeconds) {
        updateDataFields(components, operacao);
        paintDataFieldFocus(0, components);
        enableFrame(false, frame,panelLoader);  
        
        if (delaySeconds == null){
            delaySeconds = 1;
        }
        
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
                        updateDataFields(components, operacao);
                        enableFrame(true, frame, panelLoader);
                        JOptionPane.showMessageDialog(null, "Execução realizada com sucesso!");                        
                        this.cancel();                        
                    }

                    if (estadoAnalisado.getDirecao().equals(DirecaoEnum.DIREITA.getSimbolo())) {
                        pos++;
                    } else {
                        pos--;
                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                    updateDataFields(components, operacao);
                    enableFrame(true, frame, panelLoader);
                    JOptionPane.showMessageDialog(null, "Erro ao executar algoritmo!", null, JOptionPane.ERROR_MESSAGE);
                    this.cancel();
                }

            }

        }, 1000, (delaySeconds * 1000));
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
    
    private static void enableFrame(boolean editable, JFrame frame, JPanel panelLoader){
        frame.setEnabled(editable);
        panelLoader.setVisible(!editable);
    }
    
}
