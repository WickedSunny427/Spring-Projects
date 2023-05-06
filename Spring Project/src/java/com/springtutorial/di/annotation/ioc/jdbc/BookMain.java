package com.spring.ioc.di.annotation.ioc.jdbc;

import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookMain {

    private static Logger logger = LoggerFactory.getLogger(BookMain.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				"com.spring.ioc.di.annotation.ioc.jdbc");

		BookDao bookDAO = context.getBean("bookDao", BookDao.class);
		logger.info("Displaying menu now  ..");
		showMenu(bookDAO);
		context.close();
	}

	public static void showMenu(BookDao bookDAO) {
		while (true) {
			System.out.println("\n================= WELCOME TO LIBRARY ================= \n");
			System.out.println("1. Add a Book to the Library.");
			System.out.println("2. Update any existing Book details.");
			System.out.println("3. Search book by ID");
			System.out.println("4. View All Books");
			System.out.println("5. Delete any book.");
			System.out.println("6. To Exit, Enter value 0");

			System.out.println("\nEnter your choice::");
			int choice = Utillity.getNumber();

			switch (choice) {
			case 1:
				logger.info("Adding a book here...");
				System.out.println("\n-------- ADDING NEW BOOK------");

				Book book = new Book();

				System.out.println("Enter book's Name :");
				book.setName(Utillity.getWord());

				System.out.println("Enter Author's Name :");
				book.setAuthor(Utillity.getWord());

				System.out.println("Enter book's Description :");
				book.setDescription(Utillity.getWord());

				System.out.println("Enter book's Price :");
				book.setPrice(Utillity.getWord());

				bookDAO.insertBook(book);
				System.out.println(book.getName() + " added Successfully !!!");
				break;
			case 2:
				System.out.println("\n-------- UPDATING AN EXISISTING BOOK------");
				System.out.println("Enter book's ID to be updated :");

				Scanner sc = new Scanner(System.in);

				int bookUpdateId = sc.nextInt();
				Utillity.getLine();

				Book updatedBook = new Book();

				System.out.println("Enter book's Name :");
				updatedBook.setName(Utillity.getLine());

				System.out.println("Enter Author's Name :");
				updatedBook.setAuthor(Utillity.getLine());

				System.out.println("Enter book's Description :");
				updatedBook.setDescription(Utillity.getLine());

				System.out.println("Enter book's Price :");
				updatedBook.setPrice(Utillity.getLine());

				bookDAO.updateBook(updatedBook, bookUpdateId);
				System.out.println("Book with ID " + bookUpdateId + " updated successfully !!!");
				break;

			case 3:
				System.out.println("\n-------- SEARCHING A BOOK------");
				System.out.println("Enter book's ID you are looking for :");

				Book foundBook = bookDAO.getBookById(Utillity.getNumber());
				System.out.println(foundBook + foundBook.getAuthor());
				System.out.println("Name of the Book :" + foundBook.getName());
				System.out.println("Author's Name :" + foundBook.getAuthor());
				System.out.println("Description of the Book :" + foundBook.getDescription());
				System.out.println("Price :" + foundBook.getPrice());
				break;
			case 4:
				System.out.println("\n-------- GETTING ALL BOOKS AVAILABLE------");

				List<Book> books = bookDAO.getBooks();
				for (Book eachBook : books) {
					System.out.println("Name :" + eachBook.getName());
					System.out.println("Author :" + eachBook.getAuthor());
					System.out.println("Description :" + eachBook.getDescription());
					System.out.println("Price :" + eachBook.getPrice() + "\n");
				}
				break;
			case 5:
				System.out.println("\n-------- DELETING A BOOK ------");
				System.out.println("Enter book's ID to be deleted :");
				int bookDeleteId = Utillity.getNumber();
				bookDAO.deleteBook(bookDeleteId);
				System.out.println("Book with ID " + bookDeleteId + " deleted successfully !!!");
				break;

			case 9:
				System.out.println("\nExiting the application... Thank you for your time !!!");
				System.exit(0);
			default:
				System.out.println("\nIncorrect input!!! Please re-enter choice from our menu again !!!");
			}
		}
	}
}