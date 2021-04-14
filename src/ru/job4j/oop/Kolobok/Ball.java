package oop.Kolobok;

public class Ball implements Eating {

    private String name;

    public Ball(String name) {
        this.name = name;
    }

    @Override
    public void tryEat(Ball ball) {

        System.out.println(ball.name + " это я.");
    }

    public void run() {
        System.out.println(name + " я побежал");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
