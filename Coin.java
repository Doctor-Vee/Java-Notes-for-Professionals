public enum Coin {
    PENNY(1, true), NICKEL(5, false), DIME(10), QUARTER(25);

    private final int value;
    private final boolean isCopperColoured;

    Coin(int value){
        this(value, false);
    }

    Coin(int value, boolean isCopperColoured){
        this.value = value;
        this.isCopperColoured = isCopperColoured;
    }

    public int getValue() {
        return value;
    }

    public boolean isCopperColoured() {
        return isCopperColoured;
    }
}
