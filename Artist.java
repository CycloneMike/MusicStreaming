import java.util.*;

public class Artist extends Listener{
	private ArrayList<Album> catalogue; //why array list not sure
	private HashSet<Listener> followers;
	
	//constructor
	public Artist() {
		id = id+userCount;
		setName("N/A");
		Playlist = new ArrayList<Playlist>();
		catalogue = new ArrayList<Album>();
		followers = new HashSet<Listener>();
		userCount++;
	}
	
	public Artist(String name) {
		id = id+userCount;
		setName(name);
		Playlist = new ArrayList<Playlist>();
		catalogue = new ArrayList<Album>();
		followers = new HashSet<Listener>();
		userCount++;
	}
	

	//getters and setters
	public ArrayList<Album> getCatatogue() {
		return catalogue;
	}
	public void setCatatogue(ArrayList<Album> catatogue) {
		this.catalogue = catatogue;
	}
	public HashSet<Listener> getFollowers() {
		return followers;
	}
	public void setFollowers(HashSet<Listener> followers) {
		this.followers = followers;
	}
	
	//manipulate followers
	public void addFollower(Listener listener) {
		followers.add(listener);
	}
	public void removeFollower(Listener listener) {
		followers.remove(listener);
	}
	
	
	//adding and subtracting from catalogue
	public void addToCatalogue(Album album) {
		catalogue.add(album);
	}
	public void removeFromCatalogue(Album album) {
		catalogue.remove(album);
	}
	

	
	
}
