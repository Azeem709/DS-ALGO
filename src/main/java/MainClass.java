import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {

    public static void main(String [] args)
    {
problem();
    }


//    String str="uid1:12 , uid2:10 , uid3:20 , uid1:null , uid2:10 , uid3:10, uid4:xyz1 , uid1:100 , uid5:100";
//
//    Output:
//    uid1=112
//    uid2=20
//    uid3=30
//    uid5=100
    public static void problem(){
        String s = new String("Helloe");
        String s1 = s;

        List<String> list = Arrays.asList(new String[]{"azeem.rahman@avaali.com"});
        list.replaceAll(String::toUpperCase);

        System.out.println(list);
    }



}
