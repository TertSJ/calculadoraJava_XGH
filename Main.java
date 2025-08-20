public class Main {
    public static void main(String[] args) {
        Teclado io = new Teclado();
        Operacao oper = new Operacao();

        String op = io.menu();

        while (true) {
            if (op.equals("x")) {
                oper.multiplicacao(io);
            }
            if (op.equals("-")) {
                oper.subtracao(io);
            }
            if (op.equals("/")) {
                oper.divisao(io);
            }
            if (op.equals("+")) {
                oper.soma(io);
            }
            if (op.equals("z")){
                break;
            }
            op = io.menu();
        }
    }
}