class CaesarCipher{

    private int mKey;

    public CaesarCipher (int key){
        this.mKey = key;
    }

    public int getKey(int newKey){
        this.mKey = newKey;
        return mKey;
    }

}