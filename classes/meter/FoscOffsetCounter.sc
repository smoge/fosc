/* ------------------------------------------------------------------------------------------------------------
• FoscOffsetCounter
------------------------------------------------------------------------------------------------------------ */
FoscOffsetCounter : FoscTypedCounter {
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    // INIT
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    *new { |items|
        ^super.new(itemClass: FoscOffset).initFoscOffsetCounter();
    }
    initFoscOffsetCounter { |items|

    }
}
