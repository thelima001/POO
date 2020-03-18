import java.util.ArrayList;

public class StackSt {

    private String nomeStack;
    private ArrayList<String> strs;

    public StackSt(){
        this.nomeStack = "";
        this.strs = new ArrayList<>();
    }

    public StackSt(String nome){
        this.nomeStack = nome;
        this.strs = new ArrayList<String>();
    }

    public void push(String s){
        this.strs.add(s);
    }

    public String top(){
        if (!this.strs.isEmpty()) return this.strs.get(this.strs.size() - 1);
        else return "n/a";
    }

   public String pop(){
    if (!this.strs.isEmpty()) return this.strs.remove(this.strs.size() - 1);
    else return "n/a";
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Stack de Strings" + "\n");
        sb.append("Nome: " + this.nomeStack + "\n");
        sb.append("Stack: " + this.strs.toString() + "\n");
        return sb.toString();
    }


}