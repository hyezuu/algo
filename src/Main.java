import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.print(main.solution(str));
    }

    public String solution(String str) {
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=0; i<ch.length-1; i++){
            if(ch[i]!=ch[i+1]){
                sb.append((char)ch[i]);
                sb.append(count);
                count = 1;
            }
            else count++;
        }
        return sb.toString().replaceAll("1","");
    }
}
