# Система управления библиотекой

Этот проект представляет собой простую систему управления библиотекой, реализованную на Java. Он позволяет пользователям взаимодействовать с библиотекой, добавляя, удаляя, беря в аренду и возвращая книги. Система состоит из трех основных классов: `Book` (Книга), `Library` (Библиотека) и `Reader` (Читатель).

## Содержание
- [Установка](#установка)
- [Использование](#использование)
- [Классы](#классы)
  - [Book (Книга)](#книга)
  - [Library (Библиотека)](#библиотека)
  - [Reader (Читатель)](#читатель)
- [Содействие](#содействие)
- [Лицензия](#лицензия)

## Установка

Для использования этой системы управления библиотекой выполните следующие шаги:
1. Склонируйте репозиторий:
   ```bash
   git clone https://github.com/Nikita00721/AltenarUnitTests.git
   ```
2. Импортируйте проект в вашу предпочтительную среду разработки Java.
3. Соберите и запустите проект.

## Использование

После установки вы можете использовать систему управления библиотекой следующим образом:
```java
// Создание книг
Book book1 = new Book("Название1", "Автор1", true);
Book book2 = new Book("Название2", "Автор2", true);

// Создание библиотеки
Library library = new Library();

// Добавление книг в библиотеку
library.addBook(book1);
library.addBook(book2);

// Создание читателя
Reader reader = new Reader("Иван");

// Читатель берет книгу в аренду
reader.borrowBook(book1);

// Отображение взятых в аренду книг читателем
reader.displayBorrowedBooks();

// Читатель возвращает книгу
reader.returnBook(book1);
```

## Классы

### Книга
Представляет книгу с такими свойствами, как название, автор и доступность.

#### Методы
- getTitle(): Получить название книги.
- setTitle(String title): Установить название книги.
- getAuthor(): Получить автора книги.
- setAuthor(String author): Установить автора книги.
- isAvailable(): Проверить доступность книги.
- setAvailable(boolean available): Установить доступность книги.

### Библиотека
Представляет библиотеку, содержащую список книг.

#### Методы
- addBook(Book book): Добавить книгу в библиотеку.
- removeBook(Book book): Удалить книгу из библиотеки.
- getAllBooks(): Получить список всех книг в библиотеке.
- isBookAvailable(Book book): Проверить доступность книги.
- searchBooks(String query): Поиск книг по названию или автору.

### Читатель
Представляет читателя, который может брать книги в аренду и возвращать их в библиотеку.

#### Методы
- borrowBook(Book book): Взять книгу в аренду из библиотеки.
- returnBook(Book book): Вернуть взятую в аренду книгу в библиотеку.
- getBorrowedBooks(): Получить список взятых в аренду книг.
- hasBorrowedBook(Book book): Проверить, была ли взята в аренду книга.
- returnAllBooks(): Вернуть все взятые в аренду книги.
- displayBorrowedBooks(): Отобразить список взятых в аренду книг.

## Содействие
Если вы обнаружили какие-либо проблемы или у вас есть предложения по улучшению, не стесняйтесь открывать issue или отправлять pull request.

## Лицензия
Этот проект лицензирован по лицензии MIT.
