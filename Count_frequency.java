import java.util.HashMap;

public class Count_frequency {
    public static void main(String[] args) {
        String s="abracadabra";
        int l= s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<l;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i) )+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        for(char key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
    
}
