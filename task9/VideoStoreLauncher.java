public class VideoStoreLauncher {
public static void main (String[] args) {
    Video movie1 = new Video();
    movie1.setTitle("Три мушкетера");

    movie1.addRating(2);
    movie1.addRating(5);
    movie1.addRating(3);
    movie1.addRating(1);
    movie1.getRating(); // rating выводиться не double???

    System.out.println("Title: " + movie1.getTitle() + " Rating: " + movie1.getRating());

    movie1.CheckOut();
    getStatus(movie1); // метод ниже
    movie1.returnToStore();
    getStatus(movie1); // метод ниже

    VideoStore vstore = new VideoStore();
    vstore.addVideo("Король и лев");
    vstore.addVideo("Красная шапочка");
    vstore.addVideo("Дети шпионов");
    vstore.rateVideo(0,5);
    vstore.rateVideo(0,3);
    vstore.rateVideo(0,2);
    vstore.rateVideo(0,1);
    vstore.rateVideo(0,3);
    System.out.println(vstore.getVideoByIndex(2));

    vstore.checkOut(0);
    vstore.checkOut(2);

    System.out.println("Avarage Rating for video #0: " + vstore.ratingForVideo(0)); //выводиться не double
    vstore.listInventory();
}

    public static void getStatus(Video v) {
        String title = v.getTitle();
        if(v.isCheckOut()) {
            System.out.println(title + " is checked out.");
        }
        else {
            System.out.println(title + " is on the shelves");
        }
    }
}

