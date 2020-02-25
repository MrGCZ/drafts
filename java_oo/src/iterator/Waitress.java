package iterator;

public class Waitress {
    Menu menu;
    //Waitress����pancakeHoueseMenu�����ٳ���һ�㣬���Ա�Ϊ������Menu�ӿ�
    public Waitress(Menu menu){
        this.menu = menu;
    }

    public void printMenu(){
        Iterator pancakeIterator = menu.createIterator(); //����menu�ĵ�����
        printMenu(pancakeIterator);
    }

    //ֻҪʵ����Iterator�ӿڵļ��ϣ�������Array,ArrayList,Stack�ȶ�����������ѭ��������
    public void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
        }
    }
}
