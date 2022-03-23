package feb18.maven.demo;

public class Singleton {

		private static Singleton obj;

		private Singleton() {

		}

		public static Singleton getInstance() { // getInstance();
			if (obj == null) {
				obj = new Singleton();
				return obj;

			} else {
				return obj;
			}
		}


	}
