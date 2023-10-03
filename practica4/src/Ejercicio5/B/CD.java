package Ejercicio5.B;

public class CD extends MultiMediaItem {
    private String artist;
    public CD(String title, String artist, String language, int time) {
        super(title, language, time);
        this.artist = artist;
    }
    public void print() {
        super.print();
        System.out.println("Artist: " + artist);
    }
}