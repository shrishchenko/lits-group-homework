package songsDTO;

// Cоздадим DTO который конвертнем в JSON файлик.

public class songsDTO {

	private String artist;
	private String song;
	private String time;

	public songsDTO() {

	}

	public songsDTO(String artist, String song, String time) {
		super();
		this.artist = artist;
		this.song = song;
		this.time = time;
	}

//		getter + setters
	public String getArtist() {
		return artist;
	}

	public String getSong() {
		return song;
	}

	public String getTime() {
		return time;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
