public class No {
    public int accountBalanceAfterPurchase(int pA) {
        int r=pA%10;
        int c=0;
        if(r<5)
            c=0;
        else
            c=10;
        pA=pA-r+c;
        return 100-pA;
    }
}