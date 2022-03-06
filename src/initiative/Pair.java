package initiative;

public class Pair {
	
	    private String name;
	    private int init;
		
	    Pair(String x, int y){
	    	name=x;
	    	init=y;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getInit() {
			return init;
		}

		public void setInit(int init) {
			this.init = init;
		}

		@Override
		public String toString() {
			return "Pair [name=" + name + ", init=" + init + "]";
		}
	    
	 
	    // standard getters and setters
	
}
