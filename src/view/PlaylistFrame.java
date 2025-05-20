package view;

import java.awt.GridLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Musica;

public class PlaylistFrame extends javax.swing.JFrame {
    private static PlaylistFrame instance;
    private JFrame menuAnterior;
    
     public PlaylistFrame(JFrame menuAnterior) {
        this.menuAnterior = menuAnterior;
        initComponents();
        setLocationRelativeTo(null);
    }

    public void adicionarMusicas(List<Musica> musicas) {
        DefaultTableModel model = (DefaultTableModel) TabelaPlaylist.getModel(); 
        model.setRowCount(0);
        
        for (Musica musica : musicas) {
            model.addRow(new Object[]{
              musica.getId(),
              musica.getTitulo(),
              musica.getArtista(),
              musica.getDuracao()

            }); 
        }
        
        TabelaPlaylist.getColumnModel().getColumn(0).setPreferredWidth(50);
        TabelaPlaylist.getColumnModel().getColumn(1).setPreferredWidth(150);
        TabelaPlaylist.getColumnModel().getColumn(2).setPreferredWidth(150);
        TabelaPlaylist.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        TabelaPlaylist.setRowHeight(25);
    }
    public static PlaylistFrame getInstance(JFrame parent) {
      if (instance == null) {
          instance = new PlaylistFrame(parent);
      }
      return instance;
    }
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVoltarPlaylist = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaPlaylist = new javax.swing.JTable();
        btnRemover = new javax.swing.JButton();
        btnCriarPlaylist = new javax.swing.JButton();
        btnEditarPlaylist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnVoltarPlaylist.setBackground(new java.awt.Color(29, 185, 84));
        btnVoltarPlaylist.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnVoltarPlaylist.setText("VOLTAR");
        btnVoltarPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPlaylistActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(29, 185, 84));
        jLabel1.setText("Sua PlayList");

        TabelaPlaylist.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TabelaPlaylist);

        btnRemover.setBackground(new java.awt.Color(29, 185, 84));
        btnRemover.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRemover.setText("REMOVER ");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnCriarPlaylist.setBackground(new java.awt.Color(29, 185, 84));
        btnCriarPlaylist.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCriarPlaylist.setText("CRIAR PLAYLIST");
        btnCriarPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarPlaylistActionPerformed(evt);
            }
        });

        btnEditarPlaylist.setBackground(new java.awt.Color(29, 185, 84));
        btnEditarPlaylist.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditarPlaylist.setText("EDITAR PLAYLIST");
        btnEditarPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPlaylistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarPlaylist))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCriarPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(btnVoltarPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriarPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltarPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPlaylistActionPerformed
        System.out.println("Botão voltar foi clicado!"); // Mensagem de debug
    this.dispose();
    if (menuAnterior != null) {
        menuAnterior.setVisible(true);
    } else {
        System.out.println("Erro: menuAnterior é null");
        // Criar uma nova instância se não houver referência
        new MenuFrame().setVisible(true);
    }
    }//GEN-LAST:event_btnVoltarPlaylistActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
     int linhaSelecionada = TabelaPlaylist.getSelectedRow();
    
    if (linhaSelecionada == -1) {
      JOptionPane.showMessageDialog(this, "Selecione uma música para remover!");
        return;
    }
    
    DefaultTableModel model = (DefaultTableModel) TabelaPlaylist.getModel();
    model.removeRow(linhaSelecionada);
    
    JOptionPane.showMessageDialog(this, "Música removida com sucesso!");
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnCriarPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarPlaylistActionPerformed
    String nomePlaylist = JOptionPane.showInputDialog(this, "Digite o nome da nova playlist:");
    
    if (nomePlaylist != null && !nomePlaylist.trim().isEmpty()) {
    
    JOptionPane.showMessageDialog(this, "Playlist '" + nomePlaylist + "' criada com sucesso!");
    } else if (nomePlaylist != null) {
    JOptionPane.showMessageDialog(this, "O nome da playlist não pode ser vazio!");
      }
    }//GEN-LAST:event_btnCriarPlaylistActionPerformed

    private void btnEditarPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPlaylistActionPerformed
       int linhaSelecionada = TabelaPlaylist.getSelectedRow();
       if (linhaSelecionada == -1) {
        JOptionPane.showMessageDialog(this, "Selecione uma música para editar!");
        return;
    }
        
    DefaultTableModel model = (DefaultTableModel) TabelaPlaylist.getModel();
    model.removeRow(linhaSelecionada);
    
    if(model.getValueAt(linhaSelecionada, 0) == null ) {
         JOptionPane.showMessageDialog(this, "A linha selecionada está vazia!");
        return;
    }
    
    String id = model.getValueAt(linhaSelecionada, 0) != null ? model.getValueAt(linhaSelecionada, 0).toString() : "";
    String musica = model.getValueAt(linhaSelecionada, 1) != null ? model.getValueAt(linhaSelecionada, 1).toString() : "";
    String artista = model.getValueAt(linhaSelecionada, 2) != null ? model.getValueAt(linhaSelecionada, 2).toString() : "";
    String duracao = model.getValueAt(linhaSelecionada, 3) != null ? model.getValueAt(linhaSelecionada, 3).toString() : "";
  
    JPanel panel = new JPanel(new GridLayout(4, 2));
    panel.add(new JLabel("Música:"));
    JTextField musicaField = new JTextField(musica);
    panel.add(musicaField);
    panel.add(new JLabel("Artista:"));
    JTextField artistaField = new JTextField(artista);
    panel.add(artistaField);
    panel.add(new JLabel("Duração:"));
    JTextField duracaoField = new JTextField(duracao);
    panel.add(duracaoField);
    
    int result = JOptionPane.showConfirmDialog(this, panel, 
            "Editar Música", JOptionPane.OK_CANCEL_OPTION);
    
    if (result == JOptionPane.OK_OPTION) {
        // Atualiza os dados na tabela
        model.setValueAt(musicaField.getText(), linhaSelecionada, 1);
        model.setValueAt(artistaField.getText(), linhaSelecionada, 2);
        model.setValueAt(duracaoField.getText(), linhaSelecionada, 3);
        
        javax.swing.JOptionPane.showMessageDialog(this, "Música atualizada com sucesso!");
    }
    
    
    }//GEN-LAST:event_btnEditarPlaylistActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaylistFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaPlaylist;
    private javax.swing.JButton btnCriarPlaylist;
    private javax.swing.JButton btnEditarPlaylist;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltarPlaylist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

  
    }
 
