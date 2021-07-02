

public class ContaPagar {
    private String descricao;
    private Double valor;
    private String dataVencimento;
    private Fornecedor fornecedor;





    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    public ContaPagar() {
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
    }

    public void pagar() {
        System.out.println("Pagando a Conta "+ this.descricao + " Fornecedor "+ this.fornecedor.getNome() + " no valor de " + this.valor + " com vencimento para "+ this.dataVencimento);
    }
    
}
