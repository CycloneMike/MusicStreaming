import java.util.ArrayList;
public class Listener {//Listener user of object
		//listener vars
			protected int id = 100000;
			private String name;
			protected int userCount = 0;
			public ArrayList<Playlist> Playlist; //User Playlist in an Array
		
		//constructors
			public Listener() {
				id = id+userCount;
				setName("N/A");
				Playlist = new ArrayList<Playlist>();
				userCount++;
				//MusicStreaming.addNewAccount(id); probably a way to make it so when a listener
				//object is created, it adds a new Account to the Accounts HashMap but not sure how
			}
			public Listener(String name) {
				id = id+userCount;
				setName(name);
				Playlist = new ArrayList<Playlist>();
				userCount++;
			}

		
		//Mutators and Getters
		//Name	
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
		//ListenerID
			public int getListenerID() {
				return id;
			}
			public void setListenerID(int id) {
				this.id = id;
			}
		//Playlist
			public ArrayList<Playlist> getPlaylist() {
				return Playlist;
			}
			public void setPlaylist(ArrayList<Playlist> Playlist) {
				this.Playlist = Playlist;
			}
		
		//Methods to add new playlist or remove playlist from a listener
			public void addNewPlaylist(Playlist newMix) {
				Playlist.add(newMix);
			}
			public void removePlaylist(Playlist oldMix) {
				Playlist.remove(oldMix);
			}
		
		//print Info: Part 1 of Polymorphism Example
			public void printUserInfo() {
				System.out.println("Listener Name: " + name);
				System.out.println("Listener ID: " + id);
			}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listener michael = new Listener("Michael");
		MusicStreaming spotify = new MusicStreaming("Spotify");
		spotify.addNewAccount(michael.id, michael);

	}





	


}
