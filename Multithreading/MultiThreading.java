public class MultiThreading {
    public static void main(String[] args) {
/*
        ** Runnable 
        ** Callable
        ** Thread

        ThreadPool concept 
        Executor framework
 */
        System.out.println("This is my single process Program");
         myThread t1 = new myThread();
         myThread t2 = new myThread();

         t1.start();
         t2.start();
        
         t1.run("t1");
         t2.run("t2");

    }
}

class myThread extends Thread{
    //@Override
        public void run(String t){
            
            System.out.println("hello this is my thread execution -->"+t);
        }
}
                        