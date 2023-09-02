
package trabajo1;

public class Motocicleta extends Vehiculo{
private int cilindrada;

//constructor + getters y setters de cilindrada

    public Motocicleta(int cilindrada, String marca, int año, double precio, int capacidadEstanque, int nivelEstanque) {
        super(marca, año, precio, capacidadEstanque, nivelEstanque);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

//mostrar informacion del vehiculo
public void imprimirDatos(){
super.imprimirDatos();
System.out.println("cilindrada: " + cilindrada);
}

//vaciar estanque de motocicleta
public void vaciarEstanque(int litros){
int minimo = 5;
if(getNivelEstanque() - litros <= minimo){
setNivelEstanque(getNivelEstanque()- litros);
System.out.println(litros + " litros se han vaciado");
}else{
System.out.println("No se puede vaciar esa cantidad de litros");
}
}


}
