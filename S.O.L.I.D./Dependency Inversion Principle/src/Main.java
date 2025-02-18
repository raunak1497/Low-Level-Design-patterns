public class Main {
    public static void main(String[] args) {
        Keyboard wiredKeyBoard =  new WiredKeyboard();
        Mouse bluetoothMouse = new BluetoothMouse();

        Macbook macbook =  new Macbook(wiredKeyBoard, bluetoothMouse);

        macbook.useKeyboard();
        macbook.useMouse();
    }
}