package classes;

public class Example<D> {

	D objd;

	public Example(D objd) {
		this.objd = objd;

	}

	public D getObjd() {
		return objd;
	}

	public void print() {
		//System.out.println(objd.getClass().getName());
		System.out.println(objd);
	}

}
