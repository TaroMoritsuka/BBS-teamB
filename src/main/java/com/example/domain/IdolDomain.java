package com.example.domain;

public class IdolDomain {
	private Integer id;
	private String name;
	private Integer age;
	private String birthPlace;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the birthplace
	 */
	public String getBirthPlace() {
		return birthPlace;
	}

	/**
	 * @param birthplace the birthplace to set
	 */
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	/*
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "domain [id=" + id + ", name=" + name + ", age=" + age + ", birthPlace=" + birthPlace + "]";
	}

	public IdolDomain() {
		super();
	}

	public IdolDomain(Integer id, String name, Integer age, String birthPlace) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.birthPlace = birthPlace;
	}

}
