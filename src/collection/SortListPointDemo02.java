package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListPointDemo02 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(5,36));
        list.add(new Point(15,26));
        list.add(new Point(25,16));
        list.add(new Point(8,60));
        list.add(new Point(45,6));
        list.add(new Point(54,86));
        list.add(new Point(55,6));
        System.out.println(list);

        //单独定义比较器（定义Point元素的比较规则）
/*        Comparator<Point> c = new Comparator<Point>() {
            *//**
             * compare 方法用于定义o1和o2 比较大小的规则，并用返回值表达大小关系
             * 返回值实现的要求：
             * 如果返回值>0则表达的是：o1>o2
             * 如果返回值<0则表达的是：o1<o2
             * 如果返回值=0则表达的是：o1=o2
             *//*

            public int compare(Point o1, Point o2) {    //点比较的是原点到的距离
                int olen1 = o1.getX()*o1.getX() + o1.getY()*o1.getY();
                int olen2 = o2.getX()*o2.getX() + o2.getY()*o2.getY();
//                return olen1-olen2;     //升序
                return olen2-olen1;   //降序
            }
        };

//        Collections.reverse(list);
//        System.out.println(list);
        Collections.sort(list,c);   //点比较的是原点到的距离*/
        //将上述注释代码变为lambda 表达式
        Collections.sort(list,(o1,o2)->
         o1.getX()*o1.getX() + o1.getY()*o1.getY()- o2.getX()*o2.getX() - o2.getY()*o2.getY()   //直接用返回值表示
                );   //点比较的是原点到的距离
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
//        list.listIterator();
    }
}
