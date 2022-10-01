package fkn.vsu.com;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addFirst("красный"); //1
        list.addLast("синий"); //5
        list.addInMiddle("чуть более красный, нежели синий", 0); //3
        list.addInMiddle("чуть более синий, нежели красный", 1); //4
        list.addLast("ОЧЕНЬ СИНИЙ"); //6
        list.addFirst("ОЧЕНЬ КРАСНЫЙ"); //0
        list.addInMiddle("какой-то непонятный цвет", 1);//2
        list.deleteElement(5);
        list.deleteElement(4);
        list.deleteElement(3);
        list.deleteElement(2);
        list.deleteElement(1);
        for (int i = 0; i<list.getSize(); i++){
            System.out.println(i+" "+list.getElement(i));
        }
    }
}
