public class Main {
    public static void main(String[] args){
        System.out.println("Main thread start");
       Thread thread = new Thread(){
           public void run(){
               System.out.println("...");
               try{
                   Thread.sleep(3000);
               }catch(Exception error){
                   System.out.println(error.getMessage());
               }
               System.out.println("Thread is now running");
           }
       };

       thread.start();

        System.out.println("Main Thread Ends");
    }

}