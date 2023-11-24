package string_program;

public class stringPolindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="malayalam";
		int temp=0,temp1=str.length()-1;
		boolean flag=false;
		while(temp<temp1) {
			if(str.charAt(temp)==str.charAt(temp1)) {
				temp++;
				temp1--;
				flag=true;
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("it is polindrom");
		}else {
			System.out.println("it is not polindrom");
		}

	}

}
