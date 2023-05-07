package Formulario;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tienda extends javax.swing.JFrame {

    DefaultTableModel tabla = new DefaultTableModel();

    public Tienda() {
        initComponents();
        this.setTitle("Tienda");
        this.jtbDetalledeCompra.setModel(tabla);
        this.tabla.addColumn("Nacionalidad");
        this.tabla.addColumn("Genero");
        this.tabla.addColumn("Tallas");
        this.tabla.addColumn("Prendas");
        this.tabla.addColumn("Cantidad");
        this.tabla.addColumn("Precio Unitario");
        this.tabla.addColumn("Total a Pagar");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbxNacionalidad = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnHombre = new javax.swing.JRadioButton();
        btnMujer = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        cbxTallas = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtPrenda = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTotalaPagar = new javax.swing.JTextField();
        btnGenerarCompra = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDetalledeCompra = new javax.swing.JTable();
        btnLimpiarTabla = new javax.swing.JButton();
        btnQuitarCompra = new javax.swing.JButton();
        btnNetoaPagar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtNetoaPagar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema Tienda de Ropa");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Descuentos y Promociones"));

        jLabel2.setText("Nacional:");

        jLabel3.setText("Hombre Talla: S = 0.05 , M = 0.07 , L = 0.10");

        jLabel4.setText("Mujer Talla: S = 0.04, M = 0.09, L = 0.12 ");

        jLabel5.setText("Extranjeros");

        jLabel6.setText("Hombre Talla: S = 0.04, M = 0.09, L = 0.12");

        jLabel7.setText("Mujer Talla: S = 0.05, M = 0.07, L = 0.10 ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Realizar Compra"))));

        jLabel8.setText("Nacionalidad:");

        cbxNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Peruano", "Extranjero" }));

        jLabel9.setText("Genero:");

        buttonGroup2.add(btnHombre);
        btnHombre.setText("Hombre");

        buttonGroup2.add(btnMujer);
        btnMujer.setText("Mujer");

        jLabel10.setText("Tallas:");

        cbxTallas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "S", "M", "L" }));

        jLabel11.setText("Prenda:");

        txtPrenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrendaKeyTyped(evt);
            }
        });

        jLabel12.setText("Cantidad:");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel13.setText("Precio:");

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel14.setText("Total a Pagar:");

        txtTotalaPagar.setEditable(false);

        btnGenerarCompra.setText("Generar Compra");
        btnGenerarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCompraActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnHombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMujer))
                    .addComponent(jLabel9)
                    .addComponent(btnGenerarCompra))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(cbxTallas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotalaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPrenda, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 17, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(37, 37, 37)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHombre)
                    .addComponent(btnMujer)
                    .addComponent(cbxTallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTotalaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarCompra)
                    .addComponent(btnLimpiar))
                .addGap(27, 27, 27))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de Compras"));

        jtbDetalledeCompra = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        jtbDetalledeCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbDetalledeCompra.getTableHeader().setResizingAllowed(false);
        jtbDetalledeCompra.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtbDetalledeCompra);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLimpiarTabla.setText("Limpiar Tabla");
        btnLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTablaActionPerformed(evt);
            }
        });

        btnQuitarCompra.setText("Quitar Compra");
        btnQuitarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarCompraActionPerformed(evt);
            }
        });

        btnNetoaPagar.setText("Neto a Pagar");
        btnNetoaPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNetoaPagarActionPerformed(evt);
            }
        });

        jLabel15.setText("Neto a Pagar S/.");

        txtNetoaPagar.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnLimpiarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuitarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNetoaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNetoaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnQuitarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNetoaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txtNetoaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCompraActionPerformed

        descuentos_hombres_peruanas();
        descuentos_mujeres_peruanas();
        descuentos_hombres_extranjeros();
        descuentos_mujeres_extranjeras();

        if (btnHombre.isSelected()) {
            this.tabla.addRow(new Object[]{this.cbxNacionalidad.getSelectedItem(), "Hombre",
                this.cbxTallas.getSelectedItem(), this.txtPrenda.getText(), this.txtCantidad.getText(),
                this.txtPrecio.getText(), this.txtTotalaPagar.getText()});
        } else if (btnMujer.isSelected()) {
            this.tabla.addRow(new Object[]{this.cbxNacionalidad.getSelectedItem(), "Mujer",
                this.cbxTallas.getSelectedItem(), this.txtPrenda.getText(), this.txtCantidad.getText(),
                this.txtPrecio.getText(), this.txtTotalaPagar.getText()});
        }
    }//GEN-LAST:event_btnGenerarCompraActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.cbxNacionalidad.setSelectedIndex(0);
        if (btnHombre.isSelected()) {
            buttonGroup2.clearSelection();
        }
        if (btnMujer.isSelected()) {
            buttonGroup2.clearSelection();
        }
        this.cbxTallas.setSelectedIndex(0);
        this.txtPrenda.setText("");
        this.txtCantidad.setText("");
        this.txtPrecio.setText("");
        this.txtTotalaPagar.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnQuitarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarCompraActionPerformed
        if (jtbDetalledeCompra.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro de la tabla");

            return;
        } else {
            int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que desea Eliminar el registro? ");

            if (JOptionPane.OK_OPTION == confirmar) {

                tabla.removeRow(this.jtbDetalledeCompra.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        }
    }//GEN-LAST:event_btnQuitarCompraActionPerformed

    private void btnLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTablaActionPerformed

        if (jtbDetalledeCompra.getRowCount() > 0) {
            tabla.setRowCount(0);
            this.txtNetoaPagar.setText("");
        } else {
            
            JOptionPane.showMessageDialog(null, "La tabla ya está vacía.");
        }
    }//GEN-LAST:event_btnLimpiarTablaActionPerformed

    private void btnNetoaPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNetoaPagarActionPerformed
        if (jtbDetalledeCompra.getRowCount() < 1) {
            
           JOptionPane.showMessageDialog(null, "Agregue Compras Primero.");
        } else {
            double sumatoria;
        double sumatorial = 0;
        int totalrow = jtbDetalledeCompra.getRowCount();
        totalrow -= 1;
        for (int i = 0; i <= (totalrow); i++) {
            sumatoria = Double.parseDouble(String.valueOf(jtbDetalledeCompra.getValueAt(i, 6)));
            sumatorial += sumatoria;
        }
        txtNetoaPagar.setText("S. " + String.valueOf(sumatorial));
     
        }
        
    }//GEN-LAST:event_btnNetoaPagarActionPerformed

    private void txtPrendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrendaKeyTyped

        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese solo Prendas de Ropa");
        }
    }//GEN-LAST:event_txtPrendaKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese solo la Cantidad");
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese solo el Precio");
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    public void descuentos_hombres_extranjeros() {

        Double cantidad_s, precio_s, total_s, desc_s = 0.04;
        Double cantidad_m, precio_m, total_m, desc_m = 0.09;
        Double cantidad_l, precio_l, total_l, desc_l = 0.12;

        //Selecciona Talla S
        if (cbxNacionalidad.getSelectedIndex() == 2) {
            if (this.btnHombre.isSelected()) {
                if (cbxTallas.getSelectedIndex() == 1) {
                    cantidad_s = Double.parseDouble(this.txtCantidad.getText());
                    precio_s = Double.parseDouble(this.txtPrecio.getText());
                    total_s = (precio_s * cantidad_s) - ((cantidad_s * precio_s) * desc_s);
                    this.txtTotalaPagar.setText(String.valueOf(total_s));
                }
            }
        }
        //Seleccion Talla M
        if (cbxNacionalidad.getSelectedIndex() == 2) {
            if (this.btnHombre.isSelected()) {
                if (cbxTallas.getSelectedIndex() == 2) {
                    cantidad_m = Double.parseDouble(this.txtCantidad.getText());
                    precio_m = Double.parseDouble(this.txtPrecio.getText());
                    total_m = (precio_m * cantidad_m) - ((cantidad_m * precio_m) * desc_m);
                    this.txtTotalaPagar.setText(String.valueOf(total_m));
                }
            }
        }
        //Selecciona Talla L
        if (cbxNacionalidad.getSelectedIndex() == 2) {
            if (this.btnHombre.isSelected()) {
                if (cbxTallas.getSelectedIndex() == 3) {
                    cantidad_l = Double.parseDouble(this.txtCantidad.getText());
                    precio_l = Double.parseDouble(this.txtPrecio.getText());
                    total_l = (precio_l * cantidad_l) - ((cantidad_l * precio_l) * desc_l);
                    this.txtTotalaPagar.setText(String.valueOf(total_l));
                }
            }
        }

    }

    public void descuentos_mujeres_extranjeras() {

        Double cantidad_s, precio_s, total_s, desc_s = 0.05;
        Double cantidad_m, precio_m, total_m, desc_m = 0.07;
        Double cantidad_l, precio_l, total_l, desc_l = 0.10;

        //Selecciona Talla S
        if (cbxNacionalidad.getSelectedIndex() == 2) {
            if (this.btnMujer.isSelected()) {
                if (cbxTallas.getSelectedIndex() == 1) {
                    cantidad_s = Double.parseDouble(this.txtCantidad.getText());
                    precio_s = Double.parseDouble(this.txtPrecio.getText());
                    total_s = (precio_s * cantidad_s) - ((cantidad_s * precio_s) * desc_s);
                    this.txtTotalaPagar.setText(String.valueOf(total_s));
                }
            }
        }
        //Seleccion Talla M
        if (cbxNacionalidad.getSelectedIndex() == 2) {
            if (this.btnMujer.isSelected()) {
                if (cbxTallas.getSelectedIndex() == 2) {
                    cantidad_m = Double.parseDouble(this.txtCantidad.getText());
                    precio_m = Double.parseDouble(this.txtPrecio.getText());
                    total_m = (precio_m * cantidad_m) - ((cantidad_m * precio_m) * desc_m);
                    this.txtTotalaPagar.setText(String.valueOf(total_m));
                }
            }
        }
        //Selecciona Talla L
        if (cbxNacionalidad.getSelectedIndex() == 2) {
            if (this.btnMujer.isSelected()) {
                if (cbxTallas.getSelectedIndex() == 3) {
                    cantidad_l = Double.parseDouble(this.txtCantidad.getText());
                    precio_l = Double.parseDouble(this.txtPrecio.getText());
                    total_l = (precio_l * cantidad_l) - ((cantidad_l * precio_l) * desc_l);
                    this.txtTotalaPagar.setText(String.valueOf(total_l));
                }
            }
        }

    }

    public void descuentos_hombres_peruanas() {
        Double cantidad_s, precio_s, total_s, desc_s = 0.05;
        Double cantidad_m, precio_m, total_m, desc_m = 0.07;
        Double cantidad_l, precio_l, total_l, desc_l = 0.10;

        //Selecciona Talla S
        if (cbxNacionalidad.getSelectedIndex() == 1) {
            if (this.btnHombre.isSelected()) {
                if (cbxTallas.getSelectedIndex() == 1) {
                    cantidad_s = Double.parseDouble(this.txtCantidad.getText());
                    precio_s = Double.parseDouble(this.txtPrecio.getText());
                    total_s = (precio_s * cantidad_s) - ((cantidad_s * precio_s) * desc_s);
                    this.txtTotalaPagar.setText(String.valueOf(total_s));
                }
            }
        }
        //Seleccion Talla M
        if (cbxNacionalidad.getSelectedIndex() == 1) {
            if (this.btnHombre.isSelected()) {
                if (cbxTallas.getSelectedIndex() == 2) {
                    cantidad_m = Double.parseDouble(this.txtCantidad.getText());
                    precio_m = Double.parseDouble(this.txtPrecio.getText());
                    total_m = (precio_m * cantidad_m) - ((cantidad_m * precio_m) * desc_m);
                    this.txtTotalaPagar.setText(String.valueOf(total_m));
                }
            }
        }
        //Selecciona Talla L
        if (cbxNacionalidad.getSelectedIndex() == 1) {
            if (this.btnHombre.isSelected()) {
                if (cbxTallas.getSelectedIndex() == 3) {
                    cantidad_l = Double.parseDouble(this.txtCantidad.getText());
                    precio_l = Double.parseDouble(this.txtPrecio.getText());
                    total_l = (precio_l * cantidad_l) - ((cantidad_l * precio_l) * desc_l);
                    this.txtTotalaPagar.setText(String.valueOf(total_l));
                }
            }
        }

    }

    public void descuentos_mujeres_peruanas() {
        Double cantidad_s, precio_s, total_s, desc_s = 0.05;
        Double cantidad_m, precio_m, total_m, desc_m = 0.07;
        Double cantidad_l, precio_l, total_l, desc_l = 0.10;

        //Selecciona Talla S
        if (cbxNacionalidad.getSelectedIndex() == 1) {
            if (this.btnMujer.isSelected()) {
                if (cbxTallas.getSelectedIndex() == 1) {
                    cantidad_s = Double.parseDouble(this.txtCantidad.getText());
                    precio_s = Double.parseDouble(this.txtPrecio.getText());
                    total_s = (precio_s * cantidad_s) - ((cantidad_s * precio_s) * desc_s);
                    this.txtTotalaPagar.setText(String.valueOf(total_s));
                }
            }
        }
        //Seleccion Talla M
        if (cbxNacionalidad.getSelectedIndex() == 1) {
            if (this.btnMujer.isSelected()) {
                if (cbxTallas.getSelectedIndex() == 2) {
                    cantidad_m = Double.parseDouble(this.txtCantidad.getText());
                    precio_m = Double.parseDouble(this.txtPrecio.getText());
                    total_m = (precio_m * cantidad_m) - ((cantidad_m * precio_m) * desc_m);
                    this.txtTotalaPagar.setText(String.valueOf(total_m));
                }
            }
        }
        //Selecciona Talla L
        if (cbxNacionalidad.getSelectedIndex() == 1) {
            if (this.btnMujer.isSelected()) {
                if (cbxTallas.getSelectedIndex() == 3) {
                    cantidad_l = Double.parseDouble(this.txtCantidad.getText());
                    precio_l = Double.parseDouble(this.txtPrecio.getText());
                    total_l = (precio_l * cantidad_l) - ((cantidad_l * precio_l) * desc_l);
                    this.txtTotalaPagar.setText(String.valueOf(total_l));
                }
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
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarCompra;
    private javax.swing.JRadioButton btnHombre;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarTabla;
    private javax.swing.JRadioButton btnMujer;
    private javax.swing.JButton btnNetoaPagar;
    private javax.swing.JButton btnQuitarCompra;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbxNacionalidad;
    private javax.swing.JComboBox<String> cbxTallas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbDetalledeCompra;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNetoaPagar;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrenda;
    private javax.swing.JTextField txtTotalaPagar;
    // End of variables declaration//GEN-END:variables
}
