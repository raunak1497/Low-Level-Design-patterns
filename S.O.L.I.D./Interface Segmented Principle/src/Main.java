public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter() ;
//        w.washDishes();
//        w.cookFood();
        waiter.serveCustomer();
        waiter.takeOrder();
        Chef chef = new Chef() ;
        chef.decideMenu();
        chef.cookFood();
    }
}