public class BluetoothMouse implements Mouse {

    @Override
    public void mouseClicked(){
        System.out.println("Mouse Clicked");
    };

    @Override
    public void mouseType(){
        System.out.println("Bluetooth Mouse Type");
    };
}
