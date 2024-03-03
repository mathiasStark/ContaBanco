package entities;

public class Conta {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public Conta() {
    }

    public Conta(Integer numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + getNomeCliente().concat(", obrigado por criar" +
                " uma conta em nosso banco, sua agência é ") + getAgencia()
                .concat(" conta ") + getNumero() + " e seu saldo " + getSaldo() +
                " já está disponível para saque.";
    }
}
