package com.ee.core.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

@SuppressWarnings("rawtypes")
public class CollectionTools {

	public static void initListIfNull(List<?> list,
			 Class<? extends List> targetListClass) {
		initCollectionIfNull(list, targetListClass);
	}
	
	public static void initListAsArrayListIfNull(List<?> list) {
		initListIfNull(list, ArrayList.class);
	}
	
	public static void initListAsLinkedListIfNull(List<?> list) {
		initListIfNull(list, LinkedList.class);
	}

	public static void initSetIfNull(Set<?> set,
			Class<? extends Set> targetSetClass) {
		initCollectionIfNull(set, targetSetClass);
	}
	
	public static void initSetAsLinkedHashSetIfNull(Set<?> set) {
		initSetIfNull(set, LinkedHashSet.class);
	}
	
	public static void initMapIfNull(Map<?, ?> map,
			Class<? extends Map> targetMapClass) {
		initCollectionIfNull(map, targetMapClass);
	}
	
	private static <T> void initCollectionIfNull(T collection,
			Class<? extends T> targetCollectionClass) {
		try {
			if (collection == null)
				collection = targetCollectionClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public static <T> void removeObjectFromCollection(Collection<T> col, Predicate<T> filter) {
		if (col!=null) {
			final T object = col.stream().filter(filter).findFirst().get();
			if (object!=null)
				col.remove(object);
		}
	}

}
