public class ThreadHare implements Runnable {
    private boolean[] flags = {true, false};
    private int totalStep;
    private int step;
    public ThreadHare(int totalStep){
        this.totalStep = totalStep;
    }

    @Override
    public void run() {
        while(step<totalStep){
            var isHareSleep = flags[((int) (Math.random()*10))%2];
            if(isHareSleep){
                System.out.println("兔子睡著了zzz");
            }else {
                step+=2;
                System.out.printf("兔子跑了 %d 步...%n", step);
            }

        }
    }
}
