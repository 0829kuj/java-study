package entities;

public class Fruit {
       protected int id;       //다른 패키지에서는 사용할수 없다. 상속한 자식 클래스에서는 사용가능.
       
       @Override
       public String toString() {
    	   return "Fruit [id="+id+"]";
       }
}
