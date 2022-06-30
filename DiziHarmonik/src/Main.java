
public class Main {

	public static void main(String[] args) {
		int[] dizi= {1,2};
		double ort=0;
		for(int i=0;i<dizi.length;i++) {
			ort+=1.0/dizi[i];
		}
		System.out.println("harmonik ortalama: "+ort);
		
	}

}
