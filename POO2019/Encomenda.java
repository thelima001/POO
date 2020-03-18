import java.time.LocalDate;
import java.util.ArrayList;
// import java.util.List;
import java.util.stream.Collectors;

public class Encomenda{
    private String nomeCliente;
    private int nif;
    private String morada;
    private int nEnc;
    private LocalDate data;
    private ArrayList<LinhaEncomenda> encomendas;



    public Encomenda() {
    }

    public Encomenda(String nomeCliente, int nif, String morada, int nEnc, LocalDate data, ArrayList<LinhaEncomenda> encomendas) {
        this.nomeCliente = nomeCliente;
        this.nif = nif;
        this.morada = morada;
        this.nEnc = nEnc;
        this.data = data;
      //  this.encomendas = encomendas;
        setEncomendas(encomendas);
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNif() {
        return this.nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getMorada() {
        return this.morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getNEnc() {
        return this.nEnc;
    }

    public void setNEnc(int nEnc) {
        this.nEnc = nEnc;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public ArrayList<LinhaEncomenda> getEncomendas() {
        return this.encomendas;
    }

    public void setEncomendas(ArrayList<LinhaEncomenda> encomendas) {
        this.encomendas = new ArrayList<>();
        for (LinhaEncomenda l : encomendas) this.encomendas.add(l.clone());
    }

    public Encomenda nomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        return this;
    }

    public Encomenda nif(int nif) {
        this.nif = nif;
        return this;
    }

    public Encomenda morada(String morada) {
        this.morada = morada;
        return this;
    }

    public Encomenda nEnc(int nEnc) {
        this.nEnc = nEnc;
        return this;
    }

    public Encomenda data(LocalDate data) {
        this.data = data;
        return this;
    }

    public Encomenda encomendas(ArrayList<LinhaEncomenda> encomendas) {
        this.encomendas = encomendas;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " nomeCliente='" + getNomeCliente() + "'" +
            ", nif='" + getNif() + "'" +
            ", morada='" + getMorada() + "'" +
            ", nEnc='" + getNEnc() + "'" +
            ", data='" + getData() + "'" +
            ", encomendas='" + getEncomendas() + "'" +
            "}";
    }


    public void adicionaLinha(LinhaEncomenda e){
        this.encomendas.add(e);
    }


    public void pop(){
    if (!this.encomendas.isEmpty()) this.encomendas.remove(encomendas.size() - 1);
    }

    public LinhaEncomenda top(){
        if (!this.encomendas.isEmpty()) return this.encomendas.get(this.encomendas.size() - 1);
        else return null;
    }


    public double calculaValorTotal(){
        double r = 0;
        for (LinhaEncomenda l : encomendas){
           r += l.calculaValorLinhaEnc();
        }
        
        return r;
    }

    public double calculaValorDesconto(){
        double r = 0;
        for (LinhaEncomenda l : encomendas){
           r += l.calculaValorDesconto();
        }
        
        return r;
    }

    public double numeroTotalProdutos(){
        double r = 0;
        for (LinhaEncomenda l : encomendas){
            r += l.getQuantidade();
         }

         return r;

    }

    public boolean existeProdutoEncomenda(String refProduto){
        for (LinhaEncomenda l : encomendas){
            if (l.getReferencia() == refProduto) return true;
         }

         return false;
    }

    public void removeProduto(String codProd){
        for (LinhaEncomenda l : encomendas){
            if (l.getReferencia() == codProd) encomendas.remove(l);
         }
    }







}