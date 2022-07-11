package dao.reviewPage;

public class reviewDto {
    private static String id="not found";
    private static String movie_name="not found";
    private static String title="not yet";
    private static String content="not yet";
    //getter and setter
    public static String getId() {
        return id;
    }
    public void setId(String id) {
        reviewDto.id = id;
    }
    public String getMovie_name() {
        return movie_name;
    }
    public void setMovie_name(String movie_name) {
        reviewDto.movie_name = movie_name;
    }
    public static String getTitle() {
        return title;
    }
    public static void setTitle(String title) {
        reviewDto.title = title;
    }
    public static String getContent() {
        return content;
    }
    public static void setContent(String content) {
        reviewDto.content = content;
    }

}
