import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


public class DriveIt {
    private HashMap<String, Veiculo> driveit;

    public DriveIt(){
        this.driveit = new HashMap<String,Veiculo>();

    }

    public DriveIt(HashMap<String,Veiculo> driveit) {
        this.driveit = driveit;
    }

    public DriveIt driveit(HashMap<String,Veiculo> driveit){
        this.driveit = driveit;
        return this;
    }

    public Map<String,Veiculo> getDriveIt() { 

        Map<String, Veiculo> res = new HashMap<>();
        for(Veiculo v: this.driveit.values()){
            res.put(v.getId(), v.clone());
        }
        return res;
    }

    public void setDriveIt(HashMap<String,Veiculo> driveit) {
        for(Veiculo v: driveit.values()){
            this.driveit.put(v.getId(), v.clone());
        }
    }

    public void adiciona(Veiculo v){
        driveit.put(v.getId(), v);
    }

    public void adiciona(Set<Veiculo> vs){
        Iterator<Veiculo> itr = vs.iterator();
        while(itr.hasNext()){
            Veiculo v = itr.next();
            this.driveit.put(v.getId(), v);

        }
        
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(driveit);
    }

    @Override
    public String toString() {
        return "{" +
            " driveit='" + getDriveIt() + "'" +
            "}";
    }

    public boolean existeVeiculo(String cod){
        if (this.driveit.containsKey(cod)) return true;
        else return false;
    }

    public Veiculo getVeiculo(String cod){
        if(driveit.containsKey(cod)) return driveit.get(cod).clone();
        else return null;
        
    }

    public int quantos(){
        int list = 0;
        Iterator<Map.Entry<String, Veiculo>> itr = driveit.entrySet().iterator();
        while (itr.hasNext()){
            list++;
            itr.next(); 
        }
        return list;
    }

    public int quantos(String marca){
        int list = 0;

        for(Veiculo v: this.driveit.values()){
            if(v.getMarca() == marca) list++;
        }
        return list;
    }

    public List<Veiculo> getVeiculos(){
        List<Veiculo> list = new ArrayList<>();

        for(Veiculo v: this.driveit.values()){
            list.add(v);
        }
        return list;
    }

    public void registarAluguer(String codVeiculo, int numKms){

        if(driveit.containsKey(codVeiculo)){
            int kmsorig = driveit.get(codVeiculo).getNumKms();
            driveit.get(codVeiculo).setNumKms(kmsorig+numKms);
         } 
    }
    

    public void classificarVeiculo(String cod, Double classificacao){

        if(driveit.containsKey(cod)){
            Double classorig = driveit.get(cod).getClassificacao();
            int alugados = driveit.get(cod).getNrusers();
            Double ratingtotal = alugados * classorig;
            ratingtotal = ratingtotal + classificacao;
            Double newclassificacao = ratingtotal / (alugados+1);
            driveit.get(cod).setClassificacao(newclassificacao);
            driveit.get(cod).setNrusers(alugados+1);
         } 
    }


    public Double custoRealKm(String cod){

        if(driveit.containsKey(cod)){
            Double beforetax = driveit.get(cod).getNumKms() * driveit.get(cod).getPreco();
            Double aftertax = beforetax + (0.1*beforetax);
            return aftertax;
        }

        else return null;
    }

    







}