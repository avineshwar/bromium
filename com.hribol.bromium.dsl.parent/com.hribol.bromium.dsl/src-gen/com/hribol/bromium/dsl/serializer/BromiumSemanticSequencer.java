/*
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.serializer;

import com.google.inject.Inject;
import com.hribol.bromium.dsl.bromium.ApplicationAction;
import com.hribol.bromium.dsl.bromium.BromiumPackage;
import com.hribol.bromium.dsl.bromium.ClickClassByText;
import com.hribol.bromium.dsl.bromium.ClickCssSelector;
import com.hribol.bromium.dsl.bromium.ElementByCssToBePresent;
import com.hribol.bromium.dsl.bromium.ExpectHttpRequest;
import com.hribol.bromium.dsl.bromium.ExposedParameter;
import com.hribol.bromium.dsl.bromium.Model;
import com.hribol.bromium.dsl.bromium.PageLoad;
import com.hribol.bromium.dsl.bromium.ParameterValue;
import com.hribol.bromium.dsl.bromium.Postcondition;
import com.hribol.bromium.dsl.bromium.Precondition;
import com.hribol.bromium.dsl.bromium.SyntaxDefinition;
import com.hribol.bromium.dsl.bromium.TextOfElementWithCssSelectorToBe;
import com.hribol.bromium.dsl.bromium.ThreeDottedVersion;
import com.hribol.bromium.dsl.bromium.TypeTextInElementFoundByCssSelector;
import com.hribol.bromium.dsl.services.BromiumGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BromiumSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BromiumGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BromiumPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BromiumPackage.APPLICATION_ACTION:
				sequence_ApplicationAction(context, (ApplicationAction) semanticObject); 
				return; 
			case BromiumPackage.CLICK_CLASS_BY_TEXT:
				sequence_ClickClassByText(context, (ClickClassByText) semanticObject); 
				return; 
			case BromiumPackage.CLICK_CSS_SELECTOR:
				sequence_ClickCssSelector(context, (ClickCssSelector) semanticObject); 
				return; 
			case BromiumPackage.ELEMENT_BY_CSS_TO_BE_PRESENT:
				sequence_ElementByCssToBePresent(context, (ElementByCssToBePresent) semanticObject); 
				return; 
			case BromiumPackage.EXPECT_HTTP_REQUEST:
				sequence_ExpectHttpRequest(context, (ExpectHttpRequest) semanticObject); 
				return; 
			case BromiumPackage.EXPOSED_PARAMETER:
				sequence_ExposedParameter(context, (ExposedParameter) semanticObject); 
				return; 
			case BromiumPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case BromiumPackage.PAGE_LOAD:
				sequence_PageLoad(context, (PageLoad) semanticObject); 
				return; 
			case BromiumPackage.PARAMETER_VALUE:
				sequence_ParameterValue(context, (ParameterValue) semanticObject); 
				return; 
			case BromiumPackage.POSTCONDITION:
				sequence_Postcondition(context, (Postcondition) semanticObject); 
				return; 
			case BromiumPackage.PRECONDITION:
				sequence_Precondition(context, (Precondition) semanticObject); 
				return; 
			case BromiumPackage.SYNTAX_DEFINITION:
				sequence_SyntaxDefinition(context, (SyntaxDefinition) semanticObject); 
				return; 
			case BromiumPackage.TEXT_OF_ELEMENT_WITH_CSS_SELECTOR_TO_BE:
				sequence_TextOfElementWithCssSelectorToBe(context, (TextOfElementWithCssSelectorToBe) semanticObject); 
				return; 
			case BromiumPackage.THREE_DOTTED_VERSION:
				sequence_ThreeDottedVersion(context, (ThreeDottedVersion) semanticObject); 
				return; 
			case BromiumPackage.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR:
				sequence_TypeTextInElementFoundByCssSelector(context, (TypeTextInElementFoundByCssSelector) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ApplicationAction returns ApplicationAction
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         syntaxDefinitions+=SyntaxDefinition* 
	 *         precondition=Precondition? 
	 *         webDriverAction=WebDriverAction 
	 *         postcondition=Postcondition? 
	 *         expectHttpRequest=ExpectHttpRequest
	 *     )
	 */
	protected void sequence_ApplicationAction(ISerializationContext context, ApplicationAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WebDriverAction returns ClickClassByText
	 *     ClickClassByText returns ClickClassByText
	 *
	 * Constraint:
	 *     (cssClass=ParameterValue text=ParameterValue)
	 */
	protected void sequence_ClickClassByText(ISerializationContext context, ClickClassByText semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.CLICK_CLASS_BY_TEXT__CSS_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.CLICK_CLASS_BY_TEXT__CSS_CLASS));
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.CLICK_CLASS_BY_TEXT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.CLICK_CLASS_BY_TEXT__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClickClassByTextAccess().getCssClassParameterValueParserRuleCall_5_0(), semanticObject.getCssClass());
		feeder.accept(grammarAccess.getClickClassByTextAccess().getTextParameterValueParserRuleCall_8_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WebDriverAction returns ClickCssSelector
	 *     ClickCssSelector returns ClickCssSelector
	 *
	 * Constraint:
	 *     cssSelector=ParameterValue
	 */
	protected void sequence_ClickCssSelector(ISerializationContext context, ClickCssSelector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.CLICK_CSS_SELECTOR__CSS_SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.CLICK_CSS_SELECTOR__CSS_SELECTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClickCssSelectorAccess().getCssSelectorParameterValueParserRuleCall_6_0(), semanticObject.getCssSelector());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WebDriverActionCondition returns ElementByCssToBePresent
	 *     ElementByCssToBePresent returns ElementByCssToBePresent
	 *
	 * Constraint:
	 *     cssSelector=ParameterValue
	 */
	protected void sequence_ElementByCssToBePresent(ISerializationContext context, ElementByCssToBePresent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.WEB_DRIVER_ACTION_CONDITION__CSS_SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.WEB_DRIVER_ACTION_CONDITION__CSS_SELECTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElementByCssToBePresentAccess().getCssSelectorParameterValueParserRuleCall_4_0(), semanticObject.getCssSelector());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpectHttpRequest returns ExpectHttpRequest
	 *
	 * Constraint:
	 *     not?='not'
	 */
	protected void sequence_ExpectHttpRequest(ISerializationContext context, ExpectHttpRequest semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.EXPECT_HTTP_REQUEST__NOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.EXPECT_HTTP_REQUEST__NOT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpectHttpRequestAccess().getNotNotKeyword_1_1_0(), semanticObject.isNot());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExposedParameter returns ExposedParameter
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ExposedParameter(ISerializationContext context, ExposedParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.EXPOSED_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.EXPOSED_PARAMETER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExposedParameterAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=STRING version=STRING baseVersion=Version? actions+=ApplicationAction*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WebDriverAction returns PageLoad
	 *     PageLoad returns PageLoad
	 *
	 * Constraint:
	 *     subpath=ParameterValue
	 */
	protected void sequence_PageLoad(ISerializationContext context, PageLoad semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.PAGE_LOAD__SUBPATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.PAGE_LOAD__SUBPATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPageLoadAccess().getSubpathParameterValueParserRuleCall_2_0(), semanticObject.getSubpath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterValue
	 *
	 * Constraint:
	 *     (content=STRING | exposedParameter=[ExposedParameter|ID])
	 */
	protected void sequence_ParameterValue(ISerializationContext context, ParameterValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Postcondition returns Postcondition
	 *
	 * Constraint:
	 *     postcondition=WebDriverActionCondition
	 */
	protected void sequence_Postcondition(ISerializationContext context, Postcondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.POSTCONDITION__POSTCONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.POSTCONDITION__POSTCONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPostconditionAccess().getPostconditionWebDriverActionConditionParserRuleCall_3_0(), semanticObject.getPostcondition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Precondition returns Precondition
	 *
	 * Constraint:
	 *     action=WebDriverActionCondition
	 */
	protected void sequence_Precondition(ISerializationContext context, Precondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.PRECONDITION__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.PRECONDITION__ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPreconditionAccess().getActionWebDriverActionConditionParserRuleCall_1_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SyntaxDefinition returns SyntaxDefinition
	 *
	 * Constraint:
	 *     (content=STRING parameter=ExposedParameter?)
	 */
	protected void sequence_SyntaxDefinition(ISerializationContext context, SyntaxDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WebDriverActionCondition returns TextOfElementWithCssSelectorToBe
	 *     TextOfElementWithCssSelectorToBe returns TextOfElementWithCssSelectorToBe
	 *
	 * Constraint:
	 *     (cssSelector=ParameterValue text=ParameterValue)
	 */
	protected void sequence_TextOfElementWithCssSelectorToBe(ISerializationContext context, TextOfElementWithCssSelectorToBe semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.WEB_DRIVER_ACTION_CONDITION__CSS_SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.WEB_DRIVER_ACTION_CONDITION__CSS_SELECTOR));
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.TEXT_OF_ELEMENT_WITH_CSS_SELECTOR_TO_BE__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.TEXT_OF_ELEMENT_WITH_CSS_SELECTOR_TO_BE__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getCssSelectorParameterValueParserRuleCall_6_0(), semanticObject.getCssSelector());
		feeder.accept(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getTextParameterValueParserRuleCall_8_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ThreeDottedVersion returns ThreeDottedVersion
	 *
	 * Constraint:
	 *     (big=INT medium=INT small=INT)
	 */
	protected void sequence_ThreeDottedVersion(ISerializationContext context, ThreeDottedVersion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.THREE_DOTTED_VERSION__BIG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.THREE_DOTTED_VERSION__BIG));
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.THREE_DOTTED_VERSION__MEDIUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.THREE_DOTTED_VERSION__MEDIUM));
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.THREE_DOTTED_VERSION__SMALL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.THREE_DOTTED_VERSION__SMALL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getThreeDottedVersionAccess().getBigINTTerminalRuleCall_0_0(), semanticObject.getBig());
		feeder.accept(grammarAccess.getThreeDottedVersionAccess().getMediumINTTerminalRuleCall_2_0(), semanticObject.getMedium());
		feeder.accept(grammarAccess.getThreeDottedVersionAccess().getSmallINTTerminalRuleCall_4_0(), semanticObject.getSmall());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WebDriverAction returns TypeTextInElementFoundByCssSelector
	 *     TypeTextInElementFoundByCssSelector returns TypeTextInElementFoundByCssSelector
	 *
	 * Constraint:
	 *     (text=ParameterValue cssSelector=ParameterValue)
	 */
	protected void sequence_TypeTextInElementFoundByCssSelector(ISerializationContext context, TypeTextInElementFoundByCssSelector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR__TEXT));
			if (transientValues.isValueTransient(semanticObject, BromiumPackage.Literals.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR__CSS_SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BromiumPackage.Literals.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR__CSS_SELECTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTextParameterValueParserRuleCall_1_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssSelectorParameterValueParserRuleCall_7_0(), semanticObject.getCssSelector());
		feeder.finish();
	}
	
	
}
