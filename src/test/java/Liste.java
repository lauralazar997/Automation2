import java.util.ArrayList;
import java.util.List;

public class Liste {
    public static void main(String[]args){

        //crearea unei liste - v1
        List<String> listaStringuri = new ArrayList<>();

        //crearea unei liste - v2 - lista de integer
        List<Integer> listaInteger = List.of(1, 2, 23, 573);

        System.out.println(listaInteger);
        System.out.println(listaStringuri);

        //afisarea elementelor dintr-o lista de integers prin for
        for (int i=0; i<listaInteger.size(); i++) {
            System.out.println(listaInteger.get(i));
        }

        //afisarea listei varianta 3 - prin obiectul Integer cu i mare definim o variabila care parcurge o lista - se mai numeste
        //for each
        for (Integer item : listaInteger){
            System.out.println(item);
        }

        //operatii cu liste
        List<String> fructe = new ArrayList<>();

        //adaugam intr-o lista
        fructe.add("Apple");
        System.out.println(fructe);
        fructe.add("Banana");
        fructe.add("Orange");
        fructe.add(1, "Kiwi");
        System.out.println(fructe);

        //afisarea unui element din lista
        String item = fructe.get(2);
        System.out.println(item);

        //modificarea unui element din lista = SET
        fructe.set(3, "Plum");
        System.out.println(fructe);

        //stergerea unui element din lista - fie prin obiect, fie prin index
        fructe.remove("Kiwi");
        fructe.remove(1);
        System.out.println(fructe);

        //dimensiunea unei liste
        int marimeLista = fructe.size();
        System.out.println(marimeLista);
    }
}
