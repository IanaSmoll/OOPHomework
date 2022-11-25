public class Reviewer1 {
    int[] ratings = new int[5];
    int movieIndex;
    int rating;

    public void setRating1(int movieIndex, int rating){
        ratings[movieIndex] = rating;
    }
    public int getRating1(int movieIndex){
        return ratings[movieIndex];
    }
    public int favourite1() {
        int max = 0;
        int index = 0;
        for(int i = 0; i < ratings.length; i++) {
        if(ratings[i] > max) {
            max = ratings[i];
            index = i;
        }
    }
    return index;
    }
}
