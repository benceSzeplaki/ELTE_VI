package main.gyak3.posta;

import java.util.Arrays;

public class MailManager {

    private int from;
    private int to;
    private int[] through;
    private int messageId;

    public MailManager() {}

    public MailManager(int from, int to, int[] through, int messageId) {
        this.from = from;
        this.to = to;
        this.through = through;
        this.messageId = messageId;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int[] getThrough() {
        return through;
    }

    public void setThrough(int[] through) {
        this.through = through;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    @Override
    public String toString() {
        return "MailSending{" +
                "from=" + from +
                ", to=" + to +
                ", through=" + Arrays.toString(through) +
                ", messageId=" + messageId +
                '}';
    }
}
