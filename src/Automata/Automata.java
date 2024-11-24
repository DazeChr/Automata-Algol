package Automata;

public class Automata {
    public static void main(String[] args) {
        Compilador automata = new Compilador();
        if (!automata.errorFound) {
            System.out.println("\nAnalisis Lexico Terminado\n");
        }

        automata.Sintaxis();

        if(!automata.errorFound){
            System.out.println("\nAnalisis Sintactico Terminado");
        }
    }
}
