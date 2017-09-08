package com.a4tecnologia.soliddemojava;

/**
 * Created by LiliPaulucci on 08/09/17.
 */

public class RomanToCardinalConverter implements INumeralConverter {

    private ITranslator _translator;

    public RomanToCardinalConverter(ITranslator translator)
    {
        _translator = translator;
    }

    @Override
    public String Convert(String numeral) {
        throw new java.lang.UnsupportedOperationException("Roman numerals are not supported yet.");
    }
}
