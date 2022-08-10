package homeworkday01.day09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
//		List<Integer> list = new List<Integer>();
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			int i = it.next();
//			System.out.println(it.next());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		Iterator it = list.iterator();
		while (it.hasNext()){
			int i  = (int) it.next();
			System.out.println(i);

		}


    }
}
