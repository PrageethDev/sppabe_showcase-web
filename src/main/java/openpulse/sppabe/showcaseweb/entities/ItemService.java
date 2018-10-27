package openpulse.sppabe.showcaseweb.entities;


import org.springframework.web.client.RestTemplate;



public class ItemService extends RestTemplate{

    public String getItems(){

        String i = getForObject("http://localhost:3000/11/items", String.class);
        return i;
    }



}
