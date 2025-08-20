public class Divisao implements Opera{

public int executar(int a , int b)throws ArithmeticException{
    if (b==0){
        throw new ArithmeticException("Divisao por Zero.");
    }
    return a/b;
}
}