import java.util.*;
public class Artist extends Listener{//Listener and Object user of Service
	//Class Variables
		private ArrayList<Album> catalogue; 
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
	//Catalogue
		public ArrayList<Album> getCatatogue() {
			return catalogue;
		}
		public void setCatatogue(ArrayList<Album> catatogue) {
			this.catalogue = catatogue;
		}
	//followers
		public HashSet<Listener> getFollowers() {
			return followers;
		}
		public void setFollowers(HashSet<Listener> followers) {
			this.followers = followers;
		}
	
	//manipulate followers hashset
		public void addFollower(Listener listener) {
			followers.add(listener);
		}
		public void removeFollower(Listener listener) {
			followers.remove(listener);
		}
	
	
	//adding and subtracting from Artist's catalogue
		public void addToCatalogue(Album album) {
			catalogue.add(album);
		}
		public void removeFromCatalogue(Album album) {
			catalogue.remove(album);
		}
	
	//print catalogue
		public void printCatalogue() {
			for(Album album : catalogue) {
				album.printInfo();
				System.out.println();
			}
		}
		
	//print Info, Overrides the printUserInfo from the Listener class, 
	//Polymorphism example part 2
		public void printUserInfo() {
			System.out.println("Artist Name: " + this.getName());
			System.out.println("Artist ID: " + id);
		}
	

}
