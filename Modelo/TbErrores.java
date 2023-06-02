/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.FrmInicio;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ESTUDIO 2
 */
public class TbErrores {
    public void inicializaTabla(JTable tabla){
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();   
        titulos.add("Mensaje");
        titulos.add("Clase");
        titulos.add("Archivo");
        titulos.add("Metodo");
        titulos.add("Linea");
        for(int i=0; i<FrmInicio.errores.size(); i++){
            Vector<Object>row=new Vector<Object>();
            row.add(FrmInicio.errores.get(i).getMensaje());
            row.add(FrmInicio.errores.get(i).getClase());
            row.add(FrmInicio.errores.get(i).getArchivo());
            row.add(FrmInicio.errores.get(i).getMetodo());
            row.add(FrmInicio.errores.get(i).getLinea());
            datos.add(row);
        }
        DefaultTableModel modelo = new DefaultTableModel(datos,titulos);
        tabla.setModel(modelo);
        javax.swing.table.TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(280);
        columnModel.getColumn(1).setPreferredWidth(320);
        columnModel.getColumn(2).setPreferredWidth(160);
        columnModel.getColumn(3).setPreferredWidth(160);
        columnModel.getColumn(4).setPreferredWidth(50);
        for(int i=0; i<FrmInicio.errores.size(); i++){
            tabla.setRowHeight(i,FrmInicio.errores.get(i).getAltura());
        }
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }
}
