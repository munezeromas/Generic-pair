package org.example;

public class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair<K, V> create(K key, V value) {
        return new Pair<>(key, value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public String toString() {
        return "(Key: " + key + ", Value: " + value + ")";
    }
