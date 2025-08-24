package solid.ex06.src;
public class Penguin extends Bird {
    @Override void fly(){
         throw new UnsupportedOperationException("Can't fly"); 
    }
}