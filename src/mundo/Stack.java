package mundo;

import java.util.Iterator;

import javax.swing.JOptionPane;


public class Stack<Item> implements Iterable<Item> {

	private Item[] array = (Item[]) new Object[1];
	private  int n=0;
	
	
	public void setPush(Item item)
	{
		
		array[n++]=item;
		if(n==array.length)
		{
			resize(array.length*2);
		}
	}
	
	public Item getPop()
	{
		Item elemento= null;
		if(n==array.length);
		try
		{
			 elemento =array[--n];
			 array[n] = null;
		}
		 catch(ArrayIndexOutOfBoundsException exepcion)
		{
			 n++;
			 JOptionPane.showMessageDialog(null,"La estructura esta vacia, no es posible eliminar", "ERROR",JOptionPane.ERROR_MESSAGE);
			 System.out.println("La estructura esta vacia, no es posible eliminar");
		}
		
		if(n>0 && n<=array.length/4)
		{
			resize(array.length/2);
		}
		
		return elemento;
	}
	
	public boolean getIsEmpty(){return n==0;}
	
	public int getSize(){return n;}
	
	private void resize(int tam)
	{
		Item arrAux[]= (Item[]) new Object[tam];
		
		for(int i=0;i<n;i++)
		{
			arrAux[i]=array[i];
		}
		
		array=arrAux;
	}

	public Iterator<Item> iterator() {
		
		return new ReverseArrayIterator();
	}

	private class ReverseArrayIterator implements Iterator<Item>
	{

		private int i=n;
		public boolean hasNext() { return i>0;}
		public Item next() {return  array[--i];}
		
	}
}
