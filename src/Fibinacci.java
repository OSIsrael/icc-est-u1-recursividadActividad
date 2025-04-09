public class Fibinacci {
    public int recurividadFibonacci(int num1){
        if (num1<=1) {
            return num1;
        }
        return recurividadFibonacci(num1-1)+recurividadFibonacci(num1-2);
    }
    
}
