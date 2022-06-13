package $1_Lambda_FunctionalInterface;

import java.util.Comparator;

public class $2_Lambda_Comparator {
    public static void main(String[] args) {

        //old way
        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
            }
        };

        System.out.println("old way: "+cmp.compare(110,10));

        //using lambda
        Comparator<Integer> cmp1= (o1,o2)->o1.compareTo(o2);
        System.out.println("using lambda: "+cmp1.compare(110,110));
    }


}
