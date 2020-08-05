package br.com.caelum.contas.modelo;



public class Conta {
    static int identificador;
    private int identificadorConta;
    private String titular;
    private String agencia;
    protected double saldo;
    private int numeroConta;
    private double limite;
    private int dia;
    private int mes;
    private int ano;
    
    public void transfere (double valor, Conta conta){
        this.saca(valor);
        conta.deposita(valor);
    }
    
    private boolean bissesto(int ano){
        return (((ano % 4 == 0) && (ano % 100 != 0)) ||(ano % 400 == 0));
    }
    
    public String setData(int dia, int mes, int ano){
        
        
        if(dia>31){
            return("Dia invalido\n");
        }
        if(mes>12){
            return("Mês invalido\n");
        }
        if(((mes==4)||(mes==6)||(mes==9)||(mes==11))&&(dia>30)){
            return ("O mês "+ mes +" não tem "+ dia+ " dias\n");
        }
        if(mes == 2){
            if(bissesto(ano) == true){
                if(dia>29){
                    return ("O mês "+ mes +" em "+ ano +  " não tem "+ dia+ " dias\n");
                }
                
            }else{
                if(dia>28){
                    return ("O mês "+ mes +" em "+ ano +  " não tem "+ dia+ " dias\n");
                }
            }
        }
        
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        return ("");
    }
    
    public String getDataAbertura(){
        String data = (this.dia+"/"+this.mes+"/"+this.ano);
        return data;
    }
   
    
    
    public Conta(){
        Conta.identificador += 1;
        this.identificadorConta = Conta.identificador;
    }
    
    public String getTipo(){
        return "Conta";
    }
    
    public Conta(String titular){
        this.titular = titular;
        Conta.identificador += 1;
        this.identificadorConta = Conta.identificador;
    }
    
    public int getIdentficador(){
        return Conta.identificador;
    }
    
    public int getIdentificadorConta(){
        return this.identificadorConta;
    }
    
    public void setNumero(int numero){
        this.numeroConta = numero;
    }
    
    public int getNumero(){
        return this.numeroConta;
    }
     
    
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    
    public String getAgencia(){
        return this.agencia;
    }
   
    public String getTitular(){
        return this.titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void deposita(double valor){
        if (valor < 0){
            System.out.println("Valor invalido");         
        }else{
        this.saldo = valor + this.saldo;
        }
    }
    
    public void saca(double valor){
        this.saldo = this.saldo - valor;
    }
    
}
