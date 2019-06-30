import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// * Write a Parser for string to data object. Represented as below
// [ParentId|Id|Name]. JSON: { "ParentId": 0, "Id": 1, "Name": "Concert" }
// Example string:
// "[0|1|Concert Tickets],[0|2|Theatre],[1|10|Rock 'n Roll],[1|11|Pop],[1|12|Country],[11|21|Taylor Swift],[11|22|Ed Sheeran]";


// * Generate URLs with matched data using the parents as segments in the URL. Names generate URLs. Write URL's out to output(Ordering of output doesn't matter)
// Non url characters could be replaced as this: [" ", "-"],["'",""]
// 0 is just "Home" e.g. /
// /Concert
// /Concert/Pop
// /Concert/Pop/Ed-Sheeran
// /Concert/Pop/Taylor-Swift
// /Concert/Rock-n-Roll

// * Be able to query URL by ID in an efficient way
// Assertions
// var url = GetUrl(22);
// System.out.println("Ed Sheeran URL IsMatch: " + url == "/Concert/Pop/Ed-Sheeran");
// url = GetUrl(21);
// System.out.println("Taylor Swift URL IsMatch: " + url == "/Concert/Pop/Taylor-Swift");
// url = GetUrl(12);
// System.out.println("Country URL IsMatch: " + url == "/Concert/Country");
// url = GetUrl(10);
// System.out.println("Country URL IsMatch: " + url == "/Concert/Rock-n-Roll");


public class Solution {
	
	TicketDB ticketDB = new TicketDB();
	
	public static void main(String args[] ) throws Exception {
		//System.out.println("Hello");
		
		String input = "[0|1|Concert],[0|2|Theatre],[1|10|Rock 'n Roll],[1|11|Pop],[1|12|Country],[11|21|Taylor Swift],[11|22|Ed Sheeran]";
		
		Solution solutionParser = new Solution();
		List<Ticket> tickets = solutionParser.parseData(input);
		//tickets.forEach(T->{System.out.println(T.getURL());});
		
		String url = solutionParser.ticketDB.getUrl(22);
		System.out.println("Ed Sheeran URL IsMatch: " + url.equals("/Concert/Pop/Ed-Sheeran"));
		// url = GetUrl(21);
		// System.out.println("Taylor Swift URL IsMatch: " + url == "/Concert/Pop/Taylor-Swift");
		// url = GetUrl(12);
		// System.out.println("Country URL IsMatch: " + url == "/Concert/Country");
		// url = GetUrl(10);
		// System.out.println("Country URL IsMatch: " + url == "/Concert/Rock-n-Roll");
	}
	
	public List<Ticket> parseData(String data) {
		if (null == data)
			return null;
		String[] objs = data.split(",");
		
		List<Ticket> result = new LinkedList<>();
		
		for (String obj : objs) {
			String[] secs = obj.split("\\|");
			Ticket ticket = new Ticket(secs[0].replace("[", ""), secs[1], secs[2].replace("]", ""));
			result.add(ticket);
			ticketDB.put(ticket);
		}
		
		return result;
	}
}

class TicketDB {
	private Map<Integer, Ticket> ticketsDB;
	
	TicketDB() {
		ticketsDB = new HashMap<>();
	}
	
	public void put(Ticket ticket) {
		ticketsDB.put(ticket.getId(), ticket);
		Ticket parent = ticketsDB.get(ticket.getParentId());
		ticket.setParent(parent);
	}
	
	public String getUrl(int id) {
		if (ticketsDB == null)
			return "";
		Ticket ticket = ticketsDB.get(id);
		if (ticket == null)
			return "";
		return ticket.getURL();
	}
}

class Ticket {
	private int parentId;
	private int id;
	private String name;
	private Ticket parentTicket;
	
	private Ticket() {
		parentTicket = null;
	}
	
	Ticket(int parentId, int id, String name) {
		this();
		this.parentId = parentId;
		this.id = id;
		this.name = name;
	}
	
	Ticket(String parentId, String id, String name) {
		this();
		this.parentId = Integer.parseInt(parentId);
		this.id = Integer.parseInt(id);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getParentId() {
		return parentId;
	}
	
	public int getId() {
		return id;
	}
	
	public void setParent(Ticket ticket) {
		if (parentTicket == null) {
			parentTicket = ticket;
		}
	}
	
	public String getURL() {
		StringBuilder URL = new StringBuilder();
		if (parentTicket != null)
			URL.append(parentTicket.getURL());
		URL.append('/');
		URL.append(name.replaceAll("'", "").replaceAll(" ", "-"));
		return URL.toString();
	}
	
	@Override
	public String toString() {
		return name;
	}
}