package polymorphism;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }
    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case  'c' -> new Comedy(title);
            default -> new Movie(title);
        };
    }


}
class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Movie",
                "Something Bad Happens");


    }
}
class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Funny",
                "funny Movie",
                "Something good Happens");


    }
}
