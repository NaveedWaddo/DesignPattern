public class Thread1 extends Thread {
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();

        t1.start();
        t2.start();

        t1.setName("Thread1");
        t2.setName("Thread2");
    }


    @Override
    public void run() {

        SerializedSingletonClass s = SerializedSingletonClass.getInstance();
        System.out.println(Thread.currentThread().getName());
    }
}
