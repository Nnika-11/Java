public class DecoratorPattern {
	public static void main(String[] args) {
		CanCode developer = new FrontendDeveloper(new JavaScriptDeveloper());
		CanCode developer2 = new JuniorDeveloper(new BackendDeveloper(
				new CSharpDeveloper()));
		developer.doCoding();
		System.out.println();
		developer2.doCoding();
	}
}

//Component
interface CanCode {
	public void doCoding();
}

//Uses for type declaration
//ConcreteComponent
class JavaScriptDeveloper implements CanCode {
	@Override
	public void doCoding() {
		System.out.print("I can code on Java");
	}
}

//ConcreteComponent
class CSharpDeveloper implements CanCode {
	@Override
	public void doCoding() {
		System.out.print("I can code on C#");
	}
}


//Decoretor
abstract class DeveloperDecorator implements CanCode {
	private CanCode wrapper;

	public DeveloperDecorator(CanCode canCode) {
		this.wrapper = canCode;
	}

	public void doCoding() {
		wrapper.doCoding();
	}
}


//Used for add / subtract behavior
//ConcreteDecoretor
class FrontendDeveloper extends DeveloperDecorator {
	public FrontendDeveloper(CanCode canCode) {
		super(canCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doCoding() {
		// TODO Auto-generated method stub

		super.doCoding();
		System.out.print(" and do beautiful Web Sites");
	}
}
//ConcreteDecoretor
class JuniorDeveloper extends DeveloperDecorator {
	public JuniorDeveloper(CanCode canCode) {
		super(canCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doCoding() {
		// TODO Auto-generated method stub
		super.doCoding();
		doLearing();
	}

	public void doLearing() {
		System.out.print(", but I need more time to learn!");
	}
}
//ConcreteDecoretor
class BackendDeveloper extends DeveloperDecorator {
	public BackendDeveloper(CanCode canCode) {
		super(canCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doCoding() {
		// TODO Auto-generated method stubsuper.doCoding();
		super.doCoding();
		System.out.print(" and do dynamically working Web Sites");

	}
}