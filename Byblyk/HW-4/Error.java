import java.io.*;

public class Error {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Err er;

		int numbEr = Integer.parseInt(in.readLine());

		switch (numbEr) {
		case 400:
			er = Err.E400;
			er.setName("Bad Request");
			er.setValue(400);
			System.out.println("Error¹ " + er.getValue());
			System.out.println(er.getName());
			break;

		case 401:
			er = Err.E401;
			er.setName("Unauthorized");
			er.setValue(401);
			System.out.println("Error¹ " + er.getValue());
			System.out.println(er.getName());
			break;
		case 402:
			er = Err.E402;
			er.setName("Payment Required ");
			er.setValue(402);
			System.out.println("Error¹ " + er.getValue());
			System.out.println(er.getName());
			break;
		case 403:
			er = Err.E403;
			er.setName("Forbidden");
			er.setValue(403);
			System.out.println("Error¹ " + er.getValue());
			System.out.println(er.getName());
			break;
		case 404:
			er = Err.E404;
			er.setName("Not Found");
			er.setValue(404);
			System.out.println("Error¹ " + er.getValue());
			System.out.println(er.getName());
			break;

		}
	}

}

enum Err {
	E400(400), E401(401), E402(402), E403(403), E404(404);

	private int value;

	private Err(int value) {
		this.value = value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

}