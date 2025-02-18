public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter() ;

        waiter.serveCustomer();
        waiter.takeOrder();

        Chef chef = new Chef() ;
        chef.decideMenu();
        chef.cookFood();

        Helper helper = new Helper() ;
        helper.doTables();
        helper.washDishes();
    }
}