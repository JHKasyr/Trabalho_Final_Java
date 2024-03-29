/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.LivroController;
import Model.LivroModel;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno(a) TDS Noite
 */
public class CRUDLivro extends javax.swing.JFrame {

    /**
     * Creates new form CRUDLivro
     */
    public CRUDLivro() {
        initComponents();

        txtTitulo.setEditable(false);
        txtGenero.setEditable(false);
        txtPaginas.setEditable(false);
        txtResumo.setEditable(false);
        listarLivrosView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        panelInformações = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        lblPaginas = new javax.swing.JLabel();
        txtPaginas = new javax.swing.JTextField();
        lblResumo = new javax.swing.JLabel();
        txtResumo = new javax.swing.JTextField();
        lblCadastro = new javax.swing.JLabel();
        panelCRUD = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        panelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLivro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 800));

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        panelInformações.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setText("Título:");

        lblGenero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGenero.setText("Gênero:");

        lblPaginas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPaginas.setText("Nº Páginas:");

        lblResumo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResumo.setText("Resumo:");

        javax.swing.GroupLayout panelInformaçõesLayout = new javax.swing.GroupLayout(panelInformações);
        panelInformações.setLayout(panelInformaçõesLayout);
        panelInformaçõesLayout.setHorizontalGroup(
            panelInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformaçõesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInformaçõesLayout.createSequentialGroup()
                        .addGap(0, 41, Short.MAX_VALUE)
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInformaçõesLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGenero))
                    .addGroup(panelInformaçõesLayout.createSequentialGroup()
                        .addGroup(panelInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblResumo)
                            .addComponent(lblPaginas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPaginas)
                            .addComponent(txtResumo))))
                .addContainerGap())
        );
        panelInformaçõesLayout.setVerticalGroup(
            panelInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformaçõesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(panelInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaginas)
                    .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblResumo)
                    .addComponent(txtResumo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCadastro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblCadastro.setText("Cadastro Livro");

        panelCRUD.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CRUD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        btnNovo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCRUDLayout = new javax.swing.GroupLayout(panelCRUD);
        panelCRUD.setLayout(panelCRUDLayout);
        panelCRUDLayout.setHorizontalGroup(
            panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addContainerGap())
        );
        panelCRUDLayout.setVerticalGroup(
            panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTabela.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabela", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        tableLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Gênero", "Nº Páginas", "Resumo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLivroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableLivro);

        javax.swing.GroupLayout panelTabelaLayout = new javax.swing.GroupLayout(panelTabela);
        panelTabela.setLayout(panelTabelaLayout);
        panelTabelaLayout.setHorizontalGroup(
            panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelTabelaLayout.setVerticalGroup(
            panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabelaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVoltar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(panelInformações, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(lblCadastro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelCRUD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInformações, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        txtTitulo.setText("");
        txtGenero.setText("");
        txtPaginas.setText("");
        txtResumo.setText("");

        txtTitulo.setEditable(true);
        txtGenero.setEditable(true);
        txtPaginas.setEditable(true);
        txtResumo.setEditable(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        int valor = JOptionPane.showConfirmDialog(null,
                "Deseja realmente cancelar?",
                "Confirma Exclusão",
                JOptionPane.YES_NO_OPTION);

        if (valor == 0) {
            txtTitulo.setText("");
            txtGenero.setText("");
            txtPaginas.setText("");
            txtResumo.setText("");

            txtTitulo.setEditable(false);
            txtGenero.setEditable(false);
            txtPaginas.setEditable(false);
            txtResumo.setEditable(false);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        String titulo = txtTitulo.getText();
        String genero = txtGenero.getText();
        String paginas = txtPaginas.getText();
        String resumo = txtResumo.getText();

        LivroController novoLivro = new LivroController();
        novoLivro.cadastrarLivroController(titulo, genero, paginas, resumo);

        txtTitulo.setText("");
        txtGenero.setText("");
        txtPaginas.setText("");
        txtResumo.setText("");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int id = enviarId();
        
        LivroController excluirLivro = new LivroController();
        excluirLivro.excluirLivro(id);
        txtPaginas.setText("");
        txtResumo.setText("");
        txtGenero.setText("");
        listarLivrosView();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int id = enviarId();
        String titulo = txtTitulo.getText();
        String genero = txtGenero.getText();
        String paginas = txtPaginas.getText();
        String sinopse = txtResumo.getText();
        
                
        LivroController alterarLivro = new LivroController();
        alterarLivro.alterarLivroController(id,titulo, genero, paginas, sinopse);
        
        listarLivrosView();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tableLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLivroMouseClicked
        int idAux = Integer.parseInt(tableLivro.getModel().getValueAt(tableLivro.getSelectedRow(), 0).toString());
        String titulo = tableLivro.getModel().getValueAt(tableLivro.getSelectedRow(), 1).toString();
        String genero = tableLivro.getModel().getValueAt(tableLivro.getSelectedRow(), 2).toString();
        String paginas = tableLivro.getModel().getValueAt(tableLivro.getSelectedRow(), 3).toString();
        String sinopse = tableLivro.getModel().getValueAt(tableLivro.getSelectedRow(), 4).toString();
        
        
        txtTitulo.setText(titulo);
        txtGenero.setText(genero);
        txtPaginas.setText(paginas);
        txtResumo.setText(sinopse);
    }//GEN-LAST:event_tableLivroMouseClicked

    void listarLivrosView() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) tableLivro.getModel();
            dtm.setRowCount(0);
            LivroController livroController = new LivroController();

            ArrayList<LivroModel> listaCliente = livroController.listarLivrosController();

            Iterator<LivroModel> iterator = listaCliente.iterator();
            while (iterator.hasNext()) {
                LivroModel livro = iterator.next();
                dtm.addRow(new Object[]{
                    livro.getId(),
                    livro.getTitulo(),
                    livro.getGenero(),
                    livro.getPaginas(),
                    livro.getResumo()
                });
            }

        } catch (Exception e) {
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CRUDLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDLivro().setVisible(true);
            }
        });
    }

    private int enviarId() {
        int idAux = Integer.parseInt(tableLivro.getModel().getValueAt(tableLivro.getSelectedRow(), 0).toString());
        return idAux;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblPaginas;
    private javax.swing.JLabel lblResumo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelCRUD;
    private javax.swing.JPanel panelInformações;
    private javax.swing.JPanel panelTabela;
    private javax.swing.JTable tableLivro;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtResumo;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
