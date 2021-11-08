package com.animal;

public class Chicken implements Animal {
	private String name;
	
	public Chicken (String newName){
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
		System.out.println(this.getName() + " says petok-petok");
	}
	
	public boolean equals(Object o){
		if (o == this)
			return true;
		if (o == null || ! (o instanceof Chicken))
			return false;
		if (name.equals(((Chicken) o).getName()))
			return true;
		
		return false;
	}
}