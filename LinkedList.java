import java.util.Iterator;


class LinkedList<T> implements LinkedList_<T>
{
	T last;
	int c;
	public Position_<T> head,cad;
	public LinkedList()
	{
		last = null;
		c=0;
		head = null;  
	}
	public Position_<T> init(T previous, Position_<T> hea)
	{
		last = previous;
		Position<T> ppp = new Position<T>(previous,hea);
		head = (Position_<T>)ppp;
		return head;
	}
	public Position_<T> add(T e)
	{		

			Position<T> present = new Position<T>(e,head);
			last = e;
			head = (Position_<T>)present;
			c++;
			return present;
		
	}
	
	public Iterator<Position_<T>> positions()
	{	

		LinkedListIterator<T> it = new LinkedListIterator<T>(head);
		return it;
	}
	public Iterator<T> poss()
	{
		iter<T> it = new iter<T>(head);
		return it;
	}
	public int count()
	{
		return c;
	}
}
