package ru.job4j.oop;

public class Battery {

    private int load;

    public void exchange(Battery another) {
        this.load --;
        another.load ++;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery();
        Battery battery2 = new Battery();
        Battery battery3 = new Battery();

        battery1.setLoad(11);
        battery2.setLoad(12);
        battery3.setLoad(13);

        battery1.exchange(battery2);
        System.out.printf(" заряд 1 %d, заряд 2 %d", battery1.getLoad(), battery2.getLoad());
    }
}
