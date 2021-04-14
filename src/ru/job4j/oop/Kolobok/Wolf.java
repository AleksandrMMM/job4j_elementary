package oop.Kolobok;

public class Wolf implements Eating {

    @Override
    public void tryEat(Ball ball) {
        ball.run();
        System.out.println(ball.getName() + " убежал от волка.");
    }
}
