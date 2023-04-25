import java.util.Scanner;

public class TresEnRaya {
    public static void main(String[] args) {
        char[][] tablero = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char jugadorActual = 'X';
        Scanner scanner = new Scanner(System.in);

        while (!hayGanador(tablero) && !tableroLleno(tablero)) {
            mostrarTablero(tablero);
            System.out.println("Jugador " + jugadorActual + ", es tu turno. Ingresa la posición (fila,columna):");
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            if (movimientoValido(tablero, fila, columna)) {
                tablero[fila][columna] = jugadorActual;
                jugadorActual = jugadorActual == 'X' ? 'O' : 'X';
            } else {
                System.out.println("Movimiento inválido. Inténtalo de nuevo.");
            }
        }

        mostrarTablero(tablero);

        if (hayGanador(tablero)) {
            jugadorActual = jugadorActual == 'X' ? 'O' : 'X';
            System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
        } else {
            System.out.println("¡Empate!");
        }
    }

    public static boolean hayGanador(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != ' ' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
                return true;
            }
            if (tablero[0][i] != ' ' && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) {
                return true;
            }
        }
        if (tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
            return true;
        }
        if (tablero[0][2] != ' ' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
            return true;
        }
        return false;
    }

    public static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean movimientoValido(char[][] tablero, int fila, int columna) {
        if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
            return false;
        }
        if (tablero[fila][columna] != ' ') {
            return false;
        }
        return true;
    }

    public static void mostrarTablero(char[][] tablero) {
        System.out.println("   0  1  2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + tablero[i][j] + "]");
            }
            System.out.println();
        }
    }
    
    
}