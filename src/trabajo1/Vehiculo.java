
package trabajo1;

public class Vehiculo {
private String marca;
private int año;
private double precio;
private int capacidadEstanque;//representa la capacidad mx del estanque de bencina
private int nivelEstanque;//representa cuanta bencina tiene actualmente el vehiculo

    public Vehiculo(String marca, int año, double precio, int capacidadEstanque, int nivelEstanque) {
        this.marca = marca;
        this.año = año;
        this.precio = precio;
        this.capacidadEstanque = capacidadEstanque;
        this.nivelEstanque = nivelEstanque;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public int getNivelEstanque() {
        return nivelEstanque;
    }

    public void setNivelEstanque(int nivelEstanque) {
        this.nivelEstanque = nivelEstanque;
    }

//mostrar informacion del vehiculo
public void imprimirDatos(){
System.out.println("Marca: " + marca);
System.out.println("Año: " + año);
System.out.println("Precio: " + precio);
System.out.println("Capacidad del estanque: " + capacidadEstanque);
System.out.println("Nivel del estanque: " + nivelEstanque);
}

//método para cargar con bencina el vehiculo
public void cargarEstanque(int litros){
int capacidadDisponible = capacidadEstanque - nivelEstanque;
if(litros <= capacidadDisponible){
nivelEstanque += litros;
System.out.println("Se cargaron " + litros + " litros al estanque");
}else{
System.out.println("No se puede cargar el estanque");
}
}

//método para vaciar el tanque de bencina, no ser < 0
public void vaciarEstanque(int litros){
if(nivelEstanque - litros >= 0){
nivelEstanque -= litros;
System.out.println("Se han vaciado " + litros + " litros del estanque");
}else{
System.out.println("No se puede vaciar esa cantidad de litros");
}
}

//calcular y retornar impuesto basado en el precio del vehiculo, 
//formula: precio * 0.015 (15%)
public double calcularImpuesto(){
return precio * 0.015;
}


}
