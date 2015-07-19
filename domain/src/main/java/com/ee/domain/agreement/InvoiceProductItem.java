package com.ee.domain.agreement;

import com.ee.core.PersistentObject;
import com.ee.domain.product.Product;

/**
 * 
 * @author ilya Единица товара из накладной
 */
public interface InvoiceProductItem extends PersistentObject {

	public Product getProduct();

	public int getMeasureOkeiCode();

	public int getPackageKind();

	public long getCount();

	public double getGrossMass();

	public double getPrice();

	public int getCurrency();

	public double getPriceWithoutNDS();

	public void setPriceWithoutNDS(double priceWithoutNDS);

	public double getNDSRate();

	public double getPriceWithNDS();
}
