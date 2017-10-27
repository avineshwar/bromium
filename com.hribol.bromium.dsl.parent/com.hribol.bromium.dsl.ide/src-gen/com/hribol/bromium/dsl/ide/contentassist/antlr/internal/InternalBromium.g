/*
 * generated by Xtext 2.12.0
 */
grammar InternalBromium;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package com.hribol.bromium.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.hribol.bromium.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.hribol.bromium.dsl.services.BromiumGrammarAccess;

}
@parser::members {
	private BromiumGrammarAccess grammarAccess;

	public void setGrammarAccess(BromiumGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleApplicationAction
entryRuleApplicationAction
:
{ before(grammarAccess.getApplicationActionRule()); }
	 ruleApplicationAction
{ after(grammarAccess.getApplicationActionRule()); } 
	 EOF 
;

// Rule ApplicationAction
ruleApplicationAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getApplicationActionAccess().getGroup()); }
		(rule__ApplicationAction__Group__0)
		{ after(grammarAccess.getApplicationActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWebDriverAction
entryRuleWebDriverAction
:
{ before(grammarAccess.getWebDriverActionRule()); }
	 ruleWebDriverAction
{ after(grammarAccess.getWebDriverActionRule()); } 
	 EOF 
;

// Rule WebDriverAction
ruleWebDriverAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWebDriverActionAccess().getAlternatives()); }
		(rule__WebDriverAction__Alternatives)
		{ after(grammarAccess.getWebDriverActionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleElementWithIdIsPresent
entryRuleElementWithIdIsPresent
:
{ before(grammarAccess.getElementWithIdIsPresentRule()); }
	 ruleElementWithIdIsPresent
{ after(grammarAccess.getElementWithIdIsPresentRule()); } 
	 EOF 
;

// Rule ElementWithIdIsPresent
ruleElementWithIdIsPresent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getElementWithIdIsPresentAccess().getGroup()); }
		(rule__ElementWithIdIsPresent__Group__0)
		{ after(grammarAccess.getElementWithIdIsPresentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClickOnElementWithId
entryRuleClickOnElementWithId
:
{ before(grammarAccess.getClickOnElementWithIdRule()); }
	 ruleClickOnElementWithId
{ after(grammarAccess.getClickOnElementWithIdRule()); } 
	 EOF 
;

// Rule ClickOnElementWithId
ruleClickOnElementWithId 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClickOnElementWithIdAccess().getGroup()); }
		(rule__ClickOnElementWithId__Group__0)
		{ after(grammarAccess.getClickOnElementWithIdAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePageLoad
entryRulePageLoad
:
{ before(grammarAccess.getPageLoadRule()); }
	 rulePageLoad
{ after(grammarAccess.getPageLoadRule()); } 
	 EOF 
;

// Rule PageLoad
rulePageLoad 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPageLoadAccess().getGroup()); }
		(rule__PageLoad__Group__0)
		{ after(grammarAccess.getPageLoadAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeTextInElementFoundByCssSelector
entryRuleTypeTextInElementFoundByCssSelector
:
{ before(grammarAccess.getTypeTextInElementFoundByCssSelectorRule()); }
	 ruleTypeTextInElementFoundByCssSelector
{ after(grammarAccess.getTypeTextInElementFoundByCssSelectorRule()); } 
	 EOF 
;

// Rule TypeTextInElementFoundByCssSelector
ruleTypeTextInElementFoundByCssSelector 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getGroup()); }
		(rule__TypeTextInElementFoundByCssSelector__Group__0)
		{ after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVersion
entryRuleVersion
:
{ before(grammarAccess.getVersionRule()); }
	 ruleVersion
{ after(grammarAccess.getVersionRule()); } 
	 EOF 
;

// Rule Version
ruleVersion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVersionAccess().getSTRINGTerminalRuleCall()); }
		RULE_STRING
		{ after(grammarAccess.getVersionAccess().getSTRINGTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebDriverAction__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWebDriverActionAccess().getElementWithIdIsPresentParserRuleCall_0()); }
		ruleElementWithIdIsPresent
		{ after(grammarAccess.getWebDriverActionAccess().getElementWithIdIsPresentParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getWebDriverActionAccess().getClickOnElementWithIdParserRuleCall_1()); }
		ruleClickOnElementWithId
		{ after(grammarAccess.getWebDriverActionAccess().getClickOnElementWithIdParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getWebDriverActionAccess().getPageLoadParserRuleCall_2()); }
		rulePageLoad
		{ after(grammarAccess.getWebDriverActionAccess().getPageLoadParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getWebDriverActionAccess().getTypeTextInElementFoundByCssSelectorParserRuleCall_3()); }
		ruleTypeTextInElementFoundByCssSelector
		{ after(grammarAccess.getWebDriverActionAccess().getTypeTextInElementFoundByCssSelectorParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNameKeyword_0()); }
	'name'
	{ after(grammarAccess.getModelAccess().getNameKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNameAssignment_1()); }
	(rule__Model__NameAssignment_1)
	{ after(grammarAccess.getModelAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__2__Impl
	rule__Model__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getVersionKeyword_2()); }
	'version'
	{ after(grammarAccess.getModelAccess().getVersionKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__3__Impl
	rule__Model__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getVersionAssignment_3()); }
	(rule__Model__VersionAssignment_3)
	{ after(grammarAccess.getModelAccess().getVersionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__4__Impl
	rule__Model__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getGroup_4()); }
	(rule__Model__Group_4__0)?
	{ after(grammarAccess.getModelAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__5__Impl
	rule__Model__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getActionsKeyword_5()); }
	'actions'
	{ after(grammarAccess.getModelAccess().getActionsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__6__Impl
	rule__Model__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6()); }
	'{'
	{ after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__7__Impl
	rule__Model__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getActionsAssignment_7()); }
	(rule__Model__ActionsAssignment_7)*
	{ after(grammarAccess.getModelAccess().getActionsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_4__0__Impl
	rule__Model__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getFromKeyword_4_0()); }
	'from'
	{ after(grammarAccess.getModelAccess().getFromKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getBaseVersionAssignment_4_1()); }
	(rule__Model__BaseVersionAssignment_4_1)
	{ after(grammarAccess.getModelAccess().getBaseVersionAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ApplicationAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group__0__Impl
	rule__ApplicationAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getActionKeyword_0()); }
	'action'
	{ after(grammarAccess.getApplicationActionAccess().getActionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group__1__Impl
	rule__ApplicationAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getActionIdAssignment_1()); }
	(rule__ApplicationAction__ActionIdAssignment_1)
	{ after(grammarAccess.getApplicationActionAccess().getActionIdAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group__2__Impl
	rule__ApplicationAction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getGroup_2()); }
	(rule__ApplicationAction__Group_2__0)?
	{ after(grammarAccess.getApplicationActionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group__3__Impl
	rule__ApplicationAction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getWebDriverActionAssignment_3()); }
	(rule__ApplicationAction__WebDriverActionAssignment_3)
	{ after(grammarAccess.getApplicationActionAccess().getWebDriverActionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group__4__Impl
	rule__ApplicationAction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getGroup_4()); }
	(rule__ApplicationAction__Group_4__0)?
	{ after(grammarAccess.getApplicationActionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getGroup_5()); }
	(rule__ApplicationAction__Group_5__0)?
	{ after(grammarAccess.getApplicationActionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ApplicationAction__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group_2__0__Impl
	rule__ApplicationAction__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getWhenKeyword_2_0()); }
	'when'
	{ after(grammarAccess.getApplicationActionAccess().getWhenKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getPreconditionAssignment_2_1()); }
	(rule__ApplicationAction__PreconditionAssignment_2_1)
	{ after(grammarAccess.getApplicationActionAccess().getPreconditionAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ApplicationAction__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group_4__0__Impl
	rule__ApplicationAction__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getThenKeyword_4_0()); }
	'then'
	{ after(grammarAccess.getApplicationActionAccess().getThenKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group_4__1__Impl
	rule__ApplicationAction__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getMakeKeyword_4_1()); }
	'make'
	{ after(grammarAccess.getApplicationActionAccess().getMakeKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group_4__2__Impl
	rule__ApplicationAction__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getSureKeyword_4_2()); }
	'sure'
	{ after(grammarAccess.getApplicationActionAccess().getSureKeyword_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getPostconditionAssignment_4_3()); }
	(rule__ApplicationAction__PostconditionAssignment_4_3)
	{ after(grammarAccess.getApplicationActionAccess().getPostconditionAssignment_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ApplicationAction__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group_5__0__Impl
	rule__ApplicationAction__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getDoKeyword_5_0()); }
	'do'
	{ after(grammarAccess.getApplicationActionAccess().getDoKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group_5__1__Impl
	rule__ApplicationAction__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getNotKeyword_5_1()); }
	('not')?
	{ after(grammarAccess.getApplicationActionAccess().getNotKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group_5__2__Impl
	rule__ApplicationAction__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getExpectKeyword_5_2()); }
	'expect'
	{ after(grammarAccess.getApplicationActionAccess().getExpectKeyword_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group_5__3__Impl
	rule__ApplicationAction__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getHttpKeyword_5_3()); }
	'http'
	{ after(grammarAccess.getApplicationActionAccess().getHttpKeyword_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ApplicationAction__Group_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApplicationActionAccess().getRequestKeyword_5_4()); }
	'request'
	{ after(grammarAccess.getApplicationActionAccess().getRequestKeyword_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ElementWithIdIsPresent__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ElementWithIdIsPresent__Group__0__Impl
	rule__ElementWithIdIsPresent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementWithIdIsPresent__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementWithIdIsPresentAccess().getElementKeyword_0()); }
	'element'
	{ after(grammarAccess.getElementWithIdIsPresentAccess().getElementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementWithIdIsPresent__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ElementWithIdIsPresent__Group__1__Impl
	rule__ElementWithIdIsPresent__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementWithIdIsPresent__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementWithIdIsPresentAccess().getWithKeyword_1()); }
	'with'
	{ after(grammarAccess.getElementWithIdIsPresentAccess().getWithKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementWithIdIsPresent__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ElementWithIdIsPresent__Group__2__Impl
	rule__ElementWithIdIsPresent__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementWithIdIsPresent__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementWithIdIsPresentAccess().getCssKeyword_2()); }
	'css'
	{ after(grammarAccess.getElementWithIdIsPresentAccess().getCssKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementWithIdIsPresent__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ElementWithIdIsPresent__Group__3__Impl
	rule__ElementWithIdIsPresent__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementWithIdIsPresent__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementWithIdIsPresentAccess().getSelectorKeyword_3()); }
	'selector'
	{ after(grammarAccess.getElementWithIdIsPresentAccess().getSelectorKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementWithIdIsPresent__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ElementWithIdIsPresent__Group__4__Impl
	rule__ElementWithIdIsPresent__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementWithIdIsPresent__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementWithIdIsPresentAccess().getCssSelectorAssignment_4()); }
	(rule__ElementWithIdIsPresent__CssSelectorAssignment_4)
	{ after(grammarAccess.getElementWithIdIsPresentAccess().getCssSelectorAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementWithIdIsPresent__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ElementWithIdIsPresent__Group__5__Impl
	rule__ElementWithIdIsPresent__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementWithIdIsPresent__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementWithIdIsPresentAccess().getIsKeyword_5()); }
	'is'
	{ after(grammarAccess.getElementWithIdIsPresentAccess().getIsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementWithIdIsPresent__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ElementWithIdIsPresent__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementWithIdIsPresent__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementWithIdIsPresentAccess().getClickableKeyword_6()); }
	'clickable'
	{ after(grammarAccess.getElementWithIdIsPresentAccess().getClickableKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClickOnElementWithId__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClickOnElementWithId__Group__0__Impl
	rule__ClickOnElementWithId__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickOnElementWithId__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClickOnElementWithIdAccess().getClickKeyword_0()); }
	'click'
	{ after(grammarAccess.getClickOnElementWithIdAccess().getClickKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickOnElementWithId__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClickOnElementWithId__Group__1__Impl
	rule__ClickOnElementWithId__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickOnElementWithId__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClickOnElementWithIdAccess().getOnKeyword_1()); }
	'on'
	{ after(grammarAccess.getClickOnElementWithIdAccess().getOnKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickOnElementWithId__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClickOnElementWithId__Group__2__Impl
	rule__ClickOnElementWithId__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickOnElementWithId__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClickOnElementWithIdAccess().getElementKeyword_2()); }
	'element'
	{ after(grammarAccess.getClickOnElementWithIdAccess().getElementKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickOnElementWithId__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClickOnElementWithId__Group__3__Impl
	rule__ClickOnElementWithId__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickOnElementWithId__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClickOnElementWithIdAccess().getWithKeyword_3()); }
	'with'
	{ after(grammarAccess.getClickOnElementWithIdAccess().getWithKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickOnElementWithId__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClickOnElementWithId__Group__4__Impl
	rule__ClickOnElementWithId__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickOnElementWithId__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClickOnElementWithIdAccess().getCssKeyword_4()); }
	'css'
	{ after(grammarAccess.getClickOnElementWithIdAccess().getCssKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickOnElementWithId__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClickOnElementWithId__Group__5__Impl
	rule__ClickOnElementWithId__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickOnElementWithId__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClickOnElementWithIdAccess().getSelectorKeyword_5()); }
	'selector'
	{ after(grammarAccess.getClickOnElementWithIdAccess().getSelectorKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickOnElementWithId__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClickOnElementWithId__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickOnElementWithId__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClickOnElementWithIdAccess().getCssSelectorAssignment_6()); }
	(rule__ClickOnElementWithId__CssSelectorAssignment_6)
	{ after(grammarAccess.getClickOnElementWithIdAccess().getCssSelectorAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PageLoad__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PageLoad__Group__0__Impl
	rule__PageLoad__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PageLoad__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPageLoadAccess().getLoadKeyword_0()); }
	'load'
	{ after(grammarAccess.getPageLoadAccess().getLoadKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PageLoad__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PageLoad__Group__1__Impl
	rule__PageLoad__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PageLoad__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPageLoadAccess().getPageKeyword_1()); }
	'page'
	{ after(grammarAccess.getPageLoadAccess().getPageKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PageLoad__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PageLoad__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PageLoad__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPageLoadAccess().getSubpathAssignment_2()); }
	(rule__PageLoad__SubpathAssignment_2)
	{ after(grammarAccess.getPageLoadAccess().getSubpathAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeTextInElementFoundByCssSelector__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTextInElementFoundByCssSelector__Group__0__Impl
	rule__TypeTextInElementFoundByCssSelector__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTypeKeyword_0()); }
	'type'
	{ after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTextInElementFoundByCssSelector__Group__1__Impl
	rule__TypeTextInElementFoundByCssSelector__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTextAssignment_1()); }
	(rule__TypeTextInElementFoundByCssSelector__TextAssignment_1)
	{ after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTextAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTextInElementFoundByCssSelector__Group__2__Impl
	rule__TypeTextInElementFoundByCssSelector__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getInKeyword_2()); }
	'in'
	{ after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getInKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTextInElementFoundByCssSelector__Group__3__Impl
	rule__TypeTextInElementFoundByCssSelector__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getElementKeyword_3()); }
	'element'
	{ after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getElementKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTextInElementFoundByCssSelector__Group__4__Impl
	rule__TypeTextInElementFoundByCssSelector__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getWithKeyword_4()); }
	'with'
	{ after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getWithKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTextInElementFoundByCssSelector__Group__5__Impl
	rule__TypeTextInElementFoundByCssSelector__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssKeyword_5()); }
	'css'
	{ after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTextInElementFoundByCssSelector__Group__6__Impl
	rule__TypeTextInElementFoundByCssSelector__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getSelectorKeyword_6()); }
	'selector'
	{ after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getSelectorKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTextInElementFoundByCssSelector__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssSelectorAssignment_7()); }
	(rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7)
	{ after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssSelectorAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__VersionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getVersionVersionParserRuleCall_3_0()); }
		ruleVersion
		{ after(grammarAccess.getModelAccess().getVersionVersionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__BaseVersionAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getBaseVersionVersionParserRuleCall_4_1_0()); }
		ruleVersion
		{ after(grammarAccess.getModelAccess().getBaseVersionVersionParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__ActionsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getActionsApplicationActionParserRuleCall_7_0()); }
		ruleApplicationAction
		{ after(grammarAccess.getModelAccess().getActionsApplicationActionParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__ActionIdAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getApplicationActionAccess().getActionIdSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getApplicationActionAccess().getActionIdSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__PreconditionAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getApplicationActionAccess().getPreconditionWebDriverActionParserRuleCall_2_1_0()); }
		ruleWebDriverAction
		{ after(grammarAccess.getApplicationActionAccess().getPreconditionWebDriverActionParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__WebDriverActionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getApplicationActionAccess().getWebDriverActionWebDriverActionParserRuleCall_3_0()); }
		ruleWebDriverAction
		{ after(grammarAccess.getApplicationActionAccess().getWebDriverActionWebDriverActionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ApplicationAction__PostconditionAssignment_4_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getApplicationActionAccess().getPostconditionWebDriverActionParserRuleCall_4_3_0()); }
		ruleWebDriverAction
		{ after(grammarAccess.getApplicationActionAccess().getPostconditionWebDriverActionParserRuleCall_4_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementWithIdIsPresent__CssSelectorAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementWithIdIsPresentAccess().getCssSelectorSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getElementWithIdIsPresentAccess().getCssSelectorSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickOnElementWithId__CssSelectorAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClickOnElementWithIdAccess().getCssSelectorSTRINGTerminalRuleCall_6_0()); }
		RULE_STRING
		{ after(grammarAccess.getClickOnElementWithIdAccess().getCssSelectorSTRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PageLoad__SubpathAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPageLoadAccess().getSubpathSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getPageLoadAccess().getSubpathSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__TextAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTextSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTextSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssSelectorSTRINGTerminalRuleCall_7_0()); }
		RULE_STRING
		{ after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssSelectorSTRINGTerminalRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
