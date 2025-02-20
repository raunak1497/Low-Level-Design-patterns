public class Main {
    public static void main(String[] args){
        Directory movieDirectory = new Directory("Movie");
        File movie = new File("YJHD");
        movieDirectory.addFile(movie);
        Directory comedyMovie = new Directory("Comedy");
        File idiots3 = new File("3 Idiots");
        File rockstar = new File("Rockstar");
        comedyMovie.addFile(idiots3);
        comedyMovie.addFile(rockstar);
        movieDirectory.addFile(comedyMovie);

        movieDirectory.ls();
    }
}
