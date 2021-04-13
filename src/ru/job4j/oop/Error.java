package oop;

public class Error {

    private boolean active;

    private int status;

    private String massage;

    public Error(boolean active, int status, String massage) {
        this.active = active;
        this.status = status;
        this.massage = massage;
    }

    public Error() {

    }

    public static void main(String[] args) {

        Error error = new Error(true, 404, "not faund");
        Error error1 = new Error(false, 400, "not ");

        System.out.println(error);
        System.out.println(error1);
    }

    @Override
    public String toString() {
        return "Error{" +
                "active=" + active +
                ", status=" + status +
                ", massage='" + massage + '\'' +
                '}';
    }
}
