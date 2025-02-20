import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory {


    private String directoryName;
    public List<Objects> objectsList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        objectsList = new ArrayList<>();
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public void addObject(Object object) {
        objectsList.add((Objects) object);
    }

    public void ls(){
        System.out.println(directoryName);
        for(Object obj : objectsList){
            if(obj instanceof File){
                ((File) obj).ls();
            }
            if(obj instanceof Directory){
                ((Directory) obj).ls();
            }
        }
    }
}
