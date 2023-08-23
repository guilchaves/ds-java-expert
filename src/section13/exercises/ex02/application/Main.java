package section13.exercises.ex02.application;

import section13.exercises.ex02.entities.Comment;
import section13.exercises.ex02.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        List<Post> posts = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


        Post p1 = new Post();
        p1.setMoment(sdf.parse("21/06/2018 13:05:44"));
        p1.setTitle("Traveling to New Zealand");
        p1.setContent("I'm going to visit this wonderful country!");
        p1.setLikes(12);

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome");

        p1.addComment(c1);
        p1.addComment(c2);

        Post p2 = new Post();
        p2.setMoment(new Date("28/07/2018 23:14:19"));
        p2.setTitle("Good night guys");
        p2.setContent("See you tomorrow");
        p2.setLikes(5);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        p2.addComment(c3);
        p2.addComment(c4);

        posts.add(p1);
        posts.add(p2);

        for(Post p : posts){
            System.out.println(p);
        }
    }
}
