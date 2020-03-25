import java.util.ArrayList;
import java.time.LocalDateTime;

class QuickStart {
    public static void main(String[] args) {



        ArrayList<String> comentarios = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();
        comentarios.add("ya");
        comentarios.add("ya");
        comentarios.add("ya");
        comentarios.add("ya");
        comentarios.add("yayeet");
        FBPost newpost = new FBPost(0, "miguel", now, "skrrt", 400, comentarios);
        FBPost newpost1 = new FBPost(1, "lucas", now, "trrrsk", 401, comentarios);
        FBPost newpost2 = new FBPost(2, "farias", now, "rrrskt", 402, comentarios);
        FBPost newpost3 = new FBPost(3, "a", now, "kkkkrst", 403, comentarios);
        FBPost newpost4 = new FBPost(4, "b", now, "kkkkrst", 300, comentarios);
        FBPost newpost5 = new FBPost(5, "c", now, "kkkkrst", 100, comentarios);
        FBPost newpost6 = new FBPost(6, "d", now, "kkkkrst", 298, comentarios);

        ArrayList<FBPost> postlist = new ArrayList<>();
        postlist.add(newpost);
        postlist.add(newpost1);
        postlist.add(newpost2);
        postlist.add(newpost3);
        postlist.add(newpost4);
        postlist.add(newpost5);
        postlist.add(newpost6);
        FBFeed newfeed = new FBFeed(postlist);
        



        System.out.println("Hello, World.");
        System.out.println(newfeed.top5Comments());
        //  System.out.println(newfeed.getPost(6).getLikes());
        //  newfeed.like(newpost6);
        //  newfeed.like(6);  
        //  System.out.println(newfeed.getPost(6).getLikes());
        //  System.out.println(newfeed.getPost(6));





    }
}