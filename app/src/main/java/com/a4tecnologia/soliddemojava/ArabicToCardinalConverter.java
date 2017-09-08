package com.a4tecnologia.soliddemojava;

/**
 * Created by LiliPaulucci on 08/09/17.
 */

public class ArabicToCardinalConverter implements INumeralConverter {
    private ITranslator _translator;

    public ArabicToCardinalConverter(ITranslator translator)
    {
        _translator = translator;
    }

    @Override
    public String Convert(String numeral) {
        int number = Integer.parseInt(numeral);

        if (number < 0 || number > 99)
            throw new java.lang.UnsupportedOperationException("Numbers should be Integers between 0 and 99.");

        String OutcomeNumber;

        if (MathUtils.IsATen(number))
            OutcomeNumber = _translator.GetTens(MathUtils.GetQuotientOfDivisionBy10(number));
        else if (number < 20)
            OutcomeNumber = _translator.GetUnits(number);
        else
        {
            Integer Ten = MathUtils.GetQuotientOfDivisionBy10(number);
            Integer Remainder = MathUtils.GetRemainderOfDivisionBy10(number);

            OutcomeNumber = _translator.GetTens(Ten) + " " + _translator.GetUnits(Remainder);
        }

        return OutcomeNumber;
    }
}
