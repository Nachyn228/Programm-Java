class Avtomobil {
        int pass; //кол-во пассажиров
        int v; // объем
        double rash; //расход на 100 км

        void rasst() {
                System.out.println("Расстояние: " + ((int)(v/rash * 100)));
        }

	int rasst2() { 
		return (int)(v/rash *100);
	}

	double fuelNeeded(int km) {
		return ((double)km/100)*rash;
	}
}
class pr004 {
	public static void main(String args[]) {
		//Создание экземпляра класса
		Avtomobil lada = new Avtomobil();
		Avtomobil porshe = new Avtomobil();
                int rasst, rasst2;

                //Присваивание значений внутренним переменным экземпляра класса
                lada.pass = 4;
                lada.v = 40;
                lada.rash = 5.5;

                porshe.pass = 1;
                porshe.v = 100;
                porshe.rash = 14.0;

		System.out.println("Для расстояния в 10км. нужно " + lada.fuelNeeded(10) + " литров бензина");
		rasst=10;
		System.out.println("Для расстояния в 10км. нужно " + lada.fuelNeeded(rasst) + " литров бензина");


                //Определяем расстояние
                //rasst = (int)(lada.v/lada.rash * 100);
                //rasst2 = (int)(porshe.v/porshe.rash * 100);

                System.out.print("Для Lada: ");
                lada.rasst();
		rasst = lada.rasst2();
		System.out.println("Результат вызова метода rasst2(): " + rasst);


                System.out.println("Для Porshe: ");
                porshe.rasst();
		System.out.println("Результат вызова метода rasst2(): " + porshe.rasst2() );
        }
}

