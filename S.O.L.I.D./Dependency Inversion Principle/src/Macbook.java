//public class Macbook {
//    private final WiredKeyboard keyboard;
//    private final WiredMouse mouse;
//
//    public Macbook() {
//        keyboard =  new WiredKeyboard();
//        mouse =  new WiredMouse();
//    }
//}

public class Macbook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public  Macbook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
    public void useKeyboard() {
        keyboard.keyPressed();
        keyboard.keyBoardType();
    }

    public void useMouse() {
        mouse.mouseClicked();
        mouse.mouseType();
    }

}