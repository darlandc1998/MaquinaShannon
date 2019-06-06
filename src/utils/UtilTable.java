package utils;

import enums.DirecaoEnum;
import enums.NomeEstadoEnum;
import enums.SeparadorVariavelEnum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.Item;
import modelos.ItensEstados;

public final class UtilTable {

    public static List<String> getEstados(Integer quantidade, String inicio) {
        List<String> estados = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            estados.add(i == 0 ? inicio : NomeEstadoEnum.NOME.getNome() + (i - 1));
        }
        return estados;
    }

    public static Object[] getOpcoesComboBox(Object[] opcoes) {
        Object[] opcoesCb = new Object[opcoes.length + 1];

        for (int i = 0; i < opcoesCb.length; i++) {
            opcoesCb[i] = i == 0 ? null : opcoes[i - 1].toString();
        }

        return opcoesCb;
    }

    public static List<Item> createListAlgorithm(JTable table) {
        List<Item> itens = new ArrayList<>();

        DefaultTableModel model = (DefaultTableModel) table.getModel();

        for (int count = 0; count < model.getRowCount(); count++) {
            String estado = (String) model.getValueAt(count, 0);
            String le = (String) model.getValueAt(count, 1);
            String proxEstado = (String) model.getValueAt(count, 2);
            String escreva = (String) model.getValueAt(count, 3);
            String direcao = (String) model.getValueAt(count, 4);

            if (proxEstado == null || proxEstado.trim().isEmpty() || direcao == null || direcao.trim().isEmpty() ) {
                continue;
            }

            Item itemEstado = new Item(estado);

            if (itens.contains(itemEstado)) {
                itemEstado = itens.get(itens.indexOf(itemEstado));
            }

            ItensEstados derivacao = new ItensEstados();
            derivacao.setDirecao(DirecaoEnum.valueOf(direcao).getSimbolo());
            derivacao.setProxEstado(proxEstado);
            derivacao.setEstado(le == null ? "" : le);
            derivacao.setSimbolo(escreva == null ? "" : escreva);

            itemEstado.getItensEstados().add(derivacao);

            if (!itens.contains(itemEstado)) {
                itens.add(itemEstado);
            }
        }

        return itens;
    }

    public static void clearTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
    
    public static void createTable(String[] dados, String JVariaveis, String jEstados, JTable table){
        List<String> variaveis = Arrays.asList(JVariaveis.split(SeparadorVariavelEnum.SEPARADOR.getKey()));
        
        if (variaveis.contains(" ")){
            JOptionPane.showMessageDialog(null, "Por padrão o algoritmo já implementa vazio retire-o da lista de variaveis");
            return;
        }
        
        Integer quantidadeEstados = Integer.parseInt(jEstados);
        List<String> estados = UtilTable.getEstados(quantidadeEstados, variaveis.get(0));

        DefaultTableModel model = (DefaultTableModel) table.getModel();

        clearTable(table);

        JComboBox jCbVariaveis = new JComboBox(getOpcoesComboBox(variaveis.toArray()));
        JComboBox jCbDirecoes = new JComboBox(getOpcoesComboBox(DirecaoEnum.values()));
        JComboBox jCbEstados = new JComboBox(getOpcoesComboBox(estados.toArray()));

        int line = 0;
        for (String estado : estados) {
            for (int j = 0; j < (variaveis.size() + 1); j++) {
                model.addRow(new Object[]{estado});
                table.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(jCbVariaveis));
                table.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(jCbEstados));
                table.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(jCbVariaveis));
                table.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(jCbDirecoes));

                if (dados != null && dados.length > 0) {
                    String[] valores = dados[line].split(SeparadorVariavelEnum.SEPARADOR.getKey());
                    String estadoTextFile = valores[0];                    
                    if (estadoTextFile.equals(estado)) {                        
                        for (int v = 1; v < valores.length; v++) {
                            model.setValueAt(valores[v].trim().isEmpty() ? null : valores[v], line, v);
                        } 
                    }
                }   
                
                line++;
            }
        }
    }

}
