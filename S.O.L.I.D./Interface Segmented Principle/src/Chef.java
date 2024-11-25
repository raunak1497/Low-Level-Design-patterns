class Chef implements ChefInterface{
    @Override
    public void cookFood() {
        System.out.println("Cooking food");
    }

    @Override
    public void decideMenu() {
        System.out.println("Deciding Menu");
    }
}
