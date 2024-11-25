//class Waiter implements RestaurantEmployee{
//    @Override
//    public void washDishes(){ //Unnecessary function being implemented
//        System.out.println("Not my task");
//    }
//
//    @Override
//    public void serveCustomers() {
//        System.out.println("Serving Customers");
//    }
//
//    @Override
//    public void cookFood() { //Unnecessary function being implemented
//        System.out.println("Not my task");
//    }
//}

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