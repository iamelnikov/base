package com.ee.domain.mongo;


import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.MongoConverter;

public class EEMongoTemplate extends MongoTemplate {

	public EEMongoTemplate(MongoDbFactory mongoDbFactory, MongoConverter mongoConverter) {

		super(mongoDbFactory, mongoConverter);
//		this.mongoConverter = mongoConverter == null ? getDefaultMongoConverter(mongoDbFactory) : mongoConverter;
//		this.queryMapper = new QueryMapper(this.mongoConverter);
//		this.updateMapper = new UpdateMapper(this.mongoConverter);
//
//		// We always have a mapping context in the converter, whether it's a simple one or not
//		mappingContext = this.mongoConverter.getMappingContext();
//		// We create indexes based on mapping events
//		if (null != mappingContext && mappingContext instanceof MongoMappingContext) {
//			indexCreator = new MongoPersistentEntityIndexCreator((MongoMappingContext) mappingContext, mongoDbFactory);
//			eventPublisher = new MongoMappingEventPublisher(indexCreator);
//			if (mappingContext instanceof ApplicationEventPublisherAware) {
//				((ApplicationEventPublisherAware) mappingContext).setApplicationEventPublisher(eventPublisher);
//			}
//		}
	}
	
}
