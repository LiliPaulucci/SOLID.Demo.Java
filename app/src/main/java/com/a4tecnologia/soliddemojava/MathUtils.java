package com.a4tecnologia.soliddemojava;

/**
 * Created by LiliPaulucci on 08/09/17.
 */

public final class MathUtils {
    public static Boolean IsATen(int IncomeNumber)
    {
        return IncomeNumber % 10 == 0;
    }

    public static Integer GetRemainderOfDivisionBy10(int IncomeNumber)
    {
        return IncomeNumber % 10;
    }

    public static Integer GetQuotientOfDivisionBy10(int IncomeNumber)
    {
        return IncomeNumber / 10;
    }
}
