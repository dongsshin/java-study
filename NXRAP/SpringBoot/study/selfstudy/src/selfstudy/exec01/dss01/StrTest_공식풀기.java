package selfstudy.exec01.dss01;

public class StrTest_공식풀기 {
	public static void main(String[] args) {
		String str = "1*3*(4+(4*5+6/2))/5-(1-5)";
		String temp = getEnclosedString(str);
		temp = calculate(temp,"*");
		temp = calculate(temp,"/");
		temp = calculate(temp,"+");
		temp = calculate(temp,"-");
		System.out.println(temp);
	}
	private static String getEnclosedString(String str){
		int[] pos = getFromToIndex(str);
		String temp = str.substring(pos[0],pos[1]);
		return temp;
	}
	private static int[] getFromToIndex(String str){
		int[] ret = new int[2];
		int to = str.indexOf(")");
		int from = findReversedPos(str,to,"(");
		ret[0] = from;
		ret[1] = to;
		return ret;
	}
	private static String calculate(String str, String operator){
		int index = str.indexOf(operator);
		while(index != -1){
			String left = getLeftString(str,index);
			String to = getRightString(str,index);
			Integer value = 0;
			if(operator.equals("*")){
				value = Integer.parseInt(left) *  Integer.parseInt(to);
			}
			if(operator.equals("/")){
				value = Integer.parseInt(left) /  Integer.parseInt(to);
			}
			if(operator.equals("-")){
				value = Integer.parseInt(left) -  Integer.parseInt(to);
			}
			if(operator.equals("+")){
				value = Integer.parseInt(left) +  Integer.parseInt(to);
			}
			str = str.replace(left + operator + to, String.valueOf(value));
			index = str.indexOf(operator);
		}
		return str;
	}
	private static String getRightString(String str, int fromIndex){
		char[] charArray = str.toCharArray();
		int pos = -1;
		for(int i = fromIndex+1; i < charArray.length; i++){
			if(charArray[i] == '+' || charArray[i] == '-' || charArray[i] == '*' || charArray[i] == '/') {
				pos = fromIndex + i;
				break;
			}
		}
		return str.substring(fromIndex+1,pos-1);
	}
	private static String getLeftString(String str, int fromIndex){
		str = str.substring(0, fromIndex);
		str = new StringBuffer(str).reverse().toString();
		System.out.println(str);
		char[] charArray = str.toCharArray();
		int pos = -1;
		for(int i = fromIndex+1; i < charArray.length; i++){
			if(charArray[i] == '+' || charArray[i] == '-' || charArray[i] == '*' || charArray[i] == '/') {
				pos = fromIndex + i;
				break;
			}
		}
		if (pos == -1) return str;
		return str.substring(fromIndex+1,pos-1);
	}
	private static int findReversedPos(String str, int pos, String findStr){
		str = str.substring(0,pos);
		str = (new StringBuffer(str).reverse()).toString();
		return str.length() - str.indexOf(findStr);
	}
}