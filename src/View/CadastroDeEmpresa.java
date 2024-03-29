/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModelBeans.EmpresaBeans;
import ModelBeans.Hora;
import ModelBeans.ModeloTabela;
import ModelConexao.ConexaoBD;
import ModelDao.EmpresaDao;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Aurelio Macie Junior
 */
public class CadastroDeEmpresa extends javax.swing.JFrame {

    EmpresaBeans mod = new EmpresaBeans();
    ModelDao.EmpresaDao control = new EmpresaDao();
    EmpresaDao dao = new EmpresaDao();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
    
   /**
     * Creates new form CadastroDeEmpresa1
     */
    public CadastroDeEmpresa() {
        initComponents();
        preencherTabela("select * from empresa order by empresa_id");
        
        timer1.start();
        
        //Serve Para Exibir A Data Actual Do Sistema.
        Date data = new Date();
        DateFormat formatadorD = DateFormat.getDateInstance(DateFormat.LONG);
        jLabelDataDoSistema.setText(formatadorD.format(data));
        
        //Agora A Hora Do Sistema    
        Hora mostra_hora = new Hora();
        mostra_hora.ler_hora();
        jLabelHoraDoSistema.setText("Hora " +mostra_hora.hora);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTextFieldLocalizacao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpresaFornecedora = new javax.swing.JTable();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldContacto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldFornecedora = new javax.swing.JTextField();
        jLabelHoraDoSistema = new javax.swing.JLabel();
        jLabelDataDoSistema = new javax.swing.JLabel();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulário De Registro De Empresa");

        jTextFieldPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/search_24px.png"))); // NOI18N
        jButtonPesquisar.setToolTipText("Efectuar Pesquisa Pelo Nome");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/Claro_minimize_window_24px.png"))); // NOI18N
        jButton6.setToolTipText("Minimize");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/Claro_maximize_window_24px.png"))); // NOI18N
        jButton4.setToolTipText("Maximize");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/Claro_close_window_24px.png"))); // NOI18N
        jButton10.setToolTipText("Fechar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTextFieldLocalizacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldLocalizacao.setEnabled(false);

        jTableEmpresaFornecedora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableEmpresaFornecedora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpresaFornecedoraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmpresaFornecedora);

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Localização");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fornecedora");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");

        jTextFieldId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldId.setEnabled(false);

        jTextFieldContacto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldContacto.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contacto");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldEmail.setEnabled(false);

        jTextFieldFornecedora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldFornecedora.setEnabled(false);

        jLabelHoraDoSistema.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHoraDoSistema.setForeground(new java.awt.Color(255, 255, 255));

