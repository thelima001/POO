

public class Veiculo {
    String id;
    String marca;
    String modelo;
    int anoconstr;
    Double velocidade;
    Double preco;
    Double classificacao;
    int numKms;
    int nrusers;

    public Veiculo() {
    }


    public Veiculo(String id, String marca, String modelo, int anoconstr, Double velocidade, Double preco, Double classificacao, int numKms, int nrusers) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoconstr = anoconstr;
        this.velocidade = velocidade;
        this.preco = preco;
        this.classificacao = classificacao;
        this.numKms = numKms;
        this.nrusers = nrusers;
    }


    public Veiculo(Veiculo veiculo){
        this.id = veiculo.getId();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.anoconstr = veiculo.getAnoconstr();
        this.velocidade = veiculo.getVelocidade();
        this.preco = veiculo.getPreco();
        this.classificacao = veiculo.getClassificacao();
        this.numKms = veiculo.getNumKms();
        this.nrusers = veiculo.getNrusers();
    }

    public int getNrusers(){
        return this.nrusers;
    }
    public void setNrusers(int nrusers){
        this.nrusers = nrusers;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoconstr() {
        return this.anoconstr;
    }

    public void setAnoconstr(int anoconstr) {
        this.anoconstr = anoconstr;
    }

    public Double getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getClassificacao() {
        return this.classificacao;
    }

    public void setClassificacao(Double classificacao) {
        this.classificacao = classificacao;
    }

    public int getNumKms() {
        return this.numKms;
    }

    public void setNumKms(int numKms) {
        this.numKms = numKms;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", anoconstr='" + getAnoconstr() + "'" +
            ", velocidade='" + getVelocidade() + "'" +
            ", preco='" + getPreco() + "'" +
            ", classificacao='" + getClassificacao() + "'" +
            ", numKms='" + getNumKms() + "'" +
            ", nrUsers='" + getNrusers() + "'" +
            "}";
    }


    public Veiculo clone() {
    return new Veiculo(this);
    }

}


