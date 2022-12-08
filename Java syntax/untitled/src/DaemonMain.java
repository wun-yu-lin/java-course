public class DaemonMain {
    public static void main(String[] args) {
        var thread = new Thread(()->{
            while (true){
                System.out.println("Running.....");
            }
        });

        //thread.setDaemon(true);
        thread.start();
    }
}
