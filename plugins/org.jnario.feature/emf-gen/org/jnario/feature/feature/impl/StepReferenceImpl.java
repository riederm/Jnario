/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.feature.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepImplementation;
import org.jnario.feature.feature.StepReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.jnario.feature.feature.impl.StepReferenceImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.jnario.feature.feature.impl.StepReferenceImpl#getSyntheticStepReference <em>Synthetic Step Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepReferenceImpl extends StepImplCustom implements StepReference
{
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected StepImplementation reference;

	/**
	 * The cached value of the '{@link #getSyntheticStepReference() <em>Synthetic Step Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntheticStepReference()
	 * @generated
	 * @ordered
	 */
	protected Step syntheticStepReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepReferenceImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return FeaturePackage.Literals.STEP_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepImplementation getReference()
	{
		if (reference != null && reference.eIsProxy())
		{
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (StepImplementation)eResolveProxy(oldReference);
			if (reference != oldReference)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturePackage.STEP_REFERENCE__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepImplementation basicGetReference()
	{
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(StepImplementation newReference)
	{
		StepImplementation oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.STEP_REFERENCE__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getSyntheticStepReference()
	{
		if (syntheticStepReference != null && syntheticStepReference.eIsProxy())
		{
			InternalEObject oldSyntheticStepReference = (InternalEObject)syntheticStepReference;
			syntheticStepReference = (Step)eResolveProxy(oldSyntheticStepReference);
			if (syntheticStepReference != oldSyntheticStepReference)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturePackage.STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE, oldSyntheticStepReference, syntheticStepReference));
			}
		}
		return syntheticStepReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetSyntheticStepReference()
	{
		return syntheticStepReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyntheticStepReference(Step newSyntheticStepReference)
	{
		Step oldSyntheticStepReference = syntheticStepReference;
		syntheticStepReference = newSyntheticStepReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE, oldSyntheticStepReference, syntheticStepReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case FeaturePackage.STEP_REFERENCE__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case FeaturePackage.STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE:
				if (resolve) return getSyntheticStepReference();
				return basicGetSyntheticStepReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case FeaturePackage.STEP_REFERENCE__REFERENCE:
				setReference((StepImplementation)newValue);
				return;
			case FeaturePackage.STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE:
				setSyntheticStepReference((Step)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case FeaturePackage.STEP_REFERENCE__REFERENCE:
				setReference((StepImplementation)null);
				return;
			case FeaturePackage.STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE:
				setSyntheticStepReference((Step)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case FeaturePackage.STEP_REFERENCE__REFERENCE:
				return reference != null;
			case FeaturePackage.STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE:
				return syntheticStepReference != null;
		}
		return super.eIsSet(featureID);
	}

} //StepReferenceImpl
