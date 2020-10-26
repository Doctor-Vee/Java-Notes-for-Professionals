package assistance_classes;

public class UserForList implements Comparable<UserForList>{
    public final Long id;
    public final String username;

    public UserForList(Long id, String username){
        this.id = id;
        this.username = username;
    }

    @Override
    public String toString(){
        return String.format("%s: %d", username, id);
    }

    @Override
    public int compareTo(UserForList o) {
        return id.compareTo(o.id);
    }
}
