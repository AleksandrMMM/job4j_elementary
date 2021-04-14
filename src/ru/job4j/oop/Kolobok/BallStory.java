package oop.Kolobok;

public class BallStory {

    public static void main(String[] args) {

        Ball ball = new Ball("колобок");
        Eating[] animals = new Eating[] {

                new Hare(),
                new Wolf(),
                new Fox()
        };

        for (Eating am: animals) {
            am.tryEat(ball);
        }

    }
}
