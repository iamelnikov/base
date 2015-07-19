package com.ee.domain.invoice;

import com.ee.domain.company.Employee;
import com.ee.domain.powerofattorney.PowerOfAttorney;

public interface WayBillInvoice<T> {
	/**
	 * Поставщик
	 * @return
	 */
	public InvoiceShipperInfo getShipperInfo();
	/**
	 * Грузополучатель
	 * @return
	 */
	public InvoiceConsigneeInfo getConsigneeInfo();
	/**
	 * Плательщик
	 * @return
	 */
	public InvoicePayerInfo getPayerInfo();
	/**
	 * Лицо, разрешившее отпуск груза
	 * @return
	 */
	public Employee getShippmentAllowedPerson();
	/**
	 * Лицо, выполнившее отпуск груза
	 * @return
	 */
	public Employee getShippmentMadePerson();
	/**
	 * Главный бухгалтер
	 * @return
	 */
	public Employee getChiefAccountant();
	/**
	 * Доверенность
	 * @return объект доверенности
	 */
	public PowerOfAttorney<T> getPowerOfAttorney();
	/**
	 * Получить массу брутто
	 * @return double величина массы брутто
	 */
	public double getGrossMass();
	/**
	 * Получить массу нетто
	 * @return double величина массы нетто
	 */
	public double getNetMass();
	/**
	 * Лицо, принявшее груз 
	 * @return
	 */
	public Employee getShippmentAcceptPerson();
	
}
