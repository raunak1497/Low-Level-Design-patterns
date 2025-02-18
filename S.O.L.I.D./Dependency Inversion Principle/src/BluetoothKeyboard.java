public class BluetoothKeyboard implements Keyboard {
    @Override
    public void keyPressed(){
        System.out.println("key pressed");
    }
    @Override
     public void keyBoardType(){
        System.out.println("This is a bluetooth keyboard");
     }
}
