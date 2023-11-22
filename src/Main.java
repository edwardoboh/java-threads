public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread(), "Thread MyThread");
        thread.start();
        System.out.println("This is on the main thread");
    }

    private static class MyThread implements Runnable {
        @Override
        public void run(){
            System.out.println("This is the thread running");
        }
    }

}