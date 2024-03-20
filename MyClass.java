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
    public static void main(String[] args) {
        for (int i = 1; i < 3549; i++)
            System.out.println(convertNumber(i));
    }

    public static String convertNumber(int number) {
        StringBuilder result = new StringBuilder();
        int level = 0;

        while (number > 0) {
            int residue = number % 10;
            number = number / 10;
            result.insert(0, translateToRoman(residue, level++));
        }

        return result.toString();
    }

    public static String translateToRoman(int residue, int level) {
        // Decided to move this here as its not being used elswhere
        String[] units = { "I", "V" };
        String[] tens = { "X", "L" };
        String[] hundreds = { "C", "D" };
        String[] thousands = { "M", "G" };
        String[][] charactersArray = { units, tens, hundreds, thousands };
        String[] currentMap = charactersArray[level];
        // 9 -> IV
        if (residue == 9) {
            return currentMap[0] + "" + charactersArray[level + 1][0];
            // 5 - 8 -> V, VI, VII, VIII
        } else if (residue >= 5) {
            return currentMap[1] + repeat(currentMap[0], residue - 5);
            // 4 -> IV
        } else if (residue == 4) {
            return currentMap[0] + "" + currentMap[1];
        }
        // 1 - 3 -> I, II, III
        else {
            return repeat(currentMap[0], residue);
        }
    }

    public static String repeat(String s, int n) {
        if (s == null)
            return null;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            builder.append(s);
        }
        return builder.toString();
    }
}