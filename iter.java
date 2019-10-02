import java.util.Iterator;

class iter<T> implements Iterator<T> {
	public Position_<T> current;
	int p=0;
	public iter(Position_<T> head)
	{
		current = head;
 	}
	public boolean hasNext()
	{
			
			
		return current.after() != null ;
	}
	public T next()
	{	
		T valv = current.value();
		current=current.after();
		return valv;
	}
	
}