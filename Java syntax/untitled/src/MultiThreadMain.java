public class MultiThreadMain {
    public static void main(String[] args) {
        var tortoise = new ThreadTortoise(10);
        var hare = new ThreadHare(10);
        var tortoiseThread = new Thread(tortoise);
        var hareThread = new Thread(hare);
        tortoiseThread.start();
        hareThread.start();

    }
}
