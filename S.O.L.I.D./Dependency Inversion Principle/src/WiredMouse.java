//concrete classes
public class WiredMouse implements Mouse {
    @Override
    public void mouseClicked(){
        System.out.println("Mouse Clicked");
    };
    @Override
    public void mouseType(){
        System.out.println("Wired Mouse Type");
    };
}
