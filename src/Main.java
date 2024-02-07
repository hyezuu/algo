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
            String tmp = str.substring(0, 7).replace('#','1').replace('*','0');
            int n = Integer.parseInt(tmp, 2);
//            System.out.println(tmp+" "+n);
            sb.append((char)n);
            str = str.substring(7);

        }
        return sb.toString();
    }
}
