import java.util.ArrayList;
import java.time.LocalDate;

class QuickStart {
    public static void main(String[] args) {
        StackSt newstack = new StackSt("stack");
        newstack.push("Yeet");
        newstack.push("The");
        newstack.push("Beat");

        LinhaEncomenda newline = new LinhaEncomenda("ref1", "desc1",2.00, 2, 5, 10);
        LinhaEncomenda newline2 = new LinhaEncomenda("ref2", "desc2",4.00, 2, 5, 10);
        LocalDate today = LocalDate.now();
        ArrayList<LinhaEncomenda> encs = new ArrayList<>();
        Encomenda newencom = new Encomenda();
        newencom.setNomeCliente("jojo");
        newencom.setNif(103);
        newencom.setMorada("untsbunts");
        newencom.setNEnc(10);
        newencom.setData(today);
        newencom.setEncomendas(encs);
        newencom.push(newline);
        newencom.push(newline2);









        System.out.println("Hello, World.");
        System.out.println(newstack);
        System.out.println(newencom);
        System.out.println(newencom.getEncomendas());
    }
}