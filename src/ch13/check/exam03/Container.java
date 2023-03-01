package ch13.check.exam03;

public class Container<T, G> {

    private T t;
    private G g;

    public void set(T t, G g){
      this.t = t;
      this.g = g;
    }

    public T getKey(){
        return t;
    }
    public G getValue(){
        return g;
    }
}
