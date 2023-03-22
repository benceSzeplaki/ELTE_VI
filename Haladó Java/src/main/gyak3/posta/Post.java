package main.gyak3.posta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Post {

    private List<PostOffice> evenPostOffices = new ArrayList<>();
    private List<PostOffice> oddPostOffices = new ArrayList<>();

    public Post(PostOffice[] postOffices) {
        for(PostOffice postOffice: postOffices) {
            if(postOffice.getZipCode() % 2 == 0){
                evenPostOffices.add(postOffice);
            } else {
                oddPostOffices.add(postOffice);
            }
        }
    }

    public void simulate(MailManager[] mailManagers) {

        for(PostOffice postOffice : evenPostOffices){
            if(postOffice.hasMail()) {
                for(Mail mail : postOffice.getMails()){
                    for(MailManager mailManager: mailManagers){
                        if(mail.getId() == mailManager.getMessageId()) {
                            List<Integer> route = getRoute(mailManager.getThrough(), mailManager.getTo());
                            postOffice.send(mail.getId(), );
                        }
                    }
                }
            }
        }
        for(PostOffice postOffice : oddPostOffices){

        }
    }

    private List<Integer> getRoute(int[] through, int to) {
        List<Integer> ret = new ArrayList<>();
        for (int i : through) {
            ret.add(i);
        }
        ret.add(to);
        return ret;
    }
}
