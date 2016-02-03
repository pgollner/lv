package uebung.fuer.Klausur;

public class generics <T> {

	private T data;
	private int status;
	
	public static final int Zugrifferlaubt = 1;
	public static final int Zugriffverboten = 2;
	public static final int NichtVorhanden = 3;

	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public generics(T data, int status)
	{
		this.data = data;
		this.status = status;
	}
	public String toString()
	{
		switch (status) {
		case Zugrifferlaubt:
			return "Zugriff erlaubt";

		case Zugriffverboten:
			return "Zugriff verboten";

		case NichtVorhanden:
			return "Nicht vorhanden";

		default:
			System.out.println("Critical Failure --> Bluescreen");
			return "";
			
		}
	}
	

}
