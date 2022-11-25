public class Reviewer1Launcher {
    public static void main (String[] args) {
        boolean testGetRating1 = false;
        boolean testFavorite = false;

        String[] movie = {"The Matrix", "ET", "Slumdog Millionaire","Le Rayon Vert", "Mamma Mia"};

        Reviewer1 r1 = new Reviewer1();
        r1.setRating1(0, 3);
        r1.setRating1(1, 4); 
		r1.setRating1(2, 5);
		r1.setRating1(3, 2);
		r1.setRating1(4, 1);

        if (r1.getRating1(1) == 4) {
            testGetRating1 = true;
        }

        if(r1.favourite1() == 2) {
            testFavorite = true;
        }

        System.out.println("testGetRating1: " + testGetRating1);
        System.out.println("testFavorite: " + testFavorite);
    }
}