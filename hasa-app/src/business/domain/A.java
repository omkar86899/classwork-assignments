package business.domain;


public class A {
	private IFooable b;
	public A(IFooable b) {
		this.b = b;
	}
	public void bar() {
		b.foo();
	}
}
