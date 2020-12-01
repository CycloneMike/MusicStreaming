
public class Album {//Collection of songs of an artist on the service
	//Class vars
	private String album;
	private String artist;
	private String genre;
	private int albumID; //can auto gen but might be better not to
	private String[] tracks;
	
	//constructors
		public Album() {
			album = "";
			artist = "";
			genre = "";
			albumID = 0;
		}
	
		public Album(String album, String artist, String genre, int albumID, int numTracks) {
			this.album = album;
			this.artist = artist;
			this.genre = genre;
			this.albumID = albumID;
			tracks = new String[numTracks];
		}
	
	//Getters and Setters
	
	//Album
		public String getAlbumName() {
			return album;
		}
		public void setAlbumName(String albumName) {
			this.album = albumName;
		}
	//Artist
		public String getArtistName() {
			return artist;
		}
		public void setArtistName(String artistName) {
			this.artist = artistName;
		}
	//Genre
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
	
	//Album ID
		public int getAlbumID() {
			return albumID;
		}
		public void setAlbumID(int albumID) {
			this.albumID = albumID;
		}
	
	//Tracks
		public String[] getTracks() {
			return tracks;
		}
		public void setTracks(String[] tracks) {
			this.tracks = tracks;
		}
		//Print method for Tracks
			public String printTracks() { 
				String tracklist = "";		//List to Comma Separated thing neat
				tracklist = String.join(", ", tracks);
				return tracklist;
			}
	//Print Album Info Method
		public void printInfo() {
			System.out.println("Arist Name: " + artist);
			System.out.println("Album Name: " + album);
			System.out.println("Album Genre: " + genre);
			System.out.println("Album ID: " + albumID);
			System.out.println("Album Tracks: " + printTracks());
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Album positions = new Album("positions", "Ariana Grande", "American Pop", 3435, 2);
		String[] list = {"positions", "34+35"};
		positions.setTracks(list);
		positions.printInfo();

	}

}
