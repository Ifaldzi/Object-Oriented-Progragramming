import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Gson gson = new Gson();
        try{
            Reader reader = Files.newBufferedReader(Paths.get("src/barang.json"));

            ArrayList<Barang> barangs = gson.fromJson(reader, new TypeToken<ArrayList<Barang>>() {}.getType());
            for (Barang barang : barangs) {
                System.out.println(barang.toString());
            }
        }
        catch(NoSuchFileException exception){
            System.err.println("File Not Available");
        }
    }
}
