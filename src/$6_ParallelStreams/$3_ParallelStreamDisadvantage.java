package $6_ParallelStreams;

import java.util.stream.IntStream;

public class $3_ParallelStreamDisadvantage {
    public static void main(String[] args) {
        $3_Sum sum = new $3_Sum();

        IntStream.rangeClosed(1,1000)
                .forEach(sum::performSum);

        System.out.println("Sequential answer: "+sum.getTotal());


        /********************* Parallel Stream ************************************************/
        $3_Sum sum1= new $3_Sum();
        IntStream.rangeClosed(1,1000)
                .parallel()
                .forEach(sum1::performSum);

        System.out.println("Parallel answer: "+sum1.getTotal());


    }
}

 class $3_Sum {
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void performSum(int num)
    {
        this.total=total+num;
    }
}