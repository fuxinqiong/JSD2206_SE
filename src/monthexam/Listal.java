package monthexam;

import java.util.ArrayList;
import java.util.List;

import static monthexam.Test.print;

public class Listal {

    public static void main(String[] args) {
        List al = new ArrayList<>();
        al.add(1);
        print(al);
        System.out.println(al.get(1));
    }
}
