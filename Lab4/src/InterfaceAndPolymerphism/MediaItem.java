package InterfaceAndPolymerphism;
public abstract class MediaItem extends Item {
	private int runtime;

	public MediaItem(int idNum, String title, int numCopies, int runtime) {
		super(runtime, title, runtime);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public void print() {
		super.print();
		System.out.println("Runtime: " + runtime);
	}

}


