package view;

import Controller.ControllerMusica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Musica;



public class MusicaFrame extends javax.swing.JFrame {
    private ControllerMusica controllerMusica;
    private JFrame menuAnterior;

    
    public MusicaFrame() {
        initComponents();
        this.controllerMusica = new ControllerMusica();
        
        txtPesquisa.setToolTipText("Digite o nome da música ou artista");
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        configurarTabelaMusicas();
        carregarMusicas();
        setLocationRelativeTo(null);
        

        
    }
    private void configurarTabelaMusicas() {
         String[] colunas = {"ID", "Música", "Artista", "Duração"};
        DefaultTableModel model = new DefaultTableModel(colunas,0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
            TabelasMusicas.setModel(model);
            TabelasMusicas.getColumnModel().getColumn(0).setPreferredWidth(50);
            TabelasMusicas.setRowHeight(25);
    
    }
    private void carregarMusicas() {
        DefaultTableModel model = (DefaultTableModel) TabelasMusicas.getModel();
        model.setRowCount(0);
        
        try {
            List<Musica> musicas = controllerMusica.listarTodasMusicas();
            for(Musica musica : musicas) {
                model.addRow(new Object[]{
                    musica.getId(),
                    musica.getTitulo(),
                    musica.getArtista(),
                    musica.getDuracao()
                });
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this,
                "Erro ao carregar músicas: " + ex.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
            
            // Carrega dados de exemplo em caso de erro
            model.addRow(new Object[]{1,"Billie Jean", "Michael Jackson", "4:54"});
            model.addRow(new Object[]{2,"Shape of You", "Ed Sheeran", "3:53"});
            model.addRow(new Object[]{3,"Blinding Lights", "The Weeknd", "3:20"});
            model.addRow(new Object[]{4,"Dance Monkey", "Tones and I", "3:29"});
            model.addRow(new Object[]{5,"Save Your Tears", "The Weeknd", "3:35"});
            model.addRow(new Object[]{6,"Montero", "Lil Nas X", "2:17"});
            model.addRow(new Object[]{7,"Stay", "Post Malone", "3:24"});
            model.addRow(new Object[]{8,"Industry Baby", "Lil Nas X", "3:32"});
            model.addRow(new Object[]{9,"Sweet Child O'Mine", "Guns N' Roses", "5:56"});
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
        txtPesquisa = new javax.swing.JTextField();

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
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAddPlaylist.setBackground(new java.awt.Color(29, 185, 84));
        btnAddPlaylist.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAddPlaylist.setText("ADICIONAR NA PLAYLIST");
        btnAddPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlaylistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(txtCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(txtPesquisa))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(txtCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
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
      System.out.println("Botão voltar clicado");
      
    if(menuAnterior != null) {
          System.out.println("Tornando menu anterior visível");
          menuAnterior.setVisible(true);
          menuAnterior.setLocationRelativeTo(null); 
          
    } else {
        new MenuFrame().setVisible(true); 
    }
    this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String termo = txtPesquisa.getText().trim(); 
    
    if (termo.isEmpty() || termo.equalsIgnoreCase("Buscar")) {
        carregarMusicas();
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
    try{
        int[] selectedRows = TabelasMusicas.getSelectedRows();
        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(this, "Selecione pelo menos uma música!",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        List<Musica> musicasSelecionadas = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) TabelasMusicas.getModel();
        
        for (int row: selectedRows) {
            
            int modelRow = TabelasMusicas.convertRowIndexToModel(row);
            
            int id = (int) model.getValueAt(modelRow, 0 );
            String titulo = model.getValueAt(modelRow, 1).toString();
            String artista = model.getValueAt(modelRow, 2).toString();
            String duracao = model.getValueAt(modelRow, 3).toString();
            
            musicasSelecionadas.add(new Musica(id,titulo, artista, duracao));
        }
        
        PlaylistFrame playlistFrame = PlaylistFrame.getInstance(this);
        playlistFrame.adicionarMusicas(musicasSelecionadas);
        playlistFrame.setVisible(true);
    
        JOptionPane.showMessageDialog(this,
            musicasSelecionadas.size() + "músicas adicionadas a playlist!",
            "Sucesso" , JOptionPane.INFORMATION_MESSAGE);
    
        } catch (Exception ex)  {
            JOptionPane.showMessageDialog(this,
                    "Erro ao adicionar músicas: " + ex.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtCatalogo;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

   

  
}

    

