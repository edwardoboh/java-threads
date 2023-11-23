public class Main {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        Thread newThread = new Thread(myThread, "New Thread");
        newThread.start();
        Thread.sleep(5000);
        myThread.requestExit(true);
    }

    private static class MyThread implements Runnable {
        private boolean threadState;

        public void MyThread(){
            threadState = false;
        }
        public void requestExit(boolean state){
            threadState = !!state;
        }
        private void runThread(){
            while(!threadState){
                System.out.println("...");
                try{
                    Thread.sleep(2000);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }

        public void run(){
            System.out.println("Begin Thread Execution");
            runThread();
            System.out.println("Exit Thread Execution");
        }
    }
}