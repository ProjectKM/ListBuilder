/**
 * 
 */
package core;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

import core.scholar.ConnectionFinder;
import core.web.webGrabber;
import dataContainer.Person;

/**
 * @author ing. R.J.H.M. Stevens
 *
 */
public class Main {
	
	/**
	 * 
	 */
	public Main() {
		Instant start = Instant.now();
		ArrayList<Person> results = new ArrayList<Person>(); 
		results.add(new Person("Gerhard Weiss", "3TofHnIAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Jeroen Derwall", "a10va20AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("jaap dronkers", "p0ABWjAAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Siqi Chen", "1eaW44EAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Sjriek Alers", "u8T3ZTQAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Daan Bloembergen", "equEN3cAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Kurt Driessens", "rlUZtakAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Kateřina Staňková", "wYupkOAAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("N. Kalogeras", "8WkEJ78AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Maarten Peter Vink", "TQbMYIMAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Michael Kaisers", "huunXzMAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Andries De Grip", "b7N_BiEAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Hylke Dijkstra", "WA8a4m0AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Costica Dumbrava", "2NflUZEAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Chris Van Klaveren", "3pHXNOIAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Wim Groot", "Jb4zhiMAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Frank Thuijsman", "OxPUGmwAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Thomas Demuynck", "fGMD6oMAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Cheng Boon Ong", "Uw-5hjEAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Arno Riedl", "1daCMfMAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Mark Winands", "5S6bWAwAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Jeroen (HHLM) Donkers", "E9rZ2DAAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Nico Roos", "jvZueK0AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Jeroen J. G. van Merrienboer", "hsDHECkAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Rik Linssen", "qaQ4OP8AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("mien segers", "fNGG7NMAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Dolmans, DHJM", "7iuWO1IAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Marc Willemsen", "gveLoLcAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Jim van Os", "_EbFNbQAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Carel Thijs", "IzCknFgAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Hein De Vries", "IlAlCoEAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Ester Sleddens PhD", "0xuX6swAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Philippe Delespaul", "k0YdhUUAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("nanne de vries", "HVwtM68AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Rik Crutzen", "WD_04G0AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Wim Gijselaers", "x5T6PEgAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("C van der Vleuten", "zchuGAIAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Pascal W. M. Van Gerven", "NTGIGnsAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("P.W. Teunissen", "RwNEu2kAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Albert Scherpbier", "cWYZMxkAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Erik Driessen", "dVCni58AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Arno M.M. Muijtjens", "SHU7AxcAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Willem De Grave", "0o5Bx1AAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("János Flesch", "R9Se5aYAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Jean Derks", "VjzmMeQAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Gijs Schoenmakers", "OnuIOdgAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Philippe Uyttendaele", "v8RxB2UAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Ralf Peeters", "4gv6c1sAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Pim Nijssen", "3Hk1nRwAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Hendrik Baier", "QW-CFsoAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Tom Pepels", "tbmzStgAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Karlijn Overeem", "wNwEBD4AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Joyce M.W. Moonen-van Loon", "1sndmmAAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Daniëlle Verstegen", "dYeUnYUAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Nynke de Jong", "T6aLXEgAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Frederik C. Schadd", "VlNjnx4AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Karen D. Könings", "RSWZ7bUAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Anique BH de Bruin", "CYBbHWwAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Ingrid Spanjers", "Y1ruMRMAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Nick J. Broers", "gftJUocAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Mariëtte van Loon", "1d4IECUAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Jimmie Leppink", "FyCFdesAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Ellen Kok", "63sVAX4AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Ineke Wolfhagen", "lvFyMQQAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Jan van Dalen", "HowekoMAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Renée E. Stalmeijer", "SUmiz6sAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Henk van Berkel", "cN3AP14AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Agnes Diemers", "TWeVw_wAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Rachelle Kamp", "lZT_ru8AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Frans E.S.Tan", "afTi38wAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Inez Myin-Germeys", "cR7kVaEAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("marieke wichers", "SakYHWoAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Jean-Paul Selten", "UYIcc1EAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Nicole Geschwind", "bU2iuWMAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Daniel Van den Hove", "81DTsh4AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Leonidas Chouliaras", "7VwYEqYAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Jos Prickaerts", "UzLXobsAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Gerard van Breukelen", "lN4motAAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Dennis Hernaus", "46ypCq4AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Wim Riedel", "IZiqw_AAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Heidi Jacobs", "6cyAw9sAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("dagnelie pc", "D3YtAS8AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("stef kremers", "GHu_O-gAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Maurice Zeegers", "nbv8pHAAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Isabel Ferreira, PhD", "skHjgY4AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("G.J. Hageman", "hS72OeYAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Ilja Arts", "LeiY0wkAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Liesbeth van Osch", "we3un-IAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Gerjo Kok", "5Uv_nmkAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Ciska Hoving", "aHagB_YAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Robert AC Ruiter", "F2R3dN0AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Jascha de Nooijer", "j0U8p7UAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Silvia MAA Evers", "Ywl5rcUAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Leonie Kohl", "U2oMtlQAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Gertrudis I.J.M. Kempen", "CMuUOncAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Jan-Joost Rethans", "Ehsf8toAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Paul Ram", "A3Hkl_4AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Walther N.K.A. van Mook", "06t2AXQAAAAJ", "mumc.nl"));
		results.add(new Person("Simone Gorter", "3Y0uwv8AAAAJ", "mumc.nl"));
		results.add(new Person("Marjan Govaerts", "fRYSKYgAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Bas Verhoeven", "kSKprs4AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Robbert Duvivier", "HGjwH3MAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Wemke Veldhuijzen", "FlLLgXwAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Esther M. Bergman", "lRbMwtMAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Timothy L Dornan", "eORjGmEAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("JO Busari", "edjC8WwAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Joost Dijkstra", "zoHUR68AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Janneke M. Frambach", "mcBTb18AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Fred C.J. Stevens", "reEkxRcAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Dirk Tempelaar", "DJT0XncAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Annemarie Spruijt", "BLZITTAAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Dominique Waterval", "mPp0ktgAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Richard-Paul Koopmans", "87y4nJ4AAAAJ", "mumc.nl"));
		results.add(new Person("André Berger", "7XJ3XOUAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Pieter Kubben", "qJ8121AAAAAJ", "mumc.nl"));
		results.add(new Person("Maike Gerken", "SJxe6nEAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Helmut Brand", "zXsBuzUAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Katerina Bohle Carbonell", "g3iX5NsAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Jorrick Beckers", "xLE7GiEAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Timo Giesbrecht", "X8oLVTMAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Harry Steinbusch", "CLgQ88oAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Frans Verhey", "KuIz2mkAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Nicole Leibold", "V7M7roAAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Ehsan Pishva", "919eBIEAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Arjan Blokland", "xj2IQzcAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Anke Sambeth", "m7S3hJoAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("efpm vuurman", "WMAAMVUAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Walter H Backes", "Q5FYnQcAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Kim Kuypers", "s83N4IwAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Saartje Burgmans", "D8GQxb4AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("vincent van de ven", "0c9a_6gAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Alexander T. Sack", "87HYhZIAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("elia formisano", "WTnN8C0AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Henri M.H. Spronk", "xlM4F2sAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("A. Bast", "HctjkPIAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("A Schols", "TTQS-8sAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("van Schooten", "RkZuswQAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Guido Haenen", "SD0pgukAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Harm Hospers", "3WydHFAAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Dilana Schaafsma, PhD", "5l9K5KwAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Anita Jansen", "wutrGrYAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Pim Martens", "RV8Z7HgAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Remko van der Sanden", "nZLUD94AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Plasqui Guy", "BF3xWzgAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("David M R Townend", "J9AixNIAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Karlijn Massar", "XvLVpJMAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Job FM Metsemakers", "lNVML1gAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Jan Talmon", "LN6tBu4AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Glen O&#39;Grady", "TuCuKOgAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Bart Verspagen", "f7KIuDAAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Janjaap Semeijn", "zMTWO88AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Jochen Cals", "IaS01UsAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Remco Havermans", "f8Hl8B0AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Anne Roefs", "R54ZOJ4AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Herbert Simon", "9d7rMrkAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Inne Vandyck", "e4JY9JwAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Therese Grohnert", "9xJR1RYAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Simon Beausaert", "FWjoOZEAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Maarten van Wesel", "FSqhko4AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Dominik FROEHLICH", "t4X4DiwAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("R.L.H. Spätjens", "cD7VNLcAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Rudolf Müller", "bWQblqUAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Thomas Meyer", "lz7fTnoAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Ewout Meijer", "kCpyDucAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Robert Stokroos", "kFUnmwcAAAAJ", "mumc.nl"));
		results.add(new Person("Harald H.H.W. Schmidt", "4KCWk_YAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Peter Soeters", "CqHGDQMAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Martijn Poeze", "JpeEdcYAAAAJ", "mumc.nl"));
		results.add(new Person("matthijs hesselink", "v_lpGbIAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Frank Stassen", "US6G6s0AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("dr. Judith Peters", "16LfNF0AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Nienke van Atteveldt", "sQ4uSpgAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Felix Duecker", "VDtCuVcAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Godschalk Roger W.L.", "1oR5gFUAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Joost van Delft", "JKJkqrMAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Agnieszka Smolinska", "hakQxKIAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Jacob Jan (Jacco) Briedé", "wRyUzNoAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Susan Coort", "XyHJkkMAAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Rianne Fijten", "_q5Rkg0AAAAJ", "maastrichtuniversity.nl"));
		results.add(new Person("Kenneth Meijer", "8-vyiL8AAAAJ", "maastrichtuniversity.nl"));
		
		String[] email = new String[3];
		email[0] = "maastrichtuniversity.nl";
		email[1] = "mumc.nl";
		email[2] = "student.maastrichtuniversity.nl";
		new PersonManager(results, email);
		
		Instant end = Instant.now();
		System.out.println(Duration.between(start, end));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main();

	}

}
