package main.gyak3.posta;

import java.util.Arrays;

public class PostOffice {

    private Mail[] mails;
    private int zipCode;

    public PostOffice(){

    }

    public PostOffice(Mail[] mails, int zipCode) {
        this.mails = mails;
        this.zipCode = zipCode;
    }

    public int getZipCode() {
        return this.zipCode;
    }

    public Mail[] getMails() {
        return mails;
    }

    public void setMails(Mail[] mails) {
        this.mails = mails;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public boolean hasMail(){
        return this.mails.length != 0;
    }

    @Override
    public String toString() {
        return "PostOffice{" +
                "mails=" + Arrays.toString(mails) +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
