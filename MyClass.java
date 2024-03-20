import java.util.HashMap;
/* Integer to Roman number between 1 - 3000
I -> III
IV
V
IV
X -> XXX
XL
L
XC
C -> CCC
D
CM
MMM


1243

124, 3 -> III // I V
12, 4 -> XL // X L
1, 3 -> CCC // CCC D
0, 1 -> M // D M

MCCCXLIII

*/

class MyClass {

    private static HashMap<Integer, String> map;
    static {
        map = new HashMap(Integer, String);
        map.put(0, "I");
        map.put(1, "V");

    }
    private static HashMap<Integer, String> map2;
    static {
        map2 = new HashMap(Integer, String);
        map2.put(0, "X");
        map2.put(1, "L");
    }
    private static HashMap<Integer, String> map3;
    static {
        map3 = new HashMap(Integer, String);
        map3.put(0, "C");
        map3.put(1, "D");
    }

    private static HashMap<Integer, String> map4;
    static {
        map4 = new HashMap(Integer, String);
        map4.put(0, "M");
        map4.put(1, "P");
    }

    private HashMap<Integer, String>[] charactersArray = { map, map2, map3, map4 };

    public static void main(String[] args) {
        System.out.println(convertNumber(5));
    }

    public static String convertNumber(int n) {
        int number = n;
        String result = "";
        int level = 0;
        while (number > 0) {
            int residue = n % 10;
            number = n / 10;
            result += translateToRoman(residue, level++);
        }

        return result;
    }

    public static String translateToRoman(int residue, int level){
        map = maps[level];
        
       // [map, map, map, map]
        if(re == 1) return map[0];// "I"
        map[1]// "V"
        
        1 - 3 // I, II, II
        4 // IV
        5 // V
        6 - 8 // VI, VII, VIII
        9 // IV
    }
}