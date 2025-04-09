public class Ejemplo3 {
    public int sumaDigitos(int num){
        if (num < 10) {
            return num;
        } else {
            int ultimoDigito = num % 10;
            int resto = num / 10;
            return ultimoDigito + sumaDigitos(resto);
        }
    }
}
