package org.training.design.patterns.behavioral.chainofresponsibility;

public class CheckNumberImpl implements ICheckNumber {
    private Integer min;
    private Integer max;
    private CheckNumberImpl next;

    public CheckNumberImpl(Integer min,
                           Integer max,
                           CheckNumberImpl checkNumber) {
        this.min = min;
        this.max = max;
        this.next = checkNumber;
    }


    @Override
    public boolean check(int number) {
        if (min == null){
            if (number > max){
                System.out.println("Sayı " + max + " den büyük");
                return true;
            }
        } else if (max == null){
            if (number <= min){
                System.out.println("Sayı " + min +  " den küçük");
                return true;
            }
        } else {
            if (number >= min && number < max ) {
                System.out.println("Sayı " + min + " ile " + max + " arasında");
                return true;
            }
        }
        if (next == null){
            return false;
        }
        return next.check(number);

    }
}
