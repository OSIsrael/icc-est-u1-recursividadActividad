public class Ejemplo1 {
    public int llamadaRecursiva=1;
    /*public String construirSum(int n){
        if (n == 1) {
            return "1"; 
        } else {
            return construirSum(n - 1) + " + " + n;
        }
    }*/
    public int sumaRecursiva(int n){
        if (n==1) {

            return 1;
        }else{
            int resultadoParcial=sumaRecursiva(n-1);
            int resultado= n+resultadoParcial;
            return resultado;
            //return n+sumaRecursiva(n-1);
        }
    }
    
}
