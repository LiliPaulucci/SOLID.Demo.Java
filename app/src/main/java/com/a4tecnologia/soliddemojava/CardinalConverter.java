package com.a4tecnologia.soliddemojava;

/**
 * Created by LiliPaulucci on 08/09/17.
 */

public class CardinalConverter {

    private INumeralConverter _numeralConverter;

    public CardinalConverter(INumeralConverter numeralConverter)
    {
        _numeralConverter = numeralConverter;
    }

    public String Convert (String numeral)
    {
        return _numeralConverter.Convert(numeral);
    }
}
