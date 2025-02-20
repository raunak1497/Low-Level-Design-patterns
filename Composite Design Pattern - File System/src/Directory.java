import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory implements FileSystem{


    private String directoryName;
    public List<FileSystem> fileSystems;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        fileSystems = new ArrayList<>();
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public void addFile(FileSystem object) {
        if(object == null) {
            throw new IllegalArgumentException("FileSystem object cannot be null");
        }
        fileSystems.add(object);
    }

    @Override
    public void ls(){
        ls(0);
    }

    @Override
    public void ls(int depth){
        for(int i=0; i<depth; i++){
            System.out.print("\t");
        }
        System.out.println("Directory : " + directoryName);
        for(FileSystem fileSystem : fileSystems){
            fileSystem.ls(depth+1);
        }
    }
}
