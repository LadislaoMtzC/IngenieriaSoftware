import java.util.*;

public class Main {
    public static void main(String[] args) {
    }

    //En esta función se checa que el nombre de la bebida no supere la cantidad de caracteres
    // o que por el contrario sea menor al mínimo, verifica que sean letras las que se escriben
    //y que pueda haber un solo espacio entre las palabras
    public static boolean nombreBebida(String entrada){
        int count = 0;
        for(int i = 0; i < entrada.length(); i++) {
            char currentChar = entrada.charAt(i);
            if (currentChar == ' ') {
                // Verificar si hay dos espacios seguidos
                if (i + 1 < entrada.length() && entrada.charAt(i + 1) == ' ') {
                    return false;
                }
            } else if (!Character.isLetter(currentChar)) {
                return false; //Verificar que el caracter sea una letra
            }
            count++;
        }
        if (count > 15 || count < 2) {
            return false; // Longitud incorrecta
        }
        return true;
    }


    //En esta función se checan que los numeros de los tamaños se encuentren dentro del rango 1-48,
    // que solo sean numeros, ignorar los espacios en blanco
    public static boolean tamaño(String entrada){

        for(int i = 0; i < entrada.length(); i++) {
            char caracter = entrada.charAt(i);
            if (!Character.isDigit(caracter) && caracter != ' ') {
                return false;
            }
        }
        entrada = entrada.replaceAll("\\s+", ""); // Eliminar espacios en blanco
        if (entrada.isEmpty()) {
            return false; // Si la entrada solo contenía espacios en blanco
        }

        int numero = Integer.parseInt(entrada);

        if (numero < 1 || numero > 48){
            return false;
        }

        return true;
    }


    //En esta función se utilizan las dos funciones anteriores para corroborar que la cadena esta escrita
    // en el formato correcto
    public static boolean Cafeteria(String entrada){
        String cadenas[] = new String[6];
        int index = 0;
        int start = 0;

        //Cortar el string cada vez que encuentre una coma
        for(int i = 0; i < entrada.length(); i++){
            if (entrada.charAt(i) == ',') {
                cadenas[index] = entrada.substring(start, i);
                start = i + 1;
                index++;
            }
        }

        // Guardar la última subcadena si no hay coma al final
        if (start < entrada.length()) {
            cadenas[index] = entrada.substring(start);
            index++;

        }

        if (index == 0) {
            return false; // No se proporcionó ninguna entrada
        }



        // Verificar el nombre de la bebida en la primera subcadena
        if (!nombreBebida(cadenas[0])) {
            return false; // Nombre de bebida no válido
        }

        // Verificar los tamaños en las subcadenas restantes
        int[] tamanos = new int[index - 1];
        for (int i = 1; i < index; i++) {
            if (!tamaño(cadenas[i])) {
                return false; // Tamaño no válido en una de las subcadenas
            }
            tamanos[i - 1] = Integer.parseInt(cadenas[i].replaceAll("\\s+", ""));
        }

        // Verificar que los tamaños estén en orden ascendente
        for (int i = 1; i < tamanos.length; i++) {
            if (tamanos[i - 1] > tamanos[i]) {
                return false; // No están en orden ascendente
            }
        }

        return true;
    }

}

