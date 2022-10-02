package fkn.vsu.com;

public class Main {

    public static void main(String[] args) {
        SimpleDoubleLL<String> list3 = new SimpleDoubleLL<>();
        list3.add("11");
        list3.add("22");
        list3.add("33");
        list3.add("1,2,3,4,qq,weruyg","\\W",0);
        SimpleDoubleLL<String> list = new SimpleDoubleLL<>();
        list.add("ww,rr,tt,yy,uu,ii", "\\W", 0);
        list3.add(list);
        for (int i = 0; i<list3.getSize(); i++){
            System.out.println(i+" "+list3.getElement(i));
        }
    }
}
