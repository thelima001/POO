import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GestaoEncomendas{

    private HashMap<Integer, Encomenda> encomendas;


    public GestaoEncomendas() {
    }

    public GestaoEncomendas(HashMap<Integer,Encomenda> encomendas) {
        this.encomendas = encomendas;
    }

    public HashMap<Integer,Encomenda> getEncomendas() {
        Map<String, Encomenda> res = new HashMap<>();
        for(Encomenda e: this.encomendas.values()){
            
            res.put(e.getNEnc(), ;
        }
    }

    public void setEncomendas(HashMap<Integer,Encomenda> encomendas) {
        this.encomendas = encomendas;
    }

    public GestaoEncomendas encomendas(HashMap<Integer,Encomenda> encomendas) {
        this.encomendas = encomendas;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GestaoEncomendas)) {
            return false;
        }
        GestaoEncomendas gestaoEncomendas = (GestaoEncomendas) o;
        return Objects.equals(encomendas, gestaoEncomendas.encomendas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(encomendas);
    }

    @Override
    public String toString() {
        return "{" +
            " encomendas='" + getEncomendas() + "'" +
            "}";
    }







}



