public class File {
    private String name;
    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File(String name) {
        this.name = name;
    }

    public void ls(){
        System.out.println("The filename is :" + getName());
    }

}
