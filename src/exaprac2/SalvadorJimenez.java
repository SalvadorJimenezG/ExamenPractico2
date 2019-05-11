/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;
        
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class SalvadorJimenez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant=0;
      double total=0;
      String detalle="Detalle de Planilla \n";
      cant= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Empleados desea Registrar?(Digite un Número)"));
      
      String nombre[]=new String[cant];
      int cantidad[]=new int [cant];
      double precio[]=new double[cant];
      
       for (int i=0; i<cant; i++){
           
        nombre[i]= JOptionPane.showInputDialog ("Nombre del Empleado " + (i+1));
        precio[i]= Double.parseDouble(JOptionPane.showInputDialog("Salario por Hora"));
         cantidad[i]= Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Horas trabajadas"));  
        total += precio[i]* cantidad[i];
        detalle += "Nombre de Empleado: " + nombre[i] + " -CANTIDAD DE HORAS TRABAJADAS: " + cantidad[i] + " -Pago por Hora: $"+
                precio[i] + "\n";
           
    }
        JOptionPane.showMessageDialog(null,detalle + " \n TOTAL GENERAL DE PAGO DE PLANILLA ES: $" +total);
    }
        
    }
    

