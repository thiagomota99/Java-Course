package aulacincojava;


public class Conta {
    public String numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public Conta(double saldo, boolean status) {
        this.saldo = saldo;
        this.status = status;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        if (tipo == 1){
            this.tipo = "CP";
        }
        else if(tipo == 2){
            this.tipo = "CC";
        }
        else {
            System.out.println("Informe um tipo de conta válido!");
        }
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    public void abrirConta(){
        if(getTipo() == "CC"){
            setSaldo(50);
            setStatus(true);
            System.out.println("Conta Corrente criada com sucesso!");
            System.out.println("SALDO: " + getSaldo());
        }
        else if(getTipo() == "CP") {
           setSaldo(150);
           setStatus(true);
           System.out.println("Conta Poupança criada com sucesso!");
           System.out.println("SALDO: " + getSaldo());
        }
    }
    
    public void fecharConta(){
        if(getSaldo() > 0){
            System.out.println("Não é possível fechar a conta, pois a mesma possui saldo!");
        }
        else if (getSaldo() < 0){
            System.out.println("Não é possível fechar a conta, pois a mesma está com saldo negativo!");
        }
        else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");            
        }
    }
    
    public void depositar(double deposito){
        if(isStatus()){
            double aux = getSaldo();
            setSaldo(getSaldo() + deposito);
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("SALDO ANTERIOR: " + aux);
            System.out.println("SALDO ATUAL: " + getSaldo());
        }
        else {
            System.out.println("Não foi possível depositar, pois a conta não está aberta!");
        }
    }
    
    public void sacar(double saque){
        if(isStatus()){
            if(getSaldo() >= saque){
                double aux = getSaldo();
                setSaldo(getSaldo() - saque);
                System.out.println("Saque realizado com sucesso!");
                System.out.println("SALDO ANTERIOR: " + aux);
                System.out.println("SALDO ATUAL: " + getSaldo());
            }
            else {
                System.out.println("Não possui saldo suficiente para o saque!");
            }
        }
        else {
            System.out.println("Não foi possível sacar, pois a conta não está aberta!");
        }
    }
    
    public void pagarMensal(){        
        if(isStatus()){
            if(getTipo() == "CC"){
                if(getSaldo() >= 12){
                    setSaldo(getSaldo() - 12);
                }
            }
            else if (getTipo() == "CP"){
                 if(getSaldo() >= 20){
                 setSaldo(getSaldo() - 20);
                 }                 
            }
        }
    }
}
