package composite;
import java.util.*;

public class Menu extends MenuComponet {
    ArrayList menuComponents = new ArrayList();
    String name;

    public Menu(String name){
        this.name = name;

    }


    public void add(MenuComponet menuComponet){
        menuComponents.add(menuComponet);
    }

    public MenuComponet getChild(int i){
        return (MenuComponet)menuComponents.get(i);
    }

    public String getName(){
        return name;
    }

    public void print(){
        System.out.println("Menu is: " + getName());
        System.out.println("--------------------");
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponet menuComponet = (MenuComponet) iterator.next();
            menuComponet.print(); //这里有可能遍历出Menu也有可能是MenuItem
        }

    }

}
