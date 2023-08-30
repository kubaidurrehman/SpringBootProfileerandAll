package Spring.Boot.Movie.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Spring.Boot.Movie.Entity.MovieEntityClass;
import Spring.Boot.Movie.Service.MovieService;

@RestController

public class MovieController {
	@Autowired
	MovieService movieService;

	private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

	/* @RequestMapping(value="/name" ,method = RequestMethod.GET ) */
	@GetMapping("/abc")
	public String getBook() {
		System.out.println("asdfghj");
		return "Tournament of Power";
	}

	@GetMapping("/Ticket")
	public List<MovieEntityClass> GetAllTicket() {
		return movieService.AllTicket();
	}

	@GetMapping("/Ticket/{id}")
	public MovieEntityClass GetTicketByid(@PathVariable("id") int id) {
		LOGGER.info("Finding Ticket by ID >>>" + id);
		LOGGER.error("Its just Error check");
		LOGGER.warn("Its just Warning check");
		return this.movieService.MovieById(id);
	}

	@PostMapping("/Ticket")
	public MovieEntityClass bookTicket(@RequestBody MovieEntityClass newTicket) {

		MovieEntityClass bookTicket = this.movieService.addTicket(newTicket);
		return bookTicket;
	}

	@DeleteMapping("/Ticket/{id}")
	public List<MovieEntityClass> deleteTicket(@PathVariable("id") int id) {
		return movieService.deleteTicket(id);
	}

	/*
	 * @PutMapping("/Ticket") public MovieEntityClass updateTicket(@RequestBody
	 * MovieEntityClass ticket) { MovieEntityClass ticket1 =
	 * movieService.updateTicket(ticket); return ticket1; }
	 */

	@PutMapping("/Ticket/{id}")
	public MovieEntityClass updateTicket(@RequestBody MovieEntityClass ticket, @PathVariable("id") int id) {
		MovieEntityClass ticket1 = movieService.updateTicket(ticket, id);
		return ticket1;
	}
}
