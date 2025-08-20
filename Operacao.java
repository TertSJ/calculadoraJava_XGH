import java.util.List;


public class Operacao{
    List<String> historico;

    public void multiplicacao(Teclado io){
        double a = io.lerDouble("Digite o primeiro número da multiplicação: \n");
        double b = io.lerDouble("Digite o segundo número da multiplicação: \n");
        
        System.out.println(a + " X "+ b +" = "+ (a*b)+ "\n");
    }

    public void divisao(Teclado io)throws ArithmeticException{
        double a = io.lerDouble("Digite o primeiro número da divisão: \n");
        double b = io.lerDouble("Digite o segundo número da divisão: \n");
        if( b == 0){
            throw new ArithmeticException();
        }
        System.out.println(a + " X "+ b +" = "+ (a/b)+ "\n");
    }

    public void soma(Teclado io){
        double a = io.lerDouble("Digite o primeiro número da adição:");
        double b = io.lerDouble("Digite o segundo número da adição:");
        
        System.out.println(a + " X "+ b +" = "+ (a+b)+ "\n");
    }

    public void subtracao(Teclado io){
        double a = io.lerDouble("Digite o primeiro número da subtração: \n");
        double b = io.lerDouble("Digite o segundo número da subtração: \n");
        
        System.out.println(a + " X "+ b +" = "+ (a-b)+ "\n");
    }

}

