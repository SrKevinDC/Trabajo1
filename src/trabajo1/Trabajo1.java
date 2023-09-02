
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
System.out.println("Impuesto: " + automovil1.calcularImpuesto());
automovil1.modificarAño(2010);
System.out.println("Nuevo año: " + automovil1.getAño());
automovil1.imprimirDatos();



}catch (Exception e){
System.out.println("ERROR: " + e.getMessage());
}
System.out.println("");
System.out.println("***************************************************");
System.out.println("");
Motocicleta motocicleta1 = new Motocicleta(4,"kawasaki",2008,40,5,6);
motocicleta1.vaciarEstanque(9);
motocicleta1.imprimirDatos();
    }
    
}
