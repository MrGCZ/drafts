package composite;

public class MenuRun {
    public static void main(String args[]){
        MenuComponet allMenus =new Menu("All Menus");
        MenuComponet menu1 = new Menu("Menu1");
        MenuComponet menu2 = new Menu("Menu2");
        MenuComponet menu3 = new Menu("Menu3");

        MenuComponet menuItem1 = new MenuItem("menuItem1",1.2);
        MenuComponet menuItem2 = new MenuItem("menuItem2",1.5);

        //不管根还是叶都可以用add方法
        allMenus.add(menu1);
        allMenus.add(menu2);
        menu1.add(menuItem1);
        menu1.add(menu3); //menu1还包含一个子menu
        menu2.add(menuItem2);


        allMenus.print();
    }



}
