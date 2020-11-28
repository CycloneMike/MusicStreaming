import java.util.ArrayList;
public class Listener {
		//listener vars
		protected int id = 100000;
		private String name;
		protected int userCount = 0;
		//User Playlist in an Array
		public ArrayList<Playlist> Playlist;
		
		//constructors
		public Listener() {
			id = id+userCount;
			setName("N/A");
			Playlist = new ArrayList<Playlist>();
			userCount++;
			//MusicStreaming.addNewAccount(id);
		}
		public Listener(String name) {
			id = id+userCount;
			setName(name);
			Playlist = new ArrayList<Playlist>();
			userCount++;
		}
		
		//add playlist obj to listener's personal Playlist
		public void addNewPlaylist(Playlist newMix) {
			Playlist.add(newMix);
		}
		public void removePlaylist(Playlist oldMix) {
			Playlist.remove(oldMix);
		}
		
		//Mutators and Getters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public double getListenerID() {
			return id;
		}
		public ArrayList<Playlist> getPlaylist() {
			return Playlist;
		}
		public void setPlaylist(ArrayList<Playlist> Playlist) {
			this.Playlist = Playlist;
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listener michael = new Listener("Michael");
		MusicStreaming spotify = new MusicStreaming("Spotify");
		spotify.addNewAccount(michael.id, michael);

	}





	


}
