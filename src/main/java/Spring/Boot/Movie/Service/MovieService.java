package Spring.Boot.Movie.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.stereotype.Service;

import Spring.Boot.Movie.Entity.MovieEntityClass;

@Service
public class MovieService {

	private static List<MovieEntityClass> list = new ArrayList<>();

	static {
		list.add(new MovieEntityClass(1, "Ubaid", "Tournament of power", 1000));
		list.add(new MovieEntityClass(2, "Inzamaulhaq", "SpiderMan", 1000));
		list.add(new MovieEntityClass(3, "Imad", "Hulk", 1000));
		list.add(new MovieEntityClass(4, "Manish", "Thor", 1000));
	}

	public List<MovieEntityClass> AllTicket() {
		return list;

	}

	public MovieEntityClass MovieById(int id) {
		java.util.Iterator<MovieEntityClass> itr = list.iterator();
		while (itr.hasNext()) {
			MovieEntityClass next = itr.next();

			if (id == next.getId()) {
				int id2 = next.getId();

				return next;
			}

		}

		return null;
	}

	public MovieEntityClass addTicket(MovieEntityClass m) {
		list.add(m);
		return m;
	}

	/*
	 * public List<MovieEntityClass> deleteTicket(int id) {
	 * java.util.Iterator<MovieEntityClass> itr = list.iterator();
	 * while(itr.hasNext()) { MovieEntityClass obj = itr.next(); if(id==obj.getId())
	 * { list.remove(id); } } return list; }
	 */

	public List<MovieEntityClass> deleteTicket(int id) {
		list = list.stream().filter(book -> book.getId() != id).collect(Collectors.toList());
		System.out.println(list);
		return list;
	}

	/*
	 * public MovieEntityClass updateTicket(MovieEntityClass ticket) {
	 * 
	 * 
	 * MovieEntityClass movieEntityClass = list.stream().filter(t -> t.getId()==
	 * ticket.getId()).findAny().get();
	 * movieEntityClass.setMovieName(ticket.getMovieName());
	 * movieEntityClass.setCustomerName(ticket.getCustomerName());
	 * movieEntityClass.setAmount(ticket.getAmount()); return movieEntityClass; }
	 */

	public MovieEntityClass updateTicket(MovieEntityClass ticket, int id) {
		list = list.stream().map(b -> {
			if (b.getId() == id) {
				b.setCustomerName(ticket.getCustomerName());
				b.setMovieName(ticket.getMovieName());
				b.setAmount(ticket.getAmount());
			}
			return b;
		}).collect(Collectors.toList());

		return ticket;

	}
}
