
public class MovieTheater {
	private Client[] chairs;
	
	public MovieTheater(String x){
		int limit = Integer.parseInt(x);
		
		this.chairs = new Client[limit];
		for(int i =0;i<limit;i++) {
			this.chairs[i] = null;
		}
	}
	public void getChairs() {
		System.out.print("[ ");
		for(int i =0;i<this.chairs.length;i++) {
			if (this.chairs[i] == null) {
				System.out.print("-, ");
			} else {
				System.out.print(this.chairs[i].getId() + ":" + this.chairs[i].getPhone() + " ");
			}	
		}
		System.out.println("]");
	}
	public void reserv(Client buying, String x) {
		int position = Integer.parseInt(x);
	
		if (this.chairs[position-1] == null) {
			boolean sameId = false;
			
			
			for(int i = 0 ; i <this.chairs.length ; i++) {
				
				if (this.chairs[i] != null) {
					String a = this.chairs[i].getId();
					String b = buying.getId();
				
					if(a.equals(b)) {
						System.out.println("Falure: Id já existe!");
						sameId = true;
						break;
					}
				}
			}
			
			if (sameId == false) {
				this.chairs[position-1] = buying;
				System.out.println("Sucess!");
			}
			
			
		} else {
			System.out.println("Falure: Cadeira já reservada!");
		}
	}
	
	public void cancel(String id) {
		
		for (int i = 0;i<this.chairs.length;i++) {
			String aux;
			
			if(this.chairs[i] == null) {
				aux = " ";
			} else {
			aux = this.chairs[i].getId();
			}
			
			if (aux.equals(id)) {
				this.chairs[i] = null;
				System.out.println("\tSucess!");
				break;
			} else if(i == this.chairs.length - 1){
				System.out.println("Falure: id não encontrado.");
			}
		}
	}
}
