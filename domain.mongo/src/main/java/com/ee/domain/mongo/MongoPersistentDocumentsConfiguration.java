package com.ee.domain.mongo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

import com.ee.domain.mongo.user.DefaultMongoUser;
import com.ee.domain.user.User;

@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MongoPersistentDocumentsConfiguration {

	private String pathToFile;
	private Map<Class<? extends MongoPersistentDocument>, String> map;

	private static final String USER_COLLECTION_NAME = User.class
			.getCanonicalName();
	
	
	public MongoPersistentDocumentsConfiguration() {
		initMapByDefault();
	}

	public MongoPersistentDocumentsConfiguration(String pathToFile) {
		this.pathToFile = pathToFile;
		loadFile();
	}

	public String getPathToFile() {
		return pathToFile;
	}

	public void setPathToFile(String pathToFile) {
		this.pathToFile = pathToFile;
	}

	private void initMapByDefault() {
		this.map = new LinkedHashMap<Class<? extends MongoPersistentDocument>, String>();
		this.map.put(DefaultMongoUser.class, USER_COLLECTION_NAME);
	}

	private void loadFile() {
		try {
			Properties properties = new Properties();
			InputStream is = new FileInputStream(new File(pathToFile));
			properties.load(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getCollectionNameForClass(
			Class<? extends MongoPersistentDocument> clazz) {
		return this.map.get(clazz);
	}
}
