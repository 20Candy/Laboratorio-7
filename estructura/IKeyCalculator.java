package estructura;

public interface IKeyCalculator<K, T> {
	public K GetKey(T value);
}
