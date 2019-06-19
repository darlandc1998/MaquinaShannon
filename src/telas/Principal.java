package telas;

import enums.SeparadorVariavelEnum;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelos.Item;
import utils.UtilAlgoritmoTuring;
import utils.UtilFile;
import utils.UtilTable;

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
        jPanelExec = new javax.swing.JPanel();
        jGifLoader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLblTitle = new javax.swing.JLabel();
        btApagar = new javax.swing.JButton();
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
        btLimparTabela = new javax.swing.JButton();
        jSliderDelay = new javax.swing.JSlider();
        jLblDelay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Máquina de Turing");
        setAlwaysOnTop(true);
        setName("jFramePrincipal"); // NOI18N
        setResizable(false);

        jScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanelDados.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPanel.setViewportView(jPanelDados);

        jBtnProcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/play.png"))); // NOI18N
        jBtnProcessar.setToolTipText("Executar");
        jBtnProcessar.setMaximumSize(new java.awt.Dimension(40, 40));
        jBtnProcessar.setMinimumSize(new java.awt.Dimension(40, 40));
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

        jGifLoader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/gear.gif"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Executando...");

        javax.swing.GroupLayout jPanelExecLayout = new javax.swing.GroupLayout(jPanelExec);
        jPanelExec.setLayout(jPanelExecLayout);
        jPanelExecLayout.setHorizontalGroup(
            jPanelExecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExecLayout.createSequentialGroup()
                .addContainerGap(406, Short.MAX_VALUE)
                .addGroup(jPanelExecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jGifLoader))
                .addGap(351, 351, 351))
        );
        jPanelExecLayout.setVerticalGroup(
            jPanelExecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExecLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jGifLoader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLblTitle.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLblTitle.setText("Máquina de Turing");

        btApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eraser.png"))); // NOI18N
        btApagar.setToolTipText("Limpar");
        btApagar.setMaximumSize(new java.awt.Dimension(40, 40));
        btApagar.setMinimumSize(new java.awt.Dimension(40, 40));
        btApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btApagarMouseClicked(evt);
            }
        });
        btApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelExecucaoLayout = new javax.swing.GroupLayout(jPanelExecucao);
        jPanelExecucao.setLayout(jPanelExecucaoLayout);
        jPanelExecucaoLayout.setHorizontalGroup(
            jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                .addGroup(jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelExec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPanel)
                    .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnProcessar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelExecucaoLayout.setVerticalGroup(
            jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                .addComponent(jScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTitle)
                    .addComponent(btApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnProcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanelExec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 75, Short.MAX_VALUE))
        );

        jTab.addTab("Execução", jPanelExecucao);

        jLblQtdEstados.setText("Qtd. Estados");

        JLblDerivacaoEstados.setText("Variáveis");

        jTxtVariaveis.setToolTipText("Separe as variáveis por ;");

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

        jBtnGerarTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/table-edit.png"))); // NOI18N
        jBtnGerarTabela.setToolTipText("Gerar tabela");
        jBtnGerarTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnGerarTabelaMouseClicked(evt);
            }
        });
        jBtnGerarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGerarTabelaActionPerformed(evt);
            }
        });

        jBtnSalvarTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/content-save.png"))); // NOI18N
        jBtnSalvarTabela.setToolTipText("Salvar algoritimo para execução");
        jBtnSalvarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarTabelaActionPerformed(evt);
            }
        });

        jBtnAbrirPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder-open.png"))); // NOI18N
        jBtnAbrirPDF.setToolTipText("Abrir algoritimo");
        jBtnAbrirPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAbrirPDFMouseClicked(evt);
            }
        });

        btLimparTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eraser.png"))); // NOI18N
        btLimparTabela.setToolTipText("Limpar algoritimo");
        btLimparTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLimparTabelaMouseClicked(evt);
            }
        });
        btLimparTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparTabelaActionPerformed(evt);
            }
        });

        jSliderDelay.setMajorTickSpacing(1);
        jSliderDelay.setMaximum(5);
        jSliderDelay.setMinimum(1);
        jSliderDelay.setMinorTickSpacing(1);
        jSliderDelay.setPaintLabels(true);
        jSliderDelay.setToolTipText("");
        jSliderDelay.setValue(1);

        jLblDelay.setText("Delay de execução (Segundos)");

        javax.swing.GroupLayout jPanelAlgoritmoLayout = new javax.swing.GroupLayout(jPanelAlgoritmo);
        jPanelAlgoritmo.setLayout(jPanelAlgoritmoLayout);
        jPanelAlgoritmoLayout.setHorizontalGroup(
            jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
            .addGroup(jPanelAlgoritmoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlgoritmoLayout.createSequentialGroup()
                        .addComponent(jLblQtdEstados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtQtdEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLblDerivacaoEstados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 461, Short.MAX_VALUE)
                        .addComponent(jBtnGerarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlgoritmoLayout.createSequentialGroup()
                        .addGroup(jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblDelay)
                            .addComponent(jSliderDelay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimparTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAbrirPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnSalvarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelAlgoritmoLayout.setVerticalGroup(
            jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlgoritmoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnGerarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAlgoritmoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblQtdEstados)
                            .addComponent(JLblDerivacaoEstados)
                            .addComponent(jTxtQtdEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlgoritmoLayout.createSequentialGroup()
                        .addComponent(jLblDelay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSliderDelay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBtnSalvarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnAbrirPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btLimparTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
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

        if (getVariaveis().trim().isEmpty()) {
            msgError = "Variáveis vazias";
        }

        if (getQtdEstados().trim().isEmpty()) {
            msgError = "Quantidade de estados vazia";
        }
        
        if (!getQtdEstados().trim().chars().allMatch(Character::isDigit)){
            msgError = "Estado deve ser um inteiro";
        }

        if (msgError != null) {
            JOptionPane.showMessageDialog(null, msgError);
            return;
        }

        createTable();

    }//GEN-LAST:event_jBtnGerarTabelaMouseClicked

    private void initComponentsData() {
        for (int i = 0; i < 20; i++) {
            getPanel().add(getJtextField());
        }
        getPanel().add(getBtnAdd());
        getPanelLoader().setVisible(false);
    }

    private void jBtnSalvarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarTabelaActionPerformed

        if (getTable().getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Crie a tabela e adicione os dados necessários");
            return;
        }

        setTableMappingAlgorithm(UtilTable.createListAlgorithm(getTable()));
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

        UtilAlgoritmoTuring.execute(getTableMappingAlgorithm(), datasExecution, getComponentsPanel(), this, getPanelLoader(), jSliderDelay.getValue());

    }//GEN-LAST:event_jBtnProcessarMouseClicked

    private void jBtnProcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProcessarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnProcessarActionPerformed

    private void jBtnAbrirPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAbrirPDFMouseClicked
        openDialogFile();
    }//GEN-LAST:event_jBtnAbrirPDFMouseClicked

    private void jBtnGerarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGerarTabelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnGerarTabelaActionPerformed

    private void btApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btApagarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btApagarMouseClicked

    private void btApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarActionPerformed
        // TODO add your handling code here:

        for (int i = 0; i < getComponentsPanel().length; i++) {
            Component component = getComponentsPanel()[i];
            if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setText("");
            }
        }

    }//GEN-LAST:event_btApagarActionPerformed

    private void btLimparTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimparTabelaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btLimparTabelaMouseClicked

    private void btLimparTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparTabelaActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dm = (DefaultTableModel) jTableVariaveis.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
        
        jTxtQtdEstados.setText("");
        jTxtVariaveis.setText("");
        setTableMappingAlgorithm(null);

    }//GEN-LAST:event_btLimparTabelaActionPerformed

    private JPanel getPanel() {
        return jPanelDados;
    }

    private JTable getTable() {
        return jTableVariaveis;
    }

    private JTextField getJtextField() {
        JTextField jTextField = new JTextField();
        jTextField.setSize(100, 10);
        jTextField.setPreferredSize(new Dimension(60, 40));
        jTextField.setAutoscrolls(false);
        jTextField.setHorizontalAlignment(JTextField.CENTER);
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
                dados.add(field.getText());
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

    private void createTable() {
        createTable(null);
    }

    private void createTable(String[] dados) {
        setTableMappingAlgorithm(null);
        UtilTable.createTable(dados, getVariaveis(), getQtdEstados(), getTable());
    }

    private String getVariaveis() {
        return jTxtVariaveis.getText();
    }

    private void setVariaveis(String variaveis) {
        jTxtVariaveis.setText(variaveis);
    }

    private String getQtdEstados() {
        return jTxtQtdEstados.getText();
    }

    private void setQtdEstados(String qtdEstados) {
        jTxtQtdEstados.setText(qtdEstados);
    }

    private JPanel getPanelLoader() {
        return jPanelExec;
    }

    private void openDialogFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("txt", "txt"));

        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                List<String> lines = UtilFile.readLines(selectedFile.getAbsolutePath());
                String[] dadosIniciais = lines.get(0).split("\\|");

                setQtdEstados(dadosIniciais[0]);
                setVariaveis(dadosIniciais[1]);

                String[] dadosTabela = new String[lines.size() - 1];
                Boolean documentoValido = true;
                for (int i = 1; i < lines.size(); i++) {
                    String line = lines.get(i);

                    if (line.trim().isEmpty()) {
                        continue;
                    }

                    int quantidadeSeparador = line.length() - line.replace(SeparadorVariavelEnum.SEPARADOR.getKey(), "").length();

                    if (quantidadeSeparador < 4) {
                        documentoValido = false;
                        break;
                    }

                    dadosTabela[i - 1] = line;
                }

                if (documentoValido) {
                    createTable(dadosTabela);
                } else {
                    JOptionPane.showMessageDialog(null, "Formato do documento inválido");
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
    private javax.swing.JButton btApagar;
    private javax.swing.JButton btLimparTabela;
    private javax.swing.JButton jBtnAbrirPDF;
    private javax.swing.JButton jBtnGerarTabela;
    private javax.swing.JButton jBtnProcessar;
    private javax.swing.JButton jBtnSalvarTabela;
    private javax.swing.JLabel jGifLoader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblDelay;
    private javax.swing.JLabel jLblQtdEstados;
    private javax.swing.JLabel jLblTitle;
    private javax.swing.JPanel jPanelAlgoritmo;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelExec;
    private javax.swing.JPanel jPanelExecucao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPanel;
    private javax.swing.JSlider jSliderDelay;
    private javax.swing.JTabbedPane jTab;
    private javax.swing.JTable jTableVariaveis;
    private javax.swing.JTextField jTxtQtdEstados;
    private javax.swing.JTextField jTxtVariaveis;
    // End of variables declaration//GEN-END:variables
}
