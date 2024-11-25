//concrete classes
//public class WiredKeyboard {
//
//}


public class WiredKeyboard extends Keyboard {
    @Override
    void keyPressed(){
        System.out.println("key pressed");
    }
    @Override
    void keyBoardType(){
        System.out.println("This is a wired keyboard");
    }
}
