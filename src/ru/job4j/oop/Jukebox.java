package oop;

public class Jukebox {

    public static void main(String[] args) {

        music(1);
        music(2);
        music(100);

    }
    public static void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }
}
