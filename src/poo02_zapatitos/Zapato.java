package poo02_zapatitos;
public class Zapato {
    private String modelo;
    private Integer talla;
    private double precio;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getTalla() {
        return talla;
    }

    public void setTalla(Integer talla) {
        this.talla = talla;
        this.calcularPrecio();
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Zapato() {
        
    }

    public Zapato(String modelo, Integer talla, Double precio) {
        this.modelo = modelo;
        this.talla = talla;
        this.precio = precio;
    }
    
    private void calcularPrecio() {
        this.precio = 0; 
        var aumento = (this.talla == 8 ? 0 : this.talla == 9 ? 1 : 2) * 10;
        
        switch (this.modelo) {
            case "Ejecutivo":
                this.precio = 345.50 + aumento;  
                break;
            
            case "Premier":
                this.precio = 298.70 + aumento;  
                break;
            
            case "Emperador":
                this.precio = 246.00 + aumento;  
        }
                
        /*if ("Ejecutivo".equals(this.modelo) && this.talla >= 8) {
            this.precio = 345.50 + 10 * (this.talla = 8);
        }
        
        if ("Premier".equals(this.modelo) && this.talla >= 8) {
            this.precio = 298.70 + 10 * (this.talla = 8);
        }
        
        if ("Emperador".equals(this.modelo) && this.talla >= 8) {
            this.precio = 246.00 + 10 * (this.talla = 8);
        }*/
    }

    @Override
    public String toString() {
        return "Zapato{" + "modelo=" + modelo + ", talla=" + talla + ", precio=" + precio + '}';
    }
    
    
  
}
