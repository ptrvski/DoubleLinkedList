package fkn.vsu.com;

public class DoubleLinkedList<T> {
    private static final class Element<T>{
        Element<T> prev = null;
        Element<T> next = null;
        T data;
        public Element (T data){
            this.data = data;
        }
    }
    private int size=0;
    private Element<T> head;
    private Element<T> tail;


    public void addFirst(T value){
        Element<T> element = new Element<>(value);
        if(size==1) {tail.prev = element; element.next = tail;}
        else if(size==0){tail = element;}
        else {head.prev = element; element.next = head;}
        head = element;
        head.prev = null;
        size++;
    }
    public void addLast(T value){
        Element<T> element = new Element<>(value);
        if(size==1){head.next = element; element.prev = head;}
        else if(size==0){head = element;}
        else {tail.next = element; element.prev = tail;}
        tail = element;
        tail.next = null;
        size++;
    }
    public void addInMiddle(T value, int position){ //счет элементов с нуля, элемент вставляется после элемента под переданным номером
        if(position>size-2){
            System.out.println("Ошибка");
        }
        Element<T> element = new Element<>(value);
        Element<T> curr = head;
        for(int i = 0; i<=position-1; i++){
            curr = curr.next;
        }
        element.prev = curr;
        element.next = curr.next;
        curr.next = element;
        curr = curr.next.next;
        curr.prev = element;
        size++;
    }
    public int getSize() {
        return size;
    }
    public T getElement(int position){
        Element<T> curr = head;
        for(int i = 0; i<position; i++){
            curr = curr.next;
        }
        return curr.data;
    }

    public void deleteElement(int position){
        Element<T> curr = head;
        for(int i = 0; i<position; i++){
            curr = curr.next;
        }
        if(size==1 || position>size-1 || position <0){
            System.out.println("Ошибка");
        }
        else if(position==0){
            head = curr.next;
            head.prev = null;
        }
        else if(position==size-1){
            tail = curr.prev;
            tail.next = null;
        }
        else{
            curr.next.prev = curr.prev;
            curr.prev.next = curr.next;
        }
        size--;
    }

}
