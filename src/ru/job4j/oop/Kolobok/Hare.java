package oop.Kolobok;

public class Hare implements Eating{

    @Override
    public void tryEat(Ball ball) {
        ball.run();
        System.out.println(ball.getName() +   " Убежал  от зайца.");
    }
}
