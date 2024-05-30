public class FormatSpc {
    public static void main(String[] args) {
		int count = 0;
		for(int ch = 'a' ; ch<= 'z' ; ch++) {
			System.out.printf(" %1$4c%1$4x", ch);
			if(++count%6 == 0) {
			System.out.printf("%n");
			}
		}
	}
}


/* First the format specification %1$4c is applied to the first and only argument following the format string.
This outputs the value of ch as a character because of the �c� conversion specification, and in a field
width of 4. The second specification is %1$4x, which outputs the same argument�because of the 1$�
as hexadecimal because the conversion is �x� and in a field width of 4.
396
Chapter 8
You could write the output statement in the loop as:
System.out.printf(� %1$4c%<4x�, ch);
The second format specifier is %<4x, which will output the same argument as the preceding format specifier
because of the �<� following the % sign.
Because a % sign always indicates the start of a format specifier, you must use �%%� in the format string
when you want to output a % character. For example:

int percentage = 75;
System.out.printf(�\n%1$d%%�, percentage);
The format specifier %1$d outputs the value of percentage as a decimal value. The %% that follows in the
format string will display a percent sign, so the output will be:
75%
You use the %s specifier to output a string. Here�s an example that will output the same string twice:
String str = �The quick brown fox.�;
System.out.printf(�%nThe string is:%n%s%n%1$25s�, str);

*/
