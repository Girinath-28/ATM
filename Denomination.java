public class Denomination {
    private int twoThousand;
    private int fiveHundred;
    private int oneHundred;
    public Denomination() {
    }
    public Denomination(int twoThousand, int fiveHundred, int oneHundred) {
        this.twoThousand = twoThousand;
        this.fiveHundred = fiveHundred;
        this.oneHundred = oneHundred;
    }
    public int getTwoThousand() {
        return twoThousand;
    }
    public void setTwoThousand(int twoThousand) {
        this.twoThousand = twoThousand;
    }
    public int getFiveHundred() {
        return fiveHundred;
    }
    public void setFiveHundred(int fiveHundred) {
        this.fiveHundred = fiveHundred;
    }
    public int getOneHundred() {
        return oneHundred;
    }
    public void setOneHundred(int oneHundred) {
        this.oneHundred = oneHundred;
    }
}
