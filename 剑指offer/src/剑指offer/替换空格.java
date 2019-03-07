package ½£Ö¸offer;

public class Ìæ»»¿Õ¸ñ {
	
	public String replaceSpace(StringBuffer str) {
        if(str == null)
            return null;
    	int len = str.length();
        StringBuffer buff = new StringBuffer();
        for(int i=0;i<len;i++){
            if(str.charAt(i)== ' '){
                buff.append('%');
                buff.append('2');
                buff.append('0');
            }else{
                buff.append(str.charAt(i));
            }
        }
        return buff.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
