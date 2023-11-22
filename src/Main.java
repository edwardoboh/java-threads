public class Main {
    public static void main(String[] args) {
       MyThread miniThread = new MyThread("Mini Thread");
       miniThread.start();
       System.out.println(miniThread.getName());
    }

    private static class MyThread extends Thread {
        MyThread(String name){
            super(name);
        }

        public void run(){
            System.out.println("Running inside my thread");
        }
    }

}