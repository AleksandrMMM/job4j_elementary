package ru.job4j.work;

public abstract  class AbstactPhone {
    private int year;

    public AbstactPhone(int year){
        this.year = year;
    }
    public abstract void call(int outputNumber);
    public abstract void ring(int inputNumber);

    public static void main(String[] args) {
        AbstactPhone firstPhone = new ThomasEdisonPhone(1879);
        AbstactPhone phone = new Phone(1984);
        AbstactPhone videoPhone=new VideoPhone(2018);
        User user = new User("Андрей");
        user.callAnotherUser(224466,firstPhone);
// Вращайте ручку
//Сообщите номер абонента, сэр
        user.callAnotherUser(224466,phone);
//Вызываю номер 224466
        user.callAnotherUser(224466,videoPhone);
//Подключаю видеоканал для абонента 224466
    }
}

 class SomePhone{
    private int year;
    private String company;
    public SomePhone(int year, String company){
        this.year = year;
        this.company = company;

    }
    private  void openConnection(){

    }
    public void call(){
        openConnection();
        System.out.println("Вызываю номер");
    }
    public void ring(){
        System.out.println("Дзынь-Дзынь");
    }
}
abstract class WirelessPhone extends AbstactPhone{
    private int hour;

    public WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }
}
class CellPhone extends WirelessPhone{
    public CellPhone(int year, int hour){
        super(year, hour);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вызываю номер " + outputNumber);

    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Вам звонит абонент " + inputNumber);
    }
}

class SmartPhone extends CellPhone{
    private String operationSystem;

    public SmartPhone(int year, int hour, String operationSystem){
        super(year, hour);
        this.operationSystem = operationSystem;

    }
    public void install(String program){
        System.out.println("Устанавливаю " + program + " для " + operationSystem);
    }
}
class User{
    private String name;
    public User(String name){
        this.name = name;
    }
    public void callAnotherUser(int number, AbstactPhone phone){
        phone.call(number);
    }
}
class ThomasEdisonPhone extends AbstactPhone {

    public ThomasEdisonPhone(int year) {
        super(year);
    }
    @Override
    public void call(int outputNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента, сэр");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");
    }
}
class Phone extends AbstactPhone {

    public Phone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вызываю номер" + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");
    }
}
class VideoPhone extends AbstactPhone {

    public VideoPhone(int year) {
        super(year);
    }
    @Override
    public void call(int outputNumber) {
        System.out.println("Подключаю видеоканал для абонента " + outputNumber );
    }
    @Override
    public void ring(int inputNumber) {
        System.out.println("У вас входящий видеовызов..." + inputNumber);
    }
}