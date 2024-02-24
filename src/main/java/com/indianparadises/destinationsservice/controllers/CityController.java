package com.indianparadises.destinationsservice.controllers;

import com.indianparadises.destinationsservice.dtos.ExploreDestinatiosDTO;
import com.indianparadises.destinationsservice.dtos.ImageDTO;
import com.indianparadises.destinationsservice.entities.*;
import com.indianparadises.destinationsservice.services.CityService;
import mappers.ExploreDestinationsDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private WebClient webClient;

    @RequestMapping(path = "/insertANewCity")
    public City insertANewagraCity() {

        // Creating about object for Manali
        About aboutManali = new About("Scenic Beauty", "Adventure Hub", "Hill Station", "Explore the Majestic Landscapes of Manali",
                "Nestled in the Himalayas, Manali is a paradise for nature lovers and adventure enthusiasts. With its snow-capped peaks, lush green valleys, and gushing rivers, Manali offers a perfect blend of scenic beauty and thrilling activities. Whether you seek tranquility in the mountains or an adrenaline rush through adventure sports, Manali has it all.");

// Creating Accomodations list for Manali
        Accomodation accManali1 = new Accomodation("Snow Bliss Resort", "Mountain Retreat",
                new Address("Snow Peaks Road, Valley View"),
                new Contact("info@snowblissresort.com", "+91 7890 123456"));
        Accomodation accManali2 = new Accomodation("River Retreat Cottage", "Riverside Stay",
                new Address("Riverbank Lane, Adventure Zone"),
                new Contact("reservations@riverretreat.com", "+91 9876 543210"));
        Accomodation accManali3 = new Accomodation("Alpine Lodge", "Ski Resort",
                new Address("Alpine Slopes, Skiing District"),
                new Contact("info@alpinelodge.com", "+91 8765 432109"));
        Accomodation accManali4 = new Accomodation("Misty Meadows Chalet", "Hillside Chalet",
                new Address("Misty Hills, Pine Forest"),
                new Contact("reservations@mistymeadowschalet.com", "+91 7654 321098"));
        Accomodation accManali5 = new Accomodation("Valley View Inn", "Panoramic Views",
                new Address("Valley Vista, Serenity Zone"),
                new Contact("info@valleyviewinn.com", "+91 6543 210987"));
        List<Accomodation> AccomodationsManali = Arrays.asList(accManali1, accManali2, accManali3, accManali4, accManali5);

// Creating attractions list for Manali
        Attraction attManali1 = new Attraction("Rohtang Pass", "Mountain Pass Adventure",
                "A high mountain pass with breathtaking views.",
                "Enjoy snow activities, panoramic landscapes, and adventure sports.",
                "Snow Adventures", "Rohtang Pass is a haven for snow enthusiasts with activities like skiing and snowmobiling.");
        Attraction attManali2 = new Attraction("Solang Valley", "Adventure Playground",
                "Picturesque valley offering a variety of adventure sports.",
                "Indulge in paragliding, zorbing, and witness stunning views of the valley.",
                "Paragliding Thrills", "Solang Valley is famous for its paragliding experiences with unmatched views of the surrounding mountains.");
        Attraction attManali3 = new Attraction("Hadimba Devi Temple", "Spiritual Serenity",
                "Ancient wooden temple dedicated to Hadimba Devi.",
                "Explore the unique architecture and serene surroundings of the temple.",
                "Wooden Architecture", "Hadimba Devi Temple is known for its intricately carved wooden structure and tranquil setting.");
        Attraction attManali4 = new Attraction("Manu Temple", "Historical Shrine",
                "Ancient temple dedicated to Sage Manu.",
                "Visit the temple for its historical significance and peaceful ambiance.",
                "Sage Manu's Legacy", "Manu Temple is believed to be the only temple dedicated to Sage Manu, the progenitor of human race.");
        Attraction attManali5 = new Attraction("Old Manali", "Quaint Village Charm",
                "Explore the old-world charm of Manali in the Old Manali village.",
                "Visit traditional houses, cafes, and enjoy the laid-back atmosphere.",
                "Café Culture", "Old Manali is known for its cozy cafes and vibrant atmosphere, attracting travelers seeking a relaxed experience.");
        List<Attraction> attractionsManali = Arrays.asList(attManali1, attManali2, attManali3, attManali4, attManali5);

// Creating restaurants list for Manali
        Restaurant resManali1 = new Restaurant("Snow Peak Café", "Mountain View Dining",
                "Café with panoramic views of the surrounding snow-capped peaks.",
                new Address("Snow Peak Plaza, Adventure Zone"),
                new Contact("info@snowpeakcafe.com", "+91 7890 987654"));
        Restaurant resManali2 = new Restaurant("Riverside Grill", "Scenic Riverfront Dining",
                "Riverside restaurant offering a serene dining experience.",
                new Address("Riverfront Lane, Nature Bliss District"),
                new Contact("reservations@riversidegrill.com", "+91 9876 876543"));
        Restaurant resManali3 = new Restaurant("Alpine Bites Hut", "Ski Lodge Cuisine",
                "Ski lodge-themed restaurant serving hearty mountain cuisine.",
                new Address("Alpine Street, Skiing District"),
                new Contact("info@alpinebites.com", "+91 8765 765432"));
        Restaurant resManali4 = new Restaurant("Misty Pines Retreat", "Hillside Dining",
                "Hillside restaurant surrounded by misty pine forests.",
                new Address("Misty Hills Avenue, Pine Forest"),
                new Contact("reservations@mistypines.com", "+91 7654 654321"));
        Restaurant resManali5 = new Restaurant("Valley Vistas Café", "Panoramic Valley Views",
                "Café with breathtaking views of the valley and mountains.",
                new Address("Valley View Terrace, Serenity Zone"),
                new Contact("info@valleyvistas.com", "+91 6543 543210"));
        List<Restaurant> restaurantsManali = Arrays.asList(resManali1, resManali2, resManali3, resManali4, resManali5);

// Creating shopping spots list for Manali
        ShoppingSpot shManali1 = new ShoppingSpot("Mall Road Market", "Popular Shopping Destination",
                "Main shopping street in Manali with a variety of shops and boutiques.",
                "Explore local handicrafts, clothing, and souvenirs.",
                "Local Handicrafts", "Mall Road Market is known for its collection of traditional Himachali handicrafts and woolen items.");
        ShoppingSpot shManali2 = new ShoppingSpot("Tibetan Market", "Tibetan Handicrafts",
                "Market known for Tibetan crafts and clothing.",
                "Shop for Tibetan jewelry, prayer flags, and traditional clothing.",
                "Tibetan Artistry", "Tibetan Market offers a glimpse into Tibetan culture through its vibrant handicrafts.");
        ShoppingSpot shManali3 = new ShoppingSpot("Manu Market", "Local Bazaar",
                "Traditional market with a range of local products.",
                "Discover spices, textiles, and handmade crafts.",
                "Local Flavors", "Manu Market provides an authentic local shopping experience with a variety of products.");
        ShoppingSpot shManali4 = new ShoppingSpot("Old Manali Market", "Quaint Village Shopping",
                "Market in Old Manali known for its bohemian and laid-back atmosphere.",
                "Find unique clothing, accessories, and hippie culture souvenirs.",
                "Bohemian Vibes", "Old Manali Market reflects the bohemian lifestyle with its eclectic range of products.");
        ShoppingSpot shManali5 = new ShoppingSpot("Himachal Emporium", "State Handicrafts",
                "Emporium showcasing Himachali handicrafts and traditional items.",
                "Purchase authentic Himachali shawls, artifacts, and wooden crafts.",
                "Cultural Heritage", "Himachal Emporium promotes the rich cultural heritage of Himachal Pradesh through its handcrafted items.");
        List<ShoppingSpot> shoppingSpotsManali = Arrays.asList(shManali1, shManali2, shManali3, shManali4, shManali5);

// Creating Manali city object
        City manaliCity = new City("Manali", "Himalayan beauty, adventure sports, cultural charm", aboutManali, AccomodationsManali,
                attractionsManali, restaurantsManali, shoppingSpotsManali);

// Setting bi-directional relationship
        accManali1.setCity(manaliCity);
        accManali2.setCity(manaliCity);
        accManali3.setCity(manaliCity);
        accManali4.setCity(manaliCity);
        accManali5.setCity(manaliCity);

        attManali1.setCity(manaliCity);
        attManali2.setCity(manaliCity);
        attManali3.setCity(manaliCity);
        attManali4.setCity(manaliCity);
        attManali5.setCity(manaliCity);

        resManali1.setCity(manaliCity);
        resManali2.setCity(manaliCity);
        resManali3.setCity(manaliCity);
        resManali4.setCity(manaliCity);
        resManali5.setCity(manaliCity);

        shManali1.setCity(manaliCity);
        shManali2.setCity(manaliCity);
        shManali3.setCity(manaliCity);
        shManali4.setCity(manaliCity);
        shManali5.setCity(manaliCity);

        return cityService.insertANewCity(manaliCity);

    }

    @GetMapping(path = "exploreDestinations")
    public ResponseEntity<List<ExploreDestinatiosDTO>> exploreDestinations() {
        try {
            List<City> cities = cityService.exploreDestinations();
            List<Long> cityIds = new ArrayList<>();
            cities.stream().forEach((city)->cityIds.add(city.getCityId()));
            List<ImageDTO> imageDTOs = webClient.post()
                    .uri("http://localhost:2001/fetchPrimaryCityImages")
                    .bodyValue(cityIds)
                    .retrieve()
                    .bodyToFlux(ImageDTO.class)
                    .collectList()
                    .block();
            List<ExploreDestinatiosDTO> exploreDestinatiosDTOS = new ArrayList<>();
            for(int i=0; i<cityIds.size(); i++) {
                exploreDestinatiosDTOS.add(ExploreDestinationsDTOMapper.mapCityAndImageDTOToExploreDestinationsDTO(cities.get(i), imageDTOs.get(i)));
            }
            return new ResponseEntity<>(exploreDestinatiosDTOS, HttpStatus.OK);
        }catch(HttpClientErrorException e) {
            HttpStatusCode httpStatusCode = e.getStatusCode();
            String responseBody = e.getResponseBodyAsString();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }catch(Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
