package pratic;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a coding test. All the best!";
		//sihT is a gnidoc test. All eht best!
		String res="";
		String arr[]=s.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(i==0||count==3) {
				String temp=arr[i];
				String rev="";
				for(int j=temp.length()-1;j>=0;j--) {
					 rev+=temp.charAt(j);
				}
				res+=rev;
				res+=" ";
			}else {
				res+=arr[i];
				res+=" ";
				
			}
			count++;
			
			if(count==4) {
				count=1;
			}
		}
		System.out.println(res);
		
		
	}
	

}
