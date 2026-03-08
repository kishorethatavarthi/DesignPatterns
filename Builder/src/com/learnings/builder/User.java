package com.learnings.builder;

public class User {

	private String name;

	private int age;

	private String address;

	private boolean isActive;

	private String phone;

	public User(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.address = builder.address;
		this.isActive = builder.isActive;
		this.phone = builder.phone;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + ", isActive=" + isActive + ", phone="
				+ phone + "]";
	}

	public static class Builder {
		private String name;

		private int age;

		private String address;

		private boolean isActive;

		private String phone;

		public Builder() {

		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Builder isActive(boolean isActive) {
			this.isActive = isActive;
			return this;
		}

		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}

}
