package javaObject;


  public class shirt {
		String brand;
		double price;
		String fabric;
		int Size;

		public shirt(String brand, double price, String fabric, int size) {
			this.brand = brand;
			this.price = price;
			this.fabric = fabric;
			Size = size;
		}

		shirt() {

		}
		

		@Override
		public String toString() {
			return "brand=" + brand + ", price=" + price + ", fabric=" + fabric + ", Size=" + Size;
		}
		@Override
		public boolean equals(Object O)
		{
			shirt s=(shirt)O;
			if(this.brand.equals(s.brand)&&this.price==s.price&&this.fabric.equals(s.fabric)&&this.Size==s.Size)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		
			

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			shirt s1=new shirt("ottos",700,"cotton",30);
			shirt s2=new shirt("zara",900,"cotton",36);
			shirt s3=new shirt("ottos",700,"cotton",30);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println("equals methode output");
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			System.out.println("equals operator");
			System.out.println(s1==s3);
			

		}

	}


	
