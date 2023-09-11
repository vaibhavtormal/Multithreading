class NumberThred extends Thread {
    private int start;
    private int stop;
    private int delay;

    public NumberThred(int start, int stop, int delay) {
        this.start = start;
        this.stop = stop;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = start; i <= stop; i++) {
            System.out.println(i);

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

