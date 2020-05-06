import java.util.HashSet;
import java.util.Set;

public class QuickTest {
    public static void main(String[] args) {
    DriveIt dridri = new DriveIt();
    Veiculo a = new Veiculo("AA-00-BB", "Mercedez", "C250", 2002, 120.9, 0.55, 3.3, 0, 3);
    Veiculo b = new Veiculo("II-OO-UU", "BMW", "M3", 2005, 140.0, 0.40, 9.9, 0, 8);

    Veiculo c = new Veiculo("Teste1", "Mazda", "Miata", 2005, 140.0, 0.40, 9.9, 0, 8);
    Veiculo d = new Veiculo("Teste2", "Lexus", "Unknown", 2005, 140.0, 0.40, 9.9, 0, 8);

    System.out.println(a);
    System.out.println(b);
    
    dridri.adiciona(a);
    System.out.println(dridri);
    dridri.adiciona(b);
    dridri.registarAluguer("II-OO-UU", 300);
    dridri.classificarVeiculo("II-OO-UU", 7.5);
    dridri.classificarVeiculo("II-OO-UU", 1.0);





    System.out.println(dridri);
    System.out.println(dridri.existeVeiculo("AA-00-BB"));
    System.out.println(dridri.quantos());
    System.out.println(dridri.quantos("BMW"));
    System.out.println(dridri.getVeiculos());
    System.out.println(dridri.getVeiculo("II-OO-UU").getNumKms());
    System.out.println(dridri.getVeiculo("II-OO-UU").getClassificacao());
    System.out.println(dridri.custoRealKm("II-OO-UU"));


    Set<Veiculo> setty = new HashSet<>();
    setty.add(c);
    setty.add(d);

    dridri.adiciona(setty);

    System.out.println(dridri);









    }
}