package com.ee.domain.mongo.agreement;

import java.util.Date;

import com.ee.domain.agreement.AbstractAgreement;
import com.ee.domain.agreement.AgreementConsumerInfo;
import com.ee.domain.agreement.AgreementProducerInfo;
import com.ee.domain.mongo.document.DefaultMongoDocument;
import com.ee.domain.mongo.document.MongoDocument;
import com.mongodb.gridfs.GridFSDBFile;

public  class AbstractMongoAgreement extends
		AbstractAgreement<GridFSDBFile> implements MongoDocument {

	private DefaultMongoDocument mongoDocument = new DefaultMongoDocument();

	public AbstractMongoAgreement(String id,
			AgreementProducerInfo producerInfo,
			AgreementConsumerInfo consumerInfo, Date signDate, Date startDate,
			Date endDate) {
		super(id, producerInfo, consumerInfo, signDate, startDate, endDate);
	}

	public GridFSDBFile getFile() {
		return mongoDocument.getFile();
	}

	public void setFile(GridFSDBFile file) {
		mongoDocument.setFile(file);
	}
	
}
