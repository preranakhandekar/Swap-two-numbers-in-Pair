import java.util.* ;
import java.io.*; 
import javafx.util.Pair;

public class Solution {
    public static Pair < Integer, Integer > swap(Pair < Integer, Integer > swapValues) {
        int a=swapValues.getKey();
        int b=swapValues.getValue();
        return new Pair<>(b,a);
        
    }
}
