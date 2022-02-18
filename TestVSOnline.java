import java.util.*;
public class TestVSOnline{
    public static void main(String [] args)
    {
        Set<String>intHash = new HashSet<>;

        intHash.add(5);
        intHash.add(10);
        intHash.add(50);
        intHash.add(245);

        int sumHash = 0;
        System.out.println(intHash);
        for (Integer integer : intHash) {
            System.out.println("Hash Code: "+ integer.hashCode()+ "\tSquare root of HashCode: "+ Math.sqrt(integer.hashCode())
            + "\tSquare of HashCode: "+ Math.pow(integer.hashCode(), 2)+"\n");
            sumHash+=integer.hashCode();
        }
        System.out.println("Hash Code Sum: "+intHash.hashCode()+ "\tsumHash using loop: "+ sumHash);
    }
}