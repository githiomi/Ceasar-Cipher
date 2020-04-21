class CaesarCipher{

    private int mKey;
    private String mToEncode;

    public CaesarCipher( String plainText, int shiftKey){
        this.mKey = shiftKey;
        this.mToEncode = plainText;
    }

    public int getKey(int newKey){
        this.mKey = newKey;
        return mKey;
    }

    public String inputToEncode (String input){
        this.mToEncode = input;
        return mToEncode;
    }

    public boolean checkString ( String entered ){
        return entered.contains("2");
    }

    public String toLowercase (String enteredMix ){
        String converted = enteredMix.toLowerCase();
        return converted;
    }

    public String encodeToKey (String encodeToOne, int shiftKey ){
        String ciphered = "";
        int length = encodeToOne.length();
            for (int i = 0; i < length; i += 1){
                char ch = encodeToOne.charAt(i);

                char c = (char)(ch + shiftKey);

                if ( c > 'z'){

                    ciphered += (char)(ch - (26 - shiftKey));
                }

                else if ( Character.isAlphabetic(ch)) {

                    ciphered += c;
                }
            }
        return ciphered;
    }

    public String decryptEncoded (String encodedAlready, int shiftKey ){
        String deciphered = "";
        int length = encodedAlready.length();
        for ( int z = 0; z < length; z += 1){
            char ch = encodedAlready.charAt(z);

            char c = (char)(ch - shiftKey);

            if ( ch < 'a'){

                deciphered += (char)(ch + (26 - shiftKey));

            }else {

                deciphered += c;

            }
        }
        return deciphered;
    }

}