package feb18.maven.demo;

public class SingletonDemo {

	

		public static void main(String[] args) {

			Singleton obj = Singleton.getInstance();
			Singleton obj2 = Singleton.getInstance();
			Singleton obj3 = Singleton.getInstance();
			System.out.println(obj.hashCode());
			System.out.println(obj2.hashCode());
			System.out.println(obj3.hashCode());
			System.out.println(obj.equals(obj2));
			System.out.println(obj.equals(obj3));

		}

	}

