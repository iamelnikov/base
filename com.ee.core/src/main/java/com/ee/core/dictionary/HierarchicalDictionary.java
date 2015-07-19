package com.ee.core.dictionary;

public interface HierarchicalDictionary<T, K extends HierarchicalDictionary<T, K>> extends LinkedDictionary<T, K> {

}
