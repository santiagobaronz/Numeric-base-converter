package modelo;

/**
 *
 * @author aldanielago
 */
public class Conversor {
    public String conversor_base(int number, int base) {
        StringBuilder resultBuilder = new StringBuilder();
        while (number > 0) {
            int digit = number % base;
            char digitChar = getDigitChar(digit, base);
            resultBuilder.insert(0, digitChar);
            number /= base;
        }
        return resultBuilder.toString();
    }
    
    public static char getDigitChar(int value, int base) {
        char[] chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzαβɣδεζηθικλμνξοπρςτυφχψω₮৲৳௹฿៛₠₡₢₣₤₥₦₧₨₩₪₫₭₯₰₱₲₳₴₵≋￥﷼¢¤€ƒ£¥Ұ$元ރ円złKčर₶₷₹㍐圆圎圓圜＄￠￡￦".toCharArray();
        if (value < 0 || value >= base) {
            throw new IllegalArgumentException("Valor inválido: " + value);
        }
        return chars[value];
    }
}
