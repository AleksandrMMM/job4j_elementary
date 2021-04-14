package oop.Kolobok;

public class Fox implements Eating {

    private String name;

    @Override
    public void tryEat(Ball ball) {
        System.out.println(ball.getName()  + " лиса съела колобка");
    }
}
