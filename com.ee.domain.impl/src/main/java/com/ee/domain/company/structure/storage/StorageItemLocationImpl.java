package com.ee.domain.company.structure.storage;

import com.ee.domain.company.structure.storage.StorageItemLocation;

public class StorageItemLocationImpl implements StorageItemLocation {

	private static final String ZONE_NAME = "zone";
	private static final String SERIA_NAME = "seria";
	private static final String SECTION_NAME = "section";
	private static final String LEVEL_NAME = "level";

	static enum StorageItemLocationEnum {
		ZONE(ZONE_NAME), SERIA(SERIA_NAME), SECTION(SECTION_NAME), LEVEL(
				LEVEL_NAME);

		private String name;

		private StorageItemLocationEnum(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}
}
