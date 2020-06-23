package com.motif.common;

public class Profile {
	private String name;
    private int age;
    private int phone_num;
 
    public Profile(String name, int age, int phone_num) {
        this.name = name;
        this.age = age;
        this.phone_num = phone_num;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(int phone_num) {
		this.phone_num = phone_num;
	}
    
    
    
    
}
