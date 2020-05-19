package githubtest.model;

public class TestModel {

	private int id;
	private String name;

	@Override
	public String toString() {
		return "TestModel [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
