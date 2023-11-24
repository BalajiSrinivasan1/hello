package pratic;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="good morning jsd pepole";
		String arr[]=s.split(" ");
		String f=arr[0],L=arr[arr.length-1];
		String res="";
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				res+=L;
			}
			else if(i==arr.length-1) {
				res+=f;
			}
			else {
				res+=arr[i];
			}
			res+=" ";
		}
		System.out.println(res);

	}

}
