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
        DoubleLinkedList<String> list2 = new DoubleLinkedList<>();
        list2.addFirst("q");
        list2.addFirst("qq");
        list2.addLast("qqq");
        list2.addInMiddle("w", 0);
        SimpleDoubleLL<String> list3 = new SimpleDoubleLL<>();
        list3.add("11");
        list3.add("22");
        list3.add("33");
        list3.add(list2);
        list3.deleteElement(4);
        list3.add("qqqq", 6);
        for (int i = 0; i<list3.getSize(); i++){
            System.out.println(i+" "+list3.getElement(i));
        }
    }
}
