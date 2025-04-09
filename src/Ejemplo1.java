public class Ejemplo1 {
    public String construirSum(int n){
        if (n == 1) {
            return "1"; 
        } else {
            return construirSum(n - 1) + " + " + n;
        }
    }
    public int sumaRecursiva(int n){
        if (n==1) {
            return 1;
        }else{
            return n+sumaRecursiva(n-1);
        }
    }
    
}
