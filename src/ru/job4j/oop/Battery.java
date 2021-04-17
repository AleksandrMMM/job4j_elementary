package oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        if (this.load > another.load) {
            this.load += another.load;
            another.load = 0;
        }else {
            this.load += another.load;
            another.load = another.load - this.load;
        }

    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(23);
        Battery battery2 = new Battery(4);
        Battery battery3 = new Battery(13);



        battery1.exchange(battery2);
        System.out.printf(" заряд 1 %d, заряд 2 %d", battery1.getLoad(), battery2.getLoad());
    }
}
