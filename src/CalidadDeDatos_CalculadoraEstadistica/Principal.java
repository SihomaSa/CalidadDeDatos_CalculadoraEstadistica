package CalidadDeDatos_CalculadoraEstadistica;
import java.util.Arrays;
import java.util.HashMap;
public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
        Limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Título = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ResultMAS = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ResultMODA = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ResultMEDIANA = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ResultMG = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ResultMEDCENT = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ResultVARIANZA = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ResultDESVTIP = new javax.swing.JLabel();
        MAS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        numDatos = new javax.swing.JTextArea();
        LimpiarBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ResultPERCENTIL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Título.setText("OPERACIONES DE ESTADÍSTICA");
        Título.setAlignmentY(8.0F);

        jLabel2.setText("Ingrese los números:");

        jLabel3.setText("La MEDIA ARITMÉTICA SIMPLE es:");

        jLabel5.setText("La MODA es:");

        jLabel7.setText("La MEDIANA es:");

        jLabel9.setText("La MEDIA GEOMÉTRICA es:");

        jLabel11.setText("La MEDIDA DE CENTRALIDAD es:");

        jLabel13.setText("La VARIANZA es:");

        jLabel15.setText("La DESVIACIÓN TÍPICA es:");

        MAS.setText("RESULTADO ES:");
        MAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASActionPerformed(evt);
            }
        });

        numDatos.setColumns(20);
        numDatos.setRows(5);
        jScrollPane1.setViewportView(numDatos);

        LimpiarBTN.setText("LIMPIAR");
        LimpiarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarBTNActionPerformed(evt);
            }
        });

        jLabel1.setText("El Percentil 50 es:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LimpiarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MAS, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ResultMAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ResultDESVTIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ResultMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ResultVARIANZA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ResultMEDIANA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ResultMODA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ResultPERCENTIL, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResultMEDCENT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(Título)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Título, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ResultMEDCENT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ResultMAS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(ResultMEDIANA, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(ResultMODA, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(ResultMG, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MAS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LimpiarBTN)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResultVARIANZA, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(ResultDESVTIP, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ResultPERCENTIL, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASActionPerformed
       String Texto = numDatos.getText();
       Texto = Texto.trim();
       String[] Arreglo = Texto.split("\n");
       int n = Arreglo.length;
       int aux ;
            //Calculo media******
            int media, Suma=0;
            for(int i=0; i<n; i++){
                aux= Integer.parseInt(Arreglo[i]);
                Suma+=aux;
            }
                media=Suma/n;
                ResultMAS.setText(String.valueOf(media));
            //Calculo Mediana 
            int mediana=0;
            for(int i=0; i<n; i++){
            i=n;
             Arrays.sort(Arreglo);
            int mitad=n/2;
            if (n % 2 == 0) {
                mediana = Integer.parseInt((Arreglo[mitad - 1]+ Arreglo[mitad]))/2;
            } else {
                    mediana = Integer.parseInt(Arreglo[mitad]);
            }
            }
             ResultMEDIANA.setText(String.valueOf(mediana)); 
            //Calculo de varianza*****
            int sumatoria;
            int varianza = 1;
            for(int i= 0; i<n; i++){
                 aux= Integer.parseInt(Arreglo[i]);
                 sumatoria= (int) Math.pow((aux - media),2);
                 varianza = varianza + sumatoria;
            }
                 varianza = varianza/(n-1);
                 ResultVARIANZA.setText(String.valueOf(varianza));
            //Calculo desviación*******
            double desviacion = Math.sqrt(varianza);
            double redondeo = Math.rint(desviacion*100)/100;
            ResultDESVTIP.setText(String.valueOf(redondeo));
            //Calculo Moda
		HashMap<Integer, Integer> mapa = new HashMap<>();
		for (int i = 0; i < n; i++) {
			aux = Integer.parseInt(Arreglo[i]);
			if (mapa.containsKey(aux)){
				mapa.put(aux, mapa.get(aux) + 1);
			} else {
				mapa.put(aux, 1);
			}
		}
		int moda = 0, mayor = 0;
		for (HashMap.Entry<Integer, Integer> entry : mapa.entrySet()) {
			if (entry.getValue() > mayor) {
				mayor = entry.getValue();
				moda = entry.getKey();
			}
		}           
            ResultMODA.setText(String.valueOf(moda));
            //Calculo Media Geometrica******
           double producto = 1;
           for(int i=0; i<n; i++){
                aux= Integer.parseInt(Arreglo[i]);
                producto*= aux;
           }
            double mgeometrica = (double) Math.pow(producto,(double) 1/n);
            ResultMG.setText(String.valueOf(mgeometrica));
           //Calculo de Medida de Centralidad*****
            ResultMEDCENT.setText(String.valueOf("La media es: "+media + ", La mediana es: "+ mediana+ " ,La moda es: " + moda));    
          //Calculo de Percentil cincuenta*****
          int percentil=0;
          Arrays.sort(Arreglo);
          for(int i= 0; i<n; i++){
              i=n;
                 percentil= Integer.parseInt(Arreglo[(50*(n+1))/100]);
          }
            ResultPERCENTIL.setText(String.valueOf("El percentil es: "+percentil));
    }//GEN-LAST:event_MASActionPerformed

    private void LimpiarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarBTNActionPerformed
        Limpiar();
    }//GEN-LAST:event_LimpiarBTNActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LimpiarBTN;
    private javax.swing.JButton MAS;
    private javax.swing.JLabel ResultDESVTIP;
    private javax.swing.JLabel ResultMAS;
    private javax.swing.JLabel ResultMEDCENT;
    private javax.swing.JLabel ResultMEDIANA;
    private javax.swing.JLabel ResultMG;
    private javax.swing.JLabel ResultMODA;
    private javax.swing.JLabel ResultPERCENTIL;
    private javax.swing.JLabel ResultVARIANZA;
    private javax.swing.JLabel Título;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea numDatos;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        numDatos.setText("");
    }


}
