class Song{
   
    String songName;
    String artist;
    String lyrics;
   
   Song(String songName,String artist,String lyrics){
      System.out.println(songName);
      System.out.println(artist);
      System.out.println(lyrics);
   }
  
}

public class FavoriteSong{
   public static void main(String[] args){
      
      String songName = "Lazy Song";
      String artist = "by:Bruno Mars";
      String lyrics ="\"Today I dont feel like doing anything\"\n\"I just wanna lay in my bed\"\n\"Don't feel like picking up my phone, so leave a message at the tone\"\n\"Cause today I swear I'm not doing anything\""; 
          
      Song song = new Song(songName,artist,lyrics);
      
   }
}