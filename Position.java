



class Position<T> implements Position_<T>
{
	public T value;
	public Position_<T> locate;

	public Position(T val,Position_<T> l)
	{
		value = val;
		locate = l ;
	}
	public T value()
	{
		return value;
	}

	public Position_<T> after()
	{
		return locate;
	}
} 