public class File implements FileSystem{
    private final String name;

    private String getName() {
        return name;
    }

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls(){
        ls(0);
    }

    @Override
    public void ls(int depth){
        for(int i = 0; i < depth; i++){
            System.out.print("\t");
        }
        System.out.println("File: " + getName());
    }

}
