import java.util.*;
public class Playlist {
		private int playlistID;
		public String playlistName;
		public String tracklist;
		public String description;
		private static int playlistCount = 100000;
		
		private ArrayList<String> Songs;
		
		//Constructors
		public Playlist() { //default constructor i think this is needed just in case but not sure
			playlistID = playlistCount;
		}
		public Playlist(int playlistID, String playlistName, String description) {
			this.playlistID = playlistID; //could remove in favor of auto generating new playlist IDs 
			this.playlistName = playlistName;
	//removed tracklist from the constructor, because changed tracklist to be automatically generated based on 
	//additions and subtractions to the Song ArrayList
			this.description = description;
			Songs = new ArrayList<String>();
		}
		
		//Getters and Setters
		public String getPlaylistName() {
			return playlistName;
		}
		public void setPlaylistName(String playlistName) {
			this.playlistName = playlistName;
		}
		public String getTracklist() {
			return tracklist;
		}
		public void setTracklist(String tracklist) {
			this.tracklist = tracklist;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		
		//Modifying Songs array
		public void addSong(String song){
			Songs.add(song);
			updateTracklist();
		}
		public void removeSong(String song) {
			Songs.remove(song);
			updateTracklist();
		}
		public void updateTracklist() {
			tracklist = "";
			//List to Comma Separated thing neat
			tracklist = String.join(", ", Songs);
		}
		
		//Printing yay
		public void printInfo() {
			System.out.println("Playlist ID: " + playlistID);
			System.out.println("Playlist Name: " + playlistName);
			System.out.println("Tracklist: " + tracklist);
			System.out.println("Playlist Description: " + description);
		}
		
		
		//testing in main
		public static void main(String[] args) {
			Playlist test = new Playlist(12, "kpoopers", "koreaboo");
			System.out.println(test.getPlaylistName());
			test.setPlaylistName("kpopers");
			System.out.println(test.getPlaylistName());
			System.out.println(test.getTracklist());
	
			System.out.println(test.getDescription());
			test.setDescription("kpop boy groups");
			System.out.println(test.getDescription());
			
			test.addSong("Yes or Yes");
			test.addSong("TT");
			System.out.println(test.getTracklist());
			test.addSong("Not Shy");
			
			
			System.out.println(test.getTracklist());
			
			test.printInfo();
			
			
			
		}
}
