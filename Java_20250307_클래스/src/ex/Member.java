package ex;

public class Member {
	private String name;
	private String id;
	private String password;
	private int age;
	
	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	 // Getter 메서드
    String getName() {
        return name;
    }

    String getID() {
        return id;
    }

    String getYear() {
        return password;
    }

    // Setter 메서드
    void setName(String name) {
        this.name = name;
    }

    void getID(String id) {
        this.id = id;
    }

    void getAge(int age) {
        this.age = age;
    }

    void getPassword(String password) {
        this.password = password;
    }
    
    public void nameid() {
    	System.out.println("이름: " + name + " id: " + id);
    }
}
