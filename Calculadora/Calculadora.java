import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int operacion; //Guardaremos la opcion del usuario
        double n1=0;
        double n2=0;
        double variable=0;
         
        while(!salir){
             
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Raiz cuadrada");
            System.out.println("7. Exponencial");
            System.out.println("8. Registrar variable");
            System.out.println("9. Invocar Variable");
            System.out.println("10. Eliminar Variable");
            System.out.println("11. Valor constante e, Pi");
            System.out.println("12. Salir");
             
            System.out.println("Escribe una de las opciones, en valor numérico");
            operacion = sn.nextInt();
            sn.nextLine();

            if (operacion < 5 || operacion == 7){
                System.out.println("Escibe el primer numero");
                n1 = sn.nextDouble();
                System.out.println("Escibe el segundo numero");
                n2 = sn.nextDouble();
            }else if(operacion==8){
                System.out.println("Escribe el numero, a operar o almacenar");
                n1 = sn.nextDouble();
            }
             
            switch(operacion){
                case 1:
                    double suma =  n1 + n2;
                    System.out.println("El resultado de la suma es: "+suma);
                    break;
                case 2:
                    double resta =  n1 - n2;
                    System.out.println("El resultado de la resta es: "+resta);
                    break;
                case 3:
                    double mult =  n1 * n2;
                    System.out.println("El resultado de la multiplicación es: "+mult);
                    break;
                case 4:
                    double div =  n1 / n2;
                    System.out.println("El resultado de la division es: "+div);
                    break;
                case 5:
                    double modulo =  n1 % n2;
                    System.out.println("El resultado del modulo es: "+modulo);
                    break;
                case 6:
                    double raiz = Math.sqrt(n1);
                    System.out.println("El resultado de la raiz cuadrada de "+n1+ " es: "+raiz);
                    break;
                case 7:
                    double expo = Math.pow(n1, n2);
                    System.out.println("El resultado de "+n1+" elevado a "+n2+" es: "+expo);
                    break;
                case 8:
                    variable = n1;
                    System.out.println("Variable "+variable+" registrada");
                    break;
                case 9:
                    System.out.println("Variable "+variable+" invocada");
                    break;
                case 10:
                variable = 0;
                    System.out.println("Variable "+variable+" eliminada");
                    break;
                case 11:
                    double e = Math.E;
                    double Pi = Math.PI;
                    System.out.println("Constant e = "+e+" y la constant PI = "+Pi);
                    break;
                case 12:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 12");
            }
        }
        sn.close();
    }
}


