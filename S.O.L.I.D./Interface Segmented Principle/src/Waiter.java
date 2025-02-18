class Waiter implements WaiterInterface{
    @Override
    public void serveCustomer() {
        System.out.println("Serving Customers");
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking order");
    }
}