package view;

import Controller.ControllerMusica;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Musica;


public class MusicaFrame extends javax.swing.JFrame {
    private ControllerMusica controllerMusica;
    
    public MusicaFrame() {
        initComponents();
        this.controllerMusica = new ControllerMusica();
        txtPesquisa.setToolTipText("Digite o nome da música ou artista");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        configurarTabelaMusicas();
        
    }
    private void configurarTabelaMusicas() {
        
        String[] colunas = {"Música", "Artista", "Duração"};
        Object[][] dados = {};
           
        
        DefaultTableModel model = new DefaultTableModel(dados, colunas){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        if (TabelasMusicas != null) {
            TabelasMusicas.setModel(model);
            TabelasMusicas.getColumnModel().getColumn(0).setPreferredWidth(200);
            TabelasMusicas.setRowHeight(25);
        }else{
        JOptionPane.showMessageDialog(this,
            "Erro ao configurar tabela",
            "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel2 = new javax.swing.JPanel();
        txtCatalogo = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelasMusicas = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnAddPlaylist = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        txtCatalogo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCatalogo.setForeground(new java.awt.Color(29, 185, 84));
        txtCatalogo.setText("Catálogo de Músicas");
        txtCatalogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnVoltar.setBackground(new java.awt.Color(29, 185, 84));
        btnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        TabelasMusicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Música", "Artista", "Duração"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelasMusicas);

        btnBuscar.setBackground(new java.awt.Color(29, 185, 84));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAddPlaylist.setBackground(new java.awt.Color(29, 185, 84));
        btnAddPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlaylistActionPerformed(evt);
            }
        });

        txtPesquisa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        txtPesquisa.setText("BUSCAR");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADICIONAR NA PLAYLIST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(txtPesquisa))
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new MenuFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String termo = txtPesquisa.getText().trim(); 
    
    if (termo.isEmpty() || termo.equalsIgnoreCase("Buscar")) {
        carregarTodasMusicas();
        return;
    }
    try {
        List<model.Musica> resultados = controllerMusica.pesquisarMusicas(termo);
        DefaultTableModel model = (DefaultTableModel) TabelasMusicas.getModel();
        
        model.setRowCount(0);
        
        if (resultados.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Nenhuma música encontrada com o termo: " + termo,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            for(Musica musica : resultados) {
                model.addRow(new Object[]{
                    musica.getId(),
                    musica.getTitulo(),
                    musica.getArtista(),
                    musica.getDuracao()
                });
            }
        }
    } catch(Exception ex) {
        JOptionPane.showMessageDialog(this,
            "Erro ao pesquisar: " + ex.getMessage(),
            "Erro", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
      
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAddPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlaylistActionPerformed
         int linhaSelecionada = TabelasMusicas.getSelectedRow();
    
    if (linhaSelecionada == -1) {
        JOptionPane.showMessageDialog(this, 
            "Selecione uma música para adicionar à playlist!",
            "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }
     
    
    
    
    
    
    
    
    
        
    }//GEN-LAST:event_btnAddPlaylistActionPerformed


    
    
    
    public static void main(String args[]) {
     
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelasMusicas;
    private javax.swing.JButton btnAddPlaylist;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtCatalogo;
    private javax.swing.JLabel txtPesquisa;
    // End of variables declaration//GEN-END:variables

    
    

   public MusicaFrame(JLabel txtCatalogo) {
        this.txtCatalogo = txtCatalogo;
        setLocationRelativeTo(null);
    }
    private void voltarParaMenu() {
        MenuFrame menu = new MenuFrame();
        menu.setVisible(true);
        this.dispose();
    }

//    private void carregarMusicas() {
//        try {
//            
//            MusicaDAO musicaDAO = new MusicaDAO();
//            DefaultTableModel model = (DefaultTableModel) TabelasMusicas.getModel();
//            model.setRowCount(0); 
//           
//            model.addRow(new Object[]{"Billie Jean", "Michael Jackson", "4:54"});
//            model.addRow(new Object[]{"Shape of You", "Ed Sheeran", "3:53"});
//            model.addRow(new Object[]{"Blinding Lights", "The Weeknd", "3:20"});
//            model.addRow(new Object[]{"Dance Monkey", "Tones and I", "3:29"});
//            model.addRow(new Object[]{"Save Your Tears", "The Weeknd", "3:35"});
//            model.addRow(new Object[]{"Montero", "Lil Nas X", "2:17"});
//            model.addRow(new Object[]{"Stay", "Post Malone", "3:24"});
//            model.addRow(new Object[]{"Industry Baby", "Lil Nas X", "3:32"});
//            model.addRow(new Object[]{"Sweet Child O'Mine", "Guns N' Roses", "5:56"});
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, 
//                "Erro ao carregar músicas: " + e.getMessage(),
//                "Erro", JOptionPane.ERROR_MESSAGE);
//        }
//    }

    private void carregarTodasMusicas() {
       try {
        List<Musica> todasMusicas = controllerMusica.listarTodasMusicas();
        DefaultTableModel model = (DefaultTableModel) TabelasMusicas.getModel();
        model.setRowCount(0);
        
        for(Musica musica : todasMusicas) {
            model.addRow(new Object[]{
                musica.getTitulo(),
                musica.getArtista(),
                musica.getDuracao()
            });
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this,
            "Erro ao carregar músicas: " + ex.getMessage(),
            "Erro", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
}


    }

    

