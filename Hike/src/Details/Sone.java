package Details;

public class Sone extends Monak {

	public void monk(char b) {
		System.out.println("monk monk");

	}

	public void dummy(char a) {
		super.dummy('n');
		System.out.println("Dummy variable is" + a);
	}

	public void jobby(int b) {
		super.jobby(123);
		System.out.println("no of jobbies are" + b);
	}

	public void joker(int c, int d) {
		super.joker(345, 567);
		System.out.println("no of jokers are" + c);
		System.out.println("no of newint  jokers are" + d);
	}

	public void boy(String p) {
		super.boy("pupy");
		System.out.println("diesh" + p);
	}

	public void girl(char q) {
		super.girl('m');
		System.out.println(" girl name is" + q);
	}

	public void muscle(int r, int s) {
		super.muscle(234, 554);
		System.out.println("muscle weight is" + r);
		System.out.println("muscle new weight is" + s);
	}

	public void nano(String a) {
		super.nano("humble");
		System.out.println("nano car" + a);
	}

	public void momo(int b) {
		super.momo(236);
		System.out.println("momo are very tasty" + b);
	}

	public void ice() {
		super.ice();
		System.out.println("venila");
	}

	public static void main(String[] args) {
		Sone ll = new Sone();
		ll.boy("dinesh");
		ll.dummy('u');
		ll.girl('l');
		ll.ice();
		ll.jobby(321);
		ll.joker(789, 985);
		ll.momo(555);
		ll.monk('e');
		ll.muscle(685, 258);
		ll.nano("caar");
	}

}
