import java.util.ArrayList;
import java.time.LocalDate;

class QuickStart {
    public static void main(String[] args) {

        LinhaEncomenda newline = new LinhaEncomenda("ref1", "desc1",2.00, 2, 0.14, 0);
        LinhaEncomenda newline2 = new LinhaEncomenda("ref2", "desc2",4.00, 2, 0.14, 0);
        LocalDate today = LocalDate.now();
        ArrayList<LinhaEncomenda> encs = new ArrayList<>();
        Encomenda newencom = new Encomenda();
        newencom.setNomeCliente("jojo");
        newencom.setNif(103);
        newencom.setMorada("untsbunts");
        newencom.setNEnc(10);
        newencom.setData(today);
        newencom.setEncomendas(encs);
        newencom.adicionaLinha(newline);
        newencom.adicionaLinha(newline2);









        System.out.println("Hello, World.");
        System.out.println(newencom);
        System.out.println(newencom.getEncomendas());
        System.out.println(newencom.calculaValorTotal());
        System.out.println(newencom.calculaValorDesconto());
        System.out.println(newencom.existeProdutoEncomenda("ref1"));
        newencom.removeProduto("ref1");
        System.out.println(newencom.existeProdutoEncomenda("ref1"));


    }
}