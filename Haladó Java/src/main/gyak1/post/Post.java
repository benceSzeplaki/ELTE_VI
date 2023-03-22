package main.gyak1.post;

public class Post {

    private final PostOffice postOfficeEven;
    private final PostOffice postOfficeOdd;

    Post(PostOffice postOfficeEven, PostOffice postOfficeOdd) {
        this.postOfficeEven = postOfficeEven;
        this.postOfficeOdd = postOfficeOdd;
    }

    public void separate(Envelope envelope) {
        if(envelope.getZipCode() % 2 == 0) {
            postOfficeEven.acceptEnvelope(envelope);
        } else {
            postOfficeOdd.acceptEnvelope(envelope);
        }
    }

}
