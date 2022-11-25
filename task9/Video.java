public class Video {
    private String title;
    private double avarageRating;
    private boolean checkOut = false;
    
    int ratingSum = 0;
    int ratingCount = 0;

    public void setTitle(String title)
    { 
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void addRating(int rate) {
        ratingSum = rate + ratingSum; 
        ratingCount++;
        avarageRating = ratingSum/ ratingCount;
    }

    public double getRating() 
    {
        return avarageRating;
    }
    public void CheckOut()
    { 
        checkOut = true;
    }
    public void returnToStore() 
    {
       checkOut = false;
    }
    public boolean isCheckOut()
    {
        return checkOut;
    }
}