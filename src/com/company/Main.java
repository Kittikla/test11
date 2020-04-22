package com.company;

import javax.imageio.ImageTypeSpecifier;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] matrix = new int[r][c];
        int n = in.nextInt();
        for(int i = 0;i<n;i++){
            int x  = in.nextInt();
            int y = in.nextInt();
            if(matrix[x-1][y-1]==0) {
                System.out.println("reserved complete");
                matrix[x - 1][y - 1] += 1;
            }else if(matrix[x-1][y-1]!=0){
                System.out.println("reserved not complete");
            }
        }
    }
}










