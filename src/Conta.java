public class Conta {
    // <editor-fold desc="Atributos">
    public int numConta;
    protected String tipo; //Conta Corrente(CC) ou Conta Poupança(CP)
    private String dono;
    private float saldo;
    private boolean status; //Conta aberta ou fechada
    // </editor-fold>

    // <editor-fold desc="Abrir Conta">
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)){
            this.setSaldo(50);
        }
        else if ("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }// </editor-fold>

    // <editor-fold desc="Fechar Conta">
    public void fecharConta(float s){
        if(this.getSaldo() > 0){
            System.out.println("Conta com saldo. Não pode ser fechada.");
        }
        else if(this.getSaldo() < 0){
            System.out.println("Conta em débito. Não pode ser fechada.");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }// </editor-fold>

    // <editor-fold desc="Depositar">
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de "+ this.getDono());
        }
        else{
            System.out.println("Conta Fechada! Impossível depositar.");
        }
    }// </editor-fold>

    // <editor-fold desc="Sacar">
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de "+ this.getDono());
            }
            else{
                System.out.println("Saldo Insuficiente!");
            }
        }
        else{
            System.out.println("Conta Fechada! Impossível Sacar!");
        }
    }//</editor-fold>

    //<editor-fold desc="Mensalidade">
    public void mesalidade(){
        float v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }
        else if(this.getTipo() == "CP"){
            v = 20;
        }
        if(this.getStatus()){
            if(saldo > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga por "+ this.getDono());
            }
            else{
                System.out.println("Saldo Insuficiente!");
            }
        }
        else{
            System.out.println("Conta Fechada! Impossível pagar.");
        }
    }//</editor-fold>

    //<editor-fold desc="Estado Atual">
    public void estadoAtual(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Titular: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }//</editor-fold>

    // <editor-fold desc="Métodos Especiais">

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Conta() {

    }


    // </editor-fold>
}



