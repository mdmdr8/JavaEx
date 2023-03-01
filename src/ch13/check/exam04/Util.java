package ch13.check.exam04;

public class Util {
/*    첫 번쨰 방법
    public static<K, V> V getValue(Pair<K, V> p, K k){
        if(p.getKey() == k){
            return p.getValue();
        }else {
            return null;
        }
    }*/

    //두 번째 방법
    public static <P extends Pair<K, V>, K, V> V getValue(P p, K k) {
        if (p.getKey() == k) {
            return p.getValue();
        } else {
            return null;
        }
    }
}
