package boletin7_5;

public class MayorQue {
    float n1, n2, n3;
  
    public void mayor(float n1, float n2, float n3){
        
        if (n2 > n1){
            System.out.println("El número mayor es "+n2);
        }
        else if (n3 > n1){
            System.out.println("El número mayor es "+n3);
        }
        else {
            System.out.println("El número mayor es "+n1);
        }
    }
}
