public class Relacion06_1al14_AAS {
    public static boolean esCapicua(int numero) {
        return numero == voltea(numero);
    }


    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }


    public static int siguientePrimo(int numero) {
        numero++;
        while (!esPrimo(numero)) {
            numero++;
        }
        return numero;
    }


    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }


    public static int digitos(int numero) {
        return Integer.toString(Math.abs(numero)).length();
    }


    public static int voltea(int numero) {
        int volteado = 0;
        while (numero != 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        }
        return volteado;
    }


    public static int digitoN(int numero, int posicion) {
        String numStr = Integer.toString(numero);
        if (posicion >= 0 && posicion < numStr.length()) {
            return Character.getNumericValue(numStr.charAt(posicion));
        }
        return -1;
    }


    public static int posicionDeDigito(int numero, int digito) {
        String numStr = Integer.toString(numero);
        return numStr.indexOf(Integer.toString(digito));
    }


    public static int quitaPorDetras(int numero, int n) {
        return numero / potencia(10, n);
    }


    public static int quitaPorDelante(int numero, int n) {
        String numStr = Integer.toString(numero);
        if (n >= numStr.length()) return 0;
        return Integer.parseInt(numStr.substring(n));
    }


    public static int pegaPorDetras(int numero, int digito) {
        return (numero * 10) + digito;
    }


    public static int pegaPorDelante(int numero, int digito) {
        String numStr = Integer.toString(digito) + Integer.toString(numero);
        return Integer.parseInt(numStr);
    }


    public static int trozoDeNumero(int numero, int inicio, int fin) {
        String numStr = Integer.toString(numero);
        if (inicio < 0 || fin >= numStr.length() || inicio > fin) {
            return -1;
        }
        return Integer.parseInt(numStr.substring(inicio, fin + 1));
    }


    public static int juntaNumeros(int num1, int num2) {
        String numStr1 = Integer.toString(num1);
        String numStr2 = Integer.toString(num2);
        return Integer.parseInt(numStr1 + numStr2);
    }


    // Para probar las funciones:
    public static void main(String[] args) {
        // Pruebas rápidas
        System.out.println("¿Es capicúa 72327? " + esCapicua(72327));
        System.out.println("¿Es primo 7? " + esPrimo(7));
        System.out.println("Siguiente primo de 14: " + siguientePrimo(14));
        System.out.println("3^4 = " + potencia(3, 4));
        System.out.println("Número de dígitos en 679: " + digitos(679));
        System.out.println("Volteado de 80018: " + voltea(80018));
        System.out.println("Dígito en la posición 2 de 987435: " + digitoN(987435, 2));
        System.out.println("Posición del dígito 4 en 20244: " + posicionDeDigito(20244, 4));
        System.out.println("Quitar 1 dígito por detrás a 527991: " + quitaPorDetras(527991, 1));
        System.out.println("Quitar 2 dígitos por delante a 4477839: " + quitaPorDelante(4477839, 2));
        System.out.println("Pegar 9 por detrás a 237641: " + pegaPorDetras(237641, 9));
        System.out.println("Pegar 5 por delante a 887422: " + pegaPorDelante(887422, 5));
        System.out.println("Trozo del número 9253174 entre posiciones 3 y 5: " + trozoDeNumero(9253174, 3, 5));
        System.out.println("Juntar 111 y 808: " + juntaNumeros(111, 808));
    }
}
