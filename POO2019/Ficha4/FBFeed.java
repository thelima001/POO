import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Comparator;



public class FBFeed implements Comparator<FBPost>{
    private ArrayList<FBPost> postlist;

    public FBFeed() {
    }

    public FBFeed(ArrayList<FBPost> postlist) {
        this.postlist = postlist;
    }

    public ArrayList<FBPost> getPostlist() {
        ArrayList<FBPost> newpostlist = new ArrayList<>();
        for (FBPost l : postlist) newpostlist.add(l.clone());
        return newpostlist;
    }

    public void setPostlist(ArrayList<FBPost> postlist) {
        this.postlist = new ArrayList<>();
        for (FBPost l : postlist) this.postlist.add(l.clone());
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FBFeed)) {
            return false;
        }
        FBFeed fBFeed = (FBFeed) o;
        return Objects.equals(postlist, fBFeed.postlist);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(postlist);
    }

    @Override
    public String toString() {
        return "{" +
            " postlist='" + getPostlist() + "'" +
            "}";
    }


    //Queries ao FBFeed

    public int nrPosts(String user){
        int r = 0;
        for (FBPost l : postlist){
            if (l.getUser().equals(user)) r++;
        }
        return r;
    }

    public List<FBPost> postsOf(String user){
        ArrayList<FBPost> userPosts = new ArrayList<>();
        for (FBPost p : postlist){
            if (p.getUser().equals(user)) userPosts.add(p.clone());
        }
        return userPosts;
    }

    public List<FBPost> postsOf(String user, LocalDateTime inicio, LocalDateTime fim){
        ArrayList<FBPost> userPosts = new ArrayList<>();
        for (FBPost p : postlist){
            if (p.getUser().equals(user) &&
                p.getData().isAfter(inicio) &&
                p.getData().isBefore(fim)) userPosts.add(p.clone());
        }
        return userPosts;
    }

    public FBPost getPost(int id){
        FBPost idPost = new FBPost();
        for (FBPost p : this.postlist){
            if (p.getId() == id) idPost = p.clone();
        }
        return idPost;
        }

    public void comment(FBPost post, String comentario){
        ArrayList<String> newcomentarios = new ArrayList<>();
        for (FBPost p : this.postlist){
            if(p.equals(post)){
                newcomentarios = p.getComments(); 
                newcomentarios.add(comentario);
                p.setComments(newcomentarios);
            }
        }
    }
        
    public void like(FBPost post){
        for (FBPost p : this.postlist){
            if(p.equals(post)){ p.setLikes(p.getLikes()+1);
                
            }
        }
    }
//A DE CIMA WORKS

    public void like(int postid){
        
        FBPost tbl = new FBPost();
        tbl = getPost(postid);
        like(tbl); 
    }


    public int compare(FBPost o1, FBPost o2) {
        return (o1.getLikes()-o2.getLikes());
    }


    public List<Integer> top5Comments(){
        ArrayList<Integer> result = new ArrayList<>();

        Collections.sort(postlist);
        Collections.reverse(postlist);
        //Iterador Interno

        for(int i =0; i<5; i++)
            result.add(postlist.get(i).getId());
             
        
        
        //Interno

        //result = (ArrayList<Integer>) postlist.stream().map(FBPost::getId).limit(5).collect(Collectors.toList());



        return result;
    }

}
