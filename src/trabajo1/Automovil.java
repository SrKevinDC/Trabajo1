
package trabajo1;

public class Automovil extends Vehiculo {
private int cantidadPuertas;

//constructor

    public Automovil(int cantidadPuertas, String marca, int año, double precio,
 int capacidadEstanque, int nivelEstanque) throws Exception {
        super(marca, año, precio, capacidadEstanque, nivelEstanque);
        this.cantidadPuertas = cantidadPuertas;
if(cantidadPuertas % 2 == 0){
System.out.println("Cantidad de puertas correctas");
}else{
throw new RuntimeException("La cantidad de puertas es impar");
}

//cargar estanque del automovil
public void cargarEstanque(int litros){
}


//vaciar estanque del automovil}
public void vaciarEstanque(int litros){
int minimo = 15;

}
}
  




  
}