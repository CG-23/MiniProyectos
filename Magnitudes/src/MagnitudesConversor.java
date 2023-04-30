import java.util.HashMap;
import java.util.Map;

public class MagnitudesConversor {
   // Volumen
    public static String volumenConversion(double valor, String unidad) {
        Map<String, Double> unidades = new HashMap<>();
        unidades.put("l", 1.0);
        unidades.put("ml", 0.001);
        unidades.put("cl", 0.01);
        unidades.put("dl", 0.1);
        unidades.put("m3", 1000.0);
        double resultado = valor / unidades.get(unidad);
        return (valor+" litros = "+resultado+" "+ unidad);
    }

    // Longitud
    public static String longitudConversion(double valor, String unidad) {
        Map<String, Double> unidades = new HashMap<>();
        unidades.put("m", 1.0);
        unidades.put("cm", 0.01);
        unidades.put("mm", 0.001);
        unidades.put("km", 1000.0);

        double resultado = valor / unidades.get(unidad);
        return (valor+" metros = "+resultado+" "+ unidad);
    }

    // Masa
    public static String masaConversion(double valor, String unidad) {
        Map<String, Double> unidades = new HashMap<>();
        unidades.put("g", 1.0);
        unidades.put("mg", 0.001);
        unidades.put("kg", 1000.0);

        double resultado = valor / unidades.get(unidad);
        return (valor+" gramos = "+resultado+" "+ unidad);
    }

    // Tiempo
    public static String tiempoConversion(double valor, String unidad) {
        Map<String, Double> unidades = new HashMap<>();
        unidades.put("s", 1.0);
        unidades.put("min", 60.0);
        unidades.put("h", 3600.0);
        unidades.put("d", 86400.0);
        unidades.put("mes", 2629800.0); // promedio de 30.44 días por mes
        unidades.put("a", 31557600.0); // promedio de 365.25 días por año

        double resultado = valor / unidades.get(unidad);
        return (valor+" segundos = "+resultado+" "+ unidad);
    }
}


