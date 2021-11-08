package com.animal;

public class Sheep implements Animal {
	private String name;
	public Sheep (String newName)
	{
		setName(newName);
	}
	public void setName(String newName)
	{
		name = newName;
	}
	@Override
	public String getName()
	{
		return name;
	}
	@Override
	public void makeNoise()
	{
		System.out.println(this.getName() + " says mbekk");
	}
}
