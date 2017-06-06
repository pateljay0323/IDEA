package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 20/4/17.
 */
public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        int max=-1;
        for (int i=0;i<keyboards.length;i++){
            for (int j=0;j<drives.length;j++){
                if(keyboards[i]+drives[j]<=s && max<keyboards[i]+drives[j]){
                    max=keyboards[i]+drives[j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
