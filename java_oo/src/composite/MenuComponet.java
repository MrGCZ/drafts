package composite;
//���ģʽ�����������νṹ����ʾ����/���֣���ϣ���, Composite����Ҷ��ĩ�ڣ�leaf��ʵ�������Component����ͬһ�ӿڣ��Ա��ڿ�����ͬһ��ʽ��������Ҷ��
public abstract class MenuComponet {
        public void add(MenuComponet menuComponet){
            throw new UnsupportedOperationException();
        }

        public MenuComponet getChild(int i){
            throw new UnsupportedOperationException();
        }

        public String getName(){
            throw new UnsupportedOperationException();
        }

        public double getPrice(){
            throw new UnsupportedOperationException();
        }

        public void print(){
            throw new UnsupportedOperationException();
        }
}
