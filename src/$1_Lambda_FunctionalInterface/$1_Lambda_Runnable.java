package $1_Lambda_FunctionalInterface;

public class $1_Lambda_Runnable {
    public static void main(String[] args) {

        //old way
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();

        //new way
        Runnable runnable1=()->{
            System.out.println("hello Lambda");
        };
        new Thread(runnable1).start();


        //latest way
        new Thread(()->{System.out.println("Latest way");}).start();

    }
}
