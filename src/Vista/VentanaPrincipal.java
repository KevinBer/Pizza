/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;

/**
 *
 * @author kevin bermudez
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuOrdenes = new javax.swing.JMenu();
        jMItemAgregarOrden = new javax.swing.JMenuItem();
        jMItemDesglosar = new javax.swing.JMenuItem();
        jMItemBuscarPedido = new javax.swing.JMenuItem();
        JMenuClientes = new javax.swing.JMenu();
        jMenuItemAdministrar = new javax.swing.JMenu();
        jMItemAgregarCliente = new javax.swing.JMenuItem();
        jMItemBuscarCliente = new javax.swing.JMenuItem();
        jMItemEliminar = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin bermudez\\Documents\\NetBeansProjects\\PizzaRica\\src\\imagenes\\logo.jpg")); // NOI18N

        jMenuOrdenes.setText("Ordenes");

        jMItemAgregarOrden.setText("Agregar orden");
        jMenuOrdenes.add(jMItemAgregarOrden);

        jMItemDesglosar.setText("Desglosar total");
        jMenuOrdenes.add(jMItemDesglosar);

        jMItemBuscarPedido.setText("Buscar orden");
        jMenuOrdenes.add(jMItemBuscarPedido);

        jMenuBar1.add(jMenuOrdenes);

        JMenuClientes.setText("Clientes");

        jMenuItemAdministrar.setText("Administrar");

        jMItemAgregarCliente.setText("Agregar");
        jMenuItemAdministrar.add(jMItemAgregarCliente);

        jMItemBuscarCliente.setText("Buscar");
        jMenuItemAdministrar.add(jMItemBuscarCliente);

        jMItemEliminar.setText("Eliminar");
        jMenuItemAdministrar.add(jMItemEliminar);

        JMenuClientes.add(jMenuItemAdministrar);

        jMenuBar1.add(JMenuClientes);

        jMenuSalir.setText("Salir");
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMItemAgregarCliente;
    private javax.swing.JMenuItem jMItemAgregarOrden;
    private javax.swing.JMenuItem jMItemBuscarCliente;
    private javax.swing.JMenuItem jMItemBuscarPedido;
    private javax.swing.JMenuItem jMItemDesglosar;
    private javax.swing.JMenuItem jMItemEliminar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuItemAdministrar;
    private javax.swing.JMenu jMenuOrdenes;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
}
