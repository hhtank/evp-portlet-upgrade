/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.evp.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.AuditedModel;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the EVPGrantTransaction service. Represents a row in the &quot;EVPGrantTransaction&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.evp.model.impl.EVPGrantTransactionModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.evp.model.impl.EVPGrantTransactionImpl</code>.
 * </p>
 *
 * @author Val Nagy
 * @see EVPGrantTransaction
 * @generated
 */
@ProviderType
public interface EVPGrantTransactionModel
	extends AuditedModel, BaseModel<EVPGrantTransaction>, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a evp grant transaction model instance should use the {@link EVPGrantTransaction} interface instead.
	 */

	/**
	 * Returns the primary key of this evp grant transaction.
	 *
	 * @return the primary key of this evp grant transaction
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this evp grant transaction.
	 *
	 * @param primaryKey the primary key of this evp grant transaction
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the evp grant transaction ID of this evp grant transaction.
	 *
	 * @return the evp grant transaction ID of this evp grant transaction
	 */
	public long getEvpGrantTransactionId();

	/**
	 * Sets the evp grant transaction ID of this evp grant transaction.
	 *
	 * @param evpGrantTransactionId the evp grant transaction ID of this evp grant transaction
	 */
	public void setEvpGrantTransactionId(long evpGrantTransactionId);

	/**
	 * Returns the company ID of this evp grant transaction.
	 *
	 * @return the company ID of this evp grant transaction
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this evp grant transaction.
	 *
	 * @param companyId the company ID of this evp grant transaction
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this evp grant transaction.
	 *
	 * @return the user ID of this evp grant transaction
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this evp grant transaction.
	 *
	 * @param userId the user ID of this evp grant transaction
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this evp grant transaction.
	 *
	 * @return the user uuid of this evp grant transaction
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this evp grant transaction.
	 *
	 * @param userUuid the user uuid of this evp grant transaction
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this evp grant transaction.
	 *
	 * @return the user name of this evp grant transaction
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this evp grant transaction.
	 *
	 * @param userName the user name of this evp grant transaction
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this evp grant transaction.
	 *
	 * @return the create date of this evp grant transaction
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this evp grant transaction.
	 *
	 * @param createDate the create date of this evp grant transaction
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this evp grant transaction.
	 *
	 * @return the modified date of this evp grant transaction
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this evp grant transaction.
	 *
	 * @param modifiedDate the modified date of this evp grant transaction
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the evp grant request ID of this evp grant transaction.
	 *
	 * @return the evp grant request ID of this evp grant transaction
	 */
	public long getEvpGrantRequestId();

	/**
	 * Sets the evp grant request ID of this evp grant transaction.
	 *
	 * @param evpGrantRequestId the evp grant request ID of this evp grant transaction
	 */
	public void setEvpGrantRequestId(long evpGrantRequestId);

	/**
	 * Returns the file entry ID of this evp grant transaction.
	 *
	 * @return the file entry ID of this evp grant transaction
	 */
	public long getFileEntryId();

	/**
	 * Sets the file entry ID of this evp grant transaction.
	 *
	 * @param fileEntryId the file entry ID of this evp grant transaction
	 */
	public void setFileEntryId(long fileEntryId);

	/**
	 * Returns the grant type of this evp grant transaction.
	 *
	 * @return the grant type of this evp grant transaction
	 */
	public int getGrantType();

	/**
	 * Sets the grant type of this evp grant transaction.
	 *
	 * @param grantType the grant type of this evp grant transaction
	 */
	public void setGrantType(int grantType);

	/**
	 * Returns the amount of this evp grant transaction.
	 *
	 * @return the amount of this evp grant transaction
	 */
	public double getAmount();

	/**
	 * Sets the amount of this evp grant transaction.
	 *
	 * @param amount the amount of this evp grant transaction
	 */
	public void setAmount(double amount);

	/**
	 * Returns the currency code of this evp grant transaction.
	 *
	 * @return the currency code of this evp grant transaction
	 */
	@AutoEscape
	public String getCurrencyCode();

	/**
	 * Sets the currency code of this evp grant transaction.
	 *
	 * @param currencyCode the currency code of this evp grant transaction
	 */
	public void setCurrencyCode(String currencyCode);

	/**
	 * Returns the date of this evp grant transaction.
	 *
	 * @return the date of this evp grant transaction
	 */
	public Date getDate();

	/**
	 * Sets the date of this evp grant transaction.
	 *
	 * @param date the date of this evp grant transaction
	 */
	public void setDate(Date date);

	/**
	 * Returns the note of this evp grant transaction.
	 *
	 * @return the note of this evp grant transaction
	 */
	@AutoEscape
	public String getNote();

	/**
	 * Sets the note of this evp grant transaction.
	 *
	 * @param note the note of this evp grant transaction
	 */
	public void setNote(String note);

	/**
	 * Returns the number of this evp grant transaction.
	 *
	 * @return the number of this evp grant transaction
	 */
	@AutoEscape
	public String getNumber();

	/**
	 * Sets the number of this evp grant transaction.
	 *
	 * @param number the number of this evp grant transaction
	 */
	public void setNumber(String number);

	/**
	 * Returns the bank bic code of this evp grant transaction.
	 *
	 * @return the bank bic code of this evp grant transaction
	 */
	@AutoEscape
	public String getBankBICCode();

	/**
	 * Sets the bank bic code of this evp grant transaction.
	 *
	 * @param bankBICCode the bank bic code of this evp grant transaction
	 */
	public void setBankBICCode(String bankBICCode);

	/**
	 * Returns the bank iban code of this evp grant transaction.
	 *
	 * @return the bank iban code of this evp grant transaction
	 */
	@AutoEscape
	public String getBankIBANCode();

	/**
	 * Sets the bank iban code of this evp grant transaction.
	 *
	 * @param bankIBANCode the bank iban code of this evp grant transaction
	 */
	public void setBankIBANCode(String bankIBANCode);

	/**
	 * Returns the bank name of this evp grant transaction.
	 *
	 * @return the bank name of this evp grant transaction
	 */
	@AutoEscape
	public String getBankName();

	/**
	 * Sets the bank name of this evp grant transaction.
	 *
	 * @param bankName the bank name of this evp grant transaction
	 */
	public void setBankName(String bankName);

	/**
	 * Returns the purpose of use of this evp grant transaction.
	 *
	 * @return the purpose of use of this evp grant transaction
	 */
	@AutoEscape
	public String getPurposeOfUse();

	/**
	 * Sets the purpose of use of this evp grant transaction.
	 *
	 * @param purposeOfUse the purpose of use of this evp grant transaction
	 */
	public void setPurposeOfUse(String purposeOfUse);

}