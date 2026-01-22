package Week12;
import java.util.*;

public class ListArrayIterator{
    
    public static void main(String[] args){
        
        ArrayList<String> names= new ArrayList<>();
        names.add("kar");
        names.add("Ing");
        names.add("Sai");
        names.add("Vector");
        names.add("Safal");
        
        for(String name : names){
            System.out.println("Names: " + name);
        }
        
        Iterator<String> nameIterator= names.iterator();
        
        while(nameIterator.hasNext()){
            System.out.println("Name Iterator: " + nameIterator.next());
        }
        
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(30);
        numbers.add(67);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        
        for(int num : numbers){
            System.out.println("Numbers: " + num);
        }
        
        Iterator<Integer> numberIterator= numbers.iterator();
        
        while(numberIterator.hasNext()){
            System.out.println("Number Iterator: " + numberIterator.next());
        }
    
        
        System.out.println("Size of names ArrayList: " + names.size());
        System.out.println("SIze of numbers ArrayList: " + numbers.size());
        
        numbers.clear();
        
        System.out.println("3rd element: " + names.get(2));
        System.out.println("5th element: " + names.get(4));
        names.remove(2);
    }
}