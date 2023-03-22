package main.gyak3.posta;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class PostMain {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File file = new File("posts.json");
            File sendMailsFile = new File("mails_sent.json");
            PostOffice[] posts = objectMapper.readValue(file, PostOffice[].class);
            MailManager[] mailManagers = objectMapper.readValue(sendMailsFile, MailManager[].class);
            for (PostOffice post : posts) {
                System.out.println(post.toString());
            }
            for(MailManager mail : mailManagers) {
                System.out.println(mail.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
