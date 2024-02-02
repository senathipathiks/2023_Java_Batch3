package com.ticket_db.main;

import java.util.Scanner;

import com.ticket_db.bean.ticket;
import com.ticket_db.dao.ticket_dbDAO;

public class ticket_dbMain {

	static Scanner sc = new Scanner(System.in);

	public static int displaymenu() {
		System.out.println("1.Create  2.Update 3.Delete 4.Find 5.FindAll 6.Exit");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		return choice;
	}

	public static ticket createticket() {
		System.out.println("Enter ticket id,department,date,category,priority,phone_no");
		return new ticket(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());

	}

	public static int updateticket() {
		System.out.println("Enter the ticket id and name to update the ticket status");
		return dao.updateticket(sc.nextInt(), sc.next());
	}

	public static int deleteticket() {
		System.out.println("Enter the ticket id to delete the ticket status ");
		return (sc.nextInt());
	}

	public static int findticket() {
		System.out.println("Enter the ticket id to find the ticket details");
		return (sc.nextInt());
	}

	static ticket_dbDAO dao = new ticket_dbDAO();

	public static void main(String[] args) {
		String msg = "";
		int n;

		do {
			switch (displaymenu()) {
			case 1:
				ticket t1 = createticket();
				n = dao.createticket(t1);

				if (n == 1)
					System.out.println("Ticket created successfully");
				else
					System.out.println("Ticket created failure");
				break;

			case 2:
//				ticket t2 = ;
				n = updateticket();

				if (n == 1)
					System.out.println("Ticket updated successfully");
				else
					System.out.println("Ticket not updated");
				break;

			case 3:
				int t_id = deleteticket();
				n = dao.deleteticket(t_id);

				if (n == 1)
					System.out.println("Ticket deleted successfully");
				else
					System.out.println("Ticket not deleted");
				break;

			case 4:
				int t_id1 = findticket();
				n = dao.findticket(t_id1);

				if (n == 1)
					System.out.println("Ticket found successfully");
				else
					System.out.println("Ticketd not found");
				break;

			case 5:
				n = dao.findallticket();
				if (n == 1)
					System.out.println("All ticket details displayed successfully");
				else
					System.out.println("Ticket not found");
				break;

			case 6:
				System.out.println("Exited Successfully");
				System.exit(0);
			}
			System.out.println("Do you wish to continue(yes/no)");
			msg = sc.next();
		} while (msg.equals("yes"));

	}

}
