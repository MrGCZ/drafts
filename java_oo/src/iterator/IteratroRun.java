package iterator;
//������ģʽ���ṩһ�ַ���˳����ʾۺ϶����еĸ���Ԫ�ء�
public class IteratroRun {
    public static void main(String args[]){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu);

        waitress.printMenu();
    }

}
