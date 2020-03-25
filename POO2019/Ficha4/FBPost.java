import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;
import java.lang.Comparable;

public class FBPost implements Comparable<FBPost>{
    private int id;
    private String user;
    private LocalDateTime data;
    private String content;
    private int likes;
    private ArrayList<String> comments;

    public FBPost() {
    }

    public FBPost(int id, String user, LocalDateTime data, String content, int likes, ArrayList<String> comments) {
        this.id = id;
        this.user = user;
        this.data = data;
        this.content = content;
        this.likes = likes;
        setComments(comments);
    }

    public FBPost(FBPost post) {
        this.id = post.getId();
        this.user = post.getUser();
        this.data = post.getData();
        this.content = post.getContent();
        this.likes = post.getLikes();
        this.comments = post.getComments();
    }
       

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LocalDateTime getData() {
        return this.data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<String> getComments() {
        ArrayList<String> newcomments = new ArrayList<>();
        for (String l : comments) newcomments.add(new String(l));
        return newcomments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = new ArrayList<>();
        for (String l : comments) this.comments.add(new String(l));
    }

    public FBPost id(int id) {
        this.id = id;
        return this;
    }

    public FBPost user(String user) {
        this.user = user;
        return this;
    }

    public FBPost data(LocalDateTime data) {
        this.data = data;
        return this;
    }

    public FBPost content(String content) {
        this.content = content;
        return this;
    }

    public FBPost likes(int likes) {
        this.likes = likes;
        return this;
    }

    public FBPost comments(ArrayList<String> comments) {
        this.comments = comments;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FBPost)) {
            return false;
        }
        FBPost fBPost = (FBPost) o;
        return id == fBPost.id && Objects.equals(user, fBPost.user) && Objects.equals(data, fBPost.data) && Objects.equals(content, fBPost.content) && likes == fBPost.likes && Objects.equals(comments, fBPost.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, data, content, likes, comments);
    }

    public FBPost clone() {
        return new FBPost(this);
    }


    public int compareTo(FBPost o) {
        return this.getLikes() - o.getLikes();
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", user='" + getUser() + "'" +
            ", data='" + getData() + "'" +
            ", content='" + getContent() + "'" +
            ", likes='" + getLikes() + "'" +
            ", comments='" + getComments() + "'" +
            "}";
    }

   
}