package org.data_net.main.java.vistas;

import java.awt.Image;
import javax.swing.ImageIcon;
import org.data_net.main.java.controladores.MainController;
import org.data_net.main.java.modelos.StatsModel;

public class MainWindow extends javax.swing.JFrame{
    public MainWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        ListPanel = new javax.swing.JPanel();
        ListCabanas = new javax.swing.JScrollPane();
        tablaCabanas = new javax.swing.JTable();
        ListReservas = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
        DataPanel = new javax.swing.JPanel();
        InputPanel = new javax.swing.JLayeredPane();
        CabinInput = new javax.swing.JPanel();
        txtEtiqueta = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ReserveInput = new javax.swing.JPanel();
        txtInquilino = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtCantInq = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCabana = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtDesde = new javax.swing.JTextField();
        txtHasta = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        OpsPanel = new javax.swing.JPanel();
        agregarButton = new javax.swing.JButton();
        listarButton = new javax.swing.JButton();
        borrarButton = new javax.swing.JButton();
        actualizarButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        nuevoButton = new javax.swing.JButton();
        StatsPanel = new javax.swing.JPanel();
        NumRep = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        percLabel = new javax.swing.JLabel();
        ocCabLabel = new javax.swing.JLabel();
        disCabLabel = new javax.swing.JLabel();
        nInqLabel = new javax.swing.JLabel();
        GraphRep = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        LeftPanel = new javax.swing.JPanel();
        reservasButton = new javax.swing.JButton();
        cabanasButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        verTxtButton = new javax.swing.JRadioButton();
        verGraphButton = new javax.swing.JRadioButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor Cabañas");
        setBackground(new java.awt.Color(92, 160, 142));

