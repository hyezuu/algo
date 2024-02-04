import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

       System.out.println(main.solution(str));
    }
    public String solution(String str){
        String answer = "";
        int max = 0;
        for(String word : str.split(" ")){
           if(max<word.length()){
               max=word.length();
               answer = word;
           }
        }
        return answer;
    }
}