        jLabelDataDoSistema.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDataDoSistema.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHoraDoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDataDoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldFornecedora, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldContacto)
                            .addComponent(jTextFieldEmail))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelHoraDoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDataDoSistema, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFornecedora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(884, 483));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed

        mod.setPesquisa(jTextFieldPesquisar.getText());
        EmpresaBeans model = control.buscaEmpresa(mod);

        jTextFieldId.setText(String.valueOf(model.getCodigo()));
        jTextFieldFornecedora.setText(model.getNome());
        jTextFieldLocalizacao.setText(model.getLocalizacao());
        jTextFieldContacto.setText(model.getContacto());
        jTextFieldEmail.setText(model.getEmail());

        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);

        jTextFieldId.setEnabled(false);
        jTextFieldFornecedora.setEnabled(false);
        jTextFieldLocalizacao.setEnabled(false);
        jTextFieldContacto.setEnabled(false);
        jTextFieldEmail.setEnabled(false);

        jTextFieldId.setText("");
        jTextFieldFornecedora.setText("");
        jTextFieldLocalizacao.setText("");
        jTextFieldContacto.setText("");
        jTextFieldEmail.setText("");

        preencherTabela("select * from empresa where empresa_nome like '%" + mod.getPesquisa() + "%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableEmpresaFornecedoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmpresaFornecedoraMouseClicked

        String nome = ""+jTableEmpresaFornecedora.getValueAt(jTableEmpresaFornecedora.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select * from empresa where empresa_nome='"+nome+"'");
        try {
            conex.rs.first();
            jTextFieldId.setText(String.valueOf(conex.rs.getInt("empresa_id")));
            jTextFieldFornecedora.setText(String.valueOf(conex.rs.getString("empresa_nome")));
            jTextFieldLocalizacao.setText(String.valueOf(conex.rs.getString("empresa_localizacao")));
            jTextFieldContacto.setText(String.valueOf(conex.rs.getString("empresa_contacto")));
            jTextFieldEmail.setText(String.valueOf(conex.rs.getString("empresa_email")));

            jButtonExcluir.setEnabled(true);
            jButtonEditar.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);

            jTextFieldFornecedora.setEnabled(false);
            jTextFieldLocalizacao.setEnabled(false);
            jTextFieldContacto.setEnabled(false);
            jTextFieldEmail.setEnabled(false);

            preencherTabela("select * from empresa order by empresa_id");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ERRO AO SELECIONAR" +ex);
        }
        conex.desconexao();
    }//GEN-LAST:event_jTableEmpresaFornecedoraMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        jTextFieldId.setText("");
        jTextFieldFornecedora.setEnabled(false);
        jTextFieldLocalizacao.setEnabled(false);
        jTextFieldContacto.setEnabled(false);
        jTextFieldEmail.setEnabled(false);

        jTextFieldFornecedora.setText("");
        jTextFieldLocalizacao.setText("");
        jTextFieldContacto.setText("");
        jTextFieldEmail.setText("");

        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Excluir?");
        if(resposta == JOptionPane.YES_OPTION){
            mod.setCodigo(Integer.parseInt(jTextFieldId.getText()));
            control.excluir(mod);

            jTextFieldPesquisar.setText("");
            jTextFieldId.setText("");
            jTextFieldContacto.setText("");
            jTextFieldFornecedora.setText("");
            jTextFieldEmail.setText("");
            jTextFieldLocalizacao.setText("");

            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            preencherTabela("select * from empresa order by empresa_id");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed

        flag = 2;

        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);

        jTextFieldFornecedora.setEnabled(true);
        jTextFieldLocalizacao.setEnabled(true);
        jTextFieldContacto.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        jTextFieldPesquisar.setText("");
        if (jTextFieldFornecedora.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha O Campo 'Nome' Para Continuar!");
            jTextFieldFornecedora.requestFocus();
        }else if(jTextFieldLocalizacao.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha O Campo 'Contacto' Para Continuar!");
            jTextFieldLocalizacao.requestFocus();
        }else if(jTextFieldContacto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha O Campo 'Nascimento' Para Continuar!");
            jTextFieldContacto.requestFocus();
        }else if(jTextFieldEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha O Campo 'Número De Identificação' Para Continuar!");
            jTextFieldEmail.requestFocus();

        } else if (flag==1){

            mod.setNome(jTextFieldFornecedora.getText());
            mod.setLocalizacao(jTextFieldLocalizacao.getText());
            mod.setContacto(jTextFieldContacto.getText());
            mod.setEmail(jTextFieldEmail.getText());
            control.salvar(mod);

            jButtonEditar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);

            jTextFieldFornecedora.setText("");
            jTextFieldLocalizacao.setText("");
            jTextFieldContacto.setText("");
            jTextFieldEmail.setText("");
            jTextFieldId.setText("");

            jTextFieldContacto.setEnabled(!true);
            jTextFieldLocalizacao.setEnabled(!true);
            jTextFieldFornecedora.setEnabled(!true);
            jTextFieldEmail.setEnabled(!true);
            preencherTabela("select * from empresa order by empresa_id");
        } else{

            jTextFieldContacto.setEnabled(!true);
            jTextFieldFornecedora.setEnabled(!true);
            jTextFieldLocalizacao.setEnabled(!true);
            jTextFieldEmail.setEnabled(!true);

            jButtonEditar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);

            mod.setCodigo(Integer.parseInt(jTextFieldId.getText()));
            mod.setNome(jTextFieldFornecedora.getText());
            mod.setContacto(jTextFieldContacto.getText());
            mod.setLocalizacao(jTextFieldLocalizacao.getText());
            mod.setEmail(jTextFieldEmail.getText());
            control.editar(mod);

            jTextFieldFornecedora.setText("");
            jTextFieldContacto.setText("");
            jTextFieldLocalizacao.setText("");
            jTextFieldEmail.setText("");
            jTextFieldId.setText("");

            preencherTabela("select * from empresa order by empresa_id");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed

        flag = 1;

        jTextFieldFornecedora.setEnabled(true);
        jTextFieldLocalizacao.setEnabled(true);
        jTextFieldContacto.setEnabled(true);
        jTextFieldEmail.setEnabled(true);

        jTextFieldFornecedora.setText("");
        jTextFieldLocalizacao.setText("");
        jTextFieldContacto.setText("");
        jTextFieldEmail.setText("");

        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setExtendedState(Login.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (this.getExtendedState()!= Login.MAXIMIZED_BOTH){
            this.setExtendedState(Login.MAXIMIZED_BOTH);
        }else{
            this.setExtendedState(Login.NORMAL);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        //Agora A Hora Do Sistema    
        Hora mostra_hora = new Hora();
        mostra_hora.ler_hora();
        jLabelHoraDoSistema.setText("Hora Actual.: " +mostra_hora.hora);        // TODO add your handling code here:
    }//GEN-LAST:event_timer1OnTime

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    public void preencherTabela(String sql){
            
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"id","Nome","Localização","Contacto","Email"};
        conex.conexao();
        
        conex.executaSql(sql);
            try {
                conex.rs.first();
                do{
                  dados.add(new Object[]{conex.rs.getInt("empresa_id"),conex.rs.getString("empresa_nome"),conex.rs.getString("empresa_localizacao"),conex.rs.getString("empresa_contacto"),conex.rs.getString("empresa_email")});  
                }while(conex.rs.next());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro Ao Preencher Arraylist"+ex);
            }
            
            ModeloTabela modelo = new ModeloTabela(dados, colunas);
            
            jTableEmpresaFornecedora.setModel(modelo);
            jTableEmpresaFornecedora.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableEmpresaFornecedora.getColumnModel().getColumn(0).setResizable(false);
            jTableEmpresaFornecedora.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTableEmpresaFornecedora.getColumnModel().getColumn(1).setResizable(false);
            jTableEmpresaFornecedora.getColumnModel().getColumn(2).setPreferredWidth(230);
            jTableEmpresaFornecedora.getColumnModel().getColumn(2).setResizable(false);
            jTableEmpresaFornecedora.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTableEmpresaFornecedora.getColumnModel().getColumn(3).setResizable(false);
            jTableEmpresaFornecedora.getColumnModel().getColumn(4).setPreferredWidth(230);
            jTableEmpresaFornecedora.getTableHeader().setReorderingAllowed(false);
            jTableEmpresaFornecedora.setAutoResizeMode(jTableEmpresaFornecedora.AUTO_RESIZE_OFF);
            jTableEmpresaFornecedora.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            conex.desconexao();
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
            java.util.logging.Logger.getLogger(CadastroDeEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelDataDoSistema;
    private javax.swing.JLabel jLabelHoraDoSistema;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmpresaFornecedora;
    private javax.swing.JTextField jTextFieldContacto;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFornecedora;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLocalizacao;
    private javax.swing.JTextField jTextFieldPesquisar;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables
}
