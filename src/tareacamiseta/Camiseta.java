/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacamiseta;

/**
 *
 * @author leyle
 */
public class Camiseta {
    
    private int id;
    private String descripcion;
    private double precio;

    public Camiseta(int id) {
        
        switch (id){
            case 1:
                this.descripcion = "manga corta";
                this.precio = 190;
            break;
            case 2:
                this.descripcion = "casual manga larga";
                this.precio = 230;
            break;
            case 3:
                this.descripcion = "Formal manga larga";
                this.precio = 310;
            break;
            
        }
      
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    public double calculCamiseta( int cantidad ){
        
        double precioTotal =0;
        
        if ( cantidad  < 3 ){
            precioTotal = cantidad * this.precio;
        } else if ( cantidad >= 3 && cantidad < 6 ){
            precioTotal = cantidad * this.precio * (1-0.05);
        } else if ( cantidad > 5 ){
            precioTotal = cantidad * this.precio * (1-0.08);
        }
                          
        return precioTotal;
    }
    
    
}
