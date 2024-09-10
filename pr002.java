class pr002 {
	public static void main(String args[]) {
		byte b, bb, bbb;
		short s, ss, sss;
		int i, ii, I;
		long l, ll, L;
		b = 127;
		bb = (byte)130;
		s = 32000;
		ss = (short)33000;
		System.out.println("bb = " + bb + "\nss = " + ss);
		sss = 100;
		bbb = (byte)sss;
		System.out.println("bbb = " + bbb + "\nsss = " + sss);
		System.out.println();
		
		ii = 700000;
		int V = ii*ii*ii;
		System.out.println("Объем куба: " + V);
		long VV = (long)ii*ii*ii;
		System.out.println("Правильно вычислительный объём куба: " + VV);

		double d, dd;
		d = b/2;
		System.out.println("d = " + d);
		dd = (double)b/2;
		System.out.println("dd = " + dd);

		char ch;
		ch = 'D';
		System.out.println("Значение ch: " + ch);
		ch++;
		System.out.println("Новое значение ch: " + ch);
		ch = 97;
		System.out.println("Новейшее значение ch, с кодом 97: " + ch);
		I = (int)ch;
		System.out.println("I int ch: " + I);
		ch = 'А';
		for (i=0; i<63; i++) {
			I = (int)ch;
			System.out.print("Код символа " + ch + ": " + I + " \n");
			ch++;
			}
		System.out.println("Примеры использование логического типа\n");
		boolean bool;
		bool = false;
		System.out.println("Значение bool: " + bool);
		bool = true;
		System.out.println("Значение bool: " + bool);
		if(bool) System.out.println("Выводим строку, если \"bool\" true");
		if(!bool) System.out.println("Выводим строку, если инверсия \"bool\" true");
		bool = ch=='я';
		if(bool)
			System.out.println("Символ ch равен \"я\" ");

	}

}
