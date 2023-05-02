package test;

public class Test {

    public String Cryptographer(String insert) {
        String output = "";
        char[] array = insert.toCharArray();
        for (int i = 0; i < array.length - 1; i++) {
            int ch = array[i];
            if (ch % 2 == 0) {
                array[i] = (char) (ch * 2);
            } else {
                array[i] = (char) (ch + 10);
            }
        }
        for(char c:array){
            output+=c;
        }

        return output;
    }
    
    public String DeCryptographer(String insert){
        String output="";
        char[] array = insert.toCharArray();
        for (int i = 0; i < array.length - 1; i++) {
            int ch = array[i];
            if (ch % 2 == 0) {
                array[i] = (char) (ch / 2);
            } else {
                array[i] = (char) (ch - 10);
            }
        }
        for(char c:array){
            output+=c;
        }
        return output;
    }

}
