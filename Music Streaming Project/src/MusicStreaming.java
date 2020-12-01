import java.util.*;
import java.util.Map.Entry;
public class MusicStreaming { //Streaming service object, create on for new service
	//Class Variables
		private String serviceName;
		private HashMap<Integer, Listener> accounts;
		
	//creates a new MusicStreaming service
		public MusicStreaming() {
			setServiceName("N/A");
			setAccounts(new HashMap<Integer, Listener>());
		}
		public MusicStreaming(String name) {
			setServiceName(name);
			setAccounts(new HashMap<Integer, Listener>());
		}
	//Getters and Setters
	//serviceName
		public String getServiceName() {
			return serviceName;
		}
		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}
	//accounts HashMap
		public HashMap<Integer, Listener> getAccounts() {
			return accounts;
		}
		public void setAccounts(HashMap<Integer, Listener> accounts) {
			this.accounts = accounts;
		}
	
	
	//Ading and removing accounts from Service
	//adds new listener
		public void addNewAccount(int accountID, Listener listener) {
			accounts.put(accountID, listener);
		}
	//adds new artist
		public void addNewAccount(int accountID, Artist artist) {
			accounts.put(accountID, artist);
		}
	//removes and account
		public void removeAccount(int accountID) {
			accounts.remove(accountID);
		}
	
	//PrintInfo for test
		public void printInfo() {
			for (Entry<Integer, Listener> entry : accounts.entrySet())  
	            System.out.println("Key = " + entry.getKey() + 
	                             ", Value = " + entry.getValue()); 
		}

	

	public static void main(String[] args) {
		
		//Spotify service created
		MusicStreaming spotify = new MusicStreaming("Spotify");
		Listener michael = new Listener("Michael"); //Michael listener created
		spotify.addNewAccount(michael.id, michael);//Michael listener added to Spotify
		Artist ariana = new Artist("Ariana Grande");//Ariana Grande artist created
		spotify.addNewAccount(ariana.id, ariana);//Ariana Grande artist added to Spotify
		//spotify.printInfo();
		
		Album positions = new Album("positions", "Ariana Grande", "American Pop", 3435, 2);
		String[] list = {"positions", "34+35"};//creating a Album for Ariana for testing nd to be in print
		positions.setTracks(list);
		//positions.printInfo();
		
		ariana.addToCatalogue(positions);
		
		Album thankYou = new Album("thank u, next", "Ariana Grande", "American Pop", 1123, 3);
		String[] thank = {"imagine", "7 rings", "thank u, next"};
		thankYou.setTracks(thank);//another album
		
		ariana.addToCatalogue(thankYou);
		
		ariana.addFollower(michael);//adding Michael as a follower
		
		Playlist meow = new Playlist(1, "current favs", "stuff i am into right now");
		meow.addSong("daechwita");
		meow.addSong("dududunga");//modifying a preset playlist
				 
		ariana.addNewPlaylist(meow);
		
		
		//BEGINNING OF THE SCENARIO DEMONSTRATION IN THE CODE
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like to: ");
		System.out.println("\t Scenario 1. Create a new playlist");
		System.out.println("\t Scenario 2. Add a new album to your profile");
		
		int next = input.nextInt();
		
		if (next == 1) {
			System.out.println("What would you like the Playlist to be called?");
			String nameOfPlaylist = input.next();
			System.out.println("What do you want as the description of the playlist?");
			input.nextLine();
			String descriptionOfPlaylist = input.nextLine();
			System.out.println("What should the ID number of the playlist be?");
			int playlistID = input.nextInt();
			Playlist test = new Playlist(playlistID, nameOfPlaylist, descriptionOfPlaylist);
			ariana.addNewPlaylist(test);
			
			
			System.out.println("Would you like to add songs to the playlist? Input Y/N");
			if (input.next().charAt(0) == 'Y') {
				boolean factor = true;
				while (factor == true) {
					System.out.println("Please enter the name of the song.");
					String song = input.next();
					test.addSong(song);
					
					System.out.println("Would you like to add another song to the playlist? Input Y/N");
					if (input.next().charAt(0) == 'N') {
						factor = false;
						
					}	
					else {
						continue;
					}
				}
				System.out.println("Would you like the remove a song? Input Y/N");
				if(input.next().charAt(0) == 'Y') {
					System.out.println("Please enter the name of the song you wuld like to remove.");
					String song = input.next();
					test.removeSong(song);
				}
				
			}

			else {
				System.out.println("Error, you did not input a Y or N, please restart.");
			}
			
			test.printInfo();

		}
		else if (next == 2) {// have to press enter twice, couldn't fix that bug....
		
			System.out.println("What is the name of the album?");
			input.nextLine();
			String name = input.nextLine();
			
			System.out.println("Who is the artist?");
			String artist = input.nextLine();
			
			System.out.println("What genre is the album?");
			String genre = input.nextLine();
			
			System.out.println("What is the album ID?");
			int albumID = input.nextInt();
			System.out.println("How many tracks are on the album?");
			int trackCount = input.nextInt();
			
			Album test = new Album(name, artist, genre, albumID, trackCount);
			ariana.addToCatalogue(test);
			
			String[] newTracklist = new String[trackCount];
			for(int i = 1; i <= trackCount; i++) {
				
				input.nextLine();
				System.out.println("What is track " + i + ": ");
				newTracklist[i-1] = input.nextLine();
				}
			test.setTracks(newTracklist);

			ariana.printCatalogue();
			
		}
		else
			System.out.println("Error");
	
		input.close();

	}
	
}
