package json;

import org.json.JSONObject;

public class ManipulandoJson {

    public String criandoJson(){
        JSONObject json = new JSONObject();
        json.put("nome", "Elaine");
        json.put("sobrenome", "Maekawa");
        json.put("idade", 28);
//        System.out.println(json);
//        System.out.println(json.get("nome"));
        return json.get("nome").toString();
    }
}
