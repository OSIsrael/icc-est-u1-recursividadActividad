public class Ejemplo2 {
    public int potenciaRecursiva(int base, int exponente){
        if(exponente==0){
            return 1;
        }
        else{
            return base*potenciaRecursiva(base, exponente-1);
        }
    }
}
