public class Bitwise
{
	public static void main(String[] args)
	{
		int n = 8;
		int fourthBitFromRight = (n & 0b1000) / 0b1000;
		System.out.println(fourthBitFromRight);

		System.out.println(~8); // "not" operation, ~8 = -9
		System.out.println(1 << 3); // left shift, 1 << 3 = 8, shift bit pattern to the left 3 steps
		fourthBitFromRight = (n & (1 << 3)) >> 3;
		System.out.println(fourthBitFromRight);
	}
}