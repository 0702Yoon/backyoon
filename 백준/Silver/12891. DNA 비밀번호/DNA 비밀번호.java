import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] standArr;
    static int[] countArr;
    static int checkNumber;
    static int resultCheckNumber;

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int max = Integer.parseInt(stringTokenizer.nextToken());
            int length = Integer.parseInt(stringTokenizer.nextToken());
            char[] lines = br.readLine().toCharArray();
            standArr = new int[4];
            countArr = new int[4];
            checkNumber = 0;
            resultCheckNumber = 0;
            stringTokenizer = new StringTokenizer(br.readLine());
            for (int i = 0; i < 4; i++) {
                standArr[i] = Integer.parseInt(stringTokenizer.nextToken());
                if (standArr[i] == 0) {
                    checkNumber++;
                }
            }
            for (int i = 0; i < length; i++) {
                addElement(lines[i]);
            }
            checkResult();
            int j;
            for (int i = length; i < max; i++) {
                j = i - length;
                addElement(lines[i]);
                minusElement(lines[j]);
                checkResult();
            }
            System.out.println(resultCheckNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void minusElement(char element) {
        switch (element) {
            case 'A':
                if (standArr[0] == countArr[0]) {
                    checkNumber--;
                }
                countArr[0]--;
                break;
            case 'C':

                if (standArr[1] == countArr[1]) {
                    checkNumber--;
                }
                countArr[1]--;
                break;
            case 'G':

                if (standArr[2] == countArr[2]) {
                    checkNumber--;
                }
                countArr[2]--;
                break;
            case 'T':
                if (standArr[3] == countArr[3]) {
                    checkNumber--;
                }
                countArr[3]--;
                break;
        }
    }

    private static void checkResult() {
        if (checkNumber == 4) {
            resultCheckNumber++;
        }
    }

    private static void addElement(char element) {
        switch (element) {
            case 'A':
                countArr[0]++;
                if (standArr[0] == countArr[0]) {
                    checkNumber++;
                }
                break;
            case 'C':
                countArr[1]++;
                if (standArr[1] == countArr[1]) {
                    checkNumber++;
                }
                break;
            case 'G':
                countArr[2]++;
                if (standArr[2] == countArr[2]) {
                    checkNumber++;
                }
                break;
            case 'T':
                countArr[3]++;
                if (standArr[3] == countArr[3]) {
                    checkNumber++;
                }
                break;
        }
    }
}
