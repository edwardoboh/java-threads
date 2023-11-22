public class Main {
    public static void main(String[] args){
        System.out.println("Main thread start");
       Thread thread = new Thread(
               () -> {
                   System.out.println("Inner Thread Started");
                   try{
                       Thread.sleep(4000);
                   }catch(Exception e){
                       System.out.println(e.getMessage());
                   }
                   System.out.println("Inner Thread Ends");
               }
       );
       thread.setDaemon(true);  // Use this line if you want the second thread to end immediately the main thread exits
       thread.start();

       System.out.println("Main Thread Ends");
    }

}