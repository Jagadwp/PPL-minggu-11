package com.animal;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class AnimalFarm {
	public static void main(String[] args)
	{
		Sheep a = new Sheep("Jasper");
		Sheep b = new Sheep("Madeline");
		Chicken c = new Chicken("Amarillo");
		Chicken d = new Chicken("Rocky");
		
		// Using Stacks
		Stack<Animal> animalStack = new Stack<Animal>();
		System.out.println("Using Stacks");
		System.out.println("Adding " + a.getClass().getSimpleName() + " " + a.getName());
		animalStack.push(a);
		System.out.println("Adding " + c.getClass().getSimpleName() + " " + c.getName());
		animalStack.push(c);
		System.out.println("Adding " + d.getClass().getSimpleName() + " " + d.getName());
		animalStack.push(d);
		System.out.println("Adding " + b.getClass().getSimpleName() + " " + b.getName());
		animalStack.push(b);
		System.out.println();
		
		while (!animalStack.isEmpty())
			animalStack.pop().makeNoise();
		
		// Using Queues
		ArrayBlockingQueue<Animal> animalsInLine = new 
		ArrayBlockingQueue<Animal>(10);
		System.out.println("\nUsing Queues");
		
		try {
			System.out.println("Adding " + a.getClass().getSimpleName() + " " + a.getName());
			animalsInLine.put(a);
			System.out.println("Adding " + c.getClass().getSimpleName() + " " + c.getName());
			animalsInLine.put(c);
			System.out.println("Adding " + d.getClass().getSimpleName() + " " + d.getName());
			animalsInLine.put(d);
			System.out.println("Adding " + b.getClass().getSimpleName() + " " + b.getName());
			animalsInLine.put(b);
			System.out.println();
		}catch (Exception e) {}
		
		while (!animalsInLine.isEmpty()){
			try {
				Animal i = animalsInLine.take();
				i.makeNoise();
			} catch (Exception e){}
			//
			// Or equivalently
			// animalsInLine.take().makeNoise();
			//
		}
		
		// using sets
		HashSet<Animal> animalSet = new HashSet<Animal>();
		System.out.println("\nUsing Sets");
		
		System.out.println("Adding " + a.getClass().getSimpleName() + " " + a.getName());
		animalSet.add(a);
		System.out.println("Adding Sheep Fluffy");
		animalSet.add(new Sheep("Fluffy"));
		System.out.println("Adding " + c.getClass().getSimpleName() + " " + c.getName());
		animalSet.add(c);
		System.out.println("Adding " + d.getClass().getSimpleName() + " " + d.getName());
		animalSet.add(d);
		System.out.println("Adding Chicken Lassie\n");
		animalSet.add(new Chicken("Lassie"));
		
		for (Animal i: animalSet)
			i.makeNoise();
		
		// More fun with stacks
		animalStack.clear();
		System.out.println("Adding " + a.getClass().getSimpleName() + " " + a.getName());
		animalStack.push(a);
		System.out.println("Adding " + c.getClass().getSimpleName() + " " + c.getName());
		animalStack.push(c);
		System.out.println("Adding " + b.getClass().getSimpleName() + " " + b.getName());
		animalStack.push(b);
		a.setName("Jerry");
		System.out.println("\nAccessing by foreach");
		
		for (Animal i: animalStack)
			i.makeNoise();
		
		System.out.println("\nAccessing the stack way");
		
		while (! animalStack.isEmpty())
			animalStack.pop().makeNoise();		
	}
}
