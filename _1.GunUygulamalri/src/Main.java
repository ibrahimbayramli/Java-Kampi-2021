import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(7);
        list.add(0);
        list.stream().forEach(iter-> System.out.print(iter+" "));

        System.out.println("***********************");
        list.stream().sorted();

        list.stream().sorted().forEach(iter-> System.out.print(iter+" "));


    }
}