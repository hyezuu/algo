import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        System.out.print(T.solution(num, str));
    }

    public String solution(int num, String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num; i++){
            String str1 = str.substring(i*7,7*(i+1))
                    .replaceAll("[*]","0")
                    .replaceAll("#","1");
            sb.append((char)Integer.parseInt(str1,2));
        }
        return sb.toString();
    }
}