        ListPanel.setBackground(new java.awt.Color(92, 160, 142));
        ListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));
        ListPanel.setLayout(new java.awt.CardLayout());

        tablaCabanas = new javax.swing.JTable(){
            public boolean isCellEditable(int fila,int col){
                return false;
            }
        };
        tablaCabanas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tablaCabanas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Etiqueta", "Capacidad"
            }
        ));
        tablaCabanas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaCabanas.setFocusable(false);
        tablaCabanas.setRowMargin(4);
        tablaCabanas.getTableHeader().setReorderingAllowed(false);
        ListCabanas.setViewportView(tablaCabanas);

        ListPanel.add(ListCabanas, "card2");

        tablaCabanas = new javax.swing.JTable(){
            public boolean isCellEditable(int fila,int col){
                return false;
            }
        };
        tablaReservas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Inquilino", "Telefono", "Mail", "Cant Inq", "Cabaña", "Desde", "Hasta", "Costo"
            }
        ));
        tablaReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaReservas.setFocusable(false);
        tablaReservas.setRowMargin(4);
        tablaReservas.getTableHeader().setReorderingAllowed(false);
        ListReservas.setViewportView(tablaReservas);
        if (tablaReservas.getColumnModel().getColumnCount() > 0) {
            tablaReservas.getColumnModel().getColumn(0).setMinWidth(50);
            tablaReservas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaReservas.getColumnModel().getColumn(0).setMaxWidth(3050);
            tablaReservas.getColumnModel().getColumn(4).setMinWidth(60);
            tablaReservas.getColumnModel().getColumn(4).setPreferredWidth(60);
            tablaReservas.getColumnModel().getColumn(6).setPreferredWidth(60);
            tablaReservas.getColumnModel().getColumn(7).setPreferredWidth(50);
            tablaReservas.getColumnModel().getColumn(8).setMinWidth(50);
            tablaReservas.getColumnModel().getColumn(8).setPreferredWidth(50);
        }

        ListPanel.add(ListReservas, "card2");

        DataPanel.setBackground(new java.awt.Color(92, 160, 142));
        DataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        InputPanel.setLayout(new java.awt.CardLayout());

        CabinInput.setBackground(new java.awt.Color(92, 160, 142));
        CabinInput.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Datos"));

        txtEtiqueta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEtiqueta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEtiquetaActionPerformed(evt);
            }
        });

        txtCapacidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setText("ETIQUETA:");

        jLabel10.setText("CAPACIDAD:");

        javax.swing.GroupLayout CabinInputLayout = new javax.swing.GroupLayout(CabinInput);
        CabinInput.setLayout(CabinInputLayout);
        CabinInputLayout.setHorizontalGroup(
            CabinInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CabinInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CabinInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CabinInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(txtEtiqueta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        CabinInputLayout.setVerticalGroup(
            CabinInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabinInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CabinInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CabinInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        InputPanel.add(CabinInput, "card2");

        ReserveInput.setBackground(new java.awt.Color(92, 160, 142));
        ReserveInput.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Datos"));

        txtInquilino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtMail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCantInq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setText("INQUILINO:");

        jLabel14.setText("TELEFONO:");

        jLabel15.setText("MAIL:");

        jLabel16.setText("CANT INQUILINOS:");

        txtCabana.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel17.setText("CABAÑA:");

        jLabel18.setText("DESDE:");

        txtDesde.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDesde.setText("DD-MM-YYYY");
        txtDesde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDesdeMouseClicked(evt);
            }
        });
        txtDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesdeActionPerformed(evt);
            }
        });

        txtHasta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHasta.setText("DD-MM-YYYY");

        jLabel19.setText("HASTA:");

        txtCosto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel20.setText("COSTO:");

        javax.swing.GroupLayout ReserveInputLayout = new javax.swing.GroupLayout(ReserveInput);
        ReserveInput.setLayout(ReserveInputLayout);
        ReserveInputLayout.setHorizontalGroup(
            ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReserveInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReserveInputLayout.createSequentialGroup()
                        .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(ReserveInputLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addGap(113, 113, 113))
                    .addGroup(ReserveInputLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCosto)
                    .addComponent(txtHasta)
                    .addComponent(txtDesde)
                    .addComponent(txtCabana)
                    .addComponent(txtCantInq, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(txtMail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtInquilino, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        ReserveInputLayout.setVerticalGroup(
            ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReserveInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantInq, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCabana, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        InputPanel.add(ReserveInput, "card2");

        OpsPanel.setBackground(new java.awt.Color(92, 160, 142));
        OpsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        agregarButton.setText("AGREGAR");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        listarButton.setText("LISTAR");
        listarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarButtonActionPerformed(evt);
            }
        });

        borrarButton.setText("BORRAR");

        actualizarButton.setText("ACTUALIZAR");

        javax.swing.GroupLayout OpsPanelLayout = new javax.swing.GroupLayout(OpsPanel);
        OpsPanel.setLayout(OpsPanelLayout);
        OpsPanelLayout.setHorizontalGroup(
            OpsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OpsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(OpsPanelLayout.createSequentialGroup()
                        .addComponent(actualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        OpsPanelLayout.setVerticalGroup(
            OpsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agregarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualizarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrarButton)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DataPanelLayout = new javax.swing.GroupLayout(DataPanel);
        DataPanel.setLayout(DataPanelLayout);
        DataPanelLayout.setHorizontalGroup(
            DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanelLayout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(OpsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DataPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(InputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(191, Short.MAX_VALUE)))
        );
        DataPanelLayout.setVerticalGroup(
            DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataPanelLayout.createSequentialGroup()
                .addComponent(OpsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DataPanelLayout.createSequentialGroup()
                    .addComponent(InputPanel)
                    .addContainerGap()))
        );

        editarButton.setText("EDITAR");

        nuevoButton.setText("NUEVO");

        StatsPanel.setBackground(new java.awt.Color(138, 186, 174));
        StatsPanel.setLayout(new java.awt.CardLayout());

        NumRep.setBackground(new java.awt.Color(138, 186, 174));
        NumRep.setMaximumSize(new java.awt.Dimension(191, 600));
        NumRep.setMinimumSize(new java.awt.Dimension(191, 600));
        NumRep.setPreferredSize(new java.awt.Dimension(191, 600));

        jLabel1.setText("Cabañas Ocupadas");

        jLabel2.setText("Porcentaje de Ocupacion");

        jLabel3.setText("Cabañas Disponibles");

        jLabel4.setText("Numero de Inquilinos");

        percLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        percLabel.setText("jLabel5");

        ocCabLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ocCabLabel.setText("jLabel5");

        disCabLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        disCabLabel.setText("jLabel5");

        nInqLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nInqLabel.setText("jLabel5");

        javax.swing.GroupLayout NumRepLayout = new javax.swing.GroupLayout(NumRep);
        NumRep.setLayout(NumRepLayout);
        NumRepLayout.setHorizontalGroup(
            NumRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NumRepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(32, 32, 32))
            .addGroup(NumRepLayout.createSequentialGroup()
                .addGroup(NumRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NumRepLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(percLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NumRepLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(NumRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(NumRepLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(nInqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(NumRepLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(ocCabLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NumRepLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(disCabLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        NumRepLayout.setVerticalGroup(
            NumRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumRepLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(ocCabLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(disCabLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(nInqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(percLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StatsPanel.add(NumRep, "card2");

        GraphRep.setBackground(new java.awt.Color(138, 186, 174));

        jLabel5.setText("Disponibilidad de Cabañas");

        jLabel6.setText("Porcentaje de Ocupación");

        javax.swing.GroupLayout GraphRepLayout = new javax.swing.GroupLayout(GraphRep);
        GraphRep.setLayout(GraphRepLayout);
        GraphRepLayout.setHorizontalGroup(
            GraphRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GraphRepLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(GraphRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(GraphRepLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(GraphRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(GraphRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GraphRepLayout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37)))
        );
        GraphRepLayout.setVerticalGroup(
            GraphRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GraphRepLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel5)
                .addGap(213, 213, 213)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
            .addGroup(GraphRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GraphRepLayout.createSequentialGroup()
                    .addGap(175, 175, 175)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(460, Short.MAX_VALUE)))
        );

        StatsPanel.add(GraphRep, "card3");

        LeftPanel.setBackground(new java.awt.Color(0, 106, 78));

        reservasButton.setText("Reservas");

        cabanasButton.setText("Cabañas");
        cabanasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabanasButtonActionPerformed(evt);
            }
        });

        logo.setMaximumSize(new java.awt.Dimension(128, 128));
        logo.setMinimumSize(new java.awt.Dimension(128, 128));
        logo.setPreferredSize(new java.awt.Dimension(128, 128));

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reservasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cabanasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cabanasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(reservasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        ButtonPanel.setBackground(new java.awt.Color(138, 186, 174));

        verTxtButton.setBackground(new java.awt.Color(138, 186, 174));
        verTxtButton.setText("Ver Texto");
        verTxtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTxtButtonActionPerformed(evt);
            }
        });

        verGraphButton.setBackground(new java.awt.Color(138, 186, 174));
        verGraphButton.setText("VerGráfico");
        verGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verGraphButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verTxtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verGraphButton)
                .addContainerGap())
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verTxtButton)
                    .addComponent(verGraphButton))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(editarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nuevoButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StatsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StatsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listarButtonActionPerformed

    private void cabanasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabanasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cabanasButtonActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void txtEtiquetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEtiquetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEtiquetaActionPerformed

    private void txtDesdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDesdeMouseClicked
        
    }//GEN-LAST:event_txtDesdeMouseClicked

    private void txtDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesdeActionPerformed

    private void verTxtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTxtButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verTxtButtonActionPerformed

    private void verGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verGraphButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verGraphButtonActionPerformed

    public static void main(String args[]) {
       MainWindow v=new MainWindow();
       MainController con=new MainController(v);
       StatsModel statsModel=new StatsModel(con);
       v.setVisible(true);
       v.setLocationRelativeTo(null);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    public javax.swing.JPanel CabinInput;
    private javax.swing.JPanel DataPanel;
    private javax.swing.JPanel GraphRep;
    public javax.swing.JLayeredPane InputPanel;
    private javax.swing.JPanel LeftPanel;
    public javax.swing.JScrollPane ListCabanas;
    public javax.swing.JPanel ListPanel;
    public javax.swing.JScrollPane ListReservas;
    private javax.swing.JPanel NumRep;
    private javax.swing.JPanel OpsPanel;
    public javax.swing.JPanel ReserveInput;
    private javax.swing.JPanel StatsPanel;
    public javax.swing.JButton actualizarButton;
    public javax.swing.JButton agregarButton;
    public javax.swing.JButton borrarButton;
    public javax.swing.JButton cabanasButton;
    private javax.swing.JLabel disCabLabel;
    public javax.swing.JButton editarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    public javax.swing.JButton listarButton;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nInqLabel;
    public javax.swing.JButton nuevoButton;
    private javax.swing.JLabel ocCabLabel;
    private javax.swing.JLabel percLabel;
    public javax.swing.JButton reservasButton;
    public javax.swing.JTable tablaCabanas;
    public javax.swing.JTable tablaReservas;
    public javax.swing.JTextField txtCabana;
    public javax.swing.JTextField txtCantInq;
    public javax.swing.JTextField txtCapacidad;
    public javax.swing.JTextField txtCosto;
    public javax.swing.JTextField txtDesde;
    public javax.swing.JTextField txtEtiqueta;
    public javax.swing.JTextField txtHasta;
    public javax.swing.JTextField txtInquilino;
    public javax.swing.JTextField txtMail;
    public javax.swing.JTextField txtTelefono;
    private javax.swing.JRadioButton verGraphButton;
    private javax.swing.JRadioButton verTxtButton;
    // End of variables declaration//GEN-END:variables
}
