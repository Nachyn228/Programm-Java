package bookpackext;
class pr012 {
	public static void main(String[] args){
                ExBook[] books = new ExBook[5];
                books[0] = new ExBook("Иллиада", "Гомер", 1980, "Просвящение");
                books[1] = new ExBook("Унесённые ветром", "Митчел", 2000, "Эксмо");
                books[2] = new ExBook("Наедине с собой", "Аврелий", 1950, "Питер");
                books[3] = new ExBook("Собор Парижской богоматери", "Гюго", 1970, "Лабиринт");
                books[4] = new ExBook("Преступление и наказание", "Достоевский", 1950, "Просвящение");
                for(int i=0; i < books.length; i++)
                        books[i].show();
        }
}

