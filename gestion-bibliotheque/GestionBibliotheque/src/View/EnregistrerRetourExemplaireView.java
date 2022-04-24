package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EnregistrerRetourExemplaireView extends javax.swing.JFrame {

    public EnregistrerRetourExemplaireView() {
       
    	initComponents();
    	
    	initView(); 
    	
        ImageIcon img = new ImageIcon(getClass().getResource("/ressources/icon.png"));
        setIconImage(img.getImage());
    	
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")                     
    private void initComponents() {

    	  pnlInfoEmprunt = new javax.swing.JPanel();
          lblCin = new javax.swing.JLabel();
          txtCin = new javax.swing.JTextField();
          lblNumInv = new javax.swing.JLabel();
          txtNumInv = new javax.swing.JTextField();
          lblDateEmprunt = new javax.swing.JLabel();
          dtDateEmprunt = new com.toedter.calendar.JDateChooser();
          pnlInfoRetour = new javax.swing.JPanel();
          lblDateRetour = new javax.swing.JLabel();
          dtDateRetour = new com.toedter.calendar.JDateChooser();
          lblEtat = new javax.swing.JLabel();
          comboEtat = new javax.swing.JComboBox<>();
          checkBoxEmprunt = new javax.swing.JCheckBox();
          btnAnnuler = new javax.swing.JButton();
          btnEnregistrer = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          this.setTitle("Enregistrer Retour - Exemplaire ");

          pnlInfoEmprunt.setBorder(javax.swing.BorderFactory.createTitledBorder("Information d'emprunt"));

          lblCin.setText("CIN: ");

          lblNumInv.setText("Numero Invantaire: ");

          lblDateEmprunt.setText("Date Emprunt: ");

          javax.swing.GroupLayout pnlInfoEmpruntLayout = new javax.swing.GroupLayout(pnlInfoEmprunt);
          pnlInfoEmprunt.setLayout(pnlInfoEmpruntLayout);
          pnlInfoEmpruntLayout.setHorizontalGroup(
              pnlInfoEmpruntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(pnlInfoEmpruntLayout.createSequentialGroup()
                  .addGap(35, 35, 35)
                  .addGroup(pnlInfoEmpruntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(pnlInfoEmpruntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoEmpruntLayout.createSequentialGroup()
                              .addComponent(lblNumInv, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                          .addGroup(pnlInfoEmpruntLayout.createSequentialGroup()
                              .addComponent(lblCin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(66, 66, 66)))
                      .addGroup(pnlInfoEmpruntLayout.createSequentialGroup()
                          .addComponent(lblDateEmprunt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addGap(23, 23, 23)))
                  .addGroup(pnlInfoEmpruntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                      .addComponent(txtCin)
                      .addComponent(txtNumInv)
                      .addComponent(dtDateEmprunt, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );
          pnlInfoEmpruntLayout.setVerticalGroup(
              pnlInfoEmpruntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(pnlInfoEmpruntLayout.createSequentialGroup()
                  .addGap(34, 34, 34)
                  .addGroup(pnlInfoEmpruntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                      .addComponent(lblCin)
                      .addComponent(txtCin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18)
                  .addGroup(pnlInfoEmpruntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                      .addComponent(lblNumInv)
                      .addComponent(txtNumInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18)
                  .addGroup(pnlInfoEmpruntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(lblDateEmprunt)
                      .addComponent(dtDateEmprunt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addContainerGap(48, Short.MAX_VALUE))
          );

          pnlInfoRetour.setBorder(javax.swing.BorderFactory.createTitledBorder("Information Retour"));

          lblDateRetour.setText("Date Retour: ");

          lblEtat.setText("Etat: ");

          comboEtat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Neuf", "Bon Etat", "Partiellement abime", "Tres abime", "En réparation" }));

          checkBoxEmprunt.setText("Modifier l'etat de l'exemplaire");

          javax.swing.GroupLayout pnlInfoRetourLayout = new javax.swing.GroupLayout(pnlInfoRetour);
          pnlInfoRetour.setLayout(pnlInfoRetourLayout);
          pnlInfoRetourLayout.setHorizontalGroup(
              pnlInfoRetourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(pnlInfoRetourLayout.createSequentialGroup()
                  .addGap(38, 38, 38)
                  .addGroup(pnlInfoRetourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addGroup(pnlInfoRetourLayout.createSequentialGroup()
                          .addComponent(lblEtat, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                          .addComponent(comboEtat, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addComponent(checkBoxEmprunt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addGroup(pnlInfoRetourLayout.createSequentialGroup()
                          .addComponent(lblDateRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addGap(31, 31, 31)
                          .addComponent(dtDateRetour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                  .addContainerGap(37, Short.MAX_VALUE))
          );
          pnlInfoRetourLayout.setVerticalGroup(
              pnlInfoRetourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(pnlInfoRetourLayout.createSequentialGroup()
                  .addGap(26, 26, 26)
                  .addGroup(pnlInfoRetourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(dtDateRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(lblDateRetour))
                  .addGap(18, 18, 18)
                  .addComponent(checkBoxEmprunt)
                  .addGap(18, 18, 18)
                  .addGroup(pnlInfoRetourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                      .addComponent(lblEtat)
                      .addComponent(comboEtat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addContainerGap(39, Short.MAX_VALUE))
          );

          btnAnnuler.setText("Annuler");

          btnEnregistrer.setMnemonic('E');
          btnEnregistrer.setText("Enregistrer");

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                  .addGap(38, 38, 38)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                      .addGroup(layout.createSequentialGroup()
                          .addComponent(btnEnregistrer)
                          .addGap(18, 18, 18)
                          .addComponent(btnAnnuler))
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                          .addComponent(pnlInfoRetour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addComponent(pnlInfoEmprunt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                  .addContainerGap(49, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                  .addGap(30, 30, 30)
                  .addComponent(pnlInfoEmprunt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(31, 31, 31)
                  .addComponent(pnlInfoRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(34, 34, 34)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                      .addComponent(btnAnnuler)
                      .addComponent(btnEnregistrer))
                  .addContainerGap(69, Short.MAX_VALUE))
          );

          pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public void initView() {
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EnregistrerRetourExemplaireView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnregistrerRetourExemplaireView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnregistrerRetourExemplaireView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnregistrerRetourExemplaireView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    
    
 



	public javax.swing.JButton getBtnAnnuler() {
		return btnAnnuler;
	}

	public javax.swing.JButton getBtnEnregistrer() {
		return btnEnregistrer;
	}

	public javax.swing.JComboBox<String> getComboEtat() {
		return comboEtat;
	}

	public com.toedter.calendar.JDateChooser getDtDateEmprunt() {
		return dtDateEmprunt;
	}

	public com.toedter.calendar.JDateChooser getDtDateRetour() {
		return dtDateRetour;
	}

	public javax.swing.JLabel getLblCin() {
		return lblCin;
	}

	public javax.swing.JLabel getLblDateEmprunt() {
		return lblDateEmprunt;
	}

	public javax.swing.JLabel getLblDateRetour() {
		return lblDateRetour;
	}

	public javax.swing.JLabel getLblEtat() {
		return lblEtat;
	}

	public javax.swing.JLabel getLblNumInv() {
		return lblNumInv;
	}

	public javax.swing.JPanel getPnlInfoEmprunt() {
		return pnlInfoEmprunt;
	}

	public javax.swing.JPanel getPnlInfoRetour() {
		return pnlInfoRetour;
	}

	public javax.swing.JTextField getTxtCin() {
		return txtCin;
	}

	public javax.swing.JTextField getTxtNumInv() {
		return txtNumInv;
	}


	public javax.swing.JCheckBox getCheckBoxEmprunt() {
		return checkBoxEmprunt;
	}







	// Variables declaration - do not modify                     
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JCheckBox checkBoxEmprunt;
    private javax.swing.JComboBox<String> comboEtat;
    private com.toedter.calendar.JDateChooser dtDateEmprunt;
    private com.toedter.calendar.JDateChooser dtDateRetour;
    private javax.swing.JLabel lblCin;
    private javax.swing.JLabel lblDateEmprunt;
    private javax.swing.JLabel lblDateRetour;
    private javax.swing.JLabel lblEtat;
    private javax.swing.JLabel lblNumInv;
    private javax.swing.JPanel pnlInfoEmprunt;
    private javax.swing.JPanel pnlInfoRetour;
    private javax.swing.JTextField txtCin;
    private javax.swing.JTextField txtNumInv;
    // End of variables declaration            
    
    
	public void triggerErrorMessage(String msj, String title) {
		
		JOptionPane.showMessageDialog(this, msj, title, JOptionPane.ERROR_MESSAGE);
		
	}

	public void showMessage(String msj, String title) {
		
		JOptionPane.showMessageDialog(this, msj, title, JOptionPane.INFORMATION_MESSAGE);
		
	}

	public void triggerWarningMessage(String msj, String title) {
		
		JOptionPane.showMessageDialog(this, msj, title, JOptionPane.WARNING_MESSAGE);
		
	}
}
