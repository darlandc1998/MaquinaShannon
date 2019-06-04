package telas;

import enums.DirecaoEnum;
import enums.SeparadorVariavelEnum;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelos.Item;
import modelos.ItensEstados;
import utils.UtilAlgoritmoTuring;
import utils.UtilPDF;
import utils.UtilTabela;

public class Principal extends javax.swing.JFrame {

    private List<Item> tableMappingAlgorithm;

    public Principal() {
        initComponents();
        initComponentsData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTab = new javax.swing.JTabbedPane();
        jPanelExecucao = new javax.swing.JPanel();
        jScrollPanel = new javax.swing.JScrollPane();
        jPanelDados = new javax.swing.JPanel();
        jBtnProcessar = new javax.swing.JButton();
        jPanelAlgoritmo = new javax.swing.JPanel();
        jLblQtdEstados = new javax.swing.JLabel();
        JLblDerivacaoEstados = new javax.swing.JLabel();
        jTxtQtdEstados = new javax.swing.JTextField();
        jTxtVariaveis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVariaveis = new javax.swing.JTable();
        jBtnGerarTabela = new javax.swing.JButton();
        jBtnSalvarTabela = new javax.swing.JButton();
        jBtnAbrirPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Máquina de Shannon");
        setAlwaysOnTop(true);
        setName("jFramePrincipal"); // NOI18N
        setResizable(false);

        jPanelDados.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPanel.setViewportView(jPanelDados);

        jBtnProcessar.setText("Processar");
        jBtnProcessar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnProcessarMouseClicked(evt);
            }
        });
        jBtnProcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProcessarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelExecucaoLayout = new javax.swing.GroupLayout(jPanelExecucao);
        jPanelExecucao.setLayout(jPanelExecucaoLayout);
        jPanelExecucaoLayout.setHorizontalGroup(
            jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
            .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                .addComponent(jBtnProcessar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelExecucaoLayout.setVerticalGroup(
            jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                .addComponent(jScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnProcessar)
                .addGap(0, 211, Short.MAX_VALUE))
        );

        jTab.addTab("Execução", jPanelExecucao);

        jLblQtdEstados.setText("Qtd. Estados:");

        JLblDerivacaoEstados.setText("Variáveis");

        jTableVariaveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estado", "Lê", "Vá para", "Escreva", "Direção"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVariaveis.setRowHeight(30);
        jTableVariaveis.getTableHeader().setResizingAllowed(false);
        jTableVariaveis.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableVariaveis);

        jBtnGerarTabela.setText("Gerar Tabela");
        jBtnGerarTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnGerarTabelaMouseClicked(evt);
            }
        });

        jBtnSalvarTabela.setText("Salvar");
        jBtnSalvarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarTabelaActionPerformed(evt);
            }
        });

        jBtnAbrirPDF.setText("Abrir PDF");
        jBtnAbrirPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAbrirPDFMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelAlgoritmoLayout = new javax.swing.GroupLayout(jPanelAlgoritmo);
        jPanelAlgoritmo.setLayout(jPanelAlgoritmoLayout);
        jPanelAlgoritmoLayout.setHorizontalGroup(
            jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlgoritmoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblQtdEstados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtQtdEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLblDerivacaoEstados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnGerarTabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnAbrirPDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnSalvarTabela)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
        );
        jPanelAlgoritmoLayout.setVerticalGroup(
            jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlgoritmoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblQtdEstados)
                    .addComponent(JLblDerivacaoEstados)
                    .addComponent(jTxtQtdEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnGerarTabela)
                    .addComponent(jBtnSalvarTabela)
                    .addComponent(jBtnAbrirPDF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
        );

        jTab.addTab("Algoritmo", jPanelAlgoritmo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTab)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGerarTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnGerarTabelaMouseClicked

        String msgError = null;

        String quantidadeEstados = jTxtQtdEstados.getText();
        String variaveis = jTxtVariaveis.getText();

        if (variaveis.trim().isEmpty()) {
            msgError = "Variaveis vazias";
        }

        if (quantidadeEstados.trim().isEmpty()) {
            msgError = "Quantidade de estados vazia";
        }

        if (msgError != null) {
            JOptionPane.showMessageDialog(null, msgError);
            return;
        }

        createTable();

    }//GEN-LAST:event_jBtnGerarTabelaMouseClicked

    private void initComponentsData() {
        for (int i = 0; i < 12; i++) {
            getPanel().add(getJtextField());
        }

        getPanel().add(getBtnAdd());
    }

    private void jBtnSalvarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarTabelaActionPerformed

        if (jTableVariaveis.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Crie a tabela e adicione os dados necessários");
            return;
        }

        setTableMappingAlgorithm(createListAlgorithm());
    }//GEN-LAST:event_jBtnSalvarTabelaActionPerformed

    private void jBtnProcessarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnProcessarMouseClicked

        if (getTableMappingAlgorithm() == null || getTableMappingAlgorithm().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Crie um algoritmo para executar o programa");
            return;
        }

        List<String> datasExecution = getDataFields();

        if (datasExecution == null || datasExecution.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira os dados para executar o programa");
            return;
        }

        UtilAlgoritmoTuring.execute(getTableMappingAlgorithm(), datasExecution, getComponentsPanel(), this);

    }//GEN-LAST:event_jBtnProcessarMouseClicked

    private void jBtnProcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProcessarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnProcessarActionPerformed

    private void jBtnAbrirPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAbrirPDFMouseClicked
        openDialogPDF();
    }//GEN-LAST:event_jBtnAbrirPDFMouseClicked

    private void createTable() {
        Integer quantidadeEstados = Integer.parseInt(jTxtQtdEstados.getText());
        List<String> variaveis = Arrays.asList(jTxtVariaveis.getText().split(SeparadorVariavelEnum.SEPARADOR.getKey()));
        List<String> estados = UtilTabela.getEstados(quantidadeEstados, variaveis.get(0));

        DefaultTableModel model = (DefaultTableModel) jTableVariaveis.getModel();

        cleartable();

        JComboBox jCbVariaveis = new JComboBox(UtilTabela.getOpcoesComboBox(variaveis.toArray()));
        JComboBox jCbDirecoes = new JComboBox(UtilTabela.getOpcoesComboBox(DirecaoEnum.values()));
        JComboBox jCbEstados = new JComboBox(UtilTabela.getOpcoesComboBox(estados.toArray()));

        for (String estado : estados) {
            for (int j = 0; j < variaveis.size(); j++) {
                model.addRow(new Object[]{estado});
                jTableVariaveis.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(jCbVariaveis));
                jTableVariaveis.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(jCbEstados));
                jTableVariaveis.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(jCbVariaveis));
                jTableVariaveis.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(jCbDirecoes));
            }
        }

    }

    private void cleartable() {
        DefaultTableModel model = (DefaultTableModel) jTableVariaveis.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        setTableMappingAlgorithm(null);

    }

    private List<Item> createListAlgorithm() {
        List<Item> itens = new ArrayList<>();

        DefaultTableModel model = (DefaultTableModel) jTableVariaveis.getModel();

        for (int count = 0; count < model.getRowCount(); count++) {
            String estado = (String) model.getValueAt(count, 0);
            String le = (String) model.getValueAt(count, 1);
            String proxEstado = (String) model.getValueAt(count, 2);
            String escreva = (String) model.getValueAt(count, 3);
            DirecaoEnum direcao = (DirecaoEnum) model.getValueAt(count, 4);

            if (direcao == null && proxEstado == null && le == null && escreva == null) {
                continue;
            }

            Item itemEstado = new Item(estado);

            if (itens.contains(itemEstado)) {
                itemEstado = itens.get(itens.indexOf(itemEstado));
            }

            ItensEstados derivacao = new ItensEstados();
            derivacao.setDirecao(direcao != null ? direcao.getSimbolo() : null);
            derivacao.setProxEstado(proxEstado);
            derivacao.setEstado(le);
            derivacao.setSimbolo(escreva);

            itemEstado.getItensEstados().add(derivacao);

            if (!itens.contains(itemEstado)) {
                itens.add(itemEstado);
            }
        }

        return itens;
    }

    private JPanel getPanel() {
        return jPanelDados;
    }

    private JTextField getJtextField() {
        JTextField jTextField = new JTextField();
        jTextField.setSize(100, 10);
        jTextField.setPreferredSize(new Dimension(60, 40));
        jTextField.setAutoscrolls(false);
        return jTextField;
    }

    private JButton getBtnAdd() {
        JButton btnAdd = new JButton();
        btnAdd.setName("jBtnAdd");
        btnAdd.setText("+");
        btnAdd.setPreferredSize(new Dimension(60, 40));
        btnAdd.addActionListener((ActionEvent e) -> {
            int quantidade = getPanel().getComponentCount();
            getPanel().add(getJtextField(), quantidade - 1);
            renderPanel();
        });
        return btnAdd;
    }

    private Component[] getComponentsPanel() {
        return getPanel().getComponents();
    }

    private void renderPanel() {
        getPanel().revalidate();
        getPanel().repaint();
    }

    private ArrayList<String> getDataFields() {
        ArrayList<String> dados = new ArrayList<>();

        for (Component component : getComponentsPanel()) {
            if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                String texto = field.getText();
                if (!texto.trim().isEmpty()){
                    dados.add(texto);
                }
            }
        }

        return dados;
    }

    public List<Item> getTableMappingAlgorithm() {
        return tableMappingAlgorithm;
    }

    public void setTableMappingAlgorithm(List<Item> tableMappingAlgorithm) {
        this.tableMappingAlgorithm = tableMappingAlgorithm;
    }

    private void openDialogPDF() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("PDF", "pdf"));

        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                String[] linesPdf = UtilPDF.readLines(selectedFile.getAbsolutePath());
                for (String line : linesPdf) {
                    System.out.println("Line = " + line);
                }
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLblDerivacaoEstados;
    private javax.swing.JButton jBtnAbrirPDF;
    private javax.swing.JButton jBtnGerarTabela;
    private javax.swing.JButton jBtnProcessar;
    private javax.swing.JButton jBtnSalvarTabela;
    private javax.swing.JLabel jLblQtdEstados;
    private javax.swing.JPanel jPanelAlgoritmo;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelExecucao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPanel;
    private javax.swing.JTabbedPane jTab;
    private javax.swing.JTable jTableVariaveis;
    private javax.swing.JTextField jTxtQtdEstados;
    private javax.swing.JTextField jTxtVariaveis;
    // End of variables declaration//GEN-END:variables
}
