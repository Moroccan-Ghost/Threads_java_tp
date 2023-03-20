public class Main {
    public static void main(String[] args) {

        /**
         * Every thread will print his 100 NBR but all of them are not ordred cuz they are all using the same CPU ( Cores < 10 )
         * */
        int nb = 20;

        Talkative talkative1 = new Talkative(nb,"T1");
        Talkative talkative2 = new Talkative(nb,"T2");
        Talkative talkative3 = new Talkative(nb,"T3");
        Talkative talkative4 = new Talkative(nb,"T4");
        Talkative talkative5 = new Talkative(nb,"T5");
        Talkative talkative6 = new Talkative(nb,"T6");
        Talkative talkative7 = new Talkative(nb,"T7");
        Talkative talkative8 = new Talkative(nb,"T8");
        Talkative talkative9 = new Talkative(nb,"T9");
        Talkative talkative10 = new Talkative(nb,"T10");

        Thread thread1 = new Thread(talkative1);
        Thread thread2 = new Thread(talkative2);
        Thread thread3 = new Thread(talkative3);
        Thread thread4 = new Thread(talkative4);
        Thread thread5 = new Thread(talkative5);
        Thread thread6 = new Thread(talkative6);
        Thread thread7 = new Thread(talkative7);
        Thread thread8 = new Thread(talkative8);
        Thread thread9 = new Thread(talkative9);
        Thread thread10 = new Thread(talkative10);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();


    }
}