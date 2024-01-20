package generics;

public class GenericsKeyValues<K, V> {

    K Keys;
    V Values;

    public K getKeys() {
        return Keys;
    }

    public void setKeys(K keys) {
        Keys = keys;
    }

    public V getValues() {
        return Values;
    }

    public void setValues(V values) {
        Values = values;
    }
}
