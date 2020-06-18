package selfstudy.exec01.dss01;

public class T43DecimalTransformation {

	public static void main(String[] args) {
		int input = 3944877;
		int radix = 32;
		System.out.println("input:" + input);
		System.out.println("toOctalString:" + Integer.toOctalString(input));
		System.out.println("toHexString:" + Integer.toHexString(input));
		
		char[] rslt = transformDecToRad(input,radix);
		StringBuffer strBuf = new StringBuffer();
		for(int dkd = 0; dkd < rslt.length ; dkd++){
			strBuf.append(rslt[dkd]);
		}
		String strValue = strBuf.toString().trim();
		System.out.println(strValue);
		System.out.println(Integer.valueOf(strValue, radix));
		System.out.println(Integer.parseInt(strValue, radix));
		int output = transformRadToDec(strValue,radix);
		System.out.println(output);
	}
	public static char[] transformDecToRad(int value, int rad){
		char[] temp = new char[100];
		int idx = 0;
		int remainder = 0;
		while(value != 0){
			remainder = value%rad;
			value = value/rad;
			if(remainder < 10){
				temp[idx] = (char)(remainder + 48);
			}else{
				temp[idx] = (char)(remainder + 55);
			}
			idx++;
		}
		int jdx = 0;
		char[] rslt = new char[idx+1];
		while(idx >= 0){
			rslt[jdx] = temp[idx];
			jdx++;idx--;
			
		}
		return rslt;
	}
	public static int transformRadToDec(String value, int rad){
		int rslt = 0;
		value = value.toUpperCase().trim();
		char[] inArray = value.toCharArray();
		for(int i = 0; i < inArray.length; i++){
			int tempValue = 0;
			if(inArray[i] > '9'){
				tempValue = (int)inArray[i] - 55 ;
			}else{
				tempValue = (int)inArray[i] - 48 ;
			}
			int dkdkd = (inArray.length - i -1);
			double dkdk = Math.pow((double)rad,(double)dkdkd);
			rslt += dkdk*tempValue;
		}
		return rslt;
		
	}
}