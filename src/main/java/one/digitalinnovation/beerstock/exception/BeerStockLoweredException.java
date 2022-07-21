package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockLoweredException extends Exception{

    public BeerStockLoweredException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed is less than the minimum stock capacity: %s", id, quantityToDecrement));
    }
}
