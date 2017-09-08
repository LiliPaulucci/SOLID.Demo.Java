package com.a4tecnologia.soliddemojava;

/**
 * Created by LiliPaulucci on 08/09/17.
 */

public class CardinalTranslator implements ITranslator {
    @Override
    public String GetTens(int position) {
        return new String[] { "Zero", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" }[position];
    }

    @Override
    public String GetUnits(int position) {
        return new String[] { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eightteen", "Nineteen" }[position];
    }
}
