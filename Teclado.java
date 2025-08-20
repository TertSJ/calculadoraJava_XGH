

import java.util.Scanner;

public class Teclado{
    public Scanner input;

    public Teclado(){
        this.input = new Scanner(System.in);
    }
    
    public String lerLinha(String msg)throws NumberFormatException{
        
        System.out.println(msg);
        String linha = this.input.nextLine();
        return linha;    
        
    }

    public Double lerDouble(String msg) throws NumberFormatException{
        String linha = this.lerLinha(msg);
        return Double.parseDouble(linha);
    }


    public String menu(){
        String msg = "Escolha uma operação: \n + ) Adição \n - )Subtração \n x ) Multiplicação \n / ) Divisão \n z ) Sair";

        String op = this.lerLinha(msg);

        return op;
    }
}