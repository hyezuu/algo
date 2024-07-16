package boj12865;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer cond = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(cond.nextToken());
        int M = Integer.parseInt(cond.nextToken());

        Bag[] bags = new Bag[N];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            bags[i] = new Bag(weight, value);
        }

        System.out.println(solution(M, bags));
    }

    public static int solution(int M, Bag[] bags){
        return 0;
    }
}

class Bag {
    int weight;
    int value;

    public Bag(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}
