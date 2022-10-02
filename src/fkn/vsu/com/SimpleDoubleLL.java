package fkn.vsu.com;

public class SimpleDoubleLL<T> extends DoubleLinkedList<T>{
    public SimpleDoubleLL(){
        super();
    }
    public SimpleDoubleLL(T[] words){
        for(T word : words){
            this.addLast(word);
        }
    }
    public void add(T value, int position){
        if(position> super.getSize() || position<0){
            System.out.println("Error");
        }
        else{
            if(position== super.getSize()){
                super.addLast(value);
            }
            else if(position==0 && position != super.getSize()){
                super.addFirst(value);
            }
            else{
                super.addInMiddle(value, position-1);
            }
        }
    }
    public void add(T value){
        super.addLast(value);
    }
    public void add(DoubleLinkedList<T> addingList){
        super.tail.next = addingList.head;
        addingList.head.prev = super.tail;
        super.tail = addingList.tail;
        super.size+= addingList.size;
    }
    public void add(String value, String regex, int position){
        String[] words = value.split(regex);
        for(int i = 0; i< words.length; i++){
            this.add((T)words[i], position+i);
        }
    }
}
