package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dto.CarDTO;
import facades.CarFacade;
import utils.EMF_Creator;
import java.io.IOException;
import java.io.StringReader;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import utils.HttpUtils;

@Path("car")
public class CarResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();
       
    private static final CarFacade FACADE = CarFacade.emfManager(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
            
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String demo() {
        return "{\"msg\":\"Hello World\"}";
    }
    
    @GET
    @Path("/{plate}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCar(@PathParam("plate") String plate) throws IOException {
        String car = HttpUtils.fetchDataCar("https://v1.motorapi.dk/vehicles/" + plate);
        CarDTO carDTO = GSON.fromJson(car,CarDTO.class);       
        String GsonToJson = GSON.toJson(carDTO);
        return GsonToJson;
    }
    
    @Path("count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getPlateCount() {
        long count = FACADE.getPlateCount();
        return "{\"count\":"+count+"}";  
    }
}
