package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String beerType) {

        List<String> brands = new ArrayList<String>();
        switch (beerType) {
            case "light":
                brands.add("Jail Pale Ale");
                brands.add("Gout Stout");
                break;
            case "amber":
                brands.add("Jack Amber");
                brands.add("Red Moose");
                break;
            case "brown":
                brands.add("Brown Beer");
                brands.add("Bock Beer");
                break;
            case "dark":
                brands.add("Dark Beer");
                brands.add("Pale Ale");
                break;
        }
        return brands;
    }

    public List<String> getZones(String zone) {

        List<String> zones = new ArrayList<String>();
        switch(zone){
        case "Caribe":
        zones.add("Shell Barranquilla Sur");
        zones.add("Biomax Cartagena Bocagrande");
        zones.add("Primax Santa Marta Rodadero");
        zones.add("Chevron Montería Centro");
        break;

        case "Andina":
        zones.add("Shell Bogotá Kennedy");
        zones.add("Biomax Medellín Envigado");
        zones.add("Primax Cali Sur");
        zones.add("Chevron Manizales Centro");
        break;

        case "Pacifica":
        zones.add("Shell Buenaventura Puerto");
        zones.add("Biomax Tumaco Centro");
        zones.add("Primax Quibdó Norte");
        zones.add("Chevron Nuquí");
        break;

        case "Orinoquia":
        zones.add("Shell Villavicencio Centro");
        zones.add("Biomax Yopal Sur");
        zones.add("Primax Arauca Norte");
        zones.add("Chevron Puerto Carreño");
        break;

        case "Amazonia":
        zones.add("Shell Leticia Aeropuerto");
        zones.add("Biomax Florencia Centro");
        zones.add("Primax Puerto Asís");
        zones.add("Chevron Mocoa");
        break;

        case "Insular":
        zones.add("Shell San Andrés Norte");
        zones.add("Biomax Providencia Centro");
        zones.add("Primax San Andrés Aeropuerto");
        break;

        }
        return zones;
    }
}