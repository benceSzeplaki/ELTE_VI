package main.gyak1.post;

import java.util.ArrayList;
import java.util.List;

public class PostOffice {

    private final List<Envelope> envelopes;

    public PostOffice() {
        this.envelopes = new ArrayList<>();
    }

    public void acceptEnvelope(Envelope envelope) {
        this.envelopes.add(envelope);
    }
}
