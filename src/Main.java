public class Main{

    public static void main(String[] args){

        Conta p1 = new Conta();
        p1.setNumConta(1234);
        p1.setDono("Claudio");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.estadoAtual();


        Conta p2 = new Conta();
        p2.setNumConta(4321);
        p2.setDono("Claudete");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.estadoAtual();
    }
}