/* ------------------------------------------------------------------------------------------------------------
• FoscSegment

FoscSegment.dumpClassSubtree
------------------------------------------------------------------------------------------------------------ */
FoscSegment : FoscTypedList {
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
    // INIT
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* --------------------------------------------------------------------------------------------------------
	• newFromSelection
    -------------------------------------------------------------------------------------------------------- */
	*newFromSelection {
		^this.subClassResponsibility(thisMethod);
	}
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    // PUBLIC INSTANCE METHODS: SPECIAL METHODS
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    /* --------------------------------------------------------------------------------------------------------
    • ==
    -------------------------------------------------------------------------------------------------------- */
    == { |expr|
        var exprItems;
        if (expr.isKindOf(this.species).not) { ^false };
        if (this.size != expr.size) { ^false };
        exprItems = expr.items;
        this.items.do { |each, i| if (each != exprItems[i]) { ^false } };
        ^true;
    }
    /* --------------------------------------------------------------------------------------------------------
    • !=
    -------------------------------------------------------------------------------------------------------- */
    != { |expr|
        ^(this == expr).not
    }
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
    // PUBLIC INSTANCE METHODS
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* --------------------------------------------------------------------------------------------------------
    • hasDuplicates
    -------------------------------------------------------------------------------------------------------- */
    hasDuplicates {
        ^this.subClassResponsibility(thisMethod);
    }
    /* --------------------------------------------------------------------------------------------------------
	• illustrate
	-------------------------------------------------------------------------------------------------------- */
	illustrate {
		^this.notYetImplemented;
	}
	/* --------------------------------------------------------------------------------------------------------
    • str
	-------------------------------------------------------------------------------------------------------- */
    str {
   	    ^this.notYetImplemented;
    }
}