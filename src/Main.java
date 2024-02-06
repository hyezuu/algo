import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(T.solution(str));
    }

    public String solution(String str) {
        str = str + " ";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i=0; i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else {
                sb.append(str.charAt(i));
                if(count>1) sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
}
