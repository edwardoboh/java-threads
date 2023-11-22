public class Main {
    public static void main(String[] args){
        System.out.println("Main thread start");
        Runnable task = () -> {
            System.out.println("Child Thread");
        };
       Thread thread = new Thread(task);
//       thread.setDaemon(true);  // Use this line if you want the second thread to end immediately the main thread exits
       thread.start();

       System.out.println("Main Thread Ends");
    }

}