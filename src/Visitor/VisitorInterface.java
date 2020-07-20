package Visitor;

public interface VisitorInterface {

	public void visit(NonCaliforniaOrder nco);

	public void visit(CaliforniaOrder co);

	public void visit(OverseasOrder oo);

	public void visit(ColombianOrder clo);
}
