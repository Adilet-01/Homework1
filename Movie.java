public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String title,String studio,String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }


    public Movie(String title,String studio){
        this.title=title;
        this.studio=studio;
        rating="PG";
    }


    @Override
    public String toString() {
        return String.format("Film = %s ,Studio = %s ,Rating = %s ",title,studio,rating);
    }



}
