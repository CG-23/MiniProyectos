import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        
        Scanner scanner = new Scanner(System.in);
        
        int opcion = 0;
        
        while (opcion != 5) {
            
            System.out.println("Bienvenido al menú de conversiones");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Volumen (litros)");
            System.out.println("2. Longitud (metros)");
            System.out.println("3. Masa (gramos)");
            System.out.println("4. Tiempo (segundos)");
            System.out.println("5. Salir");
            
            opcion = scanner.nextInt();

            System.out.println("Introduce el valor que quieres convertir: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();
            
            switch(opcion) {
                case 1:
                    System.out.println("Ha seleccionado volumen (litros)");
                    System.out.println("A que unidad quieres transformarlo : (l, ml, cl,dl, m^3)");
                    String unidad = scanner.nextLine();
                    System.out.println(MagnitudesConversor.volumenConversion(valor, unidad));

                    break;
                case 2:
                    System.out.println("Ha seleccionado longitud (metros)");
                    System.out.println("A que unidad quieres transformarlo : (m, cm, mm, km)");
                    unidad = scanner.nextLine();
                    System.out.println(MagnitudesConversor.longitudConversion(valor, unidad));
                    break;
                case 3:
                    System.out.println("Ha seleccionado masa (gramos)");
                    System.out.println("A que unidad quieres transformarlo : (g, mg, kg)");
                    unidad = scanner.nextLine();
                    System.out.println(MagnitudesConversor.masaConversion(valor, unidad));
                    break;
                case 4:
                    System.out.println("Ha seleccionado tiempo (segundos)");
                    System.out.println("A que unidad quieres transformarlo : (s, min, h, d, mes, a)");
                    unidad = scanner.nextLine();
                    System.out.println(MagnitudesConversor.tiempoConversion(valor, unidad));
                    break;
                case 5:
                    System.out.println("Saliendo del menú");
                    break;
                default:
                    System.out.println("La opción seleccionada no es válida");
                    break;
            }
            
        }
        
        scanner.close();
        
    }
    
}


