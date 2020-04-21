class CaesarCipher{

    private int mKey;
    private String mToEncode;


    public int getKey(int newKey){
        this.mKey = newKey;
        return mKey;
    }

    public String inputToEncode (String input){
        this.mToEncode = input;
        return mToEncode;
    }

}