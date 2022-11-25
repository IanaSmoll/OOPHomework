import java.beans.Visibility;

public class VideoStore {
    Video[] arrayVideo = new Video[10]; 
    int videoCount;
    
    public void addVideo(String title){ // add a new video (by title) to the inventory
        if(videoCount > 10) {
            System.out.println("The store is full");
        }
        else {
            arrayVideo[videoCount] = new Video(); //создание нового объекта в массиве arrayVideo
            arrayVideo[videoCount].setTitle(title);
            videoCount++; // повторение со следующим объектом
        }
    }

    public void checkOut(int video){ // check out a video (by title)
        arrayVideo[video].CheckOut();
    }
    public void returnVideo(int video){ //return a video to the store
        arrayVideo[video].returnToStore();
    }
    public void rateVideo(int video, int rating){ //take a user's rating for a video
        arrayVideo[video].addRating(rating);
    }
    public double ratingForVideo(int video) {
        return arrayVideo[video].getRating();
    }
    public int getVideoByTitle(String title) {
        for(int i = 0; i < videoCount; i++) {
            if(title.equals(arrayVideo[i].getTitle()))
                return i;
        }
            return 0;
    }
    public String getVideoByIndex(int index) {
            if(arrayVideo[index] == null) {
                return "Video #: " + index + "not found";
            }
            else {
                return arrayVideo[index].getTitle();
            }
    }

    public void listInventory(){ //list the whole inventory of videos in the store
        for(int i = 0; i < videoCount; i++) {
            System.out.print(i + ": " + arrayVideo[i].getTitle());
            System.out.print("\tRating: " + ratingForVideo(i));
            if(arrayVideo[i].isCheckOut()) {
                System.out.print("\tCheck out: Yes ");
            }
            else {
                System.out.print(" Check out: No ");
            }
        }
    }
}