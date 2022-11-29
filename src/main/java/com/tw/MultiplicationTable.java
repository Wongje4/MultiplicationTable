package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isStartNotBiggerThanEnd(start, end) && isInRange(start) && isInRange(end);
    }

    public Boolean isInRange(int number) {
        return number >= 1 && number<=100 ;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        return null;
    }

    public String generateLine(int start, int row) {
        String line = "";
        for(int i = start; i <=row; i++) {
            if(i == row){
                line = line + generateSingleExpression(i, row);

            }else{
                line = line + generateSingleExpression(i, row) + "  ";
            }
        }
        return line;
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        int singleResultInt = multiplicand*multiplier;
        String singleExpression = String.valueOf(multiplicand)+"*"+String.valueOf(multiplier)+"="+String.valueOf(singleResultInt);

        return singleExpression;
    }
}
