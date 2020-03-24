public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello from main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();

        //creating anonymous class
        new Thread(() -> System.out.println(ThreadColor.ANSI_GREEN + "Hello from anonymous thread")).start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED+"Hello from the anonymos class's implementation of run");
                try {
                    anotherThread.join();
                    System.out.println(ThreadColor.ANSI_RED+"Anoter Thread terminated or timed out, so I am running again");
                }catch (InterruptedException e){
                    System.out.println(ThreadColor.ANSI_RED+"I couldn't wait after all. I was interrupted");
                }
            }
        });

        myRunnableThread.start();
        //anotherThread.interrupt();

        System.out.println(ThreadColor.ANSI_PURPLE + "Hello again from the main thread");

    }
}
