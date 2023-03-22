package main.gyak3.posta;

public class Mail {

    private int id;
    private int zipCode;
    private String message;

    public Mail() {

    }

    public Mail(int id, int zipCode, String message) {
        this.id = id;
        this.zipCode = zipCode;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getZipCode() {
        return this.zipCode;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "zipCode=" + zipCode +
                ", message='" + message + '\'' +
                ", id=" + id +
                '}';
    }
}
