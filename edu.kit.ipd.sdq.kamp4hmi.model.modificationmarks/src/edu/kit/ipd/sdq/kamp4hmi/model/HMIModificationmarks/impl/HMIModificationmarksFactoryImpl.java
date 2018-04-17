/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl;

import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.*;

import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.ActorStep;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.SystemStep;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HMIModificationmarksFactoryImpl extends EFactoryImpl implements HMIModificationmarksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HMIModificationmarksFactory init() {
		try {
			HMIModificationmarksFactory theHMIModificationmarksFactory = (HMIModificationmarksFactory)EPackage.Registry.INSTANCE.getEFactory(HMIModificationmarksPackage.eNS_URI);
			if (theHMIModificationmarksFactory != null) {
				return theHMIModificationmarksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HMIModificationmarksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMIModificationmarksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HMIModificationmarksPackage.HMI_SEED_MODIFICATIONS: return createHMISeedModifications();
			case HMIModificationmarksPackage.HMI_MODIFICATION_REPOSITORY: return createHMIModificationRepository();
			case HMIModificationmarksPackage.HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY: return createHMIChangePropagationDueToSoftwareDependency();
			case HMIModificationmarksPackage.HMI_MODIFY_ACTOR_STEP: return createHMIModifyActorStep();
			case HMIModificationmarksPackage.HMI_MODIFY_SYSTEM_STEP: return createHMIModifySystemStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMISeedModifications createHMISeedModifications() {
		HMISeedModificationsImpl hmiSeedModifications = new HMISeedModificationsImpl();
		return hmiSeedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMIModificationRepository createHMIModificationRepository() {
		HMIModificationRepositoryImpl hmiModificationRepository = new HMIModificationRepositoryImpl();
		return hmiModificationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMIChangePropagationDueToSoftwareDependency createHMIChangePropagationDueToSoftwareDependency() {
		HMIChangePropagationDueToSoftwareDependencyImpl hmiChangePropagationDueToSoftwareDependency = new HMIChangePropagationDueToSoftwareDependencyImpl();
		return hmiChangePropagationDueToSoftwareDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends ActorStep> HMIModifyActorStep<T> createHMIModifyActorStep() {
		HMIModifyActorStepImpl<T> hmiModifyActorStep = new HMIModifyActorStepImpl<T>();
		return hmiModifyActorStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends SystemStep> HMIModifySystemStep<T> createHMIModifySystemStep() {
		HMIModifySystemStepImpl<T> hmiModifySystemStep = new HMIModifySystemStepImpl<T>();
		return hmiModifySystemStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMIModificationmarksPackage getHMIModificationmarksPackage() {
		return (HMIModificationmarksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HMIModificationmarksPackage getPackage() {
		return HMIModificationmarksPackage.eINSTANCE;
	}

} //HMIModificationmarksFactoryImpl
