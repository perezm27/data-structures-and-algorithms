package GraphExercises;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class GetEdge<T> {

//    Feature Tasks
//Write a function based on the specifications above, which takes in a graph,
// and an array of city names. Without utilizing any of the built-in methods available to your language,
// return whether the full trip is possible with direct flights, and how much it would cost.
    //Translation :
        // Check to see if the list of cities are direct neighbors or need to pass through a connective vertex (return a boolean)
    //  && the cost adding the cost of each edge that completes the trip.
    public Collection<T> getEdge(Graph<T> routeMap){
        HashMap<T, T> output = new HashMap<>();
        Boolean flag = false;
        List<Edge<T>> directFlights;

        for (Vertex<T> city : routeMap.adjacencyList.keySet()) {
            directFlights = routeMap.getNeighbors(city);

            System.out.println(directFlights.contains(city));

           if( !directFlights.contains(city)){
               flag = true;
               output.put((T)flag, city.value);
           }

        }

        return output.values();
    }
}
