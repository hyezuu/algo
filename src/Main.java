import java.util.*;

public class Main{
    public static void main(String[] args){
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.print(main.solution(input));
    }
    public String solution(String str){
        String answer = "";
        Set<String> set = new HashSet<>();
        for(String s : str.split("")){
            if(set.add(s)){
                answer+=s;
            }
        }
        return answer;
    }
}