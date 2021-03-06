/*
 * The MIT License
 * 
 * Copyright: Copyright (C) 2014 T2Ti.COM
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * 
 * The author may be contacted at: t2ti.com@gmail.com
 *
 * @author Claudio de Barros (T2Ti.com)
 * @version 2.0
 */
package com.t2tierp.financeiro.cliente;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.openswing.swing.client.GenericButton;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.InternalFrame;
import org.openswing.swing.util.client.ClientUtils;

public class FinLancamentoReceberGrid extends InternalFrame {

    private FinLancamentoReceberGridController controller;
    
    public FinLancamentoReceberGrid(FinLancamentoReceberGridController controller) {
        initComponents();
        
        this.controller = controller;
        
        genericButton1.setToolTipText("Mesclar Lançamentos");
        
        gridControl1.setController(controller);
        gridControl1.setGridDataLocator(controller);
    }

    public GridControl getGrid1() {
        return gridControl1;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        insertButton1 = new org.openswing.swing.client.InsertButton();
        deleteButton1 = new org.openswing.swing.client.DeleteButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        navigatorBar1 = new org.openswing.swing.client.NavigatorBar();
        genericButton1 = new GenericButton(new ImageIcon(ClientUtils.getImage("ok.gif")));
        gridControl1 = new org.openswing.swing.client.GridControl();
        checkBoxColumn1 = new org.openswing.swing.table.columns.client.CheckBoxColumn();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn3 = new org.openswing.swing.table.columns.client.TextColumn();
        integerColumn4 = new org.openswing.swing.table.columns.client.IntegerColumn();
        decimalColumn5 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn6 = new org.openswing.swing.table.columns.client.DecimalColumn();
        dateColumn7 = new org.openswing.swing.table.columns.client.DateColumn();
        textColumn8 = new org.openswing.swing.table.columns.client.TextColumn();
        dateColumn9 = new org.openswing.swing.table.columns.client.DateColumn();
        decimalColumn10 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn11 = new org.openswing.swing.table.columns.client.DecimalColumn();
        integerColumn12 = new org.openswing.swing.table.columns.client.IntegerColumn();
        integerColumn13 = new org.openswing.swing.table.columns.client.IntegerColumn();

        setTitle("T2Ti ERP - Financeiro - Contas a Receber");
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fin Lancamento Receber"));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel1.add(insertButton1);
        jPanel1.add(deleteButton1);
        jPanel1.add(reloadButton1);
        jPanel1.add(navigatorBar1);

        genericButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genericButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(genericButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        gridControl1.setDeleteButton(deleteButton1);
        gridControl1.setFunctionId("finLancamentoReceber");
        gridControl1.setInsertButton(insertButton1);
        gridControl1.setNavBar(navigatorBar1);
        gridControl1.setReloadButton(reloadButton1);
        gridControl1.setValueObjectClassName("com.t2tierp.financeiro.java.FinLancamentoReceberVO");
        gridControl1.getColumnContainer().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        checkBoxColumn1.setColumnName("selecionado");
        checkBoxColumn1.setEditableOnEdit(true);
        checkBoxColumn1.setEditableOnInsert(true);
        checkBoxColumn1.setEnableInReadOnlyMode(true);
        checkBoxColumn1.setHeaderColumnName("Mesclar");
        checkBoxColumn1.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        checkBoxColumn1.setPreferredWidth(50);
        gridControl1.getColumnContainer().add(checkBoxColumn1);

        textColumn2.setColumnName("finDocumentoOrigem.descricao");
        textColumn2.setHeaderColumnName("Documento Origem");
        textColumn2.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn2.setPreferredWidth(120);
        gridControl1.getColumnContainer().add(textColumn2);

        textColumn3.setColumnName("cliente.pessoa.nome");
        textColumn3.setHeaderColumnName("Cliente");
        textColumn3.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn3.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn3);

        integerColumn4.setColumnName("quantidadeParcela");
        integerColumn4.setHeaderColumnName("Quantidade Parcela");
        integerColumn4.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        integerColumn4.setPreferredWidth(110);
        gridControl1.getColumnContainer().add(integerColumn4);

        decimalColumn5.setColumnName("valorTotal");
        decimalColumn5.setHeaderColumnName("Valor Total");
        decimalColumn5.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn5.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn5);

        decimalColumn6.setColumnName("valorAReceber");
        decimalColumn6.setHeaderColumnName("Valor A Receber");
        decimalColumn6.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn6.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn6);

        dateColumn7.setColumnName("dataLancamento");
        dateColumn7.setHeaderColumnName("Data Lancamento");
        dateColumn7.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(dateColumn7);

        textColumn8.setColumnName("numeroDocumento");
        textColumn8.setHeaderColumnName("Numero Documento");
        textColumn8.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn8.setPreferredWidth(120);
        gridControl1.getColumnContainer().add(textColumn8);

        dateColumn9.setColumnName("primeiroVencimento");
        dateColumn9.setHeaderColumnName("Primeiro Vencimento");
        dateColumn9.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        dateColumn9.setPreferredWidth(130);
        gridControl1.getColumnContainer().add(dateColumn9);

        decimalColumn10.setColumnName("taxaComissao");
        decimalColumn10.setHeaderColumnName("Taxa Comissao");
        decimalColumn10.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn10.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn10);

        decimalColumn11.setColumnName("valorComissao");
        decimalColumn11.setHeaderColumnName("Valor Comissao");
        decimalColumn11.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn11.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn11);

        integerColumn12.setColumnName("intervaloEntreParcelas");
        integerColumn12.setHeaderColumnName("Intervalo Entre Parcelas");
        integerColumn12.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        integerColumn12.setPreferredWidth(140);
        gridControl1.getColumnContainer().add(integerColumn12);

        integerColumn13.setColumnName("mescladoPara");
        integerColumn13.setHeaderColumnName("Mesclado Para");
        integerColumn13.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(integerColumn13);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(gridControl1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genericButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genericButton1ActionPerformed
        try {
            controller.mesclarLancamentos();
            JOptionPane.showMessageDialog(this, "Lançamentos Mesclados", "Informação do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_genericButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.CheckBoxColumn checkBoxColumn1;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn7;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn9;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn10;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn11;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn5;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn6;
    private org.openswing.swing.client.DeleteButton deleteButton1;
    private org.openswing.swing.client.GenericButton genericButton1;
    private org.openswing.swing.client.GridControl gridControl1;
    private org.openswing.swing.client.InsertButton insertButton1;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn12;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn13;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn4;
    private javax.swing.JPanel jPanel1;
    private org.openswing.swing.client.NavigatorBar navigatorBar1;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn3;
    private org.openswing.swing.table.columns.client.TextColumn textColumn8;
    // End of variables declaration//GEN-END:variables
}
