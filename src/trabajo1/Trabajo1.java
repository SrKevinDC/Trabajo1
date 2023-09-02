
package trabajo1;

/**
 *
 * @author Kevin Sepulveda
 */
public class Trabajo1 {

    public static void main(String[] args) throws Exception {
       
try{

Automovil automovil1 = new Automovil(3,"Susuki",2009,50,50,60);
automovil1.cargarEstanque(5);
automovil1.vaciarEstanque(30);
System.out.println("Debes pagar $" + automovil1.calcularImpuesto() + " de impuesto");
automovil1.modificarAño(2010);
System.out.println("El nuevo año del automovil es " + automovil1.getAño());
automovil1.imprimirDatos();



}catch (Exception e){
System.out.println("ERROR: " + e.getMessage());
}

Motocicleta motocicleta1 = new Motocicleta(4,"kawasaki",2008,40,5,6);
motocicleta1.cargarEstanque(10);
motocicleta1.vaciarEstanque(9);
System.out.println("Debes pagar $" + motocicleta1.calcularImpuesto() + " de impuesto");
System.out.println("cilindrada: " + motocicleta1.getCilindrada());
motocicleta1.imprimirDatos();
    }
    
}
