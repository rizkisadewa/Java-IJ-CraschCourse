public class NumberFormatException extends IllegalAccessException {
    static final long serivalVersionUID = -2848938806368998894L;
    public NumberFormatException(){
        super();
    }
    public NumberFormatException(String s){
        super(s);
    }
    static NumberFormatException forInputString(String s){
        return new NumberFormatException("For input String : \""+s+"\"");
    }
    static NumberFormatException forCharSequence(CharSequence s, int beginIndex, int endIndex, int errorIndex){
        return new NumberFormatException("Error at index "+(errorIndex - beginIndex)+" in: \""+s.subSequence(beginIndex, endIndex)+"\"");
    }
}